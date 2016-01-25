<%-- 
Ejercicio 3
Escribe una aplicación que pida tu nombre. A continuación mostrará “Hola” seguido del
nombre introducido. El nombre se deberá recoger mediante un formulario.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="estilos.css">
    <title>Ejercicio 3</title>
  </head>
  <body>
      <form action="respuesta.jsp" method="post" >
        <label for="nombre">Introduze tu nombre:</label></br> 
        <input type="text" name="variableNombre" id="nombre" placeholder="Alejandro" ></br>
        <input type="submit" value="Enviar">
      </form>
  </body>
</html>
