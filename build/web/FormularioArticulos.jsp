<%-- 
    Document   : Principal
    Created on : 17-jun-2020, 3:08:53
    Author     : Imad
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

        <title>Shop UHU</title>
    </head>


    <body>

        <%String o = (String) request.getSession().getAttribute("somename");%>
        
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

        <div class="container mt-4 col-lg-4">
            <div class="card col-sm-10">
                <div class="card-body ">

                    <div class="form-group text-center">
                        <h2>Formulario <span>de publicación</span></h2>
                    </div>

                    <form class="form-sign" action="InsertarArticulo" method="post" enctype="multipart/form-data">
                        <div class="form-group">
                            <label for="nombre">Nombre</label>
                            <input class="form-control" type="text" id="nombre" name="nombre" required autofocus>      
                        </div>
                        <div class="form-group">
                            <label for="desc">Descripción</label>
                            <textarea class="form-control" type="text" id="desc" name="desc" > </textarea>     
                        </div>

                        <div class="form-group">
                            <label>Categoría</label>
                            <SELECT class="form-control" id = "categoria" name="categoria" required>
                                <OPTION>Electrónica
                                <OPTION>Lectura
                                <OPTION>Juegos
                                <OPTION>Otros
                            </SELECT>       
                        </div>

                        <div class="form-group">
                            <label>Estado</label>

                            <SELECT class="form-control" id="estado" name="estado">
                                <OPTION>Nuevo
                                <OPTION>Seminuevo
                                <OPTION>Deteriorado
                                <OPTION>Antiguo
                            </SELECT>   

                        </div>

                        <div class="form-group">
                            <label for="anyo">Año de adquisición</label>
                            <input class="form-control" type="text" id="anyo" name="anyo" >

                        </div>
                        <div class="form-group">
                            <label for="precio">Precio de venta</label>
                            <input class="form-control" type="number" id="precio" name="precio"  required>

                        </div>

                        <div class="form-group">
                            <label for="file">Subir Foto</label>
                            <input type="file" id="file" name="file">
                        </div>




                        <input class="btn btn-primary btn-block" type="submit" value="Publicar">

                    </form>


                </div>

            </div>

        </div>

        <footer class="bg-light text-black">
            <div class="text-center py-2 lead fixed-bottom">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-6">
                            Copyright © 2020 - Imad Eddine Tayebi Taybi
                        </div>
                        <div class="col-sm-6">
                            webmaster: imad.tayebi@gmail.com                       
                        </div>
                    </div>
                </div>

            </div>
        </footer>


    </body>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</html>
