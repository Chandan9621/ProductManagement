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
out.println("<h3 style=color:green;font-size:25px;text-align:center;>"+"Welcome to Admin:"+ab.getFname()+"</h3>");
out.println("<h3 style=text-align:center;font-size:25px;> Update Sucessfully </h3>");
%>
<jsp:include page="Link.html"/>
</body>
</html>