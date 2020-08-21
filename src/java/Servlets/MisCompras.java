/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Clases.Carrito;
import Clases.Compra;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

/**
 *
 * @author Imad
 */
@WebServlet(name = "MisCompras", urlPatterns = {"/MisCompras"})
public class MisCompras extends HttpServlet {

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
            throws ServletException, IOException, NamingException, SQLException {
        response.setContentType("text/html;charset=UTF-8");

        HttpSession session_user;
        Connection conn;
        PreparedStatement ps;

        Context c = new InitialContext();
        javaWebApp1Pool = (javax.sql.DataSource) (DataSource) c.lookup("jdbc/javaWebApp1");
        conn = javaWebApp1Pool.getConnection();

        List<Carrito> listaCarrito = (List<Carrito>) request.getSession().getAttribute("carrito");

        if (listaCarrito == null) {
            listaCarrito = new ArrayList<>();
        }

        session_user = request.getSession(true);
        String email_usuario = session_user.getAttribute("somename").toString();
        ps = conn.prepareStatement("SELECT idusuario FROM USUARIOS where email='" + email_usuario + "'");
        //ps.execute();
        ps.executeQuery();
        ResultSet rs1 = ps.getResultSet();
        String usuario = null;
        while (rs1.next()) {
            usuario = rs1.getString("idusuario");
        }
        Long id = Long.parseLong(usuario);

        List<Compra> lista = new ArrayList();
        String sql = "select * from COMPRAS where IDUSUARIO=" + id;

        ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Compra com = new Compra();
            com.setId(rs.getInt(1));
            com.setIdCliente(rs.getInt(2));
            com.setMonto(rs.getDouble(3));
            com.setEstado(rs.getString(4));
            lista.add(com);
        }
        
        
        

        request.getSession().setAttribute("miscompras", lista);
        RequestDispatcher rd = request.getRequestDispatcher("Compras.jsp");
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
            Logger.getLogger(MisCompras.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MisCompras.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(MisCompras.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MisCompras.class.getName()).log(Level.SEVERE, null, ex);
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
