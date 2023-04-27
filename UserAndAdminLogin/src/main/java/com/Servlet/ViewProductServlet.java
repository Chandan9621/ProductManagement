package com.Servlet;

import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewProductServlet extends GenericServlet {
	public void init()throws ServletException
	{
		
	}
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
	    	 
	  RequestDispatcher rd=req.getRequestDispatcher("UserProductView.jsp");
	  rd.forward(req, res);
	     
	}
	
}
