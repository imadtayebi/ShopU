<%-- 
    Document   : Principal
    Created on : 17-jun-2020, 3:08:53
    Author     : Imad
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="Clases.Usuarios"%>
<%@page import="Clases.Articulos"%>
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
                    <a class="dropdown-item" href="#">
                        <img src="images/icon.png" alt="60" width="60"/>
                    </a>
                    <a class="dropdown-item" href="#">Usuario</a>
                    <a class="dropdown-item" href="#">${somename}</a>
                    <div class="dropdown-divider"></div>
                    <a class="dropdown-item" href="Salir">Salir</a>

                </div>
            </div>


        </nav>

        <div class="container mt-4 ">
            <div class="container">

                <%
                    Articulos Articulo = (Articulos) request.getAttribute("articulo");
                    Usuarios User = (Usuarios) request.getAttribute("vendedor");


                %>

                <div class="row">
                    <div class="col-md-3">
                        <img class="card-img-top" src="images/<%=Articulo.getIdarticulo()%>.jpg"  >
                    </div>

                    <div class="col-md-6 text-center">
                        <div class="col-md-10 mr-5 col-md-offset-2">

                            <div class="card border-info mb-3 col text-center" style="max-width: 50rem;">
                                <div class="card-body text-info">

                                    <h5 class="card-title">
                                        <%=Articulo.getNombre()%>
                                    </h5>



                                </div>

                                <p class="card-text">
                                    <%=Articulo.getDescripcion()%>
                                </p>
                                <div class="card-footer bg-transparent border-info">
                                    <h5 class="text-left"> Estado: <%=Articulo.getEstado()%></h5>
                                    <h5 class="text-left"> Año de adquisicion : <%=Articulo.getAnioAdquisicion()%></h5>
                                    <h3 class="text-left">Precio:  <%=Articulo.getPrecio()%> €</h3>
                                </div>
                            </div>  
                        </div>
                    </div>
                    <div class="col-md-3">
                        <div class="card border-info mb-3 col" style="max-width: 22rem;">
                            <div class="card-header text-info bg-transparent border-info">
                                <h5 class="card-title">
                                    <%=User.getNombre()%>
                                </h5></div>
                            <div class="card-body text-info">

                                <p class="card-text"> Correo:
                                    <%=User.getEmail()%>                                   
                                </p>

                                <p>Numero: <%=User.getTel()%></p>

                            </div>
                            <div class="card-footer bg-transparent border-info">
                                <a class="text-center mr-5" href="https://<%=User.getTwitter()%>"><img src="images/TwitterIcon.png"/></a>
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                <a class="text-center ml-5" href="https://<%=User.getFacebook()%>"><img src="images/FacebookIcon.png"/></a>
                            </div>
                        </div>  
                    </div>



                </div>

            </div>
            <br> <br> <br>
            <div class="container mt-4 ">
                <label> Añadir al carrito</label>

                <a  class="btn" href="AgregarCarrito?id=<%=Articulo.getIdarticulo()%>">
                    <img src="images/carrito.png" alt="30" width="30"/>
                </a>
            </div>

                

            <%
                if (o != null) {
            %>
            <div  class="row">
                <div class="col-md-6">
                    <form class="form-sign" action="Comentario" method="POST">
                        <h3> Comentar </h3>
                        <div class="form-group">
                            <input type="text" class="form-control" id="comentarios" name="comentario" placeholder="Escribe tu comentario..." onclick="mostrarBoton();">
                        </div>
                        <br>
                        <button type="submit" id="enviar_comentario" class="btn btn-default">Enviar</button>
                    </form>


                </div>
            </div>

            <%}%>



        </div>




    </body>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</html>
