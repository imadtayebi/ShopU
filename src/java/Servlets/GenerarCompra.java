/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Clases.Compra;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
@WebServlet(name = "GenerarCompra", urlPatterns = {"/GenerarCompra"})
public class GenerarCompra extends HttpServlet {

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
        Connection conn;
        PreparedStatement ps, ps1;
        Compra co = new Compra();
        int idc;

        String msg;
        try {
            Context c = new InitialContext();
            javaWebApp1Pool = (javax.sql.DataSource) (DataSource) c.lookup("jdbc/javaWebApp1");
            conn = javaWebApp1Pool.getConnection();

            Double cantidadAPagar = Double.parseDouble(request.getParameter("cantidadAPagar"));

            int filasAfectadas = 0;

            session_user = request.getSession(true);
            String email_usuario = session_user.getAttribute("somename").toString();
            ps1 = conn.prepareStatement("SELECT idusuario FROM USUARIOS where email='" + email_usuario + "'");
            //ps.execute();
            ps1.executeQuery();
            ResultSet rs = ps1.getResultSet();
            String usuario = null;
            while (rs.next()) {
                usuario = rs.getString("idusuario");
            }
            int id = Integer.parseInt(usuario);
            co.setIdCliente(id);
            co.setMonto(cantidadAPagar);
            co.setEstado("En Proceso de Envio");
                     
            ps = conn.prepareStatement("INSERT INTO COMPRAS(IDUSUARIO,CANTIDAD,ESTADO) VALUES(?,?,?)");
            ps.setInt(1, co.getIdCliente());
            ps.setDouble(2, co.getMonto());
            ps.setString(3, co.getEstado());
            ps.executeUpdate();

            
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
            System.out.println(ex);
        } catch (SQLException ex) {
            msg = "<p>ERROR: Base de Datos no disponible</p>";
            System.out.println(ex);
        }

        RequestDispatcher rd = request.getRequestDispatcher("MisCompras");
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
