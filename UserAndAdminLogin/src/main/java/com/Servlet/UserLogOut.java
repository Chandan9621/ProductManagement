package com.Servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Bean.UserBean;
@WebServlet("/out")
public class UserLogOut extends HttpServlet {
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		HttpSession hs=req.getSession(false);//Aceessing existing Session
		if(hs==null)
		{
			pw.println("Session Expired");
		}
		else
		{
			
			UserBean ub=(UserBean)hs.getAttribute("ubean");
			pw.println(ub.getFname());
			RequestDispatcher rd=req.getRequestDispatcher("UserLogOut.jsp");
			rd.forward(req, res);
		}
	}

}
