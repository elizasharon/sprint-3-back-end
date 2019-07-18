package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public WelcomeServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.println("<h1>Unauthorized access to this page!</h1>");
		RequestDispatcher rd = request.getRequestDispatcher("Login.html");
		rd.include(request, response);
//		pw.println("<h1>Please <a href='Login.html'>Login</a>First</h1>");
	 }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		
		PrintWriter  out = response.getWriter();
		
		if(name.equals(password)) {
//			out.println("<h1>Welcome !" + name +"</h1>");
			RequestDispatcher rd = request.getRequestDispatcher("final");
			rd.forward(request, response);
		}
		else {
			out.println("<h1>Sorry Invalid Credentials :(</h1>");
//			out.println("<h3><a href='Login.html'>Try Again</a>");
			RequestDispatcher rd = request.getRequestDispatcher("Login.html");
			rd.include(request, response);
 		}
	}

}
