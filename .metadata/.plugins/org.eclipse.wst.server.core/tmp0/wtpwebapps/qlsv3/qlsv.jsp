<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<%
		String formtitle="QUẢN LÝ THÔNG TIN SINH VIÊN";
		%>
		<h4><%= formtitle%></h4>
		<FORM method="post" action='svlSV'>
		Mã SV	<input type='text' name='parmasv' value=''><br> 
		Họ đệm SV:	<input type='text' name='parhodem' value=''><br> 
		Tên SV:	<input type='text' name='partensv' value=''><br> 
		Số điện thoại:<input type='text' name='partelsv' value=''><br>
		Email:<input type='text' name='paremailsv' value=''><br>
		<button type="submit" name="action" value="create" >Create</button>
		<button type="submit" name="action" value="modify" >Modify</button>
		<button type="submit" name="action" value="delete" >Delete</button>
		</FORM>
		
		<table border="1">
	        <tr>
	            <th>MASV</th>
	            <th>TENSV</th>
	            <th>EMAILSV</th>
	            <!-- Add other column headers as needed -->
	        </tr>
	        <c:forEach var="student" items="${students}">
	            <tr>
	                <td>${student.MASV}</td>
	                <td>${student.TENSV}</td>
	                <td>${student.EMAILSV}</td>
	      
	                <!-- Add other columns as needed -->
	            </tr>
	        </c:forEach>
    	</table>
</body>
</html>