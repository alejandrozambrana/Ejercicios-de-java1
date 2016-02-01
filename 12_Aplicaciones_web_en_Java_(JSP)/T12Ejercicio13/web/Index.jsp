<%-- 
Ejercicio 13
Transforma el test de infidelidad realizado anteriormente para consola en una
aplicación web.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Test de Infidelidad</title>
    <link href="estilos.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
    <h1>TEST DE INFIDELIDAD</h1>
  
    <form method="post" action="Resultado.jsp">
      Contesta las siguientes preguntas con verdadero o falso.</br></br>
      1. Tu pareja parece estar mas inquieta de lo normal sin ningun motivo aparente.</br>
      <input type="radio" name="pregunta1" value="verdadero" checked="checked"> Verdadero</br>
      <input type="radio" name="pregunta1" value="falso"> Falso</br></br>

      2. Ha aumentado sus gastos de vestuario.</br>
      <input type="radio" name="pregunta2" value="verdadero" checked="checked"> Verdadero</br>
      <input type="radio" name="pregunta2" value="falso"> Falso</br></br>

      3. Ha perdido el interÃ©s que mostraba anteriormente por ti.</br>
      <input type="radio" name="pregunta3" value="verdadero" checked="checked"> Verdadero</br>
      <input type="radio" name="pregunta3" value="falso"> Falso</br></br>

      4. Ahora se afeita y se asea con mas frecuencia (si es hombre) o ahora se arregla el pelo y se asea con mas frecuencia (si es mujer).</br>
      <input type="radio" name="pregunta4" value="verdadero" checked="checked"> Verdadero</br>
      <input type="radio" name="pregunta4" value="falso"> Falso</br></br>

      5. No te deja que mires la agenda de su telefono movil.</br>
      <input type="radio" name="pregunta5" value="verdadero" checked="checked"> Verdadero</br>
      <input type="radio" name="pregunta5" value="falso"> Falso</br></br>

      6. A veces tiene llamadas que dice no querer contestar cuando estas tu delante.</br>
      <input type="radio" name="pregunta6" value="verdadero" checked="checked"> Verdadero</br>
      <input type="radio" name="pregunta6" value="falso"> Falso</br></br>

      7. Ultimamente se preocupa mas en cuidar la linea y/o estar bronceado/a.</br>
      <input type="radio" name="pregunta7" value="verdadero" checked="checked"> Verdadero</br>
      <input type="radio" name="pregunta7" value="falso"> Falso</br></br>

      8. Muchos dias viene tarde despues de trabajar porque dice tener mucho mas trabajo.</br>
      <input type="radio" name="pregunta8" value="verdadero" checked="checked"> Verdadero</br>
      <input type="radio" name="pregunta8" value="falso"> Falso</br></br>

      9. Has notado que ultimamente se perfuma mas.</br>
      <input type="radio" name="pregunta9" value="verdadero" checked="checked"> Verdadero</br>
      <input type="radio" name="pregunta9" value="falso"> Falso</br></br>

      10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.</br>
      <input type="radio" name="pregunta10" value="verdadero" checked="checked"> Verdadero</br>
      <input type="radio" name="pregunta10" value="falso"> Falso</br></br>

      <input type="submit" value="Evaluar cuestionario">
    </form>
    
  </body>
</html>
