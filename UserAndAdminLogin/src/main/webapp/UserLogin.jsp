<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="com.Bean.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
.vi a
{
color:green;
text-align:center;
font-size:30px;
margin-right:-400px;
margin-left:500px;
 }
 .vi a:hover
 {
 color:violet;
 }
 .vi h2:hover
 {
 color:violet;
 }
</style>
<body style=background-color:lightblue;>
<div class="vi">
<%
UserBean ub=(UserBean)session.getAttribute("ubean");
out.println("<h2 style=color:green;text-align:center;>Welcome to User: "+ub.getFname()+"</h2>");
%>
<a href="view">ViewProduct</a>
<a href="out">LogOut</a><br>
</div>
</body>
</html>