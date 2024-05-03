<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Sign Up</title>
<%@include file="includes/head.jsp" %>
<link rel="stylesheet" href="css/style_signUp.css">
</head>
<body>
	<div class="container">
		<div class=" card w-50 mx-auto mt-5 ">
			<div class="card-header">
				<h1>Sign Up</h1>
				<p>Please fill in this form to create an account </p>
			</div>
			<div class="card-body px-4">
				<form action="" method="post">
					<div class="form-group">
						<div class="row justify-content-between">
							<div class="col-5">
							 	<input type="text" class="form-control" name="signup-firstname" required placeholder="First Name">
							</div>
							<div class="col-5">
								<input type="text" class="form-control" name="signup-lastname" required placeholder="Last Name">
							</div>					
						</div>
							<input type="email" class="form-control" name="signup-email" required placeholder="Email">
							<input type="text" class="form-control" name="signup-username" required placeholder="Username">
							<input type="password" class="form-control" name="signup-password" required placeholder="Password">
					</div>
					
					
				</form>
			</div>
		</div>
	</div>

<%@include file="includes/footer.jsp" %>

</body>
</html>