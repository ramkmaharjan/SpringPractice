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
<input type="submit" value="Submit me"/>
</form>
</body>
</html>
