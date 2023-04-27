<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="com.Bean.AdminBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
h2
{
 text-align:center;
 margin-top:10px;
 
 
}
</style>
</head>
<body>
<%
AdminBean ab=(AdminBean)session.getAttribute("abean");
out.println("<h2 style=color:green;>"+"Welcome to admin:"+ab.getFname()+"</h2>");
out.println("<h2 style=color:green;>"+"Product Added Sucessfully</br>"+"</h2>");
%>
<jsp:include page="Link.html"/>
</body>
</html>