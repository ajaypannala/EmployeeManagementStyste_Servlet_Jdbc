package com.cg.controller;

import java.io.IOException;
	import java.sql.SQLException;

	import com.cg.dao.EmployeeDao;

	import jakarta.servlet.ServletException;
	import jakarta.servlet.annotation.WebServlet;
	import jakarta.servlet.http.HttpServlet;
	import jakarta.servlet.http.HttpServletRequest;
	import jakarta.servlet.http.HttpServletResponse;

	@WebServlet("/delete")
public class DeleteEmployeeServlet extends HttpServlet {

	  @Override
	 protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	          throws ServletException, IOException {

	       int id = Integer.parseInt(req.getParameter("id"));

	       EmployeeDao dao = new EmployeeDao();

	        try {
	            dao.deleteEmployee(id);
	            resp.sendRedirect("list");

	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}


