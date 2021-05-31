<%-- 
    Document   : arithmetic
    Created on : 28-May-2021, 10:26:02 AM
    Author     : rider
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            <label>First</label>
            <input type="text" name="firstnum" value="${firstNum}">
            <br>
            <label>Second</label>
            <input type="text" name="secondnum" value="${secondNum}">
            <br>
            <input type="submit" name="button" value="+">
            <input type="submit" name="button" value="-">
            <input type="submit" name="button" value="*">
            <input type="submit" name="button" value="%">
            <br>
        </form>
            <p>Result: ${result}</p>
            <p>${error}</p>
        <a href="age">Age Calculator</a>
        
    </body>
</html>
