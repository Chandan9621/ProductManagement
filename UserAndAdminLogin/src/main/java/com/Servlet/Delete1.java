package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Bean.ProductBean;
import com.DAO.RetrieveDAO;
@WebServlet("/delete1")
public class Delete1 extends HttpServlet {
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
	PrintWriter pw=res.getWriter();
	res.setContentType("text/html");
	ProductBean pb=new ProductBean();
	ProductBean pb1=new RetrieveDAO().delete1();
	//req.setAttribute("value", k);
	if(pb1==null)
	{
		pw.println("Record Delete");
	RequestDispatcher rd=req.getRequestDispatcher("del1.jsp");
	rd.include(req, res);
		
	}

}
}
