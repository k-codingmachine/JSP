<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	Connection con = null;
	PreparedStatement pstmt = null;
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String uid = "scott";
	String pwd = "tiger";
	String sql = "insert into employee values('duke', 'seoul', '970224-1039234')";
	String sql2 = "insert into employee values('pororo', 'pusan', '001222-1038782')";
	String sql3 = "insert into employee values('duke', 'seoul', '981221-1829192')";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(url, uid, pwd);
		pstmt=con.prepareStatement(sql);
		pstmt.executeUpdate(sql);
		pstmt.executeUpdate(sql2);
		pstmt.executeUpdate(sql3);
	}catch(Exception e){
		e.getStackTrace();
	}finally{
		try{
			if(pstmt !=null) pstmt.close();
			if(con !=null) con.close();
		}catch(Exception e){
			e.getStackTrace();
		}
	}


%>
</body>
</html>