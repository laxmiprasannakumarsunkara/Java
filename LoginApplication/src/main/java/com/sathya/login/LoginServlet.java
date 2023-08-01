package com.sathya.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter Writer = response.getWriter();
		// get the data from client
		String user = request.getParameter("username");
		String password = request.getParameter("password");

		if (user.equals("prasanna") && password.equals("prassu@2125")) {
			Writer.println("Login success....");

		} else {
			Writer.println("pakkaki velli aadukoamma .......");
		}
	}

}