<%@page import="com.axelor.db.Contact"%>
<%@page import="com.axelor.db.Phone"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<% int phone_id=(int)request.getAttribute("phone_id"); 
	Phone phone = (Phone)request.getAttribute("phone_obj");
	Contact contact=phone.getContact();
%>




<form method="post" action="<%=getServletContext().getInitParameter("url")+"updateContact" %>">

		<table border=1 width="500px" action="contactAdd" align="center">
			<tr>
				<th colspan="2">Person Contact Update</th>
				<input type="hidden" name="phone_id" value="<%=phone.getPhone_id()%>" />
			</tr>

			<tr>
				<td>Contact Details</td>
				<td>
					<table>
						<tr>
							<td>Phone Type.</td>
							<td><input type="text" name="phone_type"  value="<%out.print(phone.getPhone_type());%>"/></td>

						</tr>
						<tr>
							<td>Service Provider.</td>
							<td><input type="text" name="service_provider" value="<%=phone.getService_provider()%>"/></td>
						</tr>
						<tr>
							<td>Contact No.</td>
							<td><input type="text" name="contact_no" value="<%=contact.getPhone_no()%>" /></td>
						</tr>
					</table>
				</td>
			</tr>

			<tr>
				<td>
				<td><input type="submit" name="submit" value="Update" /> <input
					type="reset" name="reset" value="reset" />
					
					 <a href="<%getServletContext().getInitParameter("url");%>/getAll" align="center">Back</a></td>

				</td>

			</tr>
		</table>

	</form>


</body>
</html>