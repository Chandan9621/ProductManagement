package com.Servlet;

import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/View")
public class AdminViewProductServlet2 extends GenericServlet {
	public void init()throws ServletException
	{
		
	}
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
	    	 
	    	 RequestDispatcher rd=req.getRequestDispatcher("AdminProductView.jsp");
	 	     rd.forward(req, res);
	     
	}
	
}
