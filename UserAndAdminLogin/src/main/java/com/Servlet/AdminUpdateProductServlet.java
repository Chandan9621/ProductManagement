package com.Servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Bean.AdminBean;
import com.Bean.ProductBean;
import com.DAO.LoginDAO;

import Exception.HandleNullPointerException;

@SuppressWarnings("serial")
@WebServlet("/upd")
public class AdminUpdateProductServlet extends HttpServlet{
	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{PrintWriter pw=res.getWriter();
	   ProductBean pb=new ProductBean();
		AdminBean eb=new AdminBean();
		try
		{
		Integer pco=(Integer.parseInt(req.getParameter("pcode")));
		pb.setpId(pco);
        ProductBean pb1=new LoginDAO().reterive(pb);
        
	    res.setContentType("text/html");
	 
	 //System.out.println("Entered value : "+pco);
	 //System.out.println("Fetch value : "+pb1);
		if(pb1==null)
		 {
			  pw.println("<h3 style=font-size:20px;color:red;>Invalid ProductId Try again....</h3><br>");
			  RequestDispatcher rd=req.getRequestDispatcher("Update.html");
			  rd.include(req, res);
		 }
		
		 else
		 { pw.println("<body background=image\\download8.jpeg>");
			 pw.println("<form action='update' method='post'>");
			 pw.println("<table><tr><td style=font-size:20px;>Product-Code</td><td><input type='text' name='pcode' value='"+pb1.getpId()+"' autofocus required style=font-size:20px;></td></tr></table><br>");
			 pw.println("<table><tr><td style=font-size:20px;>Product-Name</td><td><input type='text' name='pname' value='"+pb1.getpName()+"' style=font-size:20px;></td></tr></table><br>");
			 pw.println("<table><tr><td style=font-size:20px;>Product-Rate<td><input type='text' name='pprice' value='"    +pb1.getpPrice()+"' style=font-size:20px;></td></tr></table><br>");
			 pw.println("<table><tr><td style=font-size:20px;>Product-Qnty<td><input type='text' name='pqty' value='"+pb1.getpQty()+"' style=font-size:20px;></td></tr></table><br>");
			 pw.println("<button style=font-size:20px;>Submit</button>");
			 pw.println("</form>");
			 pw.println("</body>");
		 }
	 }
	
	 catch(Exception ex)
	 {
		 
		 //pw.println("<h3 style=font-size:20px;color:red;>Invalid ProductId Try again....</h3><br>");
		 pw.println("Please Enter Integer data....<br>");
		
		 //throw new HandleNullPointerException("invalid......");
	 }
}

}
