<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="com.Bean.ProductBean"
    import="com.Bean.UserBean"
    import="com.DAO.RetrieveDAO"
    import="java.util.Iterator"
    import="java.util.ArrayList"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

 table,th,td
 {
 border:3px solid black;
 border-collapse:collapse;
 margin:5px;
 
}
</style>
</head>
<body background="image\\download8.jpeg">
<table style="width:100px;background-color:powderblue;">
<%
ArrayList<ProductBean>al=new RetrieveDAO().retrieve();
 Iterator<ProductBean> it=al.iterator();
UserBean ub=(UserBean)session.getAttribute("ubean");
out.println("<h2 style=color:green;>Welcome to User: "+ub.getFname()+"</h2>");
out.println("<tr><th style=font-size:25px;>ProductId&nbsp&nbsp</th><th style=font-size:25px;>ProductName&nbsp&nbsp</th><th style=font-size:25px;>&nbsp&nbspProductPrice</th><th style=font-size:25px;>ProductQty&nbsp&nbsp</th><tr>");
while(it.hasNext())
{
	 ProductBean pb=(ProductBean)it.next();
	 out.println("<tr>"+"<td style=text-align:center;font-size:25px;>"+pb.getpId()+"&nbsp&nbsp"+"</td>"+"<td style=text-align:center;font-size:25px>"+pb.getpName()+"&nbsp&nbsp"+"</td>"+"<td style=text-align:center;font-size:25px>"+pb.getpPrice()+"</td>"+"<td style=text-align:center;font-size:25px;>"+pb.getpQty()+"&nbsp&nbsp"+"</td>"+"</tr>");
}
%>
</table>
<a href="view" style=color:violet;font-size:30px;margin-left:200px;>ViewProduct</a>
<a href="out" style=color:violet;font-size:30px;margin-rightt:200px;>LogOut</a>
</body>
</html>