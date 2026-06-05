<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
    <title>Home</title>
</head>

<body>

<h2>Welcome to application</h2>

<p>id : ${User.getId()}</p>
<p>name : ${User.getName()}</p>
<p>roll : ${User.getRoll()}</p>

</body>

</html>>