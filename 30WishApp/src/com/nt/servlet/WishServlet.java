package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WishServlet extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		PrintWriter pw=null;
		Calendar calendar=null;
		int hour=0;
		
		pw=res.getWriter();
		calendar=Calendar.getInstance();
		hour=calendar.get(Calendar.HOUR_OF_DAY);
		
		if(hour<=12)
			pw.println("<h1 style='color:red'>Good Morning</center></h1>");
		
		else if(hour<=17)
			pw.println("<h1 style='color:orange'>Good AfterNoon</center></h1>");
		
		else if(hour<=20)
			pw.println("<h1 style='color:orange'>Good Evening</center></h1>");
		
		else
			pw.println("<h1 style='color:orange'>Good Night</center></h1>");
		
		//pw.println("</br><a href='http://localhost:2525/30WishApp/page.html'>Home</a>");
		
		pw.close();
	}
}
