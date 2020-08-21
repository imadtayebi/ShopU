package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Clases.Usuarios;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-info\">\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a style=\"font-family: fantasy; font-size: medium; margin-left: 10px; border: none\" class=\"btn btn-outline-light\" href=\"index.jsp\">Shop UHU</a>\n");
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
      out.write("                    <a class=\"dropdown-item\" href=\"miCuenta.jsp\">\n");
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
      out.write("        ");

            if (o == null) {
        
      out.write("\n");
      out.write("        <div class=\"container mt-4 col-lg-4\">\n");
      out.write("            <div class=\"card col-sm-10\">\n");
      out.write("                <div class=\"card-body \">\n");
      out.write("\n");
      out.write("                    <div class=\"form-group text-center\">\n");
      out.write("                        <h3> Login </h3>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <form class=\"form-sign\" action=\"Login\" >\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label> Usuario: </label>\n");
      out.write("                            <input class=\"form-control\" type =\"text\" placeholder=\"&#128272; Usuario\" id =\"usuario\" name=\"usuario\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label> Contraseña: </label>\n");
      out.write("                            <input class=\"form-control\" type =\"password\" placeholder=\"&#128272; Contraseña\" id=\"clave\" name=\"clave\">\n");
      out.write("                        </div>\n");
      out.write("                        <input class=\"btn btn-primary btn-block\"  name=\"accion\" type=\"submit\" value=\"Ingresar\"> \n");
      out.write("                        <a class=\"btn btn-secundary btn-block\" href=\"Registro.jsp\"> Crear cuenta</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
} else {
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"container mt-4 col-lg-10\">\n");
      out.write("                <div class=\"jumbotron\">\n");
      out.write("                    <h1 class=\"display-4\">Bienvenido ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${somename}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("!</h1>\n");
      out.write("                    <p class=\"lead\">Esta página se encarga de vender productos nuevos y de segundamano. </p>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("\n");
      out.write("                        <img src=\"images/shop.png\" alt=\"250\" width=\"350\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <hr class=\"my-4\">\n");
      out.write("                    <p>Publica tus artículos usados o nuevos.</p>\n");
      out.write("                    <a class=\"btn btn-primary btn-lg\" href=\"FormularioArticulos.jsp\" role=\"button\">Pon tu Anuncio!</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"container mt-4 col-lg-10\">\n");
      out.write("                <div class=\"card-columns text-center\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"card\" style=\"width: 18rem;\">\n");
      out.write("                        <img class=\"card-img-top\" src=\"images/34.jpg\" alt=\"Card image cap\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <h5 class=\"card-title\">Fifa 20</h5>\n");
      out.write("                            <p class=\"card-text\">FIFA 20 - Edición Estándar (PS4)</p>\n");
      out.write("                            <a href=\"verArticulos\" class=\"btn btn-primary\">Ver Más</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"card\" style=\"width: 18rem;\">\n");
      out.write("                        <img class=\"card-img-top\" src=\"images/35.jpg\" alt=\"Card image cap\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <h5 class=\"card-title\">Iphone X</h5>\n");
      out.write("                            <p class=\"card-text\"> Producto reacondicionado por profesionales: revisado con puntos de control, 100% operativo, limpio y enviado con embalaje.  </p>\n");
      out.write("                            <a href=\"verArticulos\" class=\"btn btn-primary\">Ver Más</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"card\" style=\"width: 18rem;\">\n");
      out.write("                        <img class=\"card-img-top\" src=\"images/37.jpg\" alt=\"Card image cap\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <h5 class=\"card-title\">iMac</h5>\n");
      out.write("                            <p class=\"card-text\"> Intel Core i5 de doble núcleo a 2,3 GHz de séptima generación (Turbo Boost de hasta 3,6 GHz)  </p>\n");
      out.write("                            <a href=\"verArticulos\" class=\"btn btn-primary\">Ver Más</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
} 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container mt-4 col-lg-4\">\n");
      out.write("            ");

                if ((String) request.getAttribute("registroexito") == "true") {
            
      out.write("\n");
      out.write("            <div class=\"alert alert-success\" role=\"alert\">\n");
      out.write("                Se ha registrado correctamente.\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            ");
 } else if ((String) request.getAttribute("registroexito") == "false") {
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"alert alert-danger\" role=\"alert\">\n");
      out.write("                Registro fallido.\n");
      out.write("            </div>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <footer class=\"bg-light text-black\">\n");
      out.write("            <div class=\"text-center py-2 lead fixed-bottom\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            Copyright © 2020 - Imad Eddine Tayebi Taybi\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            webmaster: imad.tayebi@gmail.com                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
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
