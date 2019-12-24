<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form method="post" action="<%=getServletContext().getInitParameter("url")+"addContact" %>">

		<table border=1 width="500px" action="contactAdd" align="center">
			<tr>
				<th colspan="2">Person Contact Add</th>
				<input type="hidden" name="person_id" value="<%=request.getParameter("person_id")%>" />
			</tr>

			<tr>
				<td>Contact Details</td>
				<td>
					<table>
						<tr>
							<td>Phone Type.</td>
							<td><input type="text" name="phone_type" /></td>

						</tr>
						<tr>
							<td>Service Provider.</td>
							<td><input type="text" name="service_provider" /></td>
						</tr>
						<tr>
							<td>Contact No.</td>
							<td><input type="text" name="contact_no" /></td>
						</tr>
					</table>
				</td>
			</tr>

			<tr>
				<td>
				<td><input type="submit" name="submit" value="Add" /> <input
					type="reset" name="reset" value="reset" />
					
					 <a href="getAll" align="center">Back</a></td>

				</td>

			</tr>
		</table>

	</form>


</body>
</html>