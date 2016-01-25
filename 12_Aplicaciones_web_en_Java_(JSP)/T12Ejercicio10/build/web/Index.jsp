<%-- 
Ejercicio 10
Realiza un cuestionario con 10 preguntas tipo test sobre las asignaturas que se imparten
en el curso. Cada pregunta acertada sumará un punto. El programa mostrará al final la
calificación obtenida. Pásale el cuestionario a tus compañeros y pídeles que lo hagan para
ver qué tal andan de conocimientos en las diferentes asignaturas del curso. Utiliza radio
buttons en las preguntas del cuestionario.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Cuestionario</title>
    <link href="estilos.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
    <h1>CUESTIONARIO</h1>
    
    <form action="Resultado.jsp" method="post" >
      01-¿double permite meter numeros con decimales?</br>
      <input type="radio" name="pregunta1" value="si" checked="checked"> Si</br>
      <input type="radio" name="pregunta1" value="no"> No</br></br>
    

      02-¿Si en la clase no pones el mismo nombre del documento, el programa compila?</br>
      <input type="radio" name="pregunta2" value="si" checked="checked"> Si</br>
      <input type="radio" name="pregunta2" value="no"> No</br></br>
        

      03-¿El operador && significa o?</br>
      <input type="radio" name="pregunta3" value="si" checked="checked"> Si</br>
      <input type="radio" name="pregunta3" value="no"> No</br></br>

      04-¿El operador != significa distinto?</br>
      <input type="radio" name="pregunta4" value="si" checked="checked"> Si</br>
      <input type="radio" name="pregunta4" value="no"> No</br></br>

      05-¿El archivo .class es el archivo sin compilar?</br>
      <input type="radio" name="pregunta5" value="si" checked="checked"> Si</br>
      <input type="radio" name="pregunta5" value="no"> No</br></br>

      06-¿string se utiliza para poner numeros enteros?</br>
      <input type="radio" name="pregunta6" value="si" checked="checked"> Si</br>
      <input type="radio" name="pregunta6" value="no"> No</br></br>

      07-¿println hace un salto de linea?</br>
     <input type="radio" name="pregunta7" value="si" checked="checked"> Si</br>
     <input type="radio" name="pregunta7" value="no"> No</br></br>

      08-¿break en un switch inicializa el switch?</br>
      <input type="radio" name="pregunta8" value="si" checked="checked"> Si</br>
      <input type="radio" name="pregunta8" value="no"> No</br></br>

      09-¿string establece una variable? </br>
      <input type="radio" name="pregunta9" value="si" checked="checked"> Si</br>
      <input type="radio" name="pregunta9" value="no"> No</br></br>

      10-¿con el comando ls cambiamos de directorio?</br>
      <input type="radio" name="pregunta10" value="si" checked="checked"> Si</br>
      <input type="radio" name="pregunta10" value="no"> No</br></br>
      
      
       <input type="submit" value="Calcular resultado">

    </form>
  </body>
</html>
