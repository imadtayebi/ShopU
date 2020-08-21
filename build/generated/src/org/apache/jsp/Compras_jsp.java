package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Compras_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <title>Shop UHU</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    ");
String o = (String) request.getSession().getAttribute("somename");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-info\">\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a style=\"margin-left: 10px; border: none\" class=\"btn btn-outline-light\" href=\"index.jsp\">Shop UHU</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a style=\"margin-left: 10px; border: none\" class=\"btn btn-outline-light\" href=\"index.jsp\">Home</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a style=\"margin-left: 10px; border: none\" class=\"btn btn-outline-light\" href=\"\">Ver articulos</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a style=\"margin-left: 10px; border: none\" class=\"btn btn-outline-light\" href=\"FormularioArticulos.jsp\">Publicar articulos</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a style=\"margin-left: 10px; border: none\" class=\"btn btn-outline-light\" href=\"#\">Clientes</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"dropdown right\" style=\"margin-right: 100px;\">\n");
      out.write("                <button style=\"border: none;\" class=\"btn btn-outline-light dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                    Mi cuenta\n");
      out.write("                </button>\n");
      out.write("                <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton\">\n");
      out.write("                    <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                        <img src=\"imagenes/icon.png\" alt=\"60\" width=\"60\"/>\n");
      out.write("                    </a>\n");
      out.write("                    <a class=\"dropdown-item\" href=\"#\">Usuario</a>\n");
      out.write("                    <a class=\"dropdown-item\" href=\"#\">Expression somename is undefined on line 51, column 57 in Templates/JSP_Servlet/index_3.jsp.</a>\n");
      out.write("                    <div class=\"dropdown-divider\"></div>\n");
      out.write("                    <a class=\"dropdown-item\" href=\"Salir\">Salir</a>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("         <div class=\"container mt-4\">\n");
      out.write("            <h2>Mis Compras</h2>\n");
      out.write("            <div class=\"row\">            \n");
      out.write("                <table class=\"table tab-pane\">\n");
      out.write("                    <thead class=\"thead-light\">\n");
      out.write("                        <tr class=\"text-center\">\n");
      out.write("                            <th>CODIGO DE COMPRA</th>                               \n");
      out.write("                            <th>Monto</th>                                                   \n");
      out.write("                            <th>Codigo de Pago</th>                                                   \n");
      out.write("                            <th>Estado</th>                                                   \n");
      out.write("                            <th></th>                                                   \n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        <c:forEach var=\"p\" items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${miscompras}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            <tr class=\"text-center\">\n");
      out.write("                                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>                                  \n");
      out.write("                                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getMonto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>                                                                                                       \n");
      out.write("                                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getIdPago()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>                                                                                                       \n");
      out.write("                                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getEstado()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>                                                                                                       \n");
      out.write("                                <td>\n");
      out.write("                                    <a href=\"Controlador?accion=verDetalle&idcompra=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Ver Detalle</a>\n");
      out.write("                                </td>                                                                                                       \n");
      out.write("                            </tr>\n");
      out.write("                        </c:forEach>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>             \n");
      out.write("            </div>          \n");
      out.write("        </div> \n");
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
