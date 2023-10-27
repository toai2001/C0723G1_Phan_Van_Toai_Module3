<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="/admin" method="get">
    <label for="num1">Product Description : </label>
    <input type="text"name="product" id="num1">
    <label for="num2">List Price : </label>
    <input type="number"name="price" id="num2">
    <label for="num3">Discount Percent: </label>
    <input type="number"name="percent" id="num3">
    <input type="submit" value="Discount Amount">
</form>
</body>
</html>