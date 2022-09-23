<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>
<fieldset>
<p>文字列<c:out value="${param.strInput}"/>の長さは${strLength}です。</p>
</fieldset>
</body>
</html>