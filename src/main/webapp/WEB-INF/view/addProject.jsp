<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Project</title>
</head>
<body>

<h1>Add Project</h1>
	<form:form  modelAttribute="newProject">
	Project Name: <form:input id="projectName" path="projectName" type="text"/><br>
	Project Description: <form:input id="description" path="description" type="text"/><br>
	Project Start Date: <form:input id="startDate" path="startDate" type= "text"/><br>
	Project End Date: <form:input id="endDate" path="endDate" type= "text"/><br> 
	
	<br><input type="submit" id="btnAdd" value ="Add Project"/>
	
	</form:form>

</body>
</html>