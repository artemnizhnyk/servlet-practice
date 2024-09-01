<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<h:body>
    <h:form>
        <h:commandLink action="#{customerController.listSetup}"
                       value="View all customers"/>
    </h:form>
</h:body>
</html>