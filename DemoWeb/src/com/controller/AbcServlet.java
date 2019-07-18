package com.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AbcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int i =0;

	public AbcServlet() {
		super();
	}

	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet Instantiated....");
	}

	public void destroy() {
		System.out.println("Servlet Destroyed....");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Servlet request came : "+ ++i);
		ServletContext ctx = request.getServletContext();
		String company = ctx.getInitParameter("company");
		response.getWriter().println("Company : "+ company);
	}

}
