<%-- 
    Document   : ArithmeticCalculator
    Created on : Sep 14, 2018, 4:13:00 PM
    Author     : 683676
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
            ENTER A VALUE: <input type="number" name="x"><br>
            ANOTHER VALUE: <input type="number" name="y"><br>
             
            <br>
            <input type="submit" value="+" name="solve">
            <input type="submit" value="*" name="solve">
            <input type="submit" value="/" name="solve">
            <input type="submit" value="%" name="solve">
  
        </form>
        
            ${message}
            
        
    </body>
</html>
