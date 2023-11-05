<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 03/11/2023
  Time: 13:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
  <title>Them Moi</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.3.0/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://cdn.datatables.net/1.13.6/css/dataTables.bootstrap5.min.css">
  <style>
    body {
      margin: 0;
      padding: 0;
      box-sizing: border-box;
      overflow: hidden;
    }

    .header {
      display: grid;
      height: 70px;
      background-color: #2b287f;
      width: 100%;
      justify-items: center;
      align-items: center;
    }

    a {
      text-decoration: none;
    }
  </style>
</head>
<body>

<div class="header">
  <img src="https://cdn.codegym.vn/wp-content/uploads/2021/08/CodeGym-Logo.webp" alt="">
</div>
<div class="container mt-3">
  <form action="/cong-viec?action=them" method="post">
    <div class="mb-3">
      <label for="tenCongViec" class="form-label">Tên công việc</label>
      <input type="text" class="form-control" id="tenCongViec" name="tenCongViec" required>
    </div>
    <div class="mb-3">
      <label for="ngayBatDau" class="form-label">Ngày bắt đầu</label>
      <input type="date" class="form-control" id="ngayBatDau" name="ngayBatDau" required>
    </div>
    <div class="mb-3">
      <label for="ngayKetThuc" class="form-label">Ngày kết thúc</label>
      <input type="date" class="form-control" id="ngayKetThuc" name="ngayKetThuc" required>
    </div>

    <div class="mb-3">
      <label for="maTH" class="form-label">Trạng Thái</label></br>
      <select class="form-label" name="maTH" id="maTH">
        <c:forEach items="${dsTrangThai}" var="dsTrangThai">
          <option  value="${dsTrangThai.maTrangThai}">${dsTrangThai.tenTrangThai}</option>
        </c:forEach>

      </select>
    </div>
    <div class="mb-3">
      <label for="tenCongViec" class="form-label">Mô tả </label>
      <input type="text" class="form-control" id="moTa" name="moTa" required>
    </div>
    <button type="submit" class="btn btn-primary">Xác nhận</button>
  </form>
</div>

</body>
</html>
