<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
.reg h2
{
 color:green;
}
</style>
<body>
<div class="reg">
<%
out.println("<h2>User Register Successfully</h2>");
%>
</div>
<jsp:include page="home.html"/>
</body>
</html>