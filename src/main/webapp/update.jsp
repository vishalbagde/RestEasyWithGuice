<%@page import="com.axelor.db.PersonName"%>
<%@page import="com.axelor.db.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% Person person = (Person)request.getAttribute("personData");
	PersonName pname=person.getPersonName();
	String updatestr = getServletContext().getInitParameter("url")+"update/"+person.getPerson_id();
		
	//String url =request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
	
%>

<form method="post"	action="<%out.print(updatestr);%>">
		<%@include file="header.jsp"%>
		<table border=1 width="500px">
			<tr>
				<th colspan="2">Person Update</th>
			<tr>
				<td>First Name</td>
				<td><input type="text" name="fname" value="<%=pname.getFname() %>" /></td>
			</tr>
			<tr>
				<td>Moddile Name</td>
				<td><input type="text" name="mname" value="<%=pname.getMname() %>" /></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type="text" name="lname" value="<%=pname.getLname() %>" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email" value="<%=person.getEmail() %>" /></td>
			</tr>
			<tr>
				<td>
				<td><input type="submit" name="submit" value="Update" /> <input
					type="reset" name="reset" value="reset" /></td>
				</td>

			</tr>
		</table>
	</form>

</body>
</html>