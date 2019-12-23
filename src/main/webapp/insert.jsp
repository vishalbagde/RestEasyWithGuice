<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post"
		action="ws/insert">
		<%@include file="header.jsp"%>
		<table border=1 width="500px">
			<tr>
				<th colspan="2">Person Details Insert</th>
			<tr>
				<td>First Name</td>
				<td><input type="text" name="fname" /></td>
			</tr>
			<tr>
				<td>Moddile Name</td>
				<td><input type="text" name="mname" /></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type="text" name="lname" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>
				<td><input type="submit" name="submit" value="insert" /> <input
					type="reset" name="reset" value="reset" /></td>
				</td>

			</tr>
		</table>
	</form>
</body>
</html>
