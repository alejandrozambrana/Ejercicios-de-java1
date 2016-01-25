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
      out.write("    <title>Cuestionario</title>\n");
      out.write("    <link href=\"estilos.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <h1>CUESTIONARIO</h1>\n");
      out.write("    ");

    int puntos = 0;
    String pregunta;
    
      out.write("\n");
      out.write("    <form action=\"Resultado.jsp\" method=\"post\" >\n");
      out.write("      01-¿double permite meter numeros con decimales?</br>\n");
      out.write("      <input type=\"radio\" name=\"pregunta1\" value=\"si\" checked=\"checked\"> Si</br>\n");
      out.write("      <input type=\"radio\" name=\"pregunta1\" value=\"no\"> No</br></br>\n");
      out.write("    \n");
      out.write("\n");
      out.write("      02-¿Si en la clase no pones el mismo nombre del documento, el programa compila?</br>\n");
      out.write("      <input type=\"radio\" name=\"pregunta2\" value=\"si\" checked=\"checked\"> Si</br>\n");
      out.write("      <input type=\"radio\" name=\"pregunta2\" value=\"no\"> No</br></br>\n");
      out.write("        \n");
      out.write("\n");
      out.write("      03-¿El operador && significa o?</br>\n");
      out.write("      <input type=\"radio\" name=\"pregunta3\" value=\"si\" checked=\"checked\"> Si</br>\n");
      out.write("      <input type=\"radio\" name=\"pregunta3\" value=\"no\"> No</br></br>\n");
      out.write("\n");
      out.write("      04-¿El operador != significa distinto?</br>\n");
      out.write("      <input type=\"radio\" name=\"pregunta4\" value=\"si\" checked=\"checked\"> Si</br>\n");
      out.write("      <input type=\"radio\" name=\"pregunta4\" value=\"no\"> No</br></br>\n");
      out.write("\n");
      out.write("      05-¿El archivo .class es el archivo sin compilar?</br>\n");
      out.write("      <input type=\"radio\" name=\"pregunta5\" value=\"si\" checked=\"checked\"> Si</br>\n");
      out.write("      <input type=\"radio\" name=\"pregunta5\" value=\"no\"> No</br></br>\n");
      out.write("\n");
      out.write("      06-¿string se utiliza para poner numeros enteros?</br>\n");
      out.write("      <input type=\"radio\" name=\"pregunta6\" value=\"si\" checked=\"checked\"> Si</br>\n");
      out.write("      <input type=\"radio\" name=\"pregunta6\" value=\"no\"> No</br></br>\n");
      out.write("\n");
      out.write("      07-¿println hace un salto de linea?</br>\n");
      out.write("     <input type=\"radio\" name=\"pregunta7\" value=\"si\" checked=\"checked\"> Si</br>\n");
      out.write("     <input type=\"radio\" name=\"pregunta7\" value=\"no\"> No</br></br>\n");
      out.write("\n");
      out.write("      08-¿break en un switch inicializa el switch?</br>\n");
      out.write("      <input type=\"radio\" name=\"pregunta8\" value=\"si\" checked=\"checked\"> Si</br>\n");
      out.write("      <input type=\"radio\" name=\"pregunta8\" value=\"no\"> No</br></br>\n");
      out.write("\n");
      out.write("      09-¿string establece una variable? </br>\n");
      out.write("      <input type=\"radio\" name=\"pregunta9\" value=\"si\" checked=\"checked\"> Si</br>\n");
      out.write("      <input type=\"radio\" name=\"pregunta9\" value=\"no\"> No</br></br>\n");
      out.write("\n");
      out.write("      10-¿con el comando ls cambiamos de directorio?</br>\n");
      out.write("      <input type=\"radio\" name=\"pregunta10\" value=\"si\" checked=\"checked\"> Si</br>\n");
      out.write("      <input type=\"radio\" name=\"pregunta10\" value=\"no\"> No</br></br>\n");
      out.write("\n");
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
