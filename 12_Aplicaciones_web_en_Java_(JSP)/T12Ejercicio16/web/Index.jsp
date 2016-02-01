<%-- 
Ejercicio 16
Realiza una aplicación que muestre la tirada aleatoria de tres dados de póker.
Utiliza imágenes de dados reales.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Tirada de dados</title>
    <link href="estilos.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
    <h1>Tirada de dados</h1>
    
    <%
      String[] dado = {"as.png", "j.png", "q.png", "k.png", "siete.png", "ocho.png"};
    %>
    <div>
    <%  
      for(int i = 0; i < 3;i++ ){
        out.print("<img src=\"" + dado[(int)(Math.random()*6)] + "\">");
      }
    %>
    </div>
  </body>
</html>
