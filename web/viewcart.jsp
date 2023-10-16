<%-- 
    Document   : viewcart
    Created on : Jun 15, 2023, 4:44:25 PM
    Author     : Admin
--%>

<%@page import="sample.shopping.Cart"%>
<%@page import="sample.shopping.Tea"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Page</title>
    </head>
    <body>
        <h1>Your Cart is here !</h1>
        <%
            Cart cart = (Cart) session.getAttribute("CART");
            if(cart != null) {
                if(cart.getCart().size() > 0){
                
        %>
        <table border="1">
            <thead>
                <tr>
                    <th>No</th>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Price</th>
                    <th>Quantity</th>
                    <th>Edit</th>
                    <th>Remove</th>
                    <th>Total</th>
                </tr>
            </thead>
            <tbody>
                <%
                    int count = 1;
                    double total = 0;
                    for(Tea tea : cart.getCart().values()){
                        total += tea.getPrice() * tea.getQuantity();       
                %>
            <form action="MainController" method="POST">
                <tr>
                    <td><%= count++ %></td>
                    <td>
                        <input type="text" name="id" value="<%= tea.getId() %>" readonly="">
                    </td>
                    <td><%= tea.getName()%></td>
                    <td><%= tea.getPrice()%></td>
                    <td>
                        <input type="number" value="<%= tea.getQuantity()%>" min="1" name="quantity" required=""/>
                    </td>
                    <td>
                        <input type="submit" name="action" value="Edit"/>
                    </td>
                    <td>
                        <input type="submit" name="action" value="Remove"/>
                    </td>
                    <td><%= tea.getPrice() * tea.getQuantity()%></td>
                </tr>           
            </form>
                <%
                        } 
                %>
            </tbody>
        </table>
                <h2> Total: <%= total%>$ </h2>

        <%
            }
        }
        %>
    <a href="shopping.html"> Add More </a>
    </body>
</html>
