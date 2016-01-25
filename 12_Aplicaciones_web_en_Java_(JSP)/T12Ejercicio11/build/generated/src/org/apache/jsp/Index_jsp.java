package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Ejercicio11</title>\n");
      out.write("    <link href=\"estilos.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <h1>Calendario</h1>\n");
      out.write("    <form method=\"post\" action=\"calendario.jsp\">\n");
      out.write("     \n");
      out.write("      Mes:<select multiple name=\"colores\" size=\"4\" >\n");
      out.write("        <option>enero</option>\n");
      out.write("        <option>febrero</option>\n");
      out.write("        <option>marzo</option>\n");
      out.write("        <option>abril</option>\n");
      out.write("        <option>mayo</option>\n");
      out.write("        <option>junio</option>\n");
      out.write("        <option>julio</option>\n");
      out.write("        <option>agosto</option>\n");
      out.write("        <option>septiembre</option>\n");
      out.write("        <option>octubre</option>\n");
      out.write("        <option>noviembre</option>\n");
      out.write("        <option>diciembre</option>\n");
      out.write("      </select></br>\n");
      out.write("      \n");
      out.write("      <label for=\"año\">Año: </label>\n");
      out.write("      <input type=\"number\" id=\"año\" min=\"1\" name=\"año\"></br></br>\n");
      out.write("      \n");
      out.write("      Elige dia de la semana\n");
      out.write("      <select name=\"dia\">\n");
      out.write("        <option value=\"1\">lunes</option>\n");
      out.write("        <option value=\"2\">martes</option>\n");
      out.write("        <option value=\"3\">miércoles</option>\n");
      out.write("        <option value=\"4\">jueves</option>\n");
      out.write("        <option value=\"5\">viernes</option>\n");
      out.write("        <option value=\"6\">sábado</option>\n");
      out.write("        <option value=\"7\">domingo</option>\n");
      out.write("      </select></br></br>\n");
      out.write("      \n");
      out.write("      <label for=\"diaMes\">Número de días que tiene el mes </label>\n");
      out.write("      <input type=\"number\" id=\"diaMes\" min=\"28\" max=\"31\" name=\"diasMes\"></br></br>\n");
      out.write("      \n");
      out.write("      <input type=\"submit\" value=\"Enviar\">\n");
      out.write("    </form>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
