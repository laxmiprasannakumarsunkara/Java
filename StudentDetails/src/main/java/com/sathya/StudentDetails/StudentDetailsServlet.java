package com.sathya.StudentDetails;

import java.io.IOException;


import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentDetailsServlet
 */
public class StudentDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
   /* public StudentDetailsServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		writer.println("<bgcolor='blue'>");
		String Name=request.getParameter("StudentName");
		int Roll = Integer.parseInt(request.getParameter("RollNumber"));
		int Subject1 = Integer.parseInt(request.getParameter("Subject1"));
		int Subject2 = Integer.parseInt(request.getParameter("Subject2"));
		int Subject3 = Integer.parseInt(request.getParameter("Subject3"));
		writer.println("<h2 style='text-align:center'><p>"+"****Student Details****"+"</p>");
		writer.println("<p>"+" Name of the student -"+Name+"</p>");
		writer.println("<p>"+" Roll number of the student-"+Roll+"</p>");
		writer.println("<p>"+" marks of subject 1-"+Subject1+"</p>");
		writer.println("<p>"+" marks of subject 2-"+Subject2+"</p>");
		writer.println("<p>"+" marks of subject 3-"+Subject3+"</p>");
		int total = Subject1+Subject2+Subject3;
		int average = total/3;
		writer.println("<p>"+" Total marks-"+total+"</p>");
		writer.println("<p>"+" Total average-"+average+"</p>");
		if(average >= 70) {
			writer.println("<p>"+"Grade A"+"</p>");
		}
		if(average>=50 && average <70) {
			writer.println("<p>"+"Grade B"+"</p>");
		}
		if(average < 50) {
			writer.println("<p>"+"Grade C"+"</p>");
		}
		writer.println("</html></body>");
			
			
		
		
		
	
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
