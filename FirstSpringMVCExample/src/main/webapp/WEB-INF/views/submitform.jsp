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
<p> Student Ph number: ${student1.phoneNumber} </p>
<p> Student dateOfBirth: ${student1.dateOfBirth } </p>
<p> Student hobbies: ${student1.hobbies} </p>
<p> Student city: ${student1.address.city } </p>
<p> Student country: ${student1.address.country} </p>
</body>
</html>
