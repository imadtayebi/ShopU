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
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

/**
 *
 * @author Imad
 */
@WebServlet(name = "cambiarClave", urlPatterns = {"/cambiarClave"})
public class cambiarClave extends HttpServlet {
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
        String msg;
       
        // Crear un Objeto usuario
        Usuarios user;
 
        // Creamos las variables para la conexión, la sentencia y el resultado y asignar sus campos con los valores leídos
        Connection conn;
        PreparedStatement ps;
        
        int filasAfectadas = 0;
        try {
            // Leer los parámetros enviados desde el formulario
            String email=request.getParameter("email");
            String clave=request.getParameter("pass");
            String Nclave=request.getParameter("nuevapass");
            
             // establecer la conexión
            Context c = new InitialContext();
            javaWebApp1Pool = (javax.sql.DataSource) (DataSource) c.lookup("jdbc/javaWebApp1");
            conn = javaWebApp1Pool.getConnection();
 
            ps = conn.prepareStatement("SELECT clave FROM USUARIOS where email='"+email+"'");
            //ps.execute();
            ps.executeQuery();
            ResultSet rs = ps.getResultSet();
            String pass = null;
            while(rs.next())
            {
                pass = rs.getString("clave");
            }
            if(pass.equals(clave))
            {
                System.out.println("Nclave "+Nclave);
                ps = conn.prepareStatement("update usuarios set clave='"+Nclave+"' where email='"+email+"'");
                filasAfectadas=ps.executeUpdate();
            }
            else
            {
                System.out.println("ERROR AL INTRODUCIR LOS DATOS. NO SE PUEDE CAMBIAR");
            }
            
            // Preparar la sentencia SQL a realizar
            
            // Ejecutar instrucción SQL y guardar resultado en msg
            if (filasAfectadas > 0) {
                msg ="<p>OK: cambio realizado correctamente</p>";
                
            } else {
                msg ="nfilas= "+filasAfectadas+ "<p>ERROR: Ha fallado el borrado</p>";
            }
 
            ps.close();
            conn.close();
 
        } catch (NamingException ex) {
            msg = "<p>ERROR: Recurso no disponible</p>";
            System.out.println(ex);
        } catch (SQLException ex) {
            msg = "<p>ERROR: Base de Datos no disponible</p>";
            System.out.println(ex);
        } 
        
        HttpSession session_user;
        
        session_user = request.getSession();
        session_user.invalidate();
        RequestDispatcher rd = request.getRequestDispatcher("cambiarClave.jsp");
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
