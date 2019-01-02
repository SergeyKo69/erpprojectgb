<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <%--@elvariable id="user" type="ru.kogut.enterprise.model.security.UserEntity"--%>
    <form:form method="POST" action= "/loginAction" modelAttribute="user">
        <sec:csrfInput/>
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
    </form:form>
</body>
</html>
