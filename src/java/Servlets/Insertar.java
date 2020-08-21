/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Clases.Usuarios;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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

@WebServlet(name = "Insertar", urlPatterns = {"/Insertar"})
public class Insertar extends HttpServlet {

    @Resource(name = "javaWebApp1Pool")
    private DataSource javaWebApp1Pool;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param txt
     * @param hashType
     * @param request servlet request
     * @param response servlet response
     * @return 
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
     
     
      public static String getHash(String txt, String hashType) {
		try {
			java.security.MessageDigest md = java.security.MessageDigest
					.getInstance(hashType);
			byte[] array = md.digest(txt.getBytes());
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < array.length; ++i) {
				sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100)
						.substring(1, 3));
			}
			return sb.toString();
		} catch (java.security.NoSuchAlgorithmException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
      
      
      public static String md5(String txt) {
		return getHash(txt, "MD5");
	}
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, NamingException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        
       
          String msg;
       
        // Crear un Objeto usuario
        Usuarios user;
 
        // Creamos las variables para la conexión, la sentencia y el resultado y asignar sus campos con los valores leídos
        Connection conn;
        PreparedStatement ps;
        
        
        
        
        int filasAfectadas = 0;
        try {
        
        // Guardar mensaje sobre estado del resultado
        
            // Leer los parÃ¡metros enviados desde el formulario
            //  int id = Integer.parseInt(request.getParameter("id"));
            int tel = Integer.parseInt(request.getParameter("tel"));
            int cdp = Integer.parseInt(request.getParameter("cdp"));
            String nombre = request.getParameter("nombre");
            String email = request.getParameter("email");
            String facebook = request.getParameter("facebook");
            String twitter = request.getParameter("twitter");
            String localidad = request.getParameter("localidad");
            String provincia = request.getParameter("provincia");
            String direc = request.getParameter("direc");
            String clave = request.getParameter("clave");

            user = new Usuarios();
            //user.setId(id);
            user.setEmail(email);
            user.setClave(md5(clave));
            user.setNombre(nombre);
            user.setDirec(direc);
            user.setCdp(cdp);
            user.setTwitter(twitter);
            user.setFacebook(facebook);
            user.setTel(tel);
            user.setLocalidad(localidad);
            user.setProvincia(provincia);
        
            
            
           
            // establecer la conexión
            Context c = new InitialContext();
            javaWebApp1Pool = (javax.sql.DataSource) (DataSource) c.lookup("jdbc/javaWebApp1");
            conn = javaWebApp1Pool.getConnection();
            
            ps = conn.prepareStatement("SELECT email from USUARIOS where email='"+email+"'");
            ps.execute();
            ResultSet rs=ps.getResultSet();
            String prueba=null;
            while(rs.next())
            {
               prueba=rs.getString("email");
            }
            
            
            if(prueba==null)
            {
                ps = conn.prepareStatement("INSERT INTO USUARIOS(EMAIL,CLAVE,NOMBRE,DIRECCION,CODIGO_POSTAL,TWITTER,FACEBOOK,TELEFONO,LOCALIDAD,PROVINCIA) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            // ps.setInt(1, user.getId());
                ps.setString(1, user.getEmail());
                ps.setString(2, user.getClave());
                ps.setString(3, user.getNombre());
                ps.setString(4, user.getDirec());
                ps.setInt(5, user.getCdp());
                ps.setString(6, user.getTwitter());
                ps.setString(7, user.getFacebook());
                ps.setInt(8, user.getTel());
                ps.setString(9, user.getLocalidad());
                ps.setString(10, user.getProvincia());

                // Ejecutar instrucción SQL y guardar resultado en msg
                filasAfectadas = ps.executeUpdate();
                if (filasAfectadas > 0) {
                    msg ="<p>OK: Inserción realizada correctamente</p>";
                } else {
                    msg ="nfilas= "+filasAfectadas+ "<p>ERROR: Ha fallado la Inserción</p>";
                }
                System.out.println("msg "+ msg);
                request.setAttribute("registroexito", "true"); 
                
                       
            }
            else
            {
                request.setAttribute("registroexito", "false"); 
            }
            
            System.out.println("reg ex "+(String) request.getAttribute("registroexito"));
            
            // Preparar la sentencia SQL a realizar
            
 
            ps.close();
            conn.close();
            
            
        } catch (NamingException ex) {
            msg = "<p>ERROR: Recurso no disponible</p>";
            System.out.println(ex);
        } catch (SQLException ex) {
            msg = "<p>ERROR: Base de Datos no disponible</p>";
            System.out.println(ex);
        } 
        RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
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
            Logger.getLogger(Insertar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Insertar.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Insertar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Insertar.class.getName()).log(Level.SEVERE, null, ex);
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
