/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Clases.Articulos;
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
import javax.sql.DataSource;

/**
 *
 * @author Imad
 */
@WebServlet(name = "Detalles", urlPatterns = {"/Detalles"})
public class Detalles extends HttpServlet {

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

        Connection conn;
        PreparedStatement ps;

        String id = request.getParameter("id");
        String msg = null;
        Articulos a = new Articulos();
        try {
            Context c = new InitialContext();
            javaWebApp1Pool = (javax.sql.DataSource) (DataSource) c.lookup("jdbc/javaWebApp1");
            conn = javaWebApp1Pool.getConnection();
            ps = conn.prepareStatement("SELECT * FROM Articulos WHERE idarticulo=" + id);
            ps.executeQuery();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                a.setIdarticulo(rs.getLong(1));
                a.setNombre(rs.getString(2));
                a.setDescripcion(rs.getString(3));
                a.setCategoria(rs.getString(4));
                a.setEstado(rs.getString(5));
                a.setAnioAdquisicion(rs.getInt(6));
                a.setPrecio(rs.getDouble(7));
                a.setIdusuario(rs.getLong(8));
            }
            request.setAttribute("articulo", a);
        } catch (Exception e) {
            msg = "No existe usuario con ese Email";
        }

        Usuarios u = new Usuarios();
        try {
            Context c = new InitialContext();
            javaWebApp1Pool = (javax.sql.DataSource) (DataSource) c.lookup("jdbc/javaWebApp1");
            conn = javaWebApp1Pool.getConnection();
            ps = conn.prepareStatement("SELECT * FROM Usuarios WHERE idusuario=" + a.getIdusuario());
            ps.executeQuery();
            ResultSet rs2 = ps.getResultSet();
            while (rs2.next()) {
                u.setId(rs2.getInt(1));
                u.setEmail(rs2.getString(2));
                u.setClave(rs2.getString(3));
                u.setNombre(rs2.getString(4));
                u.setDirec(rs2.getString(5));
                u.setCdp(rs2.getInt(6));
                u.setTwitter(rs2.getString(7));
                u.setFacebook(rs2.getString(8));
                u.setTel(rs2.getInt(9));
                u.setLocalidad(rs2.getString(10));
                u.setProvincia(rs2.getString(11));
                

            }
            request.setAttribute("vendedor", u);
        } catch (Exception e) {
            msg = "No existe usuario con ese Email";
        }
        RequestDispatcher rd = request.getRequestDispatcher("verDetalles.jsp");
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
