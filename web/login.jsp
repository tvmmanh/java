<%-- 
    Document   : login
    Created on : May 29, 2023, 4:41:30 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <form action="MainController" method="POST">
           User ID <input type="text" name="userID" required=""/></br>
           Password <input type="password" name="password" required=""/></br>
           <input type="submit" name="action" value="Login"/>
           <input type="reset" value="Reset"/>
       </form>
        <a href="MainController?action=Create">Create</a>
        </br><a href="MainController?action=ShoppingPage">Tien's Farm</a>
        <a href="MainController?action=first">Top1</a>
        <%
            String error= (String) request.getAttribute("ERROR");
            if(error== null) error="";
        %>
        <%= error %>
        
    </body>
</html>
