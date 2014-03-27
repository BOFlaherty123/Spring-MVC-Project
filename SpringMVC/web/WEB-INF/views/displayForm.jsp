<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>

    <head>
        <title>Example Page</title>

        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/error.css" type="text/css">

    </head>

    <body>

        <h2>Example Form</h2>

        <form:form method="POST" commandName="user">

            <form:label path="firstName" cssErrorClass="error">First Name</form:label>:<form:input path="firstName" cssErrorClass="error"/> <br/>
            <form:label path="lastName" cssErrorClass="error">Last Name</form:label>:<form:input path="lastName" cssErrorClass="error"/> <br/>
            <form:label path="username" cssErrorClass="error">Username</form:label>:<form:input path="username" cssErrorClass="error"/> <br/>
            <form:label path="password" cssErrorClass="error">Password</form:label>:<form:password path="password" cssErrorClass="error"/> <br/>

            <input type="submit" value="Submit"/>

        </form:form>

        <h2>User Session Object Display (Test)</h2>
        <p>
            <b>firstName: </b> ${userObj.firstName} <br/>
            <b>lastName:</b> ${userObj.lastName} <br/>
            <b>username: </b> ${userObj.username} <br/>
            <b>password: </b> ${userObj.password} <br/>
        </p>

    </body>

</html>
