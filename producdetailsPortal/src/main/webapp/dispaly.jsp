<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Displaying the Product Details....</h1>
<hr>
<%= "ProductId: 1 " + session.getAttribute("pid") %> <br> <br>

<%= "ProductName:  shell " +session.getAttribute("pname") %>  <br> <br>

<%= "ProductPrice: 300 " + session.getAttribute("pprice") %>
</hr>


</body>
</html>