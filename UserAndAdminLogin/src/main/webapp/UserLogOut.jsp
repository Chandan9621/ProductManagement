<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="com.Bean.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body  background="image\\shop.jpg">
<%
UserBean ub=(UserBean)session.getAttribute("ubean");
out.print("<h3 style=color:red;text-align:center;font-size:20px;border:2px;>"+ub.getFname()+"&nbsp&nbsp"+"user LogOut Successfully:"+"</h3>");
%>
<jsp:include page="home.html"/>
</body>
</html>