package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import Clases.Usuarios;
import Clases.Articulos;

public final class verDetalles_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                <nav class=\"navbar navbar-expand-lg navbar-light bg-info\">\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a style=\"margin-left: 10px; border: none\" class=\"btn btn-outline-light\" href=\"index.jsp\">Shop UHU</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a style=\"margin-left: 10px; border: none\" class=\"btn btn-outline-light\" href=\"index.jsp\">Home</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a style=\"margin-left: 10px; border: none\" class=\"btn btn-outline-light\" href=\"verArticulos\">Ver articulos</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a style=\"margin-left: 10px; border: none\" class=\"btn btn-outline-light\" href=\"FormularioArticulos.jsp\">Publicar articulos</a>\n");
      out.write("                    </li>\n");
      out.write("                    <div>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("\n");
      out.write("                            <a style=\"margin-left: 10px; border: none\" class=\"btn btn-outline-light\" href=\"Carrito.jsp\"><i class=\"fas fa-cart-plus\"> </i>Carrito (<label>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contador}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>)</a>\n");
      out.write("                            <img href=\"Carrito.jsp\" src=\"images/carrito.png\"   alt=\"25\" width=\"25\"/>\n");
      out.write("                        </li>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"dropdown right\" style=\"margin-right: 100px;\">\n");
      out.write("                <button style=\"border: none;\" class=\"btn btn-outline-light dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                    Mi cuenta\n");
      out.write("                </button>\n");
      out.write("                <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton\">\n");
      out.write("                    <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                        <img src=\"images/icon.png\" alt=\"60\" width=\"60\"/>\n");
      out.write("                    </a>\n");
      out.write("                    <a class=\"dropdown-item\" href=\"#\">Usuario</a>\n");
      out.write("                    <a class=\"dropdown-item\" href=\"#\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${somename}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\n");
      out.write("                    <div class=\"dropdown-divider\"></div>\n");
      out.write("                    <a class=\"dropdown-item\" href=\"Salir\">Salir</a>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div class=\"jumbotron\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("                ");

                    Articulos Articulo = (Articulos) request.getAttribute("articulo");
                    Usuarios User = (Usuarios) request.getAttribute("vendedor");


                
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <img class=\"card-img-top\" src=\"images/");
      out.print(Articulo.getIdarticulo());
      out.write(".jpg\" width=\"100\" height=\"350\" alt=\"Card image cap\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-6 text-center\">\n");
      out.write("                        <div class=\"col-md-10 mr-5 col-md-offset-2\">\n");
      out.write("\n");
      out.write("                            <div class=\"card border-info mb-3 col text-center\" style=\"max-width: 50rem;\">\n");
      out.write("                                <div class=\"card-body text-info\">\n");
      out.write("                                    \n");
      out.write("                                    <h5 class=\"card-title\">\n");
      out.write("                                        ");
      out.print(Articulo.getNombre());
      out.write(' ');
      out.write('(');
      out.print(Articulo.getEstado());
      out.write(" - ");
      out.print(Articulo.getAnioAdquisicion());
      out.write(")\n");
      out.write("                                    </h5>\n");
      out.write("                                    \n");
      out.write("                                    <p class=\"card-text\">\n");
      out.write("                                        ");
      out.print(Articulo.getDescripcion());
      out.write("\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"card-footer bg-transparent border-info\">\n");
      out.write("                                    <label>Precio: </label>\n");
      out.write("                                    <h3 class=\"text-center\">");
      out.print(Articulo.getPrecio());
      out.write(" €</h3>\n");
      out.write("                                </div>\n");
      out.write("                            </div>  \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <div class=\"card border-info mb-3 col\" style=\"max-width: 22rem;\">\n");
      out.write("                            <div class=\"card-header text-info bg-transparent border-info\"><h5 class=\"card-title\">\n");
      out.write("                                    ");
      out.print(User.getNombre());
      out.write("\n");
      out.write("                                </h5></div>\n");
      out.write("                            <div class=\"card-body text-info\">\n");
      out.write("\n");
      out.write("                                <p class=\"card-text\">\n");
      out.write("                                    ");
      out.print(User.getEmail());
      out.write("\n");
      out.write("                                    ");
      out.print(User.getProvincia());
      out.write(" - ");
      out.print(User.getLocalidad());
      out.write("\n");
      out.write("                                    ");
      out.print(User.getTel());
      out.write("\n");
      out.write("                                </p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-footer bg-transparent border-info\">\n");
      out.write("                                <a class=\"text-center mr-5\" href=\"https://");
      out.print(User.getTwitter());
      out.write("\"><img src=\"images/TwitterIcon.png\"/></a>\n");
      out.write("                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                <a class=\"text-center ml-5\" href=\"https://");
      out.print(User.getFacebook());
      out.write("\"><img src=\"images/FacebookIcon.png\"/></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>  \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <h3>Comentarios</h3>\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                ");
 if (session.getAttribute("somename") != null) {
      out.write("\n");
      out.write("                <form class=\"form-web\" name=\"formulario-comentarios\" action=\"Comentar\" method=\"POST\">\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <textarea type=\"text\" class=\"form-control\" id=\"comentarios\" name=\"comentario\" placeholder=\"Escribe tu comentario...\" onclick=\"mostrarBoton();\"> </textarea>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <input type=\"hidden\" class=\"form-control\" id=\"idarticulo\" name=\"idarticulo\" value=\"");
      out.print(Articulo.getIdarticulo());
      out.write("\">\n");
      out.write("                        <input type=\"hidden\" class=\"form-control\" id=\"idusuario\" name=\"idusuario\" value=\"");
      out.print(User.getId());
      out.write("\">\n");
      out.write("                        <button type=\"submit\" id=\"enviar_comentario\" class=\"btn btn-default\">Enviar</button>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("                <div class=\"ml-5\">\n");
      out.write("                    <form action=\"verComentarios\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"hidden\" class=\"form-control\" id=\"idarticulo\" name=\"idarticulo\" value=\"");
      out.print(Articulo.getIdarticulo());
      out.write("\">\n");
      out.write("                            <input type=\"hidden\" class=\"form-control\" id=\"idusuario\" name=\"idusuario\" value=\"");
      out.print(User.getId());
      out.write("\">\n");
      out.write("                        </div>\n");
      out.write("                       \n");
      out.write("                        <input class=\"btn btn-outline-info ml-8\" type=\"submit\" value=\"VerComentarios\" />\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"text-center ml-8\">\n");
      out.write("                    <div class=\"card-columns text-center\" >\n");
      out.write("                        <div class=\"card-body text-info\">\n");
      out.write("                            ");

                                ResultSet rs = (ResultSet) request.getAttribute("vercomentarios");
                                if (rs != null) {
                                    while (rs.next()) {
                            
      out.write("\n");
      out.write("                            <div class=\"card\" style=\"width: 25rem;\">\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <h5 class=\"card-title\" href=\"#\">");
      out.print(rs.getDate(2));
      out.write("</h5>\n");
      out.write("\n");
      out.write("                                    <p class=\"card-text\">");
      out.print(rs.getString(1));
      out.write(" </p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"card-footer bg-transparent border-info\">\n");
      out.write("                                    <p class=\"card-text\">");
      out.print(rs.getString(3));
      out.write(" </p>    \n");
      out.write("                                    <p class=\"card-text\">");
      out.print(rs.getString(4));
      out.write(" </p>                              \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            ");
}
                                }
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>  \n");
      out.write("\n");
      out.write("                ");
} else {
      out.write("\n");
      out.write("                <div class=\"text-danger\"><h4>¡Debes de iniciar sesión para poder publicar un comentario!</h4></div>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </div>                \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
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
