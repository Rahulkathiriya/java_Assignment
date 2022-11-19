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

<!--  	j-Queary cdn -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.1/jquery.min.js"
	integrity="sha512-aVKKRRi/Q/YV+4mjoKBsE4x3H+BkegoM/em46NNlCqNTmUYADjBbeNefNxYV7giUp0VxICtqdrbqU7iVaeZNXA=="
	crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<title>Home Page</title>

<style type="text/css">
.container-fluid {
	height: 100vh;
}
</style>
</head>
<body>

	<div class="container-fluid bg-dark">
		<div class="container m-auto">
		<span class="text-success text-center">${dataAdd}</span>
		<span class="text-success text-center">${update}</span>
			<div class="row pt-5">
				<div class="col col-md-6 col-lg-6 text-end ">
					<div class="addmin text-start">
						<img alt=""
							src="https://findicons.com/files/icons/2526/bloggers/256/admin.png">
					</div>
					<div class="col col-md-6 col-lg-6 text-end ">
						<a href="addEmployee.jsp" class="btn btn-primary fw-bold">Add
							Employee</a>
					</div>
				</div>
				<div class="col col-md-6 col-lg-6 text-start">
					<div class="addmin text-start">
						<img alt=""
							src="https://findicons.com/files/icons/2526/bloggers/256/admin.png">
					</div>
					<div class="col col-md-6 col-lg-6 text-end">
						<a href="viewEmployee" class="btn btn-info fw-bold">View
							Employee</a>
					</div>
				</div>

			</div>
		</div>
	</div>

</body>
</html>