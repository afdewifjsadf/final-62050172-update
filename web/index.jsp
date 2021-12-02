<%-- 
    Document   : index
    Created on : Dec 2, 2021, 3:37:12 PM
    Author     : tana_
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Main</title>
    </head>
    <body>
        <h4>Search std</h4>
        <form name="main" action="searchServlet">
            Stdent id:
            <input type="text" name="idStudent" value="" size="60" />
            <input type="submit" value="submit" name="submit" />
        </form>

        <h4>Add vaccine</h4>
        <form name="main" action="addServlet">
            Stdent id:
            <input type="text" name="idStudent" value="" size="60" />
            <br>
            vacType:
            <select name="vaccine">
                <option value="SV">SV</option>
                <option value="SP">SP</option>
                <option value="AZ">AZ</option>
                <option value="PZ">PZ</option>
                <option value="MD">MD</option>
                <option value="Others">Others</option>
                <br>
                <input type="submit" value="submit" name="submit" />
        </form>

        <h4>Update : remove by id and vacNo</h4>
        <form name="main" action="remvoebyidandvacnoServlet">
            Stdent id:
            <input type="text" name="idStudent" value="" size="60" />
            <br>
            vacNo:
            <input type="text" name="vacNo" value="" size="60" />
            <br>
            <input type="submit" value="submit" name="submit" />
        </form>

        <h4>Update : vacType by id and vacNo</h4>
        <form name="main" action="updatevacTypeServlet">
            Stdent id:
            <input type="text" name="idStudent" value="" size="60" />
            <br>
            vacNo:
            <input type="text" name="vacNo" value="" size="60" />
            <br>

            new vacType:
            <select name="vaccine">
                <option value="SV">SV</option>
                <option value="SP">SP</option>
                <option value="AZ">AZ</option>
                <option value="PZ">PZ</option>
                <option value="MD">MD</option>
                <option value="Others">Others</option>
                <input type="submit" value="submit" name="submit" />
        </form>


    </body>
</html>
