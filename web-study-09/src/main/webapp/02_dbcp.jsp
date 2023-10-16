<%@page import="java.sql.Connection"%>
<%@page import="com.saeyan.dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>디비 연동</h3>

<%
	MemberDAO memDao = MemberDAO.getInstance();
	Connection con = memDao.getConnection();
	out.println("con : " + con + "<br>");
	out.println("DBCP 연동 성공");
%>
</body>
</html>