<%-- 
Ejercicio 15
Realiza una aplicación que genere 100 números aleatorios del 1 al 200. Los
primos deberán aparecer en un color diferente al resto.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ejercicio15</title>
    <link href="estilos.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
    <h1> Esta aplicacion Señala los primos</h1>
    <%
             
      for(int i = 0; i < 99;i++){
        int aleatorio = (int)(Math.random()*200);  
        if((aleatorio % 2)==0){
          out.print("<b class=\"naranja\">" + aleatorio + "</b>, ");
        } else {
        out.print( aleatorio + ", ");
        }
      }
    %>
  </body>
</html>
