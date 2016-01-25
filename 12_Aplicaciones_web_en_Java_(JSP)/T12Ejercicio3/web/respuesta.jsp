<%-- 
    Document   : respuesta
    Created on : 20-ene-2016, 18:22:06
    Author     : Zambrana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <% request.setCharacterEncoding("UTF-8"); %>
    <% out.print("Hola: ");%>
    <% out.print(request.getParameter("variableNombre")); %>
  </body>
</html>
