<%-- 
    Document   : Principal
    Created on : 17-jun-2020, 3:08:53
    Author     : Imad
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="">Ver articulos</a>
                    </li>
                    <li class="nav-item">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="FormularioArticulos.jsp">Publicar articulos</a>
                    </li>
                    <li class="nav-item">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="#">Clientes</a>
                    </li>
                </ul>

            </div>
            <div class="dropdown right" style="margin-right: 100px;">
                <button style="border: none;" class="btn btn-outline-light dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Mi cuenta
                </button>
                <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                    <a class="dropdown-item" href="#">
                        <img src="imagenes/icon.png" alt="60" width="60"/>
                    </a>
                    <a class="dropdown-item" href="#">Usuario</a>
                    <a class="dropdown-item" href="#">Expression somename is undefined on line 51, column 57 in Templates/JSP_Servlet/index_3.jsp.</a>
                    <div class="dropdown-divider"></div>
                    <a class="dropdown-item" href="Salir">Salir</a>

                </div>
            </div>


        </nav>

         <div class="container mt-4">
            <h2>Mis Compras</h2>
            <div class="row">            
                <table class="table tab-pane">
                    <thead class="thead-light">
                        <tr class="text-center">
                            <th>CODIGO DE COMPRA</th>                               
                            <th>Monto</th>                                                   
                            <th>Codigo de Pago</th>                                                   
                            <th>Estado</th>                                                   
                            <th></th>                                                   
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="p" items="${miscompras}">
                            <tr class="text-center">
                                <td>${p.getId()}</td>                                  
                                <td>${p.getMonto()}</td>                                                                                                       
                                <td>${p.getIdPago()}</td>                                                                                                       
                                <td>${p.getEstado()}</td>                                                                                                       
                                <td>
                                    <a href="DetalleCompras?id=${p.getId()}">Ver Detalle</a>
                                </td>                                                                                                       
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>             
            </div>          
        </div> 

        



    </body>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</html>
