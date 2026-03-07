<html>
<head>
<title>Shop</title>
</head>

<body>

<h2>Items Available</h2>

<form action="addtocart.jsp" method="post">

Apple | Price: 50  
Qty: <input type="number" name="appleQty" value="0" min="0" max="100"><br><br>

Banana | Price: 30  
Qty: <input type="number" name="bananaQty" value="0" min="0" max="100"><br><br>

Orange | Price: 40  
Qty: <input type="number" name="orangeQty" value="0" min="0" max="100"><br><br>

Cucumber | Price: 40  
Qty: <input type="number" name="cucumberQty" value="0" min="0" max="100"><br><br>

Potato | Price: 40  
Qty: <input type="number" name="potatoQty" value="0" min="0" max="100"><br><br>

Onion | Price: 40  
Qty: <input type="number" name="onionQty" value="0" min="0" max="100"><br><br>

<input type="submit" value="Add To Cart">

</form>

<br>

<style>

body{
font-family: "Sofia"; 
font-style: oblique;
background-color: #fbd7fd;
text-align: center;
}
form{
background: white;
width: 400px;
margin: auto;   
padding: 20px;
border-radius: 10px;
box-shadow: 0px 0px 10px gray;
border: #333 solid 5px;
}
.container{
background: white;
width: 400px;
margin: auto;
padding: 20px;
border-radius: 10px;
box-shadow: 0px 0px 10px gray;
}

h2{
color: #333;
}

.item{
margin: 10px 0;
}

input[type="number"]{
width: 60px;
padding: 5px;
}

input[type="submit"]{
background-color: green;
color: white;
border: none;
padding: 10px 15px;
cursor: pointer;
border-radius: 5px;
}

input[type="submit"]:hover{
background-color: darkgreen;
}

a{
display: inline-block;
margin-top: 10px;
text-decoration: none;
color: blue;
}

</style>

<a href="cart.jsp">View Cart</a>

</body>
</html>