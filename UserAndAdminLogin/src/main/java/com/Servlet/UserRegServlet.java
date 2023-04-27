package com.Servlet;

import java.io.IOException;

import java.io.PrintWriter;
import java.net.http.HttpResponse;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Bean.UserBean;
import com.DAO.LoginDAO;
@SuppressWarnings("serial")
@WebServlet("/new")
public class UserRegServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		UserBean ub=new UserBean();
		ub.setUname(req.getParameter("uname"));
		ub.setPword(req.getParameter("pword"));
		ub.setFname(req.getParameter("fname"));
		ub.setLname(req.getParameter("lname"));
		ub.setAddr(req.getParameter("addr"));
		ub.setMid(req.getParameter("mid"));
		ub.setMobno(Long.parseLong(req.getParameter("mobno")));
		int k=new LoginDAO().insert1(ub);
		//HttpSession hs=req.getSession(false);
		if(k>0)
		{
			//UserBean ub1=(UserBean)hs.getAttribute("ubean");
		    RequestDispatcher rd=req.getRequestDispatcher("UserReg.jsp");
		    rd.forward(req,res);
			
		}
		
	}

}
