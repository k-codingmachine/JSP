<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%!
	Connection con = null;
	PreparedStatement pstmt = null;

%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Item Write Result</title>
</head>
<body>

<%
    request.setCharacterEncoding("utf-8");
    String name = request.getParameter("item");
    Integer price = Integer.parseInt(request.getParameter("price"));
    String description = request.getParameter("description");
    
    
    String url = "jdbc:oracle:thin:@localhost:1521:xe";
    String uid = "scott";
    String pwd = "tiger";
    String sql = "INSERT INTO item (name, price, description) VALUES (?, ?, ?)";

    try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        con = DriverManager.getConnection(url, uid, pwd);

        pstmt = con.prepareStatement(sql);

        pstmt.setString(1, name);
        pstmt.setInt(2, price);
        pstmt.setString(3, description);

        int result = pstmt.executeUpdate();

    } catch (Exception e) {
       	e.getMessage();
    }finally{
    	try{
    		if(pstmt != null) pstmt.close(); 
    		if(con != null) con.close(); 
    	}catch(Exception e){
    		e.getMessage();
    	}
    }
    %>
</body>
</html>
