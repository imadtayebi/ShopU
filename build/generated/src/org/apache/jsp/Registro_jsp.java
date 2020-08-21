package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <div class=\"container mt-4 col-lg-4\">\n");
      out.write("            <div class=\"card col-sm-10\">\n");
      out.write("                <div class=\"card-body \">\n");
      out.write("\n");
      out.write("                    <div class=\"form-group text-center\">\n");
      out.write("                        <h2>Formulario <span>de alta</span></h2> \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <form  class=\"form-sign\" id=\"registro\" action=\"Insertar\" accept-charset=\"utf-8\" method=\"post\" role=\"form\"  onsubmit=\"return validarAlta(this)\">\n");
      out.write("\n");
      out.write("                        <input class=\"form-control\" type=\"text\" id=\"nombre\" name=\"nombre\" placeholder=\"&#128100;  Nombre\" required autofocus>  <br>                                                          \n");
      out.write("                        <input class=\"form-control\" type=\"email\" id=\"email\" name=\"email\" onchange=\"validarEmailDB();\" placeholder=\"&#9993;  Email\" required> <span class=\"text-outline-danger\" id=\"emailvalido\" style=\"font-weight: bold\"></span> <br>             \n");
      out.write("                        <input class=\"form-control\" type=\"password\" id=\"clave\" name=\"clave\" placeholder=\"&#9993;  Clave\" pattern=\"[A-Za-z][A-Za-z0-9]*[0-9][A-Za-z0-9]*\" required>   <br>                   \n");
      out.write("                        <input class=\"form-control\" type=\"password\" id=\"clave1\" name=\"clave1\" placeholder=\"&#9993;  Repite la clave\" pattern=\"[A-Za-z][A-Za-z0-9]*[0-9][A-Za-z0-9]*\" required>   <br>                     \n");
      out.write("                        <input class=\"form-control\" type=\"text\"  id=\"tel\" name=\"tel\" placeholder=\"&#128222;  Telefono\" required>     <br>                  \n");
      out.write("                        <input class=\"form-control\" type=\"text\" id=\"direc\" name=\"direc\" placeholder=\"&#8962;  Dirección\" required><br>  \n");
      out.write("                        <select class=\"form-control\" id=\"busqueda_provincia\" name=\"provincia\" >\n");
      out.write("                            <option value='todas'>Todas las Provincias</option>\n");
      out.write("                            <option value='alava'>Álava</option>\n");
      out.write("                            <option value='albacete'>Albacete</option>\n");
      out.write("                            <option value='alicante'>Alicante/Alacant</option>\n");
      out.write("                            <option value='almeria'>Almería</option>\n");
      out.write("                            <option value='asturias'>Asturias</option>\n");
      out.write("                            <option value='avila'>Ávila</option>\n");
      out.write("                            <option value='badajoz'>Badajoz</option>\n");
      out.write("                            <option value='barcelona'>Barcelona</option>\n");
      out.write("                            <option value='burgos'>Burgos</option>\n");
      out.write("                            <option value='caceres'>Cáceres</option>\n");
      out.write("                            <option value='cadiz'>Cádiz</option>\n");
      out.write("                            <option value='cantabria'>Cantabria</option>\n");
      out.write("                            <option value='castellon'>Castellón/Castelló</option>\n");
      out.write("                            <option value='ceuta'>Ceuta</option>\n");
      out.write("                            <option value='ciudadreal'>Ciudad Real</option>\n");
      out.write("                            <option value='cordoba'>Córdoba</option>\n");
      out.write("                            <option value='cuenca'>Cuenca</option>\n");
      out.write("                            <option value='girona'>Girona</option>\n");
      out.write("                            <option value='laspalmas'>Las Palmas</option>\n");
      out.write("                            <option value='granada'>Granada</option>\n");
      out.write("                            <option value='guadalajara'>Guadalajara</option>\n");
      out.write("                            <option value='guipuzcoa'>Guipúzcoa</option>\n");
      out.write("                            <option value='huelva'>Huelva</option>\n");
      out.write("                            <option value='huesca'>Huesca</option>\n");
      out.write("                            <option value='illesbalears'>Illes Balears</option>\n");
      out.write("                            <option value='jaen'>Jaén</option>\n");
      out.write("                            <option value='acoruña'>A Coruña</option>\n");
      out.write("                            <option value='larioja'>La Rioja</option>\n");
      out.write("                            <option value='leon'>León</option>\n");
      out.write("                            <option value='lleida'>Lleida</option>\n");
      out.write("                            <option value='lugo'>Lugo</option>\n");
      out.write("                            <option value='madrid'>Madrid</option>\n");
      out.write("                            <option value='malaga'>Málaga</option>\n");
      out.write("                            <option value='melilla'>Melilla</option>\n");
      out.write("                            <option value='murcia'>Murcia</option>\n");
      out.write("                            <option value='navarra'>Navarra</option>\n");
      out.write("                            <option value='ourense'>Ourense</option>\n");
      out.write("                            <option value='palencia'>Palencia</option>\n");
      out.write("                            <option value='pontevedra'>Pontevedra</option>\n");
      out.write("                            <option value='salamanca'>Salamanca</option>\n");
      out.write("                            <option value='segovia'>Segovia</option>\n");
      out.write("                            <option value='sevilla'>Sevilla</option>\n");
      out.write("                            <option value='soria'>Soria</option>\n");
      out.write("                            <option value='tarragona'>Tarragona</option>\n");
      out.write("                            <option value='santacruztenerife'>Santa Cruz de Tenerife</option>\n");
      out.write("                            <option value='teruel'>Teruel</option>\n");
      out.write("                            <option value='toledo'>Toledo</option>\n");
      out.write("                            <option value='valencia'>Valencia/Valéncia</option>\n");
      out.write("                            <option value='valladolid'>Valladolid</option>\n");
      out.write("                            <option value='vizcaya'>Vizcaya</option>\n");
      out.write("                            <option value='zamora'>Zamora</option>\n");
      out.write("                            <option value='zaragoza'>Zaragoza</option>\n");
      out.write("                        </select>    <br>                      \n");
      out.write("                        <input class=\"form-control\" type=\"text\" id=\"localidad\" name=\"localidad\" placeholder=\"&#8962;  Localidad\" required> <br>                      \n");
      out.write("                        <input class=\"form-control\" type=\"text\" id=\"cdp\" name=\"cdp\" placeholder=\"&#8962;  Código Postal\" required>         <br>            \n");
      out.write("                        <input class=\"form-control\" type=\"email\" id=\"facebook\" name=\"facebook\" placeholder=\"&#9993;  Facebook\" required>   <br>                 \n");
      out.write("                        <input class=\"form-control\" type=\"email\" id=\"twitter\" name=\"twitter\" placeholder=\"&#9993;  Twitter\" required>      <br>                  \n");
      out.write("                        <div class=\"g-recaptcha\" data-sitekey=\"6Ldz2YQUAAAAAGB9BCsaXJVo4C85Zl7-cVYQiFx3\"></div><br>\n");
      out.write("                        <script src='https://www.google.com/recaptcha/api.js?hl=es'></script>       \n");
      out.write("                        <span class=\"help-block mb-2\">\n");
      out.write("                            <p>Al continuar con el registro acepta los terminos y condiciones sobre nuestra politica de privacidad</p>\n");
      out.write("                        </span>\n");
      out.write("                        <input class=\"btn btn-primary btn-block\" type=\"submit\" value=\"Registrar\">\n");
      out.write("\n");
      out.write("                    </form>  \n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
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
      out.write("        <script src=\"js/javascript.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
      out.write("\n");
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
