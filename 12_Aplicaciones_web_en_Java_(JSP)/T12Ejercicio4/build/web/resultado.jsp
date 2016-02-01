<%-- 
    Document   : newjs
    Created on : 20-ene-2016, 23:24:53
    Author     : Zambrana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>resultado nota</title>
  </head>
  <body>
    
    <%double primerNumero =  Double.parseDouble(request.getParameter("nota1"));%>
    <%double segundoNumero =  Double.parseDouble(request.getParameter("nota2"));%>
    <%double terceroNumero =  Double.parseDouble(request.getParameter("nota3"));%> 
      
    <%out.print("La nota media es: ");%>
    <% out.println((primerNumero + segundoNumero + terceroNumero)/3);%> 
  </body>
</html>
