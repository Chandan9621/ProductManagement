<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="com.Bean.AdminBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

AdminBean ab=(AdminBean)session.getAttribute("abean");
out.println("<h3>"+ab.getFname()+"-Admin Logout Sucessfully"+"</h3>");
%>
<jsp:include page="home.html"/>
</body>
</html>