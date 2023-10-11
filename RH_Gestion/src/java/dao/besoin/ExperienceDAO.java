/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.besoin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import service.besoin.Experience;
import util.Util;

/**
 *
 * @author HERINIAINA
 */
public class ExperienceDAO {

    public static List<Experience> findAll() {
        return null;
    }

    public static void saveCritere(Experience experience, int id) throws Exception {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = Util.connect();
            statement = connection.prepareStatement("Insert into critere_age(maximum,minimum,coeff,id_besoin) values(?,?,?,?)");
            statement.setInt(1, experience.getMaximum());
            statement.setInt(2, experience.getMinimum());
            statement.setInt(3, experience.getCoeff());
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
