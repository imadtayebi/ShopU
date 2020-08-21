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
import javax.annotation.Resource;
import javax.naming.Context;
import javax.naming.InitialContext;
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
@WebServlet(name = "misAnuncios", urlPatterns = {"/misAnuncios"})
public class misAnuncios extends HttpServlet {

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
        HttpSession session_user;
        String msg;

        // Crear un Objeto usuario
        Usuarios user;

        // Creamos las variables para la conexión, la sentencia y el resultado y asignar sus campos con los valores leídos
        Connection conn;
        PreparedStatement ps;
        msg = null;
        try {
            // establecer la conexión
            Context c = new InitialContext();
            javaWebApp1Pool = (javax.sql.DataSource) (DataSource) c.lookup("jdbc/javaWebApp1");
            conn = javaWebApp1Pool.getConnection();
            
            session_user = request.getSession(true);
            String email_usuario = session_user.getAttribute("somename").toString();
            ps = conn.prepareStatement("SELECT idusuario FROM USUARIOS where email='" + email_usuario + "'");
            ps.executeQuery();
            ResultSet rs = ps.getResultSet();
            String usuario = null;
            while (rs.next()) {
                usuario = rs.getString("idusuario");
            }
            Long id = Long.parseLong(usuario);

            ps = conn.prepareStatement("SELECT * FROM Articulos where idusuario=" + id);
            ps.executeQuery();
            rs = ps.getResultSet();
            request.setAttribute("misAnuncios", rs);
        } catch (Exception e) {
            msg = "No existe usuario con ese Email";
        }

        RequestDispatcher rd = request.getRequestDispatcher("misAnuncios.jsp");
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
