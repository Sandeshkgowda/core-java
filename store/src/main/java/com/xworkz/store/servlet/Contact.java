package com.xworkz.store.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/contact")
public class Contact extends HttpServlet {
	public Contact() {
		System.out.println("Running " + this.getClass().getSimpleName());
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name1 =req.getParameter("name");
		String email1=req.getParameter("email");
		String mobile = req.getParameter("mobile");
		String comments= req.getParameter("comments");
		
		System.out.println(name1);
		System.out.println(email1);
		System.out.println(mobile);
		System.out.println(comments);
		
		PrintWriter writer= resp.getWriter();
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		if (name1.length() > 3) {
			writer.print("<span style='color:green'>");
			writer.print("Login Sucessfully " + name1);
		} else {
			writer.print("<span style='color:red'>");
			writer.print("name should be greateer than 3 charaters");
		}
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
	}

}
