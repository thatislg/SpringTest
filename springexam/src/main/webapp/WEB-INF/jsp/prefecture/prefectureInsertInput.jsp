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
	<h1>都道府県を追加</h1>
	<form:form modelAttribute="prefectureForm" action="confirm">
	<dl>
		<dt>ID</dt>
		<dd>
			<form:errors path="id" element="p"/>
			<form:input path="id"/>
		</dd>
		<dt>都道府県名</dt>
		<dd>
			<form:errors path="name" element="p"/>
			<form:input path="name"/>
		</dd>
		<dt>人口</dt>
			
			<dd>
			<form:errors path="population" element="p"/>
			<form:input path="population"/></dd>
		</dl>
			<input type="submit" value="追加">
		</form:form>
</body>
</html>