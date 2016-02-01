<%-- 
Ejercicio 7
Combina las dos aplicaciones anteriores en una sola de tal forma que en la página principal
se pueda elegir pasar de euros a pesetas o de pesetas a euros. Adorna la página con alguna
foto o dibujo.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ejecicio7</title>
     <link href="estilos.css" rel="stylesheet" type="text/css" /> 
  </head>
  <body>
    <h1>Conversor</h1>
    <form action="Conversor.jsp" method="post" >
      <label for="cambio">Cantidad:</label></br> 
      <input type="number" min="0" step="0.001" name="conversor" id="cambio" autofocus=""></br></br>
      <input type="radio" name="Convertir" value="eurosPesetas" checked="checked"> euros a pesetas</br>
      <input type="radio" name="Convertir" value="pesetasEuros"> pesetas a euros</br></br>
      <input type="submit" value="Convertir">
    </form>
  </body>
</html>
