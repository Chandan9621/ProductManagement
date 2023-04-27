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
margin-top:10px;
}
 .ad_log h2:hover 
{
color:green;
}

</style>
</head>
<body>
<div class="ad_log">
<%
 AdminBean ab=(AdminBean)session.getAttribute("abean");
 out.println("<h2>"+"Welcome to admin:"+ab.getFname()+"</h2>");
%>
<jsp:include page="Link.html"/>
</div>
</body>
</html>