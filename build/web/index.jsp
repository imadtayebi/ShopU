<%-- 
    Document   : Principal
    Created on : 17-jun-2020, 3:08:53
    Author     : Imad
--%>

<%@page import="Clases.Usuarios"%>
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
                        <a style="font-family: fantasy; font-size: medium; margin-left: 10px; border: none" class="btn btn-outline-light" href="index.jsp">Shop UHU</a>
                    </li>
                    <li class="nav-item active">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="index.jsp">Home</a>
                    </li>
                    <li class="nav-item">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="verArticulos">Ver articulos</a>
                    </li>

                    <%
                        if (o != null) {
                    %>

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
                    
                    <%} %>


        </nav>

        <%
            if (o == null) {
        %>
        <div class="container mt-4 col-lg-4">
            <div class="card col-sm-10">
                <div class="card-body ">

                    <div class="form-group text-center">
                        <h3> Login </h3>
                    </div>

                    <form class="form-sign" action="Login" >
                        <div class="form-group">
                            <label> Usuario: </label>
                            <input class="form-control" type ="text" placeholder="&#128272; Usuario" id ="usuario" name="usuario">
                        </div>
                        <div class="form-group">
                            <label> Contraseña: </label>
                            <input class="form-control" type ="password" placeholder="&#128272; Contraseña" id="clave" name="clave">
                        </div>
                        <input class="btn btn-primary btn-block"  name="accion" type="submit" value="Ingresar"> 
                        <a class="btn btn-secundary btn-block" href="Registro.jsp"> Crear cuenta</a>


                    </form>


                </div>

            </div>

        </div>


        <%} else {%>


        <div class="row">


            <div class="container mt-4 col-lg-10">
                <div class="jumbotron">
                    <h1 class="display-4">Bienvenido ${somename}!</h1>
                    <p class="lead">Esta página se encarga de vender productos nuevos y de segundamano. </p>
                    <div class="col-md-4">

                        <img src="images/shop.png" alt="250" width="350"/>


                    </div>


                    <hr class="my-4">
                    <p>Publica tus artículos usados o nuevos.</p>
                    <a class="btn btn-primary btn-lg" href="FormularioArticulos.jsp" role="button">Pon tu Anuncio!</a>
                </div>
            </div>

            <div class="container mt-4 col-lg-10">
                <div class="card-columns text-center">


                    <div class="card" style="width: 18rem;">
                        <img class="card-img-top" src="images/34.jpg" alt="Card image cap">
                        <div class="card-body">
                            <h5 class="card-title">Fifa 20</h5>
                            <p class="card-text">FIFA 20 - Edición Estándar (PS4)</p>
                            <a href="verArticulos" class="btn btn-primary">Ver Más</a>
                        </div>
                    </div>

                    <div class="card" style="width: 18rem;">
                        <img class="card-img-top" src="images/35.jpg" alt="Card image cap">
                        <div class="card-body">
                            <h5 class="card-title">Iphone X</h5>
                            <p class="card-text"> Producto reacondicionado por profesionales: revisado con puntos de control, 100% operativo, limpio y enviado con embalaje.  </p>
                            <a href="verArticulos" class="btn btn-primary">Ver Más</a>
                        </div>
                    </div>

                    <div class="card" style="width: 18rem;">
                        <img class="card-img-top" src="images/37.jpg" alt="Card image cap">
                        <div class="card-body">
                            <h5 class="card-title">iMac</h5>
                            <p class="card-text"> Intel Core i5 de doble núcleo a 2,3 GHz de séptima generación (Turbo Boost de hasta 3,6 GHz)  </p>
                            <a href="verArticulos" class="btn btn-primary">Ver Más</a>
                        </div>
                    </div>

                </div>

            </div>

        </div>

        <%} %>



        <div class="container mt-4 col-lg-4">
            <%
                if ((String) request.getAttribute("registroexito") == "true") {
            %>
            <div class="alert alert-success" role="alert">
                Se ha registrado correctamente.
            </div>

            <% } else if ((String) request.getAttribute("registroexito") == "false") {%>

            <div class="alert alert-danger" role="alert">
                Registro fallido.
            </div>
            <%}%>
        </div>





        <footer class="bg-light text-black">
            <div class="text-center py-2 lead fixed-bottom">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-6">
                            Copyright © 2020 - Imad Eddine Tayebi Taybi
                        </div>
                        <div class="col-sm-6">
                            webmaster: imad.tayebi@gmail.com                        </div>
                    </div>
                </div>

            </div>
        </footer>


    </body>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</html>
