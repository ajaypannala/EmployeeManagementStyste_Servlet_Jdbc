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
@WebServlet("/update")
public class UpdateEmployeeServlet extends HttpServlet {

	        @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
	        	int id = Integer.parseInt(req.getParameter("id"));
	        	String name=req.getParameter("name");
	        	String email=req.getParameter("email");
	        	int salary=Integer.parseInt(req.getParameter("salary"));
	        	
	        	Employee e=new Employee();
	        	e.setId(id);
	        	e.setName(name);
	        	e.setEmail(email);
	        	e.setSalary(salary);

	    
		
			EmployeeDao dao = new EmployeeDao();

	        try {
	            dao.updateEmployee(e);
	            resp.sendRedirect("list");

	        } catch (ClassNotFoundException | SQLException e1) {
	            e1.printStackTrace();
	        }
	    }
	}


