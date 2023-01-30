package com.xworkz.detail.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 4 , urlPatterns = "/detail")
public class Detail extends HttpServlet {
	public Detail() {
	System.out.println("calling constructor");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String gender = req.getParameter("gender");
		String reason = req.getParameter("reason");
		String address = req.getParameter("address");
		
		System.out.println("firstName");
		System.out.println("lastName");
		System.out.println("gender");
		System.out.println("reason");
		System.out.println("address");
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("display.jsp");
		req.setAttribute("firstName", firstName);
		req.setAttribute("lastName", lastName);
		req.setAttribute("gender", gender);
		req.setAttribute("reason", reason);
		req.setAttribute("address", address);
		dispatcher.forward(req, resp);
		
		resp.setContentType("text/html");
		
		
		

	}

}
