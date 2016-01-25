<%-- 
Ejercicio 5
Realiza un conversor de euros a pesetas.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <style>
      h1{
        text-align:center;
      }
    </style>
  </head>
  <body>
    <h1>Conversor de euros a pesetas</h1>
      <form action="conversor.jsp" method="post" >
        <label for="cambio">Por favor, Introduce la cantidad de euros a convertir:</label></br> 
        <input type="number" min="0" name="conversor" id="cambio" placeholder="20€" ></br>
        <input type="submit" value="Enviar">
      </form>
  </body>
</html>
