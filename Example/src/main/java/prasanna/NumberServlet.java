package prasanna;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NumberServlet
 */
public class NumberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public NumberServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();

		int FirstNumber = Integer.parseInt(request.getParameter("FirstNumber"));
		int SecondNumber = Integer.parseInt(request.getParameter("SecondNumber"));
		int sum = FirstNumber+SecondNumber;
		boolean isprime = true;
		
		if(sum%2==0) {
			writer.println(sum+"is even");
		}
		
		if(sum%2!=0) {
			writer.println(sum+"is odd");
		}
	    if(sum>2) {
	    
		for(int i=2;i<=sum/2;i++){      
		    if(sum%i==0){      
		    	writer.println(sum+" is not prime number");      
		     isprime=false;      
		     break;      
		    }      
		   }      
		   if(isprime == true)  { 
			   writer.println(sum+" is prime number"); }  
			
		}
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
