<%-- 
Ejercicio 4
Realiza una aplicación que calcule la media de tres notas.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ejercicio 4</title>
  </head>
  <body>
     <form action="resultado.jsp" method="post" >
        <label for="nota1">Introduze la primera nota:</label></br> 
        <input type="text" name="nota1" id="nota1" placeholder="8" ></br>
        <label for="nota2">Introduze la segunda nota:</label></br> 
        <input type="text" name="nota2" id="nota2" placeholder="8" ></br>
        <label for="nota3">Introduze la tercera nota:</label></br> 
        <input type="text" name="nota3" id="nota3" placeholder="8" ></br>
        <input type="submit" value="Enviar">
      </form>
  </body>
</html>
