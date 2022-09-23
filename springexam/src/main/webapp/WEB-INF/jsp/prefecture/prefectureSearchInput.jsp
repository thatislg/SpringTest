<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search</title>
</head>
<body>
<h1>IDで検査</h1>
	<form action="searchById" method="post">
		<fieldset>
			<input type="text" name="prefectureId" size="50" required placeholder="検査条件を入力して下さい。">
			<input type="submit" value="検査"/>
		</fieldset>
	</form>
</body>
</html>