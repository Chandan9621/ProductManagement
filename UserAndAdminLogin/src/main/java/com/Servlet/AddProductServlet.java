package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Bean.AdminBean;
import com.Bean.ProductBean;
import com.DAO.LoginDAO;

@SuppressWarnings("serial")
@WebServlet("/product")
public class AddProductServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		ProductBean pb=new ProductBean();
		pb.setpId(Integer.parseInt(req.getParameter("pcode")));
		pb.setpName(req.getParameter("pname"));
		pb.setpPrice(Integer.parseInt(req.getParameter("pprice")));
		pb.setpQty(Integer.parseInt(req.getParameter("pqty")));
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		int k=new LoginDAO().insert(pb);
		  AdminBean ab=new AdminBean();
			HttpSession hs=req.getSession(false);
		if(k>0)
		{
		   

			AdminBean ab1= (AdminBean)hs.getAttribute("abean");
			//System.out.println(ab1.getFname());
			
		    RequestDispatcher rd=req.getRequestDispatcher("AddProduct.jsp");
			rd.forward(req, res);
		}
	}
	public void destroy()
	{
		
	}
		
	}

