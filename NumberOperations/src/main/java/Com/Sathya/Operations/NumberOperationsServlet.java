package Com.Sathya.Operations;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NumberOperationsServlet
 */
public class NumberOperationsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NumberOperationsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		int Number1 = Integer.parseInt(request.getParameter("Number1"));
		int Number2 = Integer.parseInt(request.getParameter("Number2"));
		String Operation = request.getParameter("Operation");
		int result = 0;
		switch(Operation) {
		case "+":result = Number1+Number2;
							break;
		case "-":result = Number1-Number2;
							break;
		case "*":result = Number1*Number2;
							break;
		case "/":result = Number1/Number2;
							break;
		case "%":result = Number1%Number2;
							break;
		}
		RequestDispatcher Dispatcher= request.getRequestDispatcher("Operations.html");
		Dispatcher.include(request, response);
		writer.println("<h2 style='text-align:center'><p>"+"****OPERATIONS ON TWO NUMBERS****"+"</p>");
		writer.println("<html> <body bgcolor='blue'>");
		writer.println("<p>"+"Given Number 1 is"+" "+Number1+"</p>");
		writer.println("<p>"+"Given Number 2 is"+" "+Number2+"</p>");
		writer.println("result of two numbers"+" "+result);
		/*
		if (request.getParameter("Addition") != null){
			int total = Number1+Number2;
			writer.println("<p>"+" Addition Of Two Numbers-"+total+"</p>");
		} 
		if (request.getParameter("Subtraction") != null){
			int total = Number1-Number2;
			writer.println("<p>"+"Subtraction Of Two Numbers-"+total+"</p>");
		} 
		if (request.getParameter("Multiplication") != null){
			int total = Number1*Number2;
			writer.println("<p>"+"Multiplication Of Two Numbers-"+total+"</p>");
		}
		if (request.getParameter("Division") != null){
			int total = Number1/Number2;
			writer.println("<p>"+"Division Of Two Numbers-"+total+"</p>");
		}
		if (request.getParameter("ModuloDivision") != null){
			int total = Number1%Number2;
			writer.println("<p>"+"ModuloDivision Of Two Numbers-"+total+"</p>");
		}
		*/
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
