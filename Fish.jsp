<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<h1>Please enter the fish details</h1>
</head>
 <body background="img1.jpg">

	<form action="FishesRoutine1">
		Name of the fish:&nbsp<input type="text" id="fishName" name="fishName" /></br>
		Please select the type of species:&nbsp<input type="radio" name="species" id="Gold" value="Gold" checked>Gold &nbsp&nbsp
		<input type="radio" name="species" id="Silver" value="Silver">Silver &nbsp&nbsp
		<input type="radio" name="species" id="Diamond" value="Diamond">Diamond &nbsp&nbsp
		<input type="radio" name="species" id="Platinum" value="Platinum">Platinum &nbsp&nbsp </br>
		<input type="submit" value="Submit" id="submit" />
	</form>
</body>
</html>