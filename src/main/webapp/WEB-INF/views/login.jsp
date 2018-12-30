<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <form action='<spring:url value="/loginAction"/>' method="post">
        <table width="400" border="0">
            <tr>
                <td colspan="2" align="center">
                    <h2>AUTORIZATION</h2>
                </td>
            </tr>
            <tr>
                <td>USERNAME</td>
                <td><input type="text" name="login"/></td>
            </tr>
            <tr>
                <td>PASSWORD</td>
                <td><input type="password" name="password"/></td>
            </tr>
            <tr>
                <td><button type="submit">LOGIN</button></td>
            </tr>
        </table>
    </form>
</body>
</html>
