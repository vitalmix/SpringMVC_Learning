<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 07.05.2021
  Time: 14:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html>
<html>
<head>
    <title>Searched transport:</title>
</head>
<body>

<br>

Transport:
<br><br>
Model: ${starShip.model}
<br><br>
Weapon: ${starShip.weapon}
<br><br>
Module: ${starShip.module}
<br><br>

AdditionalModules:
<ul>
    <c:forEach var="temp" items="${starShip.putAdditionalModules}">

        <li> ${temp} </li>

    </c:forEach>

</ul>



</body>
</html>
