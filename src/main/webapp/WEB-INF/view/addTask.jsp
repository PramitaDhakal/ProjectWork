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

<h1>Add Task</h1>
	<form:form  modelAttribute="newTask">
	Task Status: <form:input id="taskStaus" path="taskStaus" type="text"/><br>
	Task Start Date: <form:input id="taskStartDate" path="taskStartDate" type= "text"/><br>
	Task End Date: <form:input id="taskEndDate" path="taskEndDate" type= "text"/><br> 
	
	<br><input type="submit" id="btnAdd" value ="Add Task"/>
	
	</form:form>

</body>
</html>