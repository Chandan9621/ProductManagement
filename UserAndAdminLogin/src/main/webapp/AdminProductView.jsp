<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="com.Bean.AdminBean"
    import="com.Bean.ProductBean"
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
 color:green;
 padding-top:10px;
 padding-bottom:15px;
 padding-left:10px;
 padding-right:30px;
 }
 </style>
</head>
<body>
<table style="width:100px;">
<%
ArrayList<ProductBean>al=new RetrieveDAO().retrieve1();
Iterator<ProductBean> it=al.iterator();
AdminBean ab=(AdminBean)session.getAttribute("abean");
out.println("<h3 style=color:green;>"+"Welcome to Admin: "+ab.getFname()+"</h3>");
out.println("<tr><th>ProductId</th><th>ProductName</th><th>ProductPrice</th><th>ProductQty</th><tr>");
while(it.hasNext())
{
	
	 ProductBean pb=(ProductBean)it.next();
	 out.println("<tr>"+"<td>"+pb.getpId()+"</td>"+"<td>"+pb.getpName()+"</td>"+"<td>"+pb.getpPrice()+"</td>"+"<td>"+pb.getpQty()+"</td>"+"</tr>");
}
%>
</table>
<jsp:include page="Link.html"/>
</body>
</html>