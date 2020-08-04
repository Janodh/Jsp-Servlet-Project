<%-- 
    Document   : index
    Created on : Aug 4, 2020, 11:21:09 AM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>LOGIN PAGE</h1>
        <form action="Contorller" method="POST">
            <table border="0">
               
                <tbody>
                    <tr>
                        <td>username</td>
                        <td><input type="text" name="username" value="" /></td>
                    </tr>
                    <tr>
                        <td>password</td>
                        <td><input type="text" name="password" value="" /></td>
                    </tr>
                    <tr>
                      
                        <td><input type="submit" value="login" /></td>
                    </tr>
                </tbody>
            </table>

        
        </form>
    </body>
</html>
