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

import com.Bean.AdminBean;
import com.Bean.ProductBean;
import com.DAO.LoginDAO;


@SuppressWarnings("serial")
@WebServlet("/update")
public class AdminUpdateProductServlet1 extends HttpServlet {
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws
	ServletException,IOException
	{ 
	ProductBean pb=new ProductBean();
	
	     pb.setpId(Integer.parseInt(req.getParameter("pcode")));
	     pb.setpName(req.getParameter("pname"));
	     pb.setpPrice(Integer.parseInt(req.getParameter("pprice")));
	     pb.setpQty(Integer.parseInt(req.getParameter("pqty")));
		 int k=new LoginDAO().update(pb);
		 PrintWriter pw=res.getWriter();
		 res.setContentType("text/html");
		 HttpSession hs=req.getSession(false);
		if(k>0)
		{
	
			AdminBean ab1= (AdminBean)hs.getAttribute("abean");

		   
			//pw.println("Employee Update Successfully...<br>");
			RequestDispatcher rd=req.getRequestDispatcher("Update.jsp");
		   rd.include(req, res);
	}
	}
}
