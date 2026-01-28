package com.cg.controller;

import java.io.IOException;
	import java.sql.SQLException;

	import com.cg.dao.EmployeeDao;
	import com.cg.dto.Employee;

	import jakarta.servlet.RequestDispatcher;
	import jakarta.servlet.ServletException;
	import jakarta.servlet.annotation.WebServlet;
	import jakarta.servlet.http.HttpServlet;
	import jakarta.servlet.http.HttpServletRequest;
	import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/edit")
public class EditEmployeeServlet extends HttpServlet {

	 @Override
	 protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	            throws ServletException, IOException {

	        int id = Integer.parseInt(req.getParameter("id"));

	        EmployeeDao dao = new EmployeeDao();

	        try {
	            Employee emp = dao.getEmployeeById(id);

	            // send employee object to JSP
	            req.setAttribute("emp", emp);

	            RequestDispatcher dispatcher =
	                    req.getRequestDispatcher("edit-employee.jsp");
	            dispatcher.forward(req, resp);

	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }
	  }
}


