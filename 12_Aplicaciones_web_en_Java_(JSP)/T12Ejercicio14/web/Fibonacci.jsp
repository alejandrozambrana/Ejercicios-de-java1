<%-- 
    Document   : Fibonacci
    Created on : 26-ene-2016, 19:21:06
    Author     : Zambrana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ejercicio14</title>
    <link href="estilos.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
    <h1>Fibonacci</h1>
    <%
      int numeroIntroducido = Integer.parseInt(request.getParameter("numeroIntroducido"));
      int numero1 = 0;
      int numero2 = 1;
      int suma;
    
      if (numeroIntroducido == 1){
        out.println("0");
        } else {
        out.print(numero1 + " ");
       }
        int i = 1;
        do {
          out.print(numero2 + ", ");
          suma = numero1 + numero2;
          numero1 = numero2;
          numero2 = suma;
          i++;
        } while (i < numeroIntroducido);
     %>
  </body>
</html>
