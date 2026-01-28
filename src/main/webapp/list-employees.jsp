<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
/* Add Employee Button */
.add-btn {
    display: inline-block;
    margin-bottom: 20px;
    padding: 10px 18px;
    background: linear-gradient(135deg, #43e97b, #38f9d7);
    color: #fff;
    text-decoration: none;
    font-weight: 600;
    border-radius: 25px;
    box-shadow: 0 6px 15px rgba(0, 0, 0, 0.15);
    transition: all 0.3s ease;
}

.add-btn:hover {
    transform: translateY(-2px);
    box-shadow: 0 10px 25px rgba(0, 0, 0, 0.25);
}

/* Table Styling */
.employee-table {
    width: 100%;
    border-collapse: collapse;
    font-family: Arial, sans-serif;
    background: #ffffff;
    box-shadow: 0 8px 25px rgba(0, 0, 0, 0.1);
}

.employee-table th {
    background: #4facfe;
    color: white;
    padding: 12px;
    text-align: left;
    font-size: 14px;
}

.employee-table td {
    padding: 10px 12px;
    border-bottom: 1px solid #eee;
    font-size: 14px;
}

.employee-table tr:nth-child(even) {
    background-color: #f9f9f9;
}

.employee-table tr:hover {
    background-color: #eef6ff;
}

/* Action buttons */
.employee-table a {
    padding: 6px 12px;
    margin-right: 6px;
    text-decoration: none;
    color: black;
    border-radius: 6px;
    font-size: 13px;
}

.employee-table a.edit {
    background-color: black;
}

.employee-table a.delete {
    background-color: black;
}

.employee-table a:hover {
    opacity: 0.100;
}

</style>
</head>
<body>
<%@ page import="java.util.*, com.cg.dto.Employee" %>

<a href="add-employee.jsp" class="add-btn">Add New Employee</a>

<table class="employee-table">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Salary</th>
        <th>Action</th>
    </tr>


<%
List<Employee> list = (List<Employee>) request.getAttribute("list");
for(Employee e : list) {
%>
<tr>
    <td><%=e.getId()%></td>
    <td><%=e.getName()%></td>
    <td><%=e.getEmail()%></td>
    <td><%=e.getSalary()%></td>
    <td>
        <a href="edit?id=<%=e.getId()%>">Edit</a> |
        <a href="delete?id=<%=e.getId()%>">Delete</a>
    </td>
</tr>
<% } %>
</table>

</body>
</html>