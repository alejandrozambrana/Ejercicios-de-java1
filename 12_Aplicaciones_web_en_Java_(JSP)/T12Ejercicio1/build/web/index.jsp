<!DOCTYPE html>
<!--
Ejercicio 1
Crea una aplicaci�n web en Java que muestre tu nombre y tus datos personales por pantalla.
La p�gina principal debe ser un archivo con la extensi�n jsp . Comprueba que se lanzan
bien el servidor y el navegador web. Observa los mensajes que da el servidor. F�jate en la
direcci�n que aparece en la barra de direcciones del navegador.
-->
<html>
    <head>
        <title>Ejercicio1</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
      <% 
        out.println("<b>Nombre:</b> Alejandro</br>"); 
        out.println("<b>telefono:</b> 639531132</br>"); 
        out.println("<b>DNI:</b> 77194405-F</br>");
        out.println("<b>Direccion:</b> Calle Fran del monte n� 7</br>"); 
      %>
    </body>
</html>
