<%-- 
    Document   : bank
    Created on : Oct 15, 2018, 11:33:50 PM
    Author     : Agarwal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="bank.do">
            Amount <input type="text" name="amt"/><br>
            Add <input type="radio" name="op" value="add"/>
            Less <input type="radio" name="op" value="less"/>
            Exit <input type="radio" name="op" value="exit"/>
            <br><br>
            <input type="submit" value="Subit"/>
        </form>
    </body>
</html>
