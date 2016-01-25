<%-- 
Ejercicio 11
Escribe una aplicación que genere el calendario de un mes. Se pedirá el nombre del mes,
el año, el texto que queremos que aparezca sobre el calendario, el día de la semana en que
cae el día 1 y el número de días que tiene el mes.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ejercicio11</title>
    <link href="estilos.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
    <h1>Calendario</h1>
    <form method="post" action="Calendario.jsp">
     
      Mes:<select name="mes">
        <option>enero</option>
        <option>febrero</option>
        <option>marzo</option>
        <option>abril</option>
        <option>mayo</option>
        <option>junio</option>
        <option>julio</option>
        <option>agosto</option>
        <option>septiembre</option>
        <option>octubre</option>
        <option>noviembre</option>
        <option>diciembre</option>
      </select></br></br>
      
      <label for="año">Año: </label>
      <input type="number" id="año" min="1" name="anio"></br></br>
      
      Elige dia de la semana
      <select name="dia">
        <option value="1">lunes</option>
        <option value="2">martes</option>
        <option value="3">miércoles</option>
        <option value="4">jueves</option>
        <option value="5">viernes</option>
        <option value="6">sábado</option>
        <option value="7">domingo</option>
      </select></br></br>
      
      <label for="diaMes">Número de días que tiene el mes </label>
      <input type="number" id="diaMes" min="28" max="31" name="diasMes"></br></br>
      
      <input type="submit" value="Enviar">
    </form>
  </body>
</html>
