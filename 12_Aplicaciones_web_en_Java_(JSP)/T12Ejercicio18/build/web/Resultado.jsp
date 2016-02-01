<%-- 
    Document   : Resultado
    Created on : 27-ene-2016, 17:16:49
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
    <h1>El Trile</h1>
    <%
      int aleatorio = (int)(Math.random()*3);
      String cubo[] = {"cubilete_sin_bola.png", "cubilete_sin_bola.png", "cubilete_sin_bola.png" };
      cubo[aleatorio] = "cubilete_con_1bola.png";
      int cubilete = Integer.parseInt(request.getParameter("cubilete"));
    %>
    <div>
    <%  
      for(int i = 0; i < 3; i++ ){
        out.print("<img src=\"" + cubo[i] + "\">");
      }
    %>
    </div>
    <div>
    <%
     if (aleatorio == cubilete) {
        out.print("¡Enhorabuena! ¡Has acertado!");
      } else {
        out.print("Lo siento, has perdido.");
      }
    %>
    </div>
    <p><a href="Index.jsp"><button>Volver a jugar</button></a></p>
  </body>
</html>
