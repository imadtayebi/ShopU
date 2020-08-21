/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Clases.Articulos;
import Clases.Carrito;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
@WebServlet(name = "AgregarCarrito", urlPatterns = {"/AgregarCarrito"})
public class AgregarCarrito extends HttpServlet {

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

        List<Articulos> art = new ArrayList<>();

        List<Carrito> listaCarrito = (List<Carrito>) request.getSession().getAttribute("carrito");

        if (listaCarrito == null) {
            listaCarrito = new ArrayList<>();
        }

        int cantidad = 1;
        double totalPagar = 0.0;
        int item = 0;
        String idA = request.getParameter("id");

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM Articulos WHERE idarticulo=" + Integer.parseInt(idA));
        int pos = 0;
        while (rs.next()) {
            Articulos a = new Articulos();
            cantidad=1;
            a.setIdarticulo(rs.getLong(1));
            a.setNombre(rs.getString(2));
            a.setDescripcion(rs.getString(3));
            a.setCategoria(rs.getString(4));
            a.setEstado(rs.getString(5));
            a.setAnioAdquisicion(rs.getInt(6));
            a.setPrecio(rs.getDouble(7));
            a.setIdusuario(rs.getLong(8));
            
            if (listaCarrito.size() > 0) {
                for (int i = 0; i < listaCarrito.size(); i++) {
                    if (Long.parseLong(idA)==listaCarrito.get(i).getIdArticulo()) {
                        pos = i;
                    }

                }
                if (Long.parseLong(idA)==listaCarrito.get(pos).getIdArticulo()) {
                    cantidad = listaCarrito.get(pos).getCantidad() + cantidad;
                    double subtotal = listaCarrito.get(pos).getPrecioCompra() * cantidad;
                    listaCarrito.get(pos).setCantidad(cantidad);
                    listaCarrito.get(pos).setSubTotal(subtotal);
                } else {
                    item++;
                    Carrito car = new Carrito();
                    car.setItem(item);
                    car.setIdArticulo(a.getIdarticulo());
                    car.setNombre(a.getNombre());
                    car.setDescripcion(a.getDescripcion());
                    car.setPrecioCompra(a.getPrecio());
                    car.setCantidad(cantidad);
                    car.setSubTotal(cantidad * a.getPrecio());

                    listaCarrito.add(car);
                }

            } else {

                item++;
                Carrito car = new Carrito();
                car.setItem(item);
                car.setIdArticulo(a.getIdarticulo());
                car.setNombre(a.getNombre());
                car.setDescripcion(a.getDescripcion());
                car.setPrecioCompra(a.getPrecio());
                car.setCantidad(cantidad);
                car.setSubTotal(cantidad * a.getPrecio());

                listaCarrito.add(car);

            }

        }
        

        for (int i = 0; i < listaCarrito.size(); i++) {
            totalPagar = totalPagar + listaCarrito.get(i).getSubTotal();
        }

        request.getSession().setAttribute("totalPagar", totalPagar);

        request.setAttribute("contador", listaCarrito.size());

        request.getSession().setAttribute("carrito", listaCarrito);
        RequestDispatcher rd = request.getRequestDispatcher("verArticulos");
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
            Logger.getLogger(AgregarCarrito.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AgregarCarrito.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(AgregarCarrito.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AgregarCarrito.class.getName()).log(Level.SEVERE, null, ex);
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
