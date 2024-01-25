package com.expleo.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.expleo.Emp.EmpDaoImpl;
import com.expleo.Emp.EmpModel;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Search
 */
@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Search() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		EmpModel model = getEmpId(id);
		PrintWriter out =  response.getWriter();
		
		
		
		RequestDispatcher rd = request.getRequestDispatcher("Search.jsp");
		
		
		
		
		
		if(model == null) {
			out.println("No Such Data Found ..");
		}
		else {
			request.setAttribute("found", model);
			rd.forward(request, response);
		}
			
	}


	private EmpModel getEmpId(int id) {
		EmpDaoImpl daoImpl = new EmpDaoImpl();
		return daoImpl.getEmp(id);
	}


}
