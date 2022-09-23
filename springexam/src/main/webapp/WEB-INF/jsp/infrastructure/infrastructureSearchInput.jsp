<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search</title>
</head>
<body>
<h1>InfrastructureIDで検査</h1>
	<form action="searchById" method="post">
		<fieldset>
			<input type="number" name="infrasId" size="50" min="1" max="4" required placeholder="検査条件を入力して下さい。">
			<input type="submit" value="検査"/>
		</fieldset>
	</form>
</body>
</html>