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
    <a href="users?action=users">List All Users</a>
  </h2>
</center>
<div align="center">
  <form method="post">
    <table border="1" cellpadding="5">
      <caption>
        <h2>
          Edit User
        </h2>
      </caption>
      <c:if test="${user != null}">
        <input type="hidden" name="id" value="<c:out value='${user.id}' />"/>
      </c:if>
      <tr>
        <th>User Name:</th>
        <td>
          <input type="text" name="name" size="45"
                 value="<c:out value='${user.name}' />"
          />
        </td>
      </tr>
      <tr>
        <th>User Email:</th>
        <td>
          <input type="text" name="email" size="45"
                 value="<c:out value='${user.email}' />"
          />
        </td>
      </tr>
      <tr>
        <th>Country:</th>
        <td>
          <input type="text" name="country" size="15"
                 value="<c:out value='${user.country}' />"
          />
        </td>
      </tr>
      <tr>
        <td colspan="2" align="center">
          <input type="submit" value="Save"/>
        </td>
      </tr>
    </table>
  </form>
</div>
</body>
</html>