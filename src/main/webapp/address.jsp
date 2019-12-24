<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h4 align="center"> Add Address</h4>
		<table align="center" border=1>
			<tr>
				<td>Address</td>
				<td><input type="radio" name="radio_address"
					value="address_ref" checked />Address Reference <%
					out.println("</select>");
				%></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><input type="radio" name="radio_address"
					value="address_new" />New Address
					<table>
						<tr>
							<td>Ploat No.</td>
							<td><input type="text" name="ploatno" /></td>
						</tr>
						<tr>
							<td>Area Name.</td>
							<td><input type="text" name="area" /></td>
						</tr>
						<tr>
							<td>Street.</td>
							<td><input type="text" name="street" /></td>
						</tr>
						<tr>
							<td>City.</td>
							<td><input type="text" name="city" /></td>
						</tr>
					</table></td>
			</tr>
		</table>
</body>
</html>