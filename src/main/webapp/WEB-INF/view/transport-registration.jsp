<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 15.05.2021
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Registration of transport</title>

    <style>
        .error {color: red}
    </style>
</head>
<body>

<form:form action="transportRegistration" modelAttribute="starShip">
    Model: <form:input path="model"/>
    <form:errors path="model" cssClass="error"/>
    <br><br>
    Weapon: <form:input path="weapon"/>
    <br><br>
    Passengers: <form:input path="numOfPassengers"/>
    <form:errors path="numOfPassengers" cssClass="error"/>
    <br><br>
    <input type="submit" value="Submit">
</form:form>

</body>
</html>
