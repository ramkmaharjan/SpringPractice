<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
Form Submit
</h1>


<p>${submitMsg}</p>
<p> Student name: ${student1.studentName} </p>
<p> Student add: ${student1.studentAddress } </p>
<p> Student name: ${student1.phoneNumber} </p>
<p> Student add: ${student1.dateOfBirth } </p>
<p> Student name: ${student1.hobbies} </p>

</body>
</html>
