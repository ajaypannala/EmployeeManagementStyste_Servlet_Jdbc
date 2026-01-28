<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.employee-form {
    width: 360px;
    margin: 50px auto;
    padding: 25px;
    background: #ffffff;
    border-radius: 12px;
    box-shadow: 0 10px 30px rgba(0, 0, 0, 0.15);
    font-family: Arial, sans-serif;
}

.employee-form h2 {
    text-align: center;
    margin-bottom: 20px;
    color: #333;
}

.employee-form label {
    display: block;
    margin-bottom: 6px;
    font-weight: 600;
    color: #555;
}

.employee-form input {
    width: 100%;
    padding: 10px 12px;
    margin-bottom: 16px;
    border: 1px solid #ccc;
    border-radius: 8px;
    font-size: 14px;
    transition: border-color 0.3s, box-shadow 0.3s;
}

.employee-form input:focus {
    outline: none;
    border-color: #4facfe;
    box-shadow: 0 0 0 3px rgba(79, 172, 254, 0.3);
}

.employee-form button {
    width: 100%;
    padding: 12px;
    background: linear-gradient(135deg, #4facfe, #00f2fe);
    border: none;
    border-radius: 25px;
    color: white;
    font-size: 15px;
    font-weight: 600;
    cursor: pointer;
    transition: transform 0.2s, box-shadow 0.2s;
}

.employee-form button:hover {
    transform: translateY(-2px);
    box-shadow: 0 8px 20px rgba(0, 0, 0, 0.25);
}

.employee-form button:active {
    transform: scale(0.97);
}

</style>
</head>
<body>
<form action="add" method="post" class="employee-form">
    <h2>Add Employee</h2>

    <label>Name</label>
    <input type="text" name="name" placeholder="Enter name">

    <label>Email</label>
    <input type="text" name="email" placeholder="Enter email">

    <label>Salary</label>
    <input type="text" name="salary" placeholder="Enter salary">

    <button type="submit">Add Employee</button>
</form>


</body>
</html>