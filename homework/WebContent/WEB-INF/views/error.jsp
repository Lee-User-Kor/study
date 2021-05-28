<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="server" value="${pageContext.request.serverName }:${pageContext.request.serverPort }" />
<c:set var="cpath" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="refresh" content="3;url=http://${server}/${cpath}">
<title>Insert title here</title>
</head>
<body>

<div style="font-size: 70px; color: red; font-weight: 900; font-family: '궁서'; width: 100%; height: 500px; text-align: center; line-height: 500px;">
	ERROR !!
</div>

</body>
</html>