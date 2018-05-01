<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">
	
		First name: <form:input path="firstName" />
		
		<br><br>
	
		Last name: <form:input path="lastName" />
		
		<br><br>
		<%-- <form:select path="country">
		<form:option value="Brazil" label="Brazil"/>
		<form:option value="USA" label="USA"/>
		
		</form:select> --%>
		
		Country : 
		<form:select path="country">
		
		<form:options items="${student.countryOptions }"/>
	
	</form:select>
	<br>
	<br>
Language : 
			Java<form:radiobutton path="favoriteLanguage" value="Java"/>
			C<form:radiobutton path="favoriteLanguage" value="C"/>
			DS<form:radiobutton path="favoriteLanguage" value="DS"/>
	<br>
	<br>
	Operating Systems : 
	Linux <form:checkbox path="operatingSystem" value="Linux"/>
	MAC <form:checkbox path="operatingSystem" value="MAC"/>
	Android <form:checkbox path="operatingSystem" value="Android"/>
	
		<input type="submit" value="Submit" />
	</form:form>
	
	


</body>

</html>












