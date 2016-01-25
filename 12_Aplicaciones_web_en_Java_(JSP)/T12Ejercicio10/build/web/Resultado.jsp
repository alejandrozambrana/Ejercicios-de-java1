<%-- 
    Document   : Aciertos
    Created on : 24-ene-2016, 20:53:26
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
    <h1>Resultados</h1>
    <%
      int puntos = 0;
      
        if (request.getParameter("pregunta1").equals("si")) {
          puntos++;
        }
        if (request.getParameter("pregunta2").equals("no")) {
          puntos++;
        }
        if (request.getParameter("pregunta3").equals("no")) {
          puntos++;
        }
        if (request.getParameter("pregunta4").equals("si")) {
          puntos++;
        } 
        if (request.getParameter("pregunta5").equals("no")) {
          puntos++;
        }
        if (request.getParameter("pregunta6").equals("no")) {
          puntos++;
        }
        if (request.getParameter("pregunta7").equals("si")) {
          puntos++;
        }
        if (request.getParameter("pregunta8").equals("no")) {
          puntos++;
        } 
        if (request.getParameter("pregunta9").equals("si")) {
          puntos++;
        } 
        if (request.getParameter("pregunta10").equals("no")) {
          puntos++;
        } 
        %>
        <div>
        <%
        out.print("<h2>" + "Tu Puntuacion es de " + puntos + " puntos" + "</h2>" );
        %>
        Haga clic <a href="Index.jsp">aquí</a> para repetir el cuestionario.
        </div>
  </body>
</html>
