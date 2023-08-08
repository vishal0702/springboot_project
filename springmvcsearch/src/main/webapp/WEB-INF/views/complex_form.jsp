<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<!-- Required meta tags  -->
<meta charset="utf-8">
<meta name="viewport"
	content="width-device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDL411NQApFmC26EwAOH8WgZL5MYYxFfc+NcPb1dKGj7Sk”
	crossorigin="anonymous">

<title>Complex Registration Form</title>
</head>
<body class="" style="background: #e2e2e2">
	<div class="container mt-4">
		<div class="row">
			<div class="col-md-8 offset-md-2">
				<div class="card">
					<div class="card-body">
						<h3 class="text-center">
							<b><u>Complex Form</u></b>
						</h3>
						<div class="alert alert-danger" role="alert">
							<form:errors path="studentEntity.*"></form:errors>
						</div>
						<form action="handleform" method="post">
							<div class="form-group">
								<label for="userName">Name</label> <input type="text"
									class="form-control" id="name" aria-describedby="username"
									placeholder="Enter Name" name="name" required>
							</div>
							<div class="form-group">
								<label for="userId">ID</label> <input type="text"
									class="form-control" id="id" aria-describedby="username"
									placeholder="Enter ID" name="id" required>
							</div>
							<div class="form-group">
								<label for="userDOB">Date of Birth</label> <input type="text"
									class="form-control" id="date" aria-describedby="date"
									placeholder="DD/MM/YYYY" name="dob" required>
							</div>
							<div class="form-group">
								<label for="formControlSelect1">Select Courses</label> <select
									name="courses" class="form-control" id="formControlSelect1"
									multiple>
									<option>Java</option>
									<option>Python</option>
									<option>C++</option>
									<option>Django</option>
									<option>Spring Framework</option>
								</select>
							</div>
							<div class="form-group">
								<span class="mr-3">Select Gender</span>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="gender"
										id="inlineRadio1" value="male"><label
										class="form-check-label" for="inlineRadio1">Male</label>
								</div>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="gender"
										id="inlineRadio2" value="female"><label
										class="form-check-label" for="inlineRadio2">Female</label>
								</div>
							</div>
							<div class="form-group">
								<label for="">Select Student Type</label> <select
									class="form-control" name="studentType">
									<option>Old Student</option>
									<option>New Student</option>
								</select>
							</div>
							<div class="card">
								<div class="card-body">
									<p>Address</p>
									<div class="form-group">
										<input name="address.street" type="text" class="form-control"
											placeholder="Enter Street">
									</div>
									<div class="form-group">
										<input name="address.city" type="text" class="form-control"
											placeholder="Enter City">
									</div>
								</div>
							</div>
							<div class="container text-center">
								<button type="submit" class="btn btn-primary">Submit</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>