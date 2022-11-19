<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
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
<meta charset="UTF-8">
<title>add Employee</title>
<style type="text/css">
.form-control:focus {
	border-color: none !important;
	box-shadow: none !important;
}
</style>
</head>
<body>

	<div class="container bg-dark text-light m-auto w-75">
		<div class="h1 text-center bg-primary rounded p-3">👤 Add
			Employee 👤</div>
		<br>
		<form action="addEmployee">
			<span class="text-success">${dataAdd}</span>
			<div class="row">
				<div class="col col-sm-12 col-md-6 col-lg-6">
					<input type="hidden" name="id" id="id" value="${allData.getId()}"> <label
						class=" h4 form-label" for="fname">First Name :</label> <input
						type="text" id="fname" name="fname" class="form-control"
						placeholder="Enter First Name" value="${allData.getFname()}">
				</div>
				<div class="col col-sm-12 col-md-6 col-lg-6">
					<label class=" h4 form-label" for="lname">Last Name :</label> <input
						type="text" id="lname" name="lname" class="form-control"
						placeholder="Enter last Name" value="${allData.getLname()}">
				</div>
			</div>
			<br>
			<div class="row">
				<div class="col col-sm-12 col-md-6 col-lg-6">
					<label class=" h4 form-label" for="email">Email :</label> <input
						type="email" id="email" name="email" class="form-control"
						placeholder="Enter email address" value="${allData.getEmail()}">
				</div>
				<div class="col col-sm-12 col-md-6 col-lg-6">
					<label class=" h4 form-label" for="number">Number :</label> <input
						type="text" id="number" name="number" class="form-control"
						placeholder="Enter number" value="${allData.getNumber()}">
				</div>

				<div class="row mt-4">
					<div class="col col-sm-12 col-md-6 col-lg-6">
						<label class="form-label">Address : </label>
						<textarea value="${allData.getAddress()}" rows="" cols=""
							class="form-control text-dark" name="address" id="address"></textarea>
					</div>
					<div class="col col-sm-12 col-md-6 col-lg-6 mt-4">
						<label class="form-label" for="gender">Gender :</label> &nbsp; <input
							type="radio" name="gender" value="male" checked="checked"> &nbsp;Male
						&nbsp; <input type="radio" name="gender" value="male">
						&nbsp;FeMale
					</div>
				</div>
				<div class="row mt-4">
					<div class="col col-sm-12 col-md-6 col-lg-6">
						<label class=" h4 form-label" for="password">Password :</label> <input
							type="text" id="password" name="password" class="form-control"
							placeholder="Enter password" value="${allData.getPassword()}">
					</div>
					<div class="col col-sm-12 col-md-6 col-lg-6">
						<label class=" h4 form-label" for="conpass">Confirm
							Password :</label> <input type="text" id="conpass" name="conpass"
							class="form-control" placeholder="Enter confirm password">
					</div>
				</div>
				<div class="row mt-5 mb-4">
					<div class="col col-sm-12 col-md-6 col-lg-6 text-end">
						<input type="submit" class="btn btn-primary">

					</div>
					<div class="col col-sm-12 col-md-6 col-lg-6 text-start">
						<input type="reset" class="btn btn-secondary">
					</div>
				</div>
		</form>

	</div>



	</div>

















</body>
</html>