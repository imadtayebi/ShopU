/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Clases.Articulos;
import Clases.Usuarios;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import javax.sql.DataSource;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Imad
 */
@WebServlet(name = "InsertarArticulo", urlPatterns = {"/InsertarArticulo"})
@MultipartConfig
public class InsertarArticulo extends HttpServlet {

    @Resource(name = "javaWebApp1Pool")
    private DataSource javaWebApp1Pool;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        HttpSession session;
        HttpSession session_user;
        String msg;

        // Crear un Objeto usuario
        Usuarios user;

        // Creamos las variables para la conexión, la sentencia y el resultado y asignar sus campos con los valores leídos
        Connection conn;
        PreparedStatement ps;

        int filasAfectadas = 0;
        try {
            Context c = new InitialContext();
            javaWebApp1Pool = (javax.sql.DataSource) (DataSource) c.lookup("jdbc/javaWebApp1");
            conn = javaWebApp1Pool.getConnection();

            // Guardar mensaje sobre estado del resultado
            // Leer los parámetros enviados desde el formulario
            String nombre = request.getParameter("nombre");
            String descripcion = request.getParameter("desc");
            String ano_Adq = request.getParameter("anyo");
            String categoria = request.getParameter("categoria");
            String estado = request.getParameter("estado");
            String precio = request.getParameter("precio");
            Articulos a = new Articulos();
            a.setCategoria(categoria);
            a.setAnioAdquisicion(Integer.parseInt(ano_Adq));
            a.setDescripcion(descripcion);
            a.setEstado(estado);
            a.setNombre(nombre);
            a.setPrecio(Double.parseDouble(precio));

            session_user = request.getSession(true);
            String email_usuario = session_user.getAttribute("somename").toString();
            ps = conn.prepareStatement("SELECT idusuario FROM USUARIOS where email='" + email_usuario + "'");
            //ps.execute();
            ps.executeQuery();
            ResultSet rs = ps.getResultSet();
            String usuario = null;
            while (rs.next()) {
                usuario = rs.getString("idusuario");
            }
            Long id = Long.parseLong(usuario);

            // Preparar la sentencia SQL a realizar
            ps = conn.prepareStatement("INSERT INTO ARTICULOS(nombre,descripcion,categoria,estado,anio_adquisicion,precio,idusuario) VALUES (?, ?, ?, ?, ?, ?, ?)");

            ps.setString(1, a.getNombre());
            ps.setString(2, a.getDescripcion());
            ps.setString(3, a.getCategoria());
            ps.setString(4, a.getEstado());
            ps.setInt(5, a.getAnioAdquisicion());
            ps.setDouble(6, a.getPrecio());
            ps.setLong(7, id);
            filasAfectadas = ps.executeUpdate();
            ps = conn.prepareStatement("SELECT MAX(idarticulo) AS maximo FROM Articulos");//id de la ultima fila insertada
            ps.executeQuery();
            ResultSet rs2 = ps.getResultSet();
            rs2.next();
            String art = rs2.getString("maximo");

            request.setAttribute("anuncioexito", "true");

            final Part filePart = request.getPart("file");
            final String fileName = art;

            OutputStream out = null;
            InputStream filecontent = null;
            final PrintWriter writer = response.getWriter();

            try {
                out = new FileOutputStream(new File("C:/Users/Imad/Desktop/TFG/ShopUHU/web/images" + File.separator + fileName + ".jpg"));
                filecontent = filePart.getInputStream();

                int read = 0;
                final byte[] bytes = new byte[1024];

                while ((read = filecontent.read(bytes)) != -1) {
                    out.write(bytes, 0, read);
                }

            } catch (FileNotFoundException fne) {

            } finally {
                if (out != null) {
                    out.close();
                }
                if (filecontent != null) {
                    filecontent.close();
                }
                if (writer != null) {
                    writer.close();
                }
            }

            if (filasAfectadas > 0) {
                msg = "<p>OK: Insertar articulo realizada correctamente</p>";

            } else {
                msg = "nfilas= " + filasAfectadas + "<p>ERROR: Ha fallado el Insertar articulo</p>";

            }
            System.out.println("msg " + msg);

            ps.close();
            conn.close();

        } catch (NamingException ex) {
            msg = "<p>ERROR: Recurso no disponible</p>";
            request.setAttribute("anuncioexito", "false");
            System.out.println(ex);
        } catch (SQLException ex) {
            msg = "<p>ERROR: Base de Datos no disponible</p>";
            request.setAttribute("anuncioexito", "false");
            System.out.println(ex);
        }
        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        rd.forward(request, response);
    }

    private String getFileName(final Part part) {
        final String partHeader = part.getHeader("content-disposition");
        for (String content : part.getHeader("content-disposition").split(";")) {
            if (content.trim().startsWith("filename")) {
                return content.substring(
                        content.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
