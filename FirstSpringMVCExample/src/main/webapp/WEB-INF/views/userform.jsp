<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<form action="submitForm" method="post">
<p>
Student name : <input type="text" name="studentName"/>
</p>
<p>
Student address: <input type="text" name="studentAddress"/>
</p>

<p>
Student Phone Number: <input type="text" name="phoneNumber"/>
</p>

<p>
Student Birth Date: <input type="text" name="dateOfBirth"/>
</p>

<p>
Student Hobbies: 

<select name="hobbies" multiple="multiple">
<option value="Football">Football </option>
<option value="Cricket">Cricket </option>
<option value="Rugby">Rugby </option>
<option value="Badminton">Badminton </option>
</select>
</p>

<p> Address Information</p>
<p> City <input type="text" name="address.city"/> </p>
<p> Country <input type="text" name="address.country"/> </p>

<input type="submit" value="Submit me"/>
</form>
</body>
</html>
