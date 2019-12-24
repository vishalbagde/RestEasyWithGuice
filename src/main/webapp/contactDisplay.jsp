<%@page import="com.axelor.db.entity.Person"%>
<%@page import="com.axelor.db.entity.Contact"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.axelor.db.entity.Phone"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@include file="header.jsp"%>
	<%
		//List<Phone> list = (ArrayList<Phone>)request.getAttribute("contactData");
		Person p = (Person)request.getAttribute("contactData");
		List<Phone> list = p.getPhone();
	%>
	<table align="center" border=1>
		<th>Phone ID</th>
		<th>Phone Type</th>
		<th>Service Provider</th>
		<th>Contact No</th>
		<th>Update</th>
		<%
			for (Phone phone : list) {
				out.print("<tr>");
				Contact c = phone.getContact();
				out.print("<td>"+phone.getPhone_id()+"</td>");
				out.print("<td>"+phone.getPhone_type()+"</td>");
				out.print("<td>"+phone.getService_provider()+"</td>");
				out.print("<td>"+c.getPhone_no()+"</td>");
				out.print("<td><a href='"+getServletContext().getInitParameter("url")+"personContactFetch/"+phone.getPhone_id()+"'>Update</a></td>");
				out.print("</tr>");
				
		
				
			}
		%>
		
	</table>
	 <a href="<%=getServletContext().getInitParameter("url")%>getAll" align="center">Back</a></td>
	

<%@include file="footer.jsp"%>

</body>
</html>