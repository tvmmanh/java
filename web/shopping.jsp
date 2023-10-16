<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : shopping
    Created on : Jun 15, 2023, 4:12:58 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Beautiful Tien</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1> WELCOME TO MY STORE </h1>
        <form action="MainController" method="POST">
            <select name="cmbTea">
                <c:forEach var="o" items="${listP}">
                    <option value="${o.name}">Peach Tea-25$</option>
                
                </c:forEach>
                        </select>
            <select name="cmbQuantity">
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5">5</option>
                <option value="10">10</option>
                </select>
            <input type="submit" name="action" value="Add"/>
            <input type="submit" name="action" value="View"/>
        </form>
        <%
            String message=(String) request.getAttribute("MESSAGE");
            if(message==null) message="";
        %>
        <%= message %>
    </body>
</html>
