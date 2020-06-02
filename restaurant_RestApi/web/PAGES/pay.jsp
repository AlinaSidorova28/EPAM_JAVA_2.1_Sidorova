<%@ page import="com.company.operations.Operations" %><%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 01.06.2020
  Time: 18:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>French Restaurant</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
</head>
<body>
<div class="row">
    <div class="alert alert-info text-center mx-auto">
        <form action="back" method="post" autocomplete="off">
            <input type="submit" class="btn btn-primary" value="Pay">
            <input type="hidden" name="id_cl_act" value="${id_act}">
        </form>
        <%
            Operations operation = new Operations();
            if(operation.findUnpaidOrder() != 0) {
                out.print("<p>You should pay for your previous order</p>");
            } else {
                out.print("<form action=\"back\">");
                out.print("<p>You have no orders to pay for</p>");
                out.print("<input type=\"submit\" class=\"btn btn-primary\" value=\"Back\">");
                out.print("</form>");
            }
        %>
    </div>
</div>
</body>
</html>
