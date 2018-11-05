<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<sec:authentication property="userAuthentication.authorities"/> <br/><br/>
<sec:authentication property="userAuthentication.details['principal']['name']"/>

<sec:authorize access="hasAnyRole('ROLE_ADMIN2')">
	권한없음!
</sec:authorize>
<sec:authorize access="hasAnyRole('ROLE_ADMIN')">
	권한있음!
</sec:authorize>

</body>
</html>