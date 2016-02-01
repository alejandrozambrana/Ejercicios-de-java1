<%-- 
    Document   : Resultado
    Created on : 25-ene-2016, 18:01:01
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
      
        for(int i = 1; i < 11; i++){
          if (request.getParameter("pregunta" + i ).equals("verdadero")) {
            puntos += 3;
          }
        }
    %>
    <div>
    <%
    if (puntos <= 10) {
    out.print("<h2>¡Enhorabuena! tu pareja parece ser totalmente fiel.</h2></br>");
    }
    
    if ((puntos >= 11) && (puntos <= 22)) {
    out.print("<h2>Quizas exista el peligro de otra persona en su vida o en su mente, aunque seguramente sera algo sin importancia. No bajes la guardia.</h2></br>");
    }
    
    if ((puntos > 22) && (puntos <= 30)) {
    out.print("<h2>Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco mas y averigues que es lo que esta pasando por su cabeza.</h2></br>");
    }
    %>
    Haga clic <a href="Index.jsp">aquí</a> para repetir el cuestionario.
    </div>
  </body>
</html>
