<html>
<head>
<title>Your Cart</title>
</head>

<body>

<h2>Your Cart</h2>

<%

String cart = (String) session.getAttribute("cart");

if(cart == null){
out.println("Cart is empty");
}
else{
out.println(cart);
}

%>

<br><br>

<a href="shop.jsp">Back to Shop</a>

</body>
</html>