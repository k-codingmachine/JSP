<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>홈쇼핑 회원 등록</h2>
<form action="RegiServlet" method="post">
	<input type="hidden" name="command" value="user_regi">
	<table>
		<colgroup>
			<col width="20%">
			<col width="80%">
		</colgroup>
		<tr>
			<th>회원번호(자동발생)</th>
			<td><input type="text" size="20" value="${user.custno}" name="custno"></td>
		</tr>
		<tr>
			<th>회원성명</th>
			<td><input type="text" name="custname" size="20"></td>
		</tr>
		<tr>
			<th>회원전화</th>
			<td><input type="text" name="phone" size="30"></td>
		</tr>
		<tr>
			<th>회원주소</th>
			<td><input type="text" name="address" size="40"></td>
		</tr>
		<tr>
			<th>가입일자</th>
			<td><input type="text" name="joindate" size="20"></td>
		</tr>
		<tr>
			<th>
				고객등급
				<br>(A:VIP, B:일반, C:직원)
			</th>
			<td><input type="text" name="grade" size="20"></td>
		</tr>
		<tr>
			<th>도시코드</th>
			<td><input type="text" name="city" size="20"></td>
		</tr>
	</table>
	<div class="btn_group">
		<button type="submit">등록</button>
		<button type="button">조회</button>
	</div>
</form>
<%@ include file="footer.jsp" %>


</body>
</html>