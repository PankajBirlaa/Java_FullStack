package com.expleo.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.expleo.Emp.EmpDaoImpl;
import com.expleo.Emp.EmpModel;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Employee
 */
@WebServlet("/Employee")
public class Employee extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	
    public Employee() {
        super();
  
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		int id = Integer.parseInt(request.getParameter("id"));
		
		float salary=Float.parseFloat( request.getParameter("salary"));
		
		EmpModel model = new EmpModel(id, name, salary);
		
		PrintWriter out = response.getWriter();
		
		if(insertedData(model) > 0)
		{
			out.println("<h1> Data Inserted Successfully !!!");
		
		}
		else {
			out.println("<h1> Something went Wrong  !!!");
		}
		
		
	}


	private int insertedData(EmpModel model) {
	
		EmpDaoImpl daoImpl = new EmpDaoImpl();
		
		return daoImpl.save(model);
		
	}

}
