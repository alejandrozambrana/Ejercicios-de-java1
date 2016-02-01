<%-- 
    Document   : conversor
    Created on : 21-ene-2016, 17:11:06
    Author     : Zambrana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>resultado</title>
  </head>
  <body>  
    <%
      Double euros = Double.parseDouble(request.getParameter("conversor"));
      Double pesetas = euros * 166.386;
    %> 
      <% out.println("La cantidad de euros introducida " + (int) +  euros);%> 
      <% out.print("El resultado de la conversion es: ");%> 
      <% out.print((int) + pesetas);%> 
  </body>
</html>
