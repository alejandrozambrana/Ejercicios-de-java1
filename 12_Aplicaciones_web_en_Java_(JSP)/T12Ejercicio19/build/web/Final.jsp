<%-- 
    Document   : Final
    Created on : 27-ene-2016, 18:44:55
    Author     : Zambrana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Final</title>
    <link href="estilos.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
    <h1>Apuesta y gana</h1>
    <div>
      <%
        int dinero = Integer.parseInt(request.getParameter("dinero"));
      %>
      <h2>Ha conseguido <%= dinero %> euros</h2>
      <form class="sinestilo" method="post" action="Index.jsp">
        <input type="submit" value="Volver a jugar">
      </form>
    </div>
  </body>
</html>
