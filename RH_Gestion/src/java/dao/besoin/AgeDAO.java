/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.besoin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import service.besoin.Age;
import util.Util;

/**
 *
 * @author HERINIAINA
 */
public class AgeDAO {

    public static void saveCritere(Age age, int id) throws Exception {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = Util.connect();
            statement = connection.prepareStatement("Insert into critere_age(maximum,minimum,coeff,id_besoin) values(?,?,?,?)");
            statement.setInt(1, age.getMax());
            statement.setInt(2, age.getMin());
            statement.setInt(3, age.getCoeff());
            statement.setInt(4, id);
            statement.executeUpdate();
        } catch(Exception e){
            throw e;
        } finally{
            if(statement != null){
                statement.close();
            }
            if(connection != null){
                connection.close();
            }
        }
    }
    
}
