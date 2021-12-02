<%-- 
    Document   : student
    Created on : Dec 2, 2021, 2:38:58 PM
    Author     : tana_
--%>

<%@page import="java.util.List"%>
<%@page import ="model.Studentvaccinedata"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show student!</title>
    </head>
    <body>
        <h1><%= request.getAttribute("idstudent") %></h1>
        <table>
            <c:forEach items="${stdList}" var="std">
                <tr>
                <td>Stdent vactype: <c:out value="${std.vactype}"/></td>
                <td>Stdent vacno: <c:out value="${std.vacno}"/></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
