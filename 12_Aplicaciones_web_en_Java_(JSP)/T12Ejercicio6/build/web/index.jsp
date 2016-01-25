<%-- 
Ejercicio 6
Realiza un conversor de pesetas a euros.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ejercicio 6</title>
    <style>
      h1{
        text-align:center;
      }
    </style>
  </head>
  <body>
    <h1>Conversor de pesetas a euros</h1>
    <form action="Conversor.jsp" method="post" >
      <label for="cambio">Por favor, Introduce la cantidad de Pesetas a convertir:</label></br> 
      <input type="number" min="0" step="0.001" name="conversor" id="cambio" placeholder="166.386" ></br>
      <input type="submit" value="Enviar">
    </form>
  </body>
</html>
