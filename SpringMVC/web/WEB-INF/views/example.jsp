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

    </body>

</html>
