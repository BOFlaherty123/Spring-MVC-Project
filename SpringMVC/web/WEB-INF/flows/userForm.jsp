<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>

    <head>
        <title>Register User</title>
    </head>

    <body>

        <h2>Web Flow - Register A new User.</h2>

        <form:form>
            <input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}"/>

            <b>FirstName: </b> <input type="text" name="firstName"/><br/>
            <b>LastName: </b> <input type="text" name="lastName"/><br/>
            <b>Username: </b> <input type="text" name="username"/><br/>
            <b>Password: </b> <input type="password" name="password"/><br/>

            <input type="submit" name="_eventId_submit" value="Submit" />
            <input type="submit" name="_eventId_alreadyRegistered" value="Already Registered?" />

        </form:form>

    </body>

</html>
