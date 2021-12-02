<%-- 
    Document   : student
    Created on : Dec 2, 2021, 2:38:58 PM
    Author     : tana_
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show student!</title>
    </head>
    <body>
    <h1><%= request.getAttribute("idstudent")%></h1>
    <c:forEach items="${stdList}" var="std">
        <tr>
            <td>Employee ID: <c:out value="${std.getId}"/></td>
        </tr>
</c:forEach>
</body>
</html>
