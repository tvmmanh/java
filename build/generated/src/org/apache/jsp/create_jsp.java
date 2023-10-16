package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import sample.user.UserError;

public final class create_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        Create new user:\n");
      out.write("        ");

            UserError userError= (UserError)request.getAttribute("USER_ERROR");
            if(userError == null) userError = new UserError();
            String error = (String)request.getAttribute("ERROR");
            if(error == null) error= "";
        
      out.write("\n");
      out.write("        <form action=\"MainController\" method=\"POST\">\n");
      out.write("            User ID <input type=\"text\" name=\"userID\" required=\"\"/>");
      out.print( userError.getUserIDError() );
      out.write("\n");
      out.write("            </br> Full Name <input type=\"text\" name=\"fullName\" required=\"\"/> ");
      out.print( userError.getFullNameError() );
      out.write("\n");
      out.write("            </br> Role ID <input type=\"text\" name=\"roleID\" value=\"US\" readonly=\"\"/>\n");
      out.write("            </br> Password <input type=\"password\" name=\"password\" required=\"\"/>\n");
      out.write("            </br> Confirm <input type=\"password\" name=\"confirm\" required=\"\"/> ");
      out.print( userError.getConfirmError() );
      out.write("\n");
      out.write("            </br> <input type=\"submit\" name=\"action\" value=\"Create\"/>\n");
      out.write("            <input type=\"reset\" value=\"Reset\"/>\n");
      out.write("            ");
      out.print( error );
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
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
