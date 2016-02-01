<%-- 
    Document   : Configurador
    Created on : 27-ene-2016, 16:40:40
    Author     : Zambrana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Resultado</title>
    <link href="estilos.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
    <h1>Su coche configurado!</h1>
    <div>
    <%
      if(request.getParameter("modelo").equals("ST") && request.getParameter("color").equals("Blanco")) {
        out.print("<img src=\" blanco.png \">");
      }
      if(request.getParameter("modelo").equals("ST") && request.getParameter("color").equals("Negro")) {
        out.print("<img src=\" negro.png \">");
      }
      if(request.getParameter("modelo").equals("ST") && request.getParameter("color").equals("Rojo")) {
        out.print("<img src=\" rojo.png \">");
      }
      if(request.getParameter("modelo").equals("Edition") && request.getParameter("color").equals("Blanco")) {
        out.print("<img src=\" whiteEdition.png \">");
      }
      if(request.getParameter("modelo").equals("Edition") && request.getParameter("color").equals("Negro")) {
        out.print("<img src=\" blackEdition.png \">");
      }
      if(request.getParameter("modelo").equals("Edition") && request.getParameter("color").equals("Rojo")) {
        out.print("<img src=\" redEdition.png \">");
      }
    %>
    </div>
  </body>
</html>
