<%-- 
Ejercicio 8
Realiza una aplicación que pida un número y que luego muestre la tabla de multiplicar de
ese número. El resultado se debe mostrar en una tabla (<table> en HTML).
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="estilos.css" rel="stylesheet" type="text/css" /> 
    <title>Ejercicio 8</title>
  </head>
  <body>
    <h1>Tablas de Multiplicar</h1>
    <form action="tabla.jsp" method="post" >
      <label for="tabla">¿Que tabla quieres ver?:</label></br> 
      <input type="number" min="0" name="tabla" id="tabla" ></br></br>
      <input type="submit" value="ver">
    </form>
  </body>
</html>
