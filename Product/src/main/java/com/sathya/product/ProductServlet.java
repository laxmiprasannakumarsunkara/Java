package com.sathya.product;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductServlet
 */
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ProductServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		String ProductName=request.getParameter("ProductName");
		int ProductCost = Integer.parseInt(request.getParameter("ProductCost"));
		int ProductQuantity = Integer.parseInt(request.getParameter("ProductQuantity"));
		double discount;
		String s;
		double totalbill = ProductCost*ProductQuantity;
		if(totalbill<1000)
	      {
			 s="No";
			 discount=0;
	         
	      }
	      else if(totalbill>1000 && totalbill<5000)
	      {
	    	   s="5%";
	    	  
	    	  discount = totalbill*0.05;
	         
	      }
	      else if(totalbill>5000 && totalbill<10000)
	      {
	    	  s="10%";
	    	  discount = totalbill*0.1;
	         
	      }
	      else
	      {
	    	  s="15%";
	    	  discount = totalbill*0.15;
	   
	      }
		writer.println("<h2 style='text-align:center'><p>"+"****Product Bill Calculator Result****"+"</p>");
		writer.println("<p>"+"Product Name:"+" "+ProductName+"</p");
		writer.println("<p>"+"Total Cost Of"+" "+ProductQuantity+" "+"Products:" +" "+totalbill+"</p");
		writer.println("<p>"+s+" "+"Discount Amount:" +" "+ discount+"</p");
		writer.println("<p>"+"Net Amount To Pay:"+" "+"$"+(totalbill - discount)+"</p");
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
