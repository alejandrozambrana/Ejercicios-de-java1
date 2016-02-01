<%-- 
    Document   : Resultado
    Created on : 27-ene-2016, 17:16:49
    Author     : Zambrana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Resultado</title>
    <link href="estilos.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
    <h1>Apuesta y gana</h1>
    <%
      int dinero = Integer.parseInt(request.getParameter("cantidad"));
      int aleatorio = (int)(Math.random()*3);
      String imagenes[] = {"calavera.png", "gatochinosuerte.gif", "mediolimon.jpg" };
      
    %>
    <div>
    <%  
     out.print("<img src=\"" + imagenes[aleatorio] + "\">");
    %>
    </div>
    <div>
    <%
     if (imagenes[aleatorio].equals("calavera.png")) {
        out.print("Ha perdido todo su dinero");
        dinero = 0;
      }
     if (imagenes[aleatorio].equals("gatochinosuerte.gif")) {
        out.print("Ha doblado su dinero");
        dinero *= 2;
      }
     if (imagenes[aleatorio].equals("mediolimon.jpg")) {
        out.print("Ha perdido la mitad de su dinero");
        dinero /= 2;
      }
    %>
    </div>
    <%
      if ((imagenes[aleatorio].equals("mediolimon.jpg")) || (imagenes[aleatorio].equals("gatochinosuerte.gif"))) { // El jugador puede seguir jugando o plantarse
    %>
    <div>
      <h2>Tienes <%= dinero %> €</h2>
    </div>
    
      <form method="post" class="sinestilo" action="Resultado.jsp">
        <input type="hidden" name="dinero" value="<%= dinero %>">
        <input type="submit" value="Sigo jugando">
      </form>
        
      <form class="sinestilo" method="post" action="Final.jsp">
        <input type="hidden" name="dinero" value="<%= dinero %>">
        <input type="submit" value="Me planto">
      </form>  
      
    <%
      } else {
    %>
      <form class="sinestilo" method="post" action="Index.jsp">
        <input type="submit" value="Volver a jugar">
      </form>
    <%
      } // if     
    %>
  </body>
</html>
