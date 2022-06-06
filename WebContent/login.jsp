<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<jsp:useBean id='login' class='user.LoginBean' scope='session'/>
<jsp:setProperty name="login" property="*" />
<html>
	<head>
		<title>로그인 처리</title>
	</head>
	<body>
	<% 	String UserID;
		String UserPassword;
		String Page;
	%>
	
	<% if(!login.checkUser()) { %>
		<script> location.href='notlogin.html'</script>
	<% } else { %> 
		<jsp:forward page='board.jsp' />
	<% } %>
		
	</body>
</html>