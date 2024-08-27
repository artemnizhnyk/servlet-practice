<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<form method="post" action="helloServlet">
        <input type="text" name="enteredValue"/>
        <button type="submit" value="Submit">Submit</button>
</form>
<a href="helloServlet">Hello Servlet</a>
</body>
</html>