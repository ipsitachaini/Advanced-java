<%
int number = Integer.parseInt(request.getParameter("number"));
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<h2>Multiplication Table</h2>
<div>
<%
for(int i=1;i<=10;i++){
out.println(number + " x " + i + " = " + (number*i) + "<br>");
}
%>
</div>
<style>
    body {
        background-color: rgb(246, 207, 244);
    }  
    div {
        background-color: white;
        width: 300px;
        padding: 20px;
        margin: 100px auto;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        text-size-adjust: 80px;
        align-items: center;
        border:5px double rgb(185, 94, 94);
        justify-content: center;
        font-size: 20px;
    } 
    h2 {
        text-align: center;
        text-decoration: underline;
        text-underline-position: below;
        padding-top: 20px;
    }

</style>
</body>
</html>