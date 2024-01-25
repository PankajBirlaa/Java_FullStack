<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    
    import ="com.expleo.Emp.EmpModel"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!--  agar mnodel baad me use krna ho to
	 
		EmpModel e =(EmpModel)request.getAttribute("found");


	<h1>Employee Details :</h1>
	<h2>Id: e.getId() </h2>
	<h2>Name: e.getName() </h2>
	<h2>Salary: e.getSalary() </h2>
	-->
	
		<h1>Employee Details :</h1>
	
		<h2>
		<br>ID: ${ found.id}
		<br>Name: ${ found.name}
		<br>Salary: ${ found.salary}
		</h2>
		
</body>
</html>

