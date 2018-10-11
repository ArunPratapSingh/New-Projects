package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CountryServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		String stateIndia[]={"AP","MP","UP","CG","MH"};
		String usaState[]={"CA","LA","NY","CR","AZ"};
		String ausisState[]={"TMS","BB","CBR"};
		
		String country=null;
		country=req.getParameter("country");
		
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		if(country.equals("india")){
			pw.println("states=="+Arrays.toString(stateIndia));
		}
		else if(country.equals("usa")){
			pw.println("states=="+Arrays.toString(usaState));
		}
		else{
			pw.println("states=="+Arrays.toString(ausisState));
		}
		pw.close();
	}//doGet
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		doGet(req, res);
	}//doPost
}//class