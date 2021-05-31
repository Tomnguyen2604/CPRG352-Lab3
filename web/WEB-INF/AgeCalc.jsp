<%-- 
    Document   : AgeCalc
    Created on : 27-May-2021, 11:44:05 PM
    Author     : rider
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <form method="post" action="age">
            <label>Enter your age: </label>
            <input type="text" name="age" value="${Age}">
            <br>
            <input type="submit" value="Age next birthday">
        </form>
            <p>${message}</p>
            <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
