<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Login</title>
<%@include file="includes/head.jsp" %>
</head>
<body>
 <div class="container">
 	<div class="card w-50 mx-auto mt-5">
 		<div class="card-header text-center">User Login</div>
 		<div class="card-body">
 			<form action="" method="post">
 				<div class="form-group">
 					<label>Username: </label>
 					<input type="text" class="form-control" name="login-username" required placeholder="Enter your username">
 					
 					<label>Password:</label>
 					<input type="password" required class="form-control" placeholder="********" name="login-password">
 				
 					<div class="text-center mt-2">
 					 	<button type="submit" class="btn btn-primary w-50">Login</button>
 					</div>
 				</div>
 			</form>
 		</div>
 	</div>
 </div>
<%@include file="includes/footer.jsp" %>

</body>
</html>