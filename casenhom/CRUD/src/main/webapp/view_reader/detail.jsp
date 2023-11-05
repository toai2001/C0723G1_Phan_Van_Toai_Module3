<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 03/11/2023
  Time: 17:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Haitenz.net</title>
    <link rel="stylesheet" href="/css/toai.css">
    <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css"
    />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<style>
</style>
<body>
<!--HEADER-->
<div id="header">
    <!-- Header-->
    <nav class="navbar navbar-light header">
        <div class="container">
            <a class="navbar-brand py-0" href="#">
                <img src="./img/Logo.jpg" alt="logo" width="100%" height="25">
            </a>
            <form class="d-flex w-50">
                <input class="form-control" type="search" placeholder="Nhập tên sách, tác giả hoặc thể loại để tìm"
                       aria-label="Search">
                <button class="btn btn-outline-light ms-1" type="submit">Search</button>
            </form>
            <ul class="d-flex m-0 log-in">
                <a class="d-flex" href="#">
                    <li>
                        <i class="fa-regular fa-user" style="color: #ffffff;"></i>
                    </li>
                    <li class="px-2"> Hi, nv-1</li>
                </a>

                <a class="d-flex" href="#">
                    <li>
                        <i class="fa-solid fa-right-to-bracket" style="color: #ffffff;"></i>
                    </li>
                    <li class="px-2">Đăng xuất</li>
                </a>
            </ul>
        </div>
    </nav>

    <!--    NAV BAR-->
    <nav class="navbar navbar-expand-lg navbar-light bg-light p-0">
        <div class="container-fluid">
            <div class="collapse navbar-collapse d-flex justify-content-center align-items-center"
                 id="navbarSupportedContent">
                <ul class="navbar-nav mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link" href="#">Trang chủ</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                           data-bs-toggle="dropdown" aria-expanded="false">
                            Thể loại
                        </a>
                        <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <li><a class="dropdown-item" href="#">Thể loại 1</a></li>
                            <li><a class="dropdown-item" href="#">Thể loại 1</a></li>
                            <li><a class="dropdown-item" href="#">Thể loại 1</a></li>
                            <li><a class="dropdown-item" href="#">Thể loại 1</a></li>
                            <li><a class="dropdown-item" href="#">Thể loại 1</a></li>
                            <li><a class="dropdown-item" href="#">Thể loại 1</a></li>
                            <li><a class="dropdown-item" href="#">Thể loại 1</a></li>
                        </ul>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Đang theo dõi</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Phiếu mượn của tôi</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" HREF="#">Danh sách độc giả</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
</div>

<!--MAIN-CONTENT-->
<div class="container" style="background-color: white; height: 100%">
    <div class="row">
        <h3>Chi tiết độc giả </h3>
    </div>

    <!--    BORROW DETAIL-->
    <div class="row">
        <div class="col-lg-4">
            <div class="card mb-3" style="width: 18rem;">
                <img src="${reader.image}"
                     class="card-img-top" alt="...">
            </div>
        </div>

        <div class="col-lg-8">
            <table class="table table-striped">
                <tr>
                    <td>Username: </td>
                    <td>${reader.account.username}</td>
                </tr>
                <tr>
                    <td>Họ Và Tên: </td>
                    <td>${reader.readerName}</td>
                </tr>
                <tr>
                    <td>Địa chỉ: </td>
                    <td>${reader.address}</td>
                </tr>
                <tr>
                    <td>Số chứng minh nhân dân: </td>
                    <td>${reader.citizenId}</td>
                </tr>
                <tr>
                    <td>Ngày tháng năm sinh: </td>
                    <td>${reader.dateOfBirth}</td>
                </tr>
                <tr>
                    <td>Email: </td>
                    <td>${reader.email}</td>
                </tr>
                <tr>
                    <td>Số điện thoại:</td>
                    <td>${reader.phoneNumber}</td>
                </tr>
            </table>
        </div>
    </div>

</div>

<!--FOOTER-->
<div class="card text-center mt-5">
    <div class="card-header">
        <img src="img/logo_footer.png" width="10%"/></div>
    <div class="card-body">
        <h5 class="card-title">Thư viện Online C0723G1 - Team 2</h5>
        <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
        <a href="#" class="btn btn-primary">Trở lại đầu trang</a>
    </div>
    <div class="card-footer text-muted">
        Since 2023
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
</div>
<script>
    function send(id, name) {
        document.getElementById("id").value = id;
        document.getElementById("name").innerText = name;
    }
</script>
</body>
</html>