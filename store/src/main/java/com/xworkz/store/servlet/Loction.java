package com.xworkz.store.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/loction")
public class Loction extends HttpServlet {
	public Loction() {
		System.out.println("running " + this.getClass().getSimpleName());
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("emial");
		String startPoint = req.getParameter("startPoint");
		String destination = req.getParameter("destination");
		String gender = req.getParameter("gender");

		System.out.println(name);
		System.out.println(email);
		System.out.println(startPoint);
		System.out.println(destination);
		System.out.println(gender);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		if (name.length() > 3) {
			writer.print("<span style='color:green'>");
			writer.print("Login Sucessfully " + name);
		} else {
			writer.print("<span style='color:red'>");
			writer.print("name should be greateer than 3 charaters");
		}
		

		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
	}

}
