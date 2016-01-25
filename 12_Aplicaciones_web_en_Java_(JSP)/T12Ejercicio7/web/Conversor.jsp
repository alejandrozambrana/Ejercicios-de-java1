<%-- 
    Document   : Conversor
    Created on : 24-ene-2016, 17:16:33
    Author     : Zambrana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ejercicio 7</title>
    <link href="estilos.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
    <%
      Double euros = 0.0;
      Double pesetas = 0.0;
      
    if (request.getParameter("Convertir").equals("eurosPesetas")){
      
      euros = Double.parseDouble(request.getParameter("conversor"));
      pesetas = euros * 166.386;
    %>
    
      <div>
        <% out.println("La cantidad de euros introducida " + euros + " euros.</br>");%>
        <% out.println("El resultado de la conversion es: " + pesetas + " pesetas.</br></br>");%>
        <img src="Pesetas.jpg" alt="Pesetas" title="Pesetas"></br>
      </div>
      
    <%   
    } else {
      
      pesetas  = Double.parseDouble(request.getParameter("conversor"));
      euros = pesetas / 166.386;
    %>
    
    <div>
        <% out.println("La cantidad de pesetas introducida " + pesetas + " pesetas.</br>");%>
        <% out.println("\nEl resultado de la conversion es: " + euros + " euros.</br></br>");%>
        <img src="euros.jpg" alt="Euros" title=""></br>
    </div>
      
    <% 
    }
    %>
  </body>
</html>
