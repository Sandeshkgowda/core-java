package com.xworkz.panda.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebFault;
@WebServlet(loadOnStartup = 1,urlPatterns = "/yake")
public class Java extends HttpServlet {
	public Java() {
		// TODO Auto-generated constructor stub
		System.out.println("constructor" + this.getClass().getSimpleName());
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("created sucessfully");
	}
	

}
