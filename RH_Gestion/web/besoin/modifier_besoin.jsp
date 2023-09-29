<%-- 
    Document   : ajout_besoin
    Created on : 29 sept. 2023, 09:20:14
    Author     : HERINIAINA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Modifier vos besoins</h1>
        <form>
            Poste à pourvoir :
            <select name="poste">
                <option value="idposte">Poste 1</option>
            </select></br>
            Volume de tâche requis :
            <input type="texte" name='volume_tache'>
            <select name="unite">
                <option value='idunite'>heure/jour</option>
                <option value='idunite'>homme jour/mois</option>
                <option value='idunite'>homme jour/semaine</option>
            </select></br>
            <table>
                <tr>
                    <th></th>
                    <th>Coefficient</th>
                    <th>Critère requise</th>
                </tr>
                <tr>
                    <td>Situation matrimoniale</td>
                    <td><input type="number" name="coef_sm"></td>
                    <td>
                        <select name="s_matrimoniale">
                            <option value='idsm'>marie</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Diplôme</td>
                    <td><input type="number" name="coef_dipl"></td>
                    <td>
                        <select name="diplome">
                            <option value='iddipl'>Doctorat</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Expérience</td>
                    <td><input type="number" name="coef_exp"></td>
                    <td>
                        <select name="experience">
                            <option value='idexp'>2 à 3 ans</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Nationalité</td>
                    <td><input type="number" name="coef_nat"></td>
                    <td>
                        <select name="nationalite">
                            <option value='idnat'>Malagasy</option>
                        </select>
                    </td>
                </tr>
            </table>
            <button type="submit">Valider</button>
        </form>
    </body>
</html>
