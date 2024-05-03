<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Netflix</title>


<%@include file="includes/head.jsp" %>

<!-- Box Icon -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==" crossorigin="anonymous" referrerpolicy="no-referrer" />

<link rel="stylesheet" href="css/style-home-page.css">



</head>
<body>
 <header>
 	<nav class="navbar navbar-expand-lg">
 	<div class="container">
 	
		  <a class="navbar-brand" href="#">Movie</a>
		  <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
		
		  <div class="collapse navbar-collapse" id="navbarSupportedContent">
		    <ul class="navbar-nav m-auto mb-2 mb-lg-0">
		      
		      <li class="nav-item">
		        <a class="nav-link" href="#">Home</a>
		      </li>
		      
		      <li class="nav-item">
              <a class="nav-link "href="#">Movies</a>
              </li>
              
	            <li class="nav-item">
	              <a class="nav-link" href="#">Coming</a>
	            </li>
	            
            <li class="nav-item">
              <a class="nav-link" href="#">Organic</a>
            </li>	      
		      
		      <li class="nav-item dropdown">
		        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
		          Dropdown
		        </a>
		        
		        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
		          <a class="dropdown-item" href="#">Action</a>
		          <a class="dropdown-item" href="#">Another action</a>
		          <div class="dropdown-divider"></div>
		          <a class="dropdown-item" href="#">Something else here</a>
		        </div>
		      </li>
		    </ul>
		    
		    <form class="d-flex" role="search">
		      <input class="px-2 search" type="search" placeholder="Search" aria-label="Search">
		      <button class="btn0 btn-outline-success " type="submit">Search</button>
		    </form>
		    
		  	<a href="#" class="btn">Sign up</a>
		  </div>
	</div>	  
</nav>

 </header>
 
<%@include file="includes/footer.jsp" %>

</body>
</html>