<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ include file="header.jsp" %>
<%
	/* next value 가져오기 */
	sql = "SELECT custno from member_tbl_02 where rownum <= 1 order by custno desc";
	ResultSet res = conn.prepareStatement(sql).executeQuery();
	int custno = 10001;
	if (res.next()) custno = res.getInt(1)+1;
%>
<h2>홈쇼핑 회원 등록</h2>

<%@ include file="footer.jsp" %>