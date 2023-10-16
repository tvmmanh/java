<%-- 
    Document   : admin
    Created on : May 29, 2023, 4:48:19 PM
    Author     : Admin
--%>

<%@page import="java.util.List"%>
<%@page import="sample.user.UserDTO" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Page</title>
    </head>
    <body>
        <h1>Admin Page!</h1>
        </br><a href="MainController?action=ShoppingPage">Tien's Farm</a>
        <%
            UserDTO loginUser = (UserDTO) session.getAttribute("LOGIN_USER");
            if (loginUser == null || !"AD".equals(loginUser.getRoleID())) {
                response.sendRedirect("login.html");
                return;
            }
            String search = request.getParameter("search");
            if (search == null) {
                search = "";
            }
        %>
        Welcome: <%= loginUser.getFullName()%>
        <form action="MainController" method="POST">
            <input type="submit" name="action" value="Logout" />
        </form>
    </a>
    <form action="MainController">
        Search<input type="text" name="search" value="<%= search%>" />
        <input type="submit" name="action" value="Search" />
    </form>
    <%
        List<UserDTO> listUser = (List<UserDTO>) request.getAttribute("LIST_USER");
        if (listUser != null) {
            if (listUser.size() > 0) {
    %>
    <table border="1">
        <thead>
            <tr>
                <th>No</th>
                <th>User ID</th>
                <th>Full Name</th>
                <th>Role ID</th>
                <th>Password</th>
                <th>Update</th>
                <th>Delete</th>
            </tr>
        </thead>
        <tbody>
            <% int count = 1;
                for (UserDTO user : listUser) {
            %>

        <form action="MainController">
            <tr>
                <td><%= count++%></td>
                <td> 
                    <input type="text" name="userID" value="<%= user.getUserID()%>" readonly=""/>
                </td>
                <td> 
                    <input type="text" name="fullName" value="<%= user.getFullName()%>" required="" /> 
                </td>
                <td> 
                    <input type="text" name="roleID" value="<%= user.getRoleID()%>" required="" /> 
                </td>
                <td> <%= user.getPassword()%></td>

                <%--Code Update--%>
                <td>
                    <input type="submit" name="action" value="Update" />
                    <input type="hidden" name="search" value="<%= search%>" />
                </td>
                <%--Code Delete--%>
                <td>
                    <a href="MainController?search=<%= search%>&action=Delete&userID=<%= user.getUserID()%>"> Delete </a>
                </td>
            </tr>
        </form>
        <%
            }
        %>
    </tbody>
</table>
<%
    String error = (String) request.getAttribute("ERROR");
    if (error == null) {
        error = "";
    }
%>
<%= error%>       
<%
        }
    }
%>
</body>
</html>
