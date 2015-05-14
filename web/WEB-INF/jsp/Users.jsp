<%-- 
    Document   : Users
    Created on : May 14, 2015, 9:46:46 AM
    Author     : hamza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="obj" class="model.pojo.Users"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>User List!</h1>
        <table>
            <tr>
                <th>ID</th><th>Email</th><th>Name</th>
            </tr>
            <c:forEach var="user" items="${Users}">
                <tr>
                    <td>
                        <c:out value="${user.getId()}"></c:out>
                    </td>
                    <td>
                        <c:out value="${user.getEmail()}"></c:out>
                    </td>
                    <td>
                        <c:out value="${user.getName()}"></c:out>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
