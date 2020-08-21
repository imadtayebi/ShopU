<%-- 
    Document   : Principal
    Created on : 17-jun-2020, 3:08:53
    Author     : Imad
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% if ("No".equals(request.getAttribute("emailValido"))) { %>
  <div class="alert alert-danger" role="alert">
            Email no válido, ya está en uso.
   </div>

<% } else { %>
  <div class="alert alert-success" role="alert">
        E-mail Correcto.
  </div>

<%}%>
