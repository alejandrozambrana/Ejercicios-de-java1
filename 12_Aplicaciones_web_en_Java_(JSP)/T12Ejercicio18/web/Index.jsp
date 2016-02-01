<%-- 
Ejercicio 18
Crea la aplicación “El Trile”. Deben aparecer tres cubiletes por pantalla y el
usuario deberá seleccionar uno de ellos. Para dicha selección se puede usar un
formulario con radio-button, una lista desplegable, hacer clic en el cubilete o lo
que resulte más fácil. Se levantarán los tres cubiletes y se verá si estaba o no
la bolita dentro del que el usuario indicó, así mismo, se mostrará un mensaje
diciendo “Lo siento, no has acertado” o “¡Enhorabuena!, has encontrado la
bolita”. La probabilidad de encontrar la bolita es de 1/3.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>El Trile</title>
    <link href="estilos.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
    <h1>El Trile</h1>
    <div>
    <a href="Resultado.jsp?cubilete=0"><img src="cubilete_tapando_bolas.png"></a>
    <a href="Resultado.jsp?cubilete=1"><img src="cubilete_tapando_bolas.png"></a>
    <a href="Resultado.jsp?cubilete=2"><img src="cubilete_tapando_bolas.png"></a>
    </div>
  </body>
</html>
