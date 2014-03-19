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

            First Name: <form:input path="firstName"/> <form:errors path="firstName" cssClass="error"/> <br/>
            Last Name: <form:input path="lastName"/> <form:errors path="lastName" cssClass="error"/> <br/>
            Username: <form:input path="username"/> <form:errors path="username" cssClass="error"/> <br/>
            Password: <form:password path="password"/> <form:errors path="password" cssClass="error"/> <br/>

            <input type="submit" value="Submit"/>

        </form:form>

    </body>

</html>
