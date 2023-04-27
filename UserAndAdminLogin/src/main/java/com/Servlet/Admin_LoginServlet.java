package com.Servlet;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Bean.AdminBean;
import com.DAO.LoginDAO;

@SuppressWarnings("serial")
@WebServlet("/admi")
public class Admin_LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		AdminBean ab=new LoginDAO().login1(req);
		if(ab==null)
		{
			pw.println("Invalid user Id and Password");
			RequestDispatcher rd=req.getRequestDispatcher("AdminLogin.html");
			rd.include(req, res);
		}
		else
		{
		  HttpSession hs=req.getSession();//New Session creation
		  hs.setAttribute("abean", ab);
			RequestDispatcher rd=req.getRequestDispatcher("AdminLogin.jsp");
			rd.include(req, res);
		}
		
	}
}

