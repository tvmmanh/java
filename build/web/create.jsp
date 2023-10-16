<%-- 
    Document   : create
    Created on : Jun 8, 2023, 3:33:46 PM
    Author     : Admin
--%>

<%@page import="sample.user.UserError"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Create new user:
        <%
            UserError userError= (UserError)request.getAttribute("USER_ERROR");
            if(userError == null) userError = new UserError();
            String error = (String)request.getAttribute("ERROR");
            if(error == null) error= "";
        %>
        <form action="MainController" method="POST">
            User ID <input type="text" name="userID" required=""/><%= userError.getUserIDError() %>
            </br> Full Name <input type="text" name="fullName" required=""/> <%= userError.getFullNameError() %>
            </br> Role ID <input type="text" name="roleID" value="US" readonly=""/>
            </br> Password <input type="password" name="password" required=""/>
            </br> Confirm <input type="password" name="confirm" required=""/> <%= userError.getConfirmError() %>
            </br> <input type="submit" name="action" value="Create"/>
            <input type="reset" value="Reset"/>
            <%= error %>
        </form>
    </body>
</html>
