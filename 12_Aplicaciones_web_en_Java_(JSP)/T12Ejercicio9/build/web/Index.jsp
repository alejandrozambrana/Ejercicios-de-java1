<%-- 
Ejercicio 9
Realiza una aplicación que pinte una pirámide. La altura se pedirá en un formulario. La
pirámide estará hecha de bolitas, ladrillos o cualquier otra imagen.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="estilos.css" rel="stylesheet" type="text/css" /> 
    <title>Ejercicio9</title>
  </head>
  <body>
    <h1>Pinta una piramide</h1>
    <form action="piramide.jsp" method="post" >
      <label for="piramide">Introduce la altura de la piramide:</label></br> 
      <input type="number" min="0" name="Altura" id="piramide" ></br></br>
      <input type="submit" value="ver">
    </form>
    
  </body>
</html>
