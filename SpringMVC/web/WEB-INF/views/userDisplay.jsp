<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>

    <head>
        <title>Example Page</title>

        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/error.css" type="text/css">

    </head>

    <body>

        <h2>@SessionAttributes / @ModelAttribute User Example</h2>

        <form:form method="POST" action="/SpringMVC/process-user">

            firstName: <input type="text" name="firstName"><br/>
            lastName: <input type="text" name="lastName"><br/>
            username: <input type="text" name="username"><br/>
            password: <input type="password" name="password"><br/>

            <input type="submit" value="Submit"/>

        </form:form>

    </body>

</html>