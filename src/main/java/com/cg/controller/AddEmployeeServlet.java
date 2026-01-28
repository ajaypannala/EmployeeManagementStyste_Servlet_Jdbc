package com.cg.controller;
import java.io.IOException;
import java.sql.SQLException;
import com.cg.dao.EmployeeDao;
import com.cg.dto.Employee;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddEmployeeServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Employee e = new Employee();
		e.setName(req.getParameter("name"));
		e.setEmail(req.getParameter("email"));
		e.setSalary(Integer.parseInt(req.getParameter("salary")));
			
		EmployeeDao dao=new EmployeeDao();
		try {
			dao.addEmployee(e);
			resp.sendRedirect("list");
				
		}
		catch(ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
				
		}
	}

}


