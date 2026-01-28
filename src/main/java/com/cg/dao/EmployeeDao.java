package com.cg.dao;

import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;
	import java.util.List;

import com.cg.dto.Employee;
import com.cg.util.DBUtil;

	

public class EmployeeDao {

	   public void addEmployee(Employee emp)
	            throws ClassNotFoundException, SQLException {

	        Connection conn = DBUtil.getConnection();
	        String query = "INSERT INTO EMPLOYEE(NAME, EMAIL, SALARY) VALUES (?, ?, ?)";
	        PreparedStatement ps = conn.prepareStatement(query);

	        ps.setString(1, emp.getName());
	        ps.setString(2, emp.getEmail());
	        ps.setInt(3, emp.getSalary());

	        ps.executeUpdate();
	    }
	    public void updateEmployee(Employee emp)
	            throws ClassNotFoundException, SQLException {

	        Connection conn = DBUtil.getConnection();

	        
	        String query = "UPDATE EMPLOYEE SET NAME=?, EMAIL=?, SALARY=? WHERE ID=?";
	        PreparedStatement ps = conn.prepareStatement(query);

	        ps.setString(1, emp.getName());
	        ps.setString(2, emp.getEmail());
	        ps.setInt(3, emp.getSalary());
	        ps.setInt(4, emp.getId());

	        ps.executeUpdate();
	    }
	    public void deleteEmployee(int id)
	            throws ClassNotFoundException, SQLException {

	        Connection conn = DBUtil.getConnection();
	        String query = "DELETE FROM EMPLOYEE WHERE ID=?";
	        PreparedStatement ps = conn.prepareStatement(query);

	        ps.setInt(1, id);
	        ps.executeUpdate();
	    } 
	    public List<Employee> getAllEmployees()
	            throws ClassNotFoundException, SQLException {

	        Connection conn = DBUtil.getConnection();
	        List<Employee> list = new ArrayList<>();

	        String query = "SELECT * FROM EMPLOYEE";
	        PreparedStatement ps = conn.prepareStatement(query);
	        ResultSet rs = ps.executeQuery();

	        while (rs.next()) {
	            Employee e = new Employee();
	            e.setId(rs.getInt("id"));
	            e.setName(rs.getString("name"));
	            e.setEmail(rs.getString("email"));
	            e.setSalary(rs.getInt("salary"));

	            list.add(e);
	        }
	        return list;
	    }
	    public Employee getEmployeeById(int id)
	            throws ClassNotFoundException, SQLException {

	        String query = "SELECT * FROM EMPLOYEE WHERE ID=?";
	        Connection conn = DBUtil.getConnection();
	        PreparedStatement ps = conn.prepareStatement(query);
	        ps.setInt(1, id);

	        ResultSet rs = ps.executeQuery();

	        if (rs.next()) {
	            Employee e = new Employee();
	            e.setId(rs.getInt("id"));
	            e.setName(rs.getString("name"));
	            e.setEmail(rs.getString("email"));
	            e.setSalary(rs.getInt("salary"));
	            return e;
	        }
	        return null;
	   }
}


