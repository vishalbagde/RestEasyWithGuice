<%@page import="com.axelor.db.entity.PersonName"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.axelor.db.entity.Person"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-2.2.4.js"
	integrity="sha256-iT6Q9iMJYuQiMWNd9lDyBUStIq/8PuOW33aOqmvFpqI="
	crossorigin="anonymous"></script>
</head>
<body>
<%@include file="header.jsp"%>
	<div class="data"></div>
	<%
		List<Person> list = (ArrayList<Person>) request.getAttribute("personData");
	%>
	<table align="center" border=1>
		<th>Person ID</th>
		<th>First Name</th>
		<th>Middle Name</th>
		<th>Last Name</th>
		<th>Email</th>
		<th>Display Contact</th>
		<th>Add Contact</th>
		<th>Update</th>
		<th>Delete</th>
		<%
			for (Person person : list) {
				out.print("<tr>");
				PersonName pname = person.getPersonName();
				out.print("<td>"+person.getPerson_id()+"</td>");
				out.print("<td>"+pname.getFname()+"</td>");
				out.print("<td>"+pname.getMname()+"</td>");
				out.print("<td>"+pname.getLname()+"</td>");
				out.print("<td>"+person.getEmail()+"</td>");
				out.print("<td><a href='"+getServletContext().getInitParameter("url")+"getContact/"+person.getPerson_id()+"'>show Contact</a></td>");
				out.print("<td><a href='"+getServletContext().getInitParameter("url")+"contact.jsp?person_id="+person.getPerson_id()+"'>Add Contact</a></td>");
				out.print("<td><a href='"+getServletContext().getInitParameter("url")+"personUpdateFetch/"+person.getPerson_id()+"'>Update</a></td>");
				out.print("<td><a href='"+getServletContext().getInitParameter("url")+"delete/"+person.getPerson_id()+"'>Delete</a></td>");
				out.print("</tr>");
				
				
				
			}
		%>
		
	</table>

<%@include file="footer.jsp"%>
</body>
</html>

<script type="text/javascript">
	/*
	 $(document).ready(function()
	 {
	 $.ajax({ 
	 type: "GET",
	 dataType: "json",
	 url: "http://localhost:8080/restws/json/product/get",
	 success: function(data){        
	 alert(data);
	 });
	 });
	 */
</script>