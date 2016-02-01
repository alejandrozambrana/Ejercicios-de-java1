<%-- 
    Document   : Conversor
    Created on : 24-ene-2016, 16:54:31
    Author     : Zambrana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Conversor</title>
  </head>
  <body>  
    <%
      Double pesetas  = Double.parseDouble(request.getParameter("conversor"));
      Double euros = pesetas / 166.386;
    %> 
      <% out.println("La cantidad de pesetas introducida " + (int) + pesetas + " pesetas");%> 
      <% out.print("El resultado de la conversion es: " + euros + "euros");%> 
  </body>
</html>
