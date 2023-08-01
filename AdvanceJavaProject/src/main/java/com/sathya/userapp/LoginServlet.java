package com.sathya.userapp;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		UserDao dao = new UserDao();

		 
			boolean result = false;
			try {
				result = dao.loginValidation(email, password);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (result) {
				System.out.println("success");
				RequestDispatcher dispatcher = request.getRequestDispatcher("loginsuccess.jsp");
				dispatcher.forward(request, response);
			} else {
				System.out.println("fail");
				RequestDispatcher dispatcher = request.getRequestDispatcher("loginfail.jsp");
				dispatcher.forward(request, response);
			}
		

	}

}
