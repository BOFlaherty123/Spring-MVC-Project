<%@ taglib prefix ="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>

    <head>
        <title>Form Submit</title>
    </head>

    <body>

        <h2>User Successfully Registered!</h2>

        <b>FirstName:</b> ${user.firstName} <br/>
        <b>LastName:</b> ${user.lastName} <br/>
        <b>Username:</b> ${user.username} <br/>

        <a href='${flowExecutionUrl}&_eventId=finished'>Finish</a>

    </body>

</html>
