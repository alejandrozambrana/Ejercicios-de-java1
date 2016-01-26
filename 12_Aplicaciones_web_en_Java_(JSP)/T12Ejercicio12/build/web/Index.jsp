<%-- 
Ejercicio 12
Mejora la aplicación anterior de tal forma que no haga falta introducir el día de la semana
en que cae el día 1 y el número de días que tiene el mes. El programa debe deducir estos
datos del mes y el año. Pista: puedes usar la clase Calendar (java.util.Calendar).
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ejercicio12</title>
    <link href="estilos.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
    <h1>Calendario</h1>
    <form method="post" action="Calendario.jsp">
     
      Mes:<select name="mes">
        <option value="1">enero</option>
        <option value="2">febrero</option>
        <option value="3">marzo</option>
        <option value="4">abril</option>
        <option value="5">mayo</option>
        <option value="6">junio</option>
        <option value="7">julio</option>
        <option value="8">agosto</option>
        <option value="9">septiembre</option>
        <option value="10">octubre</option>
        <option value="11">noviembre</option>
        <option value="12">diciembre</option>
      </select></br></br>
      
      <label for="año">Año: </label>
      <input type="number" id="año" min="1" name="anio"></br></br>
      
      <input type="submit" value="Enviar">
    </form>
  </body>
</html>
