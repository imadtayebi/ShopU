/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/*
 * FUNCION PARA INICIAR LAS PETICIONES AJAX
 */
var xhr;

function init_ajax() {
    if (window.XMLHttpRequest) {
        xhr = new XMLHttpRequest();
    } else if (window.ActiveXObject) {
        xhr = new ActiveXObject("Microsoft.XMLHTTP");
    }

}





function validarEmailDB() {

    init_ajax();
    
    var url = "emailValido";
    xhr.open("POST", url, true);
    xhr.onreadystatechange = emailValido;
    
    var f = document.getElementById("registro");
    var email = f.email.value;
    
    var datos = "email=" + encodeURIComponent(email);
    xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    xhr.send(datos);

}

function emailValido() {
    if (xhr.readyState === 4) {
        if (xhr.status === 200) {
            document.getElementById("emailvalido").innerHTML = xhr.responseText;
        }
    }
}

function validarAlta() {
    var ok = true;
    var f = document.getElementById("registro");

    if (f.clave.value != f.clave1.value) {
        document.getElementById("passwordvalida").innerHTML = "Error. Las contraseñas deben de coincidir";
        ok = false;
    }
    
    var email = f.email.value;
    var expr = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    if ( !expr.test(email) ){
        alert("Error: La dirección de correo " + email + " es incorrecta.");
        ok = false;
    }
    
    return ok;
}

function ultimos(){
    window.location="ultimosAnuncios";
}

function ultimos() {
    init_ajax();
    var url = "/ShopUHU/ultimosAnuncios";
    xhr.open("POST", url, true);
    
    xhr.onreadystatechange = ultimosArticulos;

    var datos = "ultimosAnuncios";
    
    xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    //alert("sigue sin ir");
    xhr.send(datos);
    //alert("salgo");
}

function ultimosArticulos() {

    if (xhr.readyState === 4) {
        if (xhr.status === 200) {
            document.getElementById("ult").innerHTML = xhr.responseText;
        }
    }
}

function redireccion(sitio){
    alert(sitio);
    location.href= sitio;
}


$(document).ready(function()){
    $(" tr #btnDelete").click(function ()){
        var ida = $(this).parent().find("#ida").val();
        eliminar(ida);
    }) ;
});

function eliminar(ida){
    var url="EliminarCarrito"
    $.ajax({
        type: 'POST',
        url: url,
        data: "ida="+ida,
        success: function (data, textStatus, jqXHR){
            alert("Registro eliminado");
        }
    });
}