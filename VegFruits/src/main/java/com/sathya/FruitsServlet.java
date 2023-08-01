package com.sathya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FruitsServlet
 */
public class FruitsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FruitsServlet() {
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
		ServletConfig config=  this.getServletConfig();
		String Fruit1 = config.getInitParameter("F1");
		String Fruit2 = config.getInitParameter("F2");
		ServletContext context = request.getServletContext();
		String Vendor = context.getInitParameter("Vendor");
		String Discount = context.getInitParameter("Discount");
		writer.println("<html><body   bgcolor='blue'  style='text-align:center'>");
		writer.println("Fruit Servlet INIT parameter-1--->"+Fruit1);
		writer.println("<br>");
		writer.println("Fruit Servlet INIT parameter-2--->"+Fruit2);
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
