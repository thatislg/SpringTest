<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
dt {
	background-color:red;
	width: 100px;
	margin: 5px 0px 5px;
}
	
</style>
</head>
<body>
	<h1>インフラ追加</h1>
	<form:form modelAttribute="infrastructureForm" action="confirm">
	<dl>
		<dt>ID</dt>
		<dd>
			<form:input path="id"/>
		</dd>
		<dt>インフラ名</dt>
		<dd>
			<form:input path="name"/>
		</dd>
		</dl>
			<input type="submit" value="追加">
		</form:form>
</body>
</html>