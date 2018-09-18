<%-- 
    Document   : AgeCalculator
    Created on : Sep 14, 2018, 3:46:36 PM
    Author     : 683676
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="calculate">
            
            Enter your age: <input type="number" name="age" ><br>
            <br>
            <input type="submit" value="Age next birthday">
            <br>
            
            <a href="arithmetic" >Arithmetic calculator</a>
        </form>
        <div>
            ${message}
            ${nextage}
        </div>
        
    </body>
</html>
