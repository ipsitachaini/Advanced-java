<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>autocart</title>
</head>
<body>
<%

String cart = (String) session.getAttribute("cart");

if(cart == null){
cart = "";
}

String apple = request.getParameter("appleQty");
String banana = request.getParameter("bananaQty");
String orange = request.getParameter("orangeQty");
String cucumber = request.getParameter("cucumberQty");
String potato = request.getParameter("potatoQty");
String onion = request.getParameter("onionQty");

if(Long.parseLong(apple) > 0){
cart = cart + "Apple | Price: 50 | Qty: " + apple + "<br>";
}

if(Long.parseLong(banana) > 0){
cart = cart + "Banana | Price: 30 | Qty: " + banana + "<br>";
}

if(Long.parseLong(orange) > 0){
cart = cart + "Orange | Price: 40 | Qty: " + orange + "<br>";
}

if(Long.parseLong   (cucumber) > 0){
cart = cart + "Cucumber | Price: 40 | Qty: " + cucumber + "<br>";
}

if(Long.parseLong(potato) > 0){
cart = cart + "Potato | Price: 40 | Qty: " + potato + "<br>";
}

if(Long.parseLong(onion) > 0){
cart = cart + "Onion | Price: 40 | Qty: " + onion + "<br>";
}

session.setAttribute("cart", cart);

%>

<h3>Items added to cart!</h3>

<a href="shop.jsp">Continue Shopping</a><br>
<a href="cart.jsp">View Cart</a>

</body>
</html>