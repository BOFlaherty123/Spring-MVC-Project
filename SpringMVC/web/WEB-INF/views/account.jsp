<%@ taglib prefix ="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>

<head>
    <title>Example Page</title>
</head>

<body>

<h2><spring:message code="msg.yourAccount"/></h2>

<c:out value="${userName}"/>

</body>

</html>
