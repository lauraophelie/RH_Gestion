<%-- 
    Document   : note_exp
    Created on : 29 sept. 2023, 09:21:04
    Author     : HERINIAINA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Notation Expérience</title>
    </head>
    <body>
        <h1>Notation Expérience</h1>
        <form action='#' method="post">
        <table>
            <tr>
                <th>Minimum</th>
                <th>Maximum</th>
                <th>Note</th>
            </tr>
            <tr>
                <td>0</td>
                <td>2</td>
                <td><input type="number" name='note_+index_exp'></td>
            </tr>
            <tr>
                <td>2</td>
                <td>5</td>
                <td><input type="number" name='note_+index_exp'></td>
            </tr>
            <tr>
                <td>5</td>
                <td>10</td>
                <td><input type="number" name='note_+index_exp'></td>
            </tr>
        </table>
            <button type="submit">Valider</button>
        </form>
    </body>
</html>
