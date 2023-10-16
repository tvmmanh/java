package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import sample.user.UserDTO;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Admin Page!</h1>\n");
      out.write("        </br><a href=\"MainController?action=ShoppingPage\">Tien's Farm</a>\n");
      out.write("        ");

            UserDTO loginUser = (UserDTO) session.getAttribute("LOGIN_USER");
            if (loginUser == null || !"AD".equals(loginUser.getRoleID())) {
                response.sendRedirect("login.html");
                return;
            }
            String search = request.getParameter("search");
            if (search == null) {
                search = "";
            }
        
      out.write("\n");
      out.write("        Welcome: ");
      out.print( loginUser.getFullName());
      out.write("\n");
      out.write("        <form action=\"MainController\" method=\"POST\">\n");
      out.write("            <input type=\"submit\" name=\"action\" value=\"Logout\" />\n");
      out.write("        </form>\n");
      out.write("    </a>\n");
      out.write("    <form action=\"MainController\">\n");
      out.write("        Search<input type=\"text\" name=\"search\" value=\"");
      out.print( search);
      out.write("\" />\n");
      out.write("        <input type=\"submit\" name=\"action\" value=\"Search\" />\n");
      out.write("    </form>\n");
      out.write("    ");

        List<UserDTO> listUser = (List<UserDTO>) request.getAttribute("LIST_USER");
        if (listUser != null) {
            if (listUser.size() > 0) {
    
      out.write("\n");
      out.write("    <table border=\"1\">\n");
      out.write("        <thead>\n");
      out.write("            <tr>\n");
      out.write("                <th>No</th>\n");
      out.write("                <th>User ID</th>\n");
      out.write("                <th>Full Name</th>\n");
      out.write("                <th>Role ID</th>\n");
      out.write("                <th>Password</th>\n");
      out.write("                <th>Update</th>\n");
      out.write("                <th>Delete</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("            ");
 int count = 1;
                for (UserDTO user : listUser) {
            
      out.write("\n");
      out.write("\n");
      out.write("        <form action=\"MainController\">\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print( count++);
      out.write("</td>\n");
      out.write("                <td> \n");
      out.write("                    <input type=\"text\" name=\"userID\" value=\"");
      out.print( user.getUserID());
      out.write("\" readonly=\"\"/>\n");
      out.write("                </td>\n");
      out.write("                <td> \n");
      out.write("                    <input type=\"text\" name=\"fullName\" value=\"");
      out.print( user.getFullName());
      out.write("\" required=\"\" /> \n");
      out.write("                </td>\n");
      out.write("                <td> \n");
      out.write("                    <input type=\"text\" name=\"roleID\" value=\"");
      out.print( user.getRoleID());
      out.write("\" required=\"\" /> \n");
      out.write("                </td>\n");
      out.write("                <td> ");
      out.print( user.getPassword());
      out.write("</td>\n");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"submit\" name=\"action\" value=\"Update\" />\n");
      out.write("                    <input type=\"hidden\" name=\"search\" value=\"");
      out.print( search);
      out.write("\" />\n");
      out.write("                </td>\n");
      out.write("                ");
      out.write("\n");
      out.write("                <td>\n");
      out.write("                    <a href=\"MainController?search=");
      out.print( search);
      out.write("&action=Delete&userID=");
      out.print( user.getUserID());
      out.write("\"> Delete </a>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </form>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("    </tbody>\n");
      out.write("</table>\n");

    String error = (String) request.getAttribute("ERROR");
    if (error == null) {
        error = "";
    }

      out.write('\n');
      out.print( error);
      out.write("       \n");

        }
    }

      out.write("\n");
      out.write("</body>\n");
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
