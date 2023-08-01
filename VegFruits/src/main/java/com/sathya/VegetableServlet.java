package com.sathya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class VegetableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public VegetableServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		ServletConfig config=  this.getServletConfig();
		String Veg1 = config.getInitParameter("V1");
		String Veg2 = config.getInitParameter("V2");
		ServletContext context = request.getServletContext();
		String Vendor = context.getInitParameter("Vendor");
		String Discount = context.getInitParameter("Discount");
		writer.println("<html><body   bgcolor='blue'  style='text-align:center'>");
		writer.println("Vegetable Servlet INIT parameter-1--->"+Veg1);
		writer.println("<br>");
		writer.println("Vegetable Servlet INIT parameter-2--->"+Veg2);
		writer.println("<br>");
		writer.println("Context parameter-1--->"+Vendor);
		writer.println("<br>");
		writer.println("Context parameter-2--->"+Discount);
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
