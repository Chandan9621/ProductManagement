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
import javax.servlet.http.HttpSession;

import com.Bean.UserBean;
import com.DAO.LoginDAO;


@SuppressWarnings("serial")
@WebServlet("/ulog")
public class UserLoginServlet extends HttpServlet{
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		UserBean ub=new LoginDAO().login(req);
		if(ub==null)
		{
			pw.println("<h3>Please Enter the Correct Data</h3>");
			RequestDispatcher rd=req.getRequestDispatcher("UserLogin.html");
			rd.include(req, res);
		}
		else
		{
			HttpSession hs=req.getSession();//New Session creation
			hs.setAttribute("ubean", ub);
			//pw.println("<h3>Welcome to user "+ub.getFname()+"</h3>");
			RequestDispatcher rd=req.getRequestDispatcher("UserLogin.jsp");
			rd.forward(req, res);
		}
		}
		
		
		
	}


