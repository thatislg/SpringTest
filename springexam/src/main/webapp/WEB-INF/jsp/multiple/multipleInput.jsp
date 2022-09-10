<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Multiple</title>
</head>
<body>
	<!-- 
	 Ở đây chú ý link ở action, thì cần đúng link mới hiển thị được 
	 result này được định nghĩa tại Controller rồi
	-->
	<form action="result">
		<fieldset>
			<input type="text" name="num" /> x 2
			<input type="submit" value="cal"/>
		</fieldset>
	</form>
</body>
</html>