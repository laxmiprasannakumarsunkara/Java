package com.sathya.form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FullNameServlet1
 */
public class FullNameServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FullNameServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		String firstname=request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		writer.println("this is full name application");
		writer.println("<h1 style='color:blue'>your full name is...</p>"+(firstname+lastname));
		writer.println("</html></body>");
		
	}



}
