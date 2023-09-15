<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>Logout Page</h1>
  
  <form method="post" action="/customLogout">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
    <!-- Spring Security 사용시 POST방식에서는 CSRF토큰값을 반드시 넘겨야줘야 한다. -->
    <input type="submit" value="로그아웃">
  </form>
  
</body>
</html>