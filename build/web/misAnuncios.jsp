<%-- 
    Document   : Principal
    Created on : 17-jun-2020, 3:08:53
    Author     : Imad
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

        <title>Shop UHU</title>
    </head>

    <%String o = (String) request.getSession().getAttribute("somename");%>
    <body>


        <nav class="navbar navbar-expand-lg navbar-light bg-info">
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item active">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="index.jsp">Shop UHU</a>
                    </li>
                    <li class="nav-item active">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="index.jsp">Home</a>
                    </li>
                    <li class="nav-item">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="verArticulos">Ver articulos</a>
                    </li>
                    <li class="nav-item">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="FormularioArticulos.jsp">Publicar articulos</a>
                    </li>
                    <div>
                        <li class="nav-item">

                            <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="Carrito.jsp"><i class="fas fa-cart-plus"> </i>Carrito (<label>${contador}</label>)</a>
                            <img href="Carrito.jsp" src="images/carrito.png"   alt="25" width="25"/>
                        </li>
                    </div>

                </ul>

            </div>
            <div class="dropdown right" style="margin-right: 100px;">
                <button style="border: none;" class="btn btn-outline-light dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Mi cuenta
                </button>
                <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                    <a class="dropdown-item" href="miCuenta.jsp">
                        <img src="images/icon.png" alt="60" width="60"/>
                    </a>
                    <a class="dropdown-item" href="#">Usuario</a>
                    <a class="dropdown-item" href="#">${somename}</a>
                    <div class="dropdown-divider"></div>
                    <a class="dropdown-item" href="Salir">Salir</a>

                </div>
            </div>


        </nav>

        <div class="jumbotron text-center">
            <h3>Mis anuncios</h3>
            <div class="card-columns-deck text-center" >


                <div class="row">
                    <div class="col-sm-8"> 
                        <table border="1" class="table">
                            <thead class="thead-dark">
                                <tr>
                                    <th>NOMBRE</th>
                                    <th>DESCRIPCION</th>
                                    <th>PRECIO</th>
                                    <th>ACCION</th>
                                </tr>
                            </thead>


                            <tbody>
                                <%
                                    ResultSet r;
                                    r = (ResultSet) request.getAttribute("misAnuncios");
                                    if (r != null) {
                                        while (r.next()) {
                                            Long idart = r.getLong(1);
                                            String id = "" + idart;
                                %>
                                <tr>
                                    <td><%= r.getString(2)%></td>
                                    <td><%= r.getString(3)%> 
                                        <img src="images/<%=idart%>.jpg" alt="100" width="100"> 

                                    </td>
                                    <td><%= r.getString(7)%> €</td>
                                    <td>
                                        <input type="hidden">
                                        <a href="" > eliminar </a>

                                    </td>
                                </tr>
                                <% }
                                    } else {%>
                            <h1>No has publicado ningun anuncio</h1>
                            <%}%>
                            </tbody>
                        </table>



                    </div>

                </div>


            </div>
        </div>





    </body>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</html>
