/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Clases.Articulos;
import Clases.Comentarios;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 *
 * @author Imad
 */
@WebServlet(name = "Comentario", urlPatterns = {"/Comentario"})
public class Comentario extends HttpServlet {

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
     * @throws javax.naming.NamingException
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, NamingException, SQLException {
        response.setContentType("text/html;charset=UTF-8");

        String msg;

        Connection conn;

        Comentarios com = new Comentarios();

        PreparedStatement ps;

        // establecer la conexión
        Context c = new InitialContext();
        javaWebApp1Pool = (javax.sql.DataSource) (DataSource) c.lookup("jdbc/javaWebApp1");
        conn = javaWebApp1Pool.getConnection();

        
        
        String texto = request.getParameter("comentario");

        String idUsu = (String) request.getSession().getAttribute("somename");

        Articulos art = (Articulos) request.getSession().getAttribute("articulo");
        //long idA = Long.parseLong(request.getParameter("id")) ;

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM USUARIOS WHERE EMAIL='" + idUsu + "'");
        int id = 0;

        
        if (rs.next()) {
            id = rs.getInt("IDUSUARIO");
        }
        com.setComentario(texto);
        com.setIdArticulos(art.getIdarticulo());
        com.setIdUsuario(id);

        ps = conn.prepareStatement("INSERT INTO COMENTARIOS(COMENTARIO,IDUSUARIO,IDARTICULO) VALUES (?,?,?)");

        ps.setString(1, com.getComentario());
        ps.setInt(2, com.getIdUsuario());
        ps.setLong(3, com.getIdArticulos());

        int filasAfectadas = ps.executeUpdate();
        if (filasAfectadas > 0) {
            msg = "<p>Enhorabuena, el comentario ha sido insertado correctamente</p>";
        } else {
            msg = "<p>ERROR: Ha fallado la Insercion</p>";
        }

        ps.close();
        conn.close();
        
        RequestDispatcher rd = request.getRequestDispatcher("Detalles?id=" + art.getIdarticulo());
        rd.forward(request, response);
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
        try {
            processRequest(request, response);
        } catch (NamingException ex) {
            Logger.getLogger(Comentario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Comentario.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (NamingException ex) {
            Logger.getLogger(Comentario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Comentario.class.getName()).log(Level.SEVERE, null, ex);
        }
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
