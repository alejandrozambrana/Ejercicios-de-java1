<%-- 
    Document   : Calendario
    Created on : 25-ene-2016, 0:07:04
    Author     : Zambrana
--%>

<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Calendario</title>
    <link href="estilos.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
    <h1><% out.print("Calendario de " + request.getParameter("mes") + " " + request.getParameter("anio"));%></h1>
    
    <%
      int columna = 1;
      int anio = Integer.parseInt(request.getParameter("anio"));
      int mes = Integer.parseInt(request.getParameter("mes"));
     
      
      Calendar miCalendario = Calendar.getInstance();
      miCalendario.set(anio, mes - 1, 1); // los meses van de 0 a 11

      int diasMes = miCalendario.getActualMaximum(Calendar.DAY_OF_MONTH);

      int dia = miCalendario.get(Calendar.DAY_OF_WEEK);
      if (dia == 1) {
        dia = 7; // el domingo es día 1
      } else {
        dia--;
      }
 
    %>
    <table>
      <tr><th>lunes</th><th>martes</th><th>miércoles</th><th>jueves</th><th>viernes</th><th>sábado</th><th>domingo</th></tr>
      <tr>
        <%
      for (int i = 1; i < diasMes + dia; i++) {
        if (i >= dia) {
          out.print("<td>" + (i - dia + 1) + "</td>");
        } else {
          out.print("<td> </td>"); // las primeras celdas quedan vacías
        }
        columna++;
        if (columna == 8) { // salta a la siguiente columna
          out.println("</tr><tr>");
          columna = 1;
        }
      }
      %>
      </td></tr>
    </table>
  </body>
</html>
