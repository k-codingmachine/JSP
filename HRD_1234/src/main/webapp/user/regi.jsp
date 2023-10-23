<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>회원 로그인</title>
 <link rel="stylesheet" type ="text/css" href="css/basic.css">
</head>
<body>
    <h2>홈쇼핑 회원등록</h2>
    <form action="RegiServlet" method="get" name = "frm">
        <label for="userId">회원번호(자동발행):</label>
        <input type="text" id="custno" name="custno" required><br>
        
        <label for="userId">회원성명:</label>
        <input type="text" id="custname" name="custname" required><br>

        <label for="password">회원전화:</label>
        <input type="text" id="phone" name="phone" required><br>
        
         <label for="password">회원주소:</label>
        <input type="text" id="address" name="address" required><br>
        
         <label for="password">가입일자:</label>
        <input type="text" id="joindate" name="joindate" required><br>
        
         <label for="password">고객등급:</label>
        <input type="text" id="grade" name="grade" required><br>
        
         <label for="password">도시코드:</label>
        <input type="text" id="city" name="city" required><br>
        

        <input type="submit" value="등록"><a href="RegiServlet?command=user_regi"></a>
        <input type="submit" value="조회">
    </form>
</body>
</html>
