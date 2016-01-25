<%-- 
Ejercicio 2
Mejora el programa anterior de tal forma que la apariencia de la página web que muestra
el navegador luzca más bonita mediante la utilización de CSS (utiliza siempre ficheros
independientes para CSS para no mezclarlo con HTML).
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Ejercicio1</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
          body{
            background-color: #ffffb3;
            text-align: center;
          }
        </style>
    </head>
    <body>
      <% 
        out.println("<b>Nombre:</b> Alejandro</br>"); 
        out.println("<b>telefono:</b> 639531132</br>"); 
        out.println("<b>DNI:</b> 77194405-F</br>");
        out.println("<b>Direccion:</b> Calle Fran del monte nº 7</br>"); 
      %>
    </body>
</html>
