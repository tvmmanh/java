<%-- 
    Document   : user
    Created on : May 29, 2023, 4:43:36 PM
    Author     : Admin
--%>

<%@page import="sample.user.UserDTO" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Page</title>
    </head>
    <body>
        <h1>User's information: </h1>
        <%
            UserDTO loginUser= (UserDTO)session.getAttribute("LOGIN_USER");
            if(loginUser== null) loginUser = new UserDTO();
        %>
        User ID: <%= loginUser.getUserID() %> </br>
        Full Name <%= loginUser.getFullName() %> </br>
        Role ID: <%= loginUser.getRoleID() %> </br>
        Password: <%= loginUser.getPassword() %> </br>
    </body>
</html>
