<%-- 
    Document   : piramide
    Created on : 24-ene-2016, 19:42:07
    Author     : Zambrana
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
    <h1>Piramide</h1>
    <% int altura = Integer.parseInt(request.getParameter("Altura")); %>
    <%
    String caracter = "";
    String blanco = "";
    int alto = 1;
    int espacios = altura-1;
    
    caracter = "caracter.png";
    blanco = "blanco.jpg";
   
      while (alto <= altura){

        //meter espacios
        for (int i = 1; i <= espacios; i++){
          out.print("<img src=\"" + blanco +"\" width=\"2%\">");
        }

        // pinta la lÃ­nea
        for (int i = 1; i < alto * 2; i++){
          out.print("<img src=\"" + caracter +"\" width=\"2%\">");
        }

        out.println("</br>");

        alto++;
        espacios--;
      }
      %>
  </body>
</html>
