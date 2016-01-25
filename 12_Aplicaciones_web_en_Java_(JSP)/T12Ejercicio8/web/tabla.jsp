<%-- 
    Document   : tabla
    Created on : 24-ene-2016, 19:07:02
    Author     : Zambrana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="estilos.css" rel="stylesheet" type="text/css" /> 
    <title>JSP Page</title>
  </head>
  <body>
    <h1>Tabla de multiplicar</h1>
    
  <% int tabla = Integer.parseInt(request.getParameter("tabla")); %>
  <table>
    <%
      for (int i = 0; i <= 10; i++) {
        out.println("<tr><td>" + tabla + " x " + i + "</td><td>" + " = " + "</td><td>" + tabla * i + "</td></tr>");
      }
    %>
  </table>
  </body>
</html>
