<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>User Management Application</title>
    <style>

        body {
            font-family: Arial, sans-serif;
            font-size: 16px;
            background-color: #F8F8F8;
        }

        h1, h2 {
            color: #2E86C1;
        }

        table {
            border-collapse: collapse;
            margin-top: 30px;
            background-color: #fff;
        }

        table th, table td {
            border: 1px solid #ddd;
            padding: 10px;
        }

        table th {
            text-align: left;
        }

        table caption {
            font-size: 24px;
            font-weight: bold;
            margin-bottom: 20px;
        }

        input[type="text"] {
            border: 1px solid #ddd;
            padding: 10px;
            font-size: 16px;
            width: 100%;
            box-sizing: border-box;
        }

        input[type="submit"] {
            background-color: #2E86C1;
            color: #fff;
            padding: 10px 20px;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
            border: none;
        }

        input[type="submit"]:hover {
            background-color: #2874A6;
        }
    </style>
</head>
<body>
<center>
    <h1>User Management</h1>

    <h2>
        <a href="/users?action=create">Add New User</a>
    </h2>
    <form action="/users?action=search" method="post">
        <input type="text" name="country">
        <button type="submit"> Nhấn</button>
    </form>


</center>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of Users</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Country</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="user" items="${listUser}">
            <tr>
                <td><c:out value="${user.id}"/></td>
                <td><c:out value="${user.name}"/></td>
                <td><c:out value="${user.email}"/></td>
                <td><c:out value="${user.country}"/></td>
                <td>
                    <a href="/users?action=edit&id=${user.id}">Edit</a>
                    <a href="/users?action=delete&id=${user.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
        <c:forEach var="country" items="${countryList}">
            <tr>
                <td><c:out value="${country.id}"/></td>
                <td><c:out value="${country.name}"/></td>
                <td><c:out value="${country.email}"/></td>
                <td><c:out value="${country.country}"/></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>