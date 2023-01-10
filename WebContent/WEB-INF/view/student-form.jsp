<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>Student Registration Form</title>

</head>

<body>

	<form:form action="processForm" modelAttribute="student">
		First name: <form:input path="firstName"/>
		<br>
		<br>
		
		Last Name: <form:input path="lastName"/>
		
		<br>
		<br>
		
		Country:
		
		<form:select path="country">
			<form:options items="${student.countryOptions}"/>
		</form:select>
		
		
		<br>
		<br>
		Fav Lang:
		
		JAVA <form:radiobutton path="favoriteLanguage" value="Java"/>
		C# <form:radiobutton path="favoriteLanguage" value="C#"/>
		C <form:radiobutton path="favoriteLanguage" value="C"/>
		
		<br>
		<br>
		Operating Systems:
			Linux<form:checkbox path="operatingSystems" value="Linux"/>
			Mac<form:checkbox path="operatingSystems" value="Mac"/>
			Windows<form:checkbox path="operatingSystems" value="Windows"/>
		<br>
		<br>
		
		<input type="submit" value="Submit">
		
	</form:form>

</body>

</html>