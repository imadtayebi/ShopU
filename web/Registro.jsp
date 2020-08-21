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
                        <h2>Formulario <span>de alta</span></h2> 
                    </div>

                    <form  class="form-sign" id="registro" action="Insertar" accept-charset="utf-8" method="post" role="form"  onsubmit="return validarAlta(this)">

                        <input class="form-control" type="text" id="nombre" name="nombre" placeholder="&#128100;  Nombre" required autofocus>  <br>                                                          
                        <input class="form-control" type="email" id="email" name="email" onchange="validarEmailDB();" placeholder="&#9993;  Email" required> <span class="text-outline-danger" id="emailvalido" style="font-weight: bold"></span> <br>             
                        <input class="form-control" type="password" id="clave" name="clave" placeholder="&#9993;  Clave" pattern="[A-Za-z][A-Za-z0-9]*[0-9][A-Za-z0-9]*" required>   <br>                   
                        <input class="form-control" type="password" id="clave1" name="clave1" placeholder="&#9993;  Repite la clave" pattern="[A-Za-z][A-Za-z0-9]*[0-9][A-Za-z0-9]*" required>  <span class="text-outline-danger" id="passwordvalida" style="font-weight: bold"></span> <br>                     
                        <input class="form-control" type="text"  id="tel" name="tel" placeholder="&#128222;  Telefono" required>     <br>                  
                        <input class="form-control" type="text" id="direc" name="direc" placeholder="&#8962;  Dirección" required><br>  
                        <select class="form-control" id="busqueda_provincia" name="provincia" >
                            <option value='todas'>Todas las Provincias</option>
                            <option value='alava'>Álava</option>
                            <option value='albacete'>Albacete</option>
                            <option value='alicante'>Alicante/Alacant</option>
                            <option value='almeria'>Almería</option>
                            <option value='asturias'>Asturias</option>
                            <option value='avila'>Ávila</option>
                            <option value='badajoz'>Badajoz</option>
                            <option value='barcelona'>Barcelona</option>
                            <option value='burgos'>Burgos</option>
                            <option value='caceres'>Cáceres</option>
                            <option value='cadiz'>Cádiz</option>
                            <option value='cantabria'>Cantabria</option>
                            <option value='castellon'>Castellón/Castelló</option>
                            <option value='ceuta'>Ceuta</option>
                            <option value='ciudadreal'>Ciudad Real</option>
                            <option value='cordoba'>Córdoba</option>
                            <option value='cuenca'>Cuenca</option>
                            <option value='girona'>Girona</option>
                            <option value='laspalmas'>Las Palmas</option>
                            <option value='granada'>Granada</option>
                            <option value='guadalajara'>Guadalajara</option>
                            <option value='guipuzcoa'>Guipúzcoa</option>
                            <option value='huelva'>Huelva</option>
                            <option value='huesca'>Huesca</option>
                            <option value='illesbalears'>Illes Balears</option>
                            <option value='jaen'>Jaén</option>
                            <option value='acoruña'>A Coruña</option>
                            <option value='larioja'>La Rioja</option>
                            <option value='leon'>León</option>
                            <option value='lleida'>Lleida</option>
                            <option value='lugo'>Lugo</option>
                            <option value='madrid'>Madrid</option>
                            <option value='malaga'>Málaga</option>
                            <option value='melilla'>Melilla</option>
                            <option value='murcia'>Murcia</option>
                            <option value='navarra'>Navarra</option>
                            <option value='ourense'>Ourense</option>
                            <option value='palencia'>Palencia</option>
                            <option value='pontevedra'>Pontevedra</option>
                            <option value='salamanca'>Salamanca</option>
                            <option value='segovia'>Segovia</option>
                            <option value='sevilla'>Sevilla</option>
                            <option value='soria'>Soria</option>
                            <option value='tarragona'>Tarragona</option>
                            <option value='santacruztenerife'>Santa Cruz de Tenerife</option>
                            <option value='teruel'>Teruel</option>
                            <option value='toledo'>Toledo</option>
                            <option value='valencia'>Valencia/Valéncia</option>
                            <option value='valladolid'>Valladolid</option>
                            <option value='vizcaya'>Vizcaya</option>
                            <option value='zamora'>Zamora</option>
                            <option value='zaragoza'>Zaragoza</option>
                        </select>    <br>                      
                        <input class="form-control" type="text" id="localidad" name="localidad" placeholder="&#8962;  Localidad" required> <br>                      
                        <input class="form-control" type="text" id="cdp" name="cdp" placeholder="&#8962;  Código Postal" required>         <br>            
                        <input class="form-control" type="email" id="facebook" name="facebook" placeholder="&#9993;  Facebook" required>   <br>                 
                        <input class="form-control" type="email" id="twitter" name="twitter" placeholder="&#9993;  Twitter" required>      <br>                  
                        <div class="g-recaptcha" data-sitekey="6Ldz2YQUAAAAAGB9BCsaXJVo4C85Zl7-cVYQiFx3"></div><br>
                        <script src='https://www.google.com/recaptcha/api.js?hl=es'></script>       
                        <span class="help-block mb-2">
                            <p>Al continuar con el registro acepta los terminos y condiciones sobre nuestra politica de privacidad</p>
                        </span>
                        <input class="btn btn-primary btn-block" type="submit" value="Registrar">

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
                            webmaster: imad.tayebi@gmail.com                        </div>
                    </div>
                </div>

            </div>
        </footer>


        <script src="js/javascript.js" type="text/javascript"></script>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </body>

</html>
