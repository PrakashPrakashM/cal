package com.serpackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String number1 = request.getParameter("num1");
		String number2  = request.getParameter("num2");
		
		int numb1 = Integer.parseInt(number1);
		int numb2 = Integer.parseInt(number2);
		
   		PrintWriter pw = response.getWriter();
		 
   		
		 int sum = numb1 + numb2;
		pw.println("Sum of number is : " + sum);
	}

}
