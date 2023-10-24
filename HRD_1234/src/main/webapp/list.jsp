<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="header.jsp" %>
<h2>홈쇼핑 회원 등록</h2>
<table>
	<colgroup>
		<col width="10%">
		<col width="10%">
		<col width="20%">
		<col width="20%">
		<col width="20%">
		<col width="10%">
		<col width="10%">
	</colgroup>
		<tr>
			<th>회원번호</th>
			<th>회원성명</th>
			<th>전화번호</th>
			<th>주소</th>
			<th>가입일자</th>
			<th>고객등급</th>
			<th>거주지역</th>
		</tr>
	 <c:forEach var="user" items="${userlist}">
            <tr>
                <td>${user.custno}</td>
                <td>${user.custname}</td>
                <td>${user.phone}</td>
                <td>${user.address}</td>
                <td>${user.joindate}</td>
                <td>${user.grade}</td>
                <td>${user.city}</td>
            </tr>
        </c:forEach>
	
</table>
<%@ include file="footer.jsp" %>