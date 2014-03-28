<%@ taglib prefix ="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>

    <head>
        <title>Example Page</title>
    </head>

    <body>

        <h2><spring:message code="msg.welcome"/></h2>

        <c:forEach items="${data}" var="data">
            <spring:message code="msg.data.name"/> <c:out value="${data.name}"/>
            <br/>
            <spring:message code="msg.data.value"/> <c:out value="${data.value}"/>
        </c:forEach>

        <h3>User Submitted Details</h3>

        <p>
            <b>firstName: </b> ${userObj.firstName} <br/>
            <b>lastName:</b> ${userObj.lastName} <br/>
            <b>username: </b> ${userObj.username} <br/>
            <b>password: </b> ${userObj.password} <br/>
        </p>

        <h3>Web Flow Execution Link</h3>
        <a href="/SpringMVC/userSaved">Launch Web Flow</a>

    </body>

</html>
