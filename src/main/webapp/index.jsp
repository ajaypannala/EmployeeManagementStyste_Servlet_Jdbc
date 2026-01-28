<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
    font-family: Arial, sans-serif;
}

.nav-buttons {
    margin-top: 20px;
}

.btn {
    display: inline-block;
    padding: 10px 18px;
    background-color: #0d6efd;
    color: #fff;
    text-decoration: none;
    font-size: 14px;
    border-radius: 5px;
    margin-right: 10px;
}
.btn:hover {
    background-color: #084298;
}
</style>
</head>
<body>
<h2>Welcome to Employee Management System</h2>
<p class="nav-buttons">
    <a href="list" class="btn">View All Employees</a>
    <a href="add-employee.jsp" class="btn btn-add">Add New Employee</a>
</p>
</body>
</html>
