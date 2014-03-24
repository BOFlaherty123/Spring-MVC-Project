<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>

    <head>
        <title>Example Page</title>

        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/error.css" type="text/css">

    </head>

    <body>

        <h2>@SessionAttributes Example</h2>

        <p>Don't forget: ${thought}</p>

        <form:form method="POST" action="/SpringMVC/remember">

            <input type="text" name="thoughtParam"><br/>

            <input type="submit" value="Submit"/>

        </form:form>

    </body>

</html>
