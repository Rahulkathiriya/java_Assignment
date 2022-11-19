<%@page import="model.employee"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
	crossorigin="anonymous">
<!-- <-- JavaScript Bundle with Popper -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
	crossorigin="anonymous"></script>

<!-- font-Awesome -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css"
	integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
<!--  	j-Queary cdn -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.1/jquery.min.js"
	integrity="sha512-aVKKRRi/Q/YV+4mjoKBsE4x3H+BkegoM/em46NNlCqNTmUYADjBbeNefNxYV7giUp0VxICtqdrbqU7iVaeZNXA=="
	crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<title>Employee List</title>
</head>
<body>

	<div class="contaier-fluid">

		<table class="table table-dark table-striped">

			<tr>

				<th>ID</th>
				<th>FIRST NAME</th>
				<th>LAST NAME</th>
				<th>EMAIL ADDRESS</th>
				<th>NUMBER</th>
				<th>ADDRESS</th>
				<th>GENDER</th>
				<th>PASSWORD</th>
				<th colspan="2" class="text-center">ACTION</th>
			</tr>


			<%
			ArrayList<employee> al = (ArrayList) request.getAttribute("data");
			for (employee e : al) {
			%>

			<tr>

				<td><%=e.getId()%></td>
				<td><%=e.getFname()%></td>
				<td><%=e.getLname()%></td>
				<td><%=e.getEmail()%></td>
				<td><%=e.getNumber()%></td>
				<td><%=e.getAddress()%></td>
				<td><%=e.getGender()%></td>
				<td><%=e.getPassword()%></td>
				<td><a href="update?uid=<%=e.getId()%>&&action=update"
					class="btn btn-warning">Update</a></td>
				<td><a href="update?uid=<%=e.getId()%>&&action=delete"
					class="btn btn-danger">delete</a></td>

			</tr>



			<%
			}
			%>




		</table>

	</div>








</body>
</html>