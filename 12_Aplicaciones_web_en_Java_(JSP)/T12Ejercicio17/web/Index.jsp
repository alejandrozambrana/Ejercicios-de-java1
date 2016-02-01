<%-- 
Ejercicio 17
Realiza un configurador del interior de un vehículo. El usuario puede elegir,
mediante un formulario, el color de la tapicería – blanco, negro o berengena -
y el material de las molduras – madera o carbono. Se debe mostrar el interior
del coche tal y como lo quiere el usuario.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Configurador</title>
    <link href="estilos.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
    <h1>Configurador</h1>
    <form method="post" action="Configurador.jsp">
     
      Modelo:<select name="modelo">
        <option value="Edition">Ford Fiesta Edition</option>
        <option value="ST">Ford Fiesta ST</option>
      </select></br></br>
      
      Color:
      <select name="color">
        <option value="Blanco">Blanco</option>
        <option value="Negro">Negro</option>
        <option value="Rojo">Rojo</option>
      </select></br></br>
      
      <input type="submit" value="Enviar">
    </form>
  </body>
</html>
