package com.sathya.userapp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResetPasswordServlet
 */
@WebServlet("/ResetPasswordServlet")
public class ResetPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//getting client data
				String email=	request.getParameter("email");
				String newPassword=	request.getParameter("newpassword");
				String confPassword=	request.getParameter("confpassword");
				
				if(newPassword.equals(confPassword)) {
					
				int res =	UserDao.passwordreset(email, confPassword);
				
				if(res==1) {
					RequestDispatcher dispatcher=request.getRequestDispatcher("ResetSuccess.jsp");
					dispatcher.forward(request, response);
				}
				else {
					RequestDispatcher dispatcher=request.getRequestDispatcher("ResetFail.jsp");
					dispatcher.forward(request, response);
				}
				}
				else {
					RequestDispatcher dispatcher=request.getRequestDispatcher("ResetFail.jsp");
					dispatcher.forward(request, response);
				}
			}
		
	}


