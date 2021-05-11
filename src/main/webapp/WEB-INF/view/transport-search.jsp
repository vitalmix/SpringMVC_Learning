<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 07.05.2021
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>Search your transport</title>
</head>
<body>

<%--<form action="transport" method="GET">
    <p>Input transport model code: <br></p>
    <input name="transportModel" placeholder="input the model of transport">
    <input type="submit" value="sub">
</form>--%>

<form:form action="transport" modelAttribute="starShip">
    <p>Input transport model code: <br><br></p>
    <form:input path="model" />
    <br><br>
    <form:select path="weapon">
        <%--<form:option value="Rockets" label="Rockets" />
        <form:option value="MashGun" label="MashGun" />
        <form:option value="LaserGun" label="LaserGun" />--%>

        <form:options items="${starShip.weaponOptions}"/>
    </form:select>
    <br><br>
    Invisibility <form:radiobutton path="module" value="invis"/>
    ExtraGunPower <form:radiobutton path="module" value="EGP"/>
    ExtraEnginePower <form:radiobutton path="module" value="EEP"/>
    <br><br>
    AdditionalModules:
    <br>
    M1 <from:checkbox path="putAdditionalModules" value="M1"/>
    M2 <from:checkbox path="putAdditionalModules" value="M2"/>
    M3 <from:checkbox path="putAdditionalModules" value="M3"/>
    <br><br>
    <input type="submit" value="sub">
</form:form>

</body>
</html>
