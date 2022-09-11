<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>
	<fieldset>
	<h1>ID: ${param.infrasId}の検査結果</h1>
	<dl>
		<dt>ID</dt>
		<dd><c:out value="${infras.id}" /></dd>
		<dt>名称</dt>
		<dd><c:out value="${infras.name}" /></dd>
		<dt>人口</dt>
		<dd><fmt:formatDate dateStyle="FULL" value="${infras.registDate}" /></dd>
	</dl>	
	</fieldset>
</body>
</html>