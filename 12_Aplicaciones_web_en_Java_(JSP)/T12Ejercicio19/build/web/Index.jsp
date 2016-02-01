<%-- 
Ejercicio 19
Crea el juego “Apuesta y gana”. El usuario debe introducir inicialmente una
cantidad de dinero. A continuación aparecerá por pantalla una imagen de
forma aleatoria. Si sale una calavera, el usuario pierde todo su dinero y termina
el juego. Si sale medio limón, el usuario pierde la mitad del dinero y puede
seguir jugando con esa cantidad o puede dejar de jugar. Si sale el gato chino
de la suerte, el usuario multiplica por dos su dinero y puede seguir jugando
con esa cantidad o puede dejar de jugar.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Apuesta y gana</title>
    <link href="estilos.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
    <h1>Apuesta y gana</h1>
    <form action="Resultado.jsp" method="post" >
      <label for="cantidad">Cantidad a apostar:</label></br> 
      <input type="number" min="0"  name="cantidad" id="cantidad" >€</br></br>
      <input type="submit" value="Convertir">
    </form>
  </body>
</html>
