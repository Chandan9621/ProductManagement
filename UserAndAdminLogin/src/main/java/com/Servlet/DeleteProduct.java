package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Bean.ProductBean;
import com.DAO.LoginDAO;
@WebServlet("/del")
public class DeleteProduct extends HttpServlet{
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		ProductBean pb=new ProductBean();
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		try {
		Integer pId=Integer.parseInt(req.getParameter("pId"));
		pb.setpId(pId);
		ProductBean pb1=new LoginDAO().reterive1(pb);
		if(pb1==null)
		{
			pw.println("<h2 style=color:red;>Invalid Product Id......</h2>");
			RequestDispatcher rd=req.getRequestDispatcher("Link.html");
			rd.include(req, res);
			
		}
		else
		{
			RequestDispatcher rd=req.getRequestDispatcher("del.jsp");
			rd.forward(req, res);
}
		}
		catch(Exception e)
		{
			pw.println("<h3 style=color:red;>Please Enter Integrer Data</h3>");
		}
		
		}

}
