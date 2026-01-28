package com.cg.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.cg.dao.EmployeeDao;
import com.cg.dto.Employee;

import jakarta.servlet.RequestDispatcher;
	import jakarta.servlet.ServletException;
	import jakarta.servlet.annotation.WebServlet;
	import jakarta.servlet.http.HttpServlet;
	import jakarta.servlet.http.HttpServletRequest;
	import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/list")
public class ListEmployeeServlet extends HttpServlet {

	  @Override
	  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	            throws ServletException, IOException {

	        EmployeeDao dao = new EmployeeDao();
	        try {
				List<Employee> list=dao.getAllEmployees();
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	        try {
	            req.setAttribute("list", dao.getAllEmployees());

	            RequestDispatcher dispatcher =
	                    req.getRequestDispatcher("list-employees.jsp");
	            dispatcher.forward(req, resp);

	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }
	  }
}


