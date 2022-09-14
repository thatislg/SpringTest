<%@page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<h1>インフラ追加（確認）</h1>
	<dl>
		<dt>ID</dt>
		<dd>
			<c:out value="${infrastructureForm.id}" />
		</dd>
		<dt>インフラ</dt>
		<dd>
			<c:out value="${infrastructureForm.name}" />
		</dd>
	</dl>
	<form:form modelAttribute="infrastructureForm" action="input">
		<form:hidden path="id" />
		<form:hidden path="name" />
		<input type="submit" value="戻る">
	</form:form>
</body>
</html>