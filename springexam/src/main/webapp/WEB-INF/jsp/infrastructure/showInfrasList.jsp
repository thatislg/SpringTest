<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>InfrasList</title>
<style>
	td.sunday{
		color:red;
	}
</style>
</head>
<body>
	<fieldset>
	<table>
	<tr>
		<td>ID</td>
		<td>名称</td>
		<td>登録日</td>
		<td>曜日</td>
	</tr>
	<c:forEach items="${infrasList}" var="infrasItem">
	<tr>
		<td><c:out value="${infrasItem.id}" /></td>
		<td><c:out value="${infrasItem.name}" /></td>
		<td><fmt:formatDate pattern="yyyy年MM月DD日" value="${infrasItem.registDate}" /></td>
		<td <c:if test="${infrasItem.registDate == '日'}">class="sunday"</c:if>>
		<fmt:formatDate pattern="E" value="${infrasItem.registDate}" />
		</td>
	</tr>
	</c:forEach>
	</table>
	</fieldset>
</body>
</html>