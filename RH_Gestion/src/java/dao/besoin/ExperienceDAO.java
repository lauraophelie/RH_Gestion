/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.besoin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import service.besoin.Experience;
import util.Util;

/**
 *
 * @author HERINIAINA
 */
public class ExperienceDAO {

    public static Experience[] findAll() throws Exception {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet result = null;
        Experience[] experiences = null;
        List<Experience> liste = new ArrayList<>();
        try{
            connection = Util.connect();
            statement = connection.prepareStatement("Select * from Experience");
            result= statement.executeQuery();
            while(result.next()){
                Experience exp = new Experience();
                exp.setDésignation(result.getString("maximum"));
                exp.setNiveau(result.getInt("minimum"));
                exp.setNiveau(result.getInt("niveau"));
                exp.setId(result.getInt("id_exp"));
                liste.add(exp);
            }
            experiences = liste.toArray(new Experience[0]);
        } catch(Exception e){
            throw e;
        } finally{
            if(result != null){
                result.close();
            }
            if(statement != null){
                statement.close();
            }
            if(connection != null){
                connection.close();
            }
        }
        return experiences;
    }

    public static void saveCritere(Experience experience, int idBesoin) throws Exception {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = Util.connect();
            statement = connection.prepareStatement("Insert into critere_experience(id_experience,coeff,id_besoin) values(?,?,?,?)");
            statement.setInt(1, experience.getId());
            statement.setInt(2, experience.getCoeff());
            statement.setInt(3, idBesoin);
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
    
    public static Experience findById(int idExperience) throws Exception{
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet result = null;
        Experience exp = new Experience();
        try{
            connection = Util.connect();
            statement = connection.prepareStatement("Select * from Experience");
            result= statement.executeQuery();
            while(result.next()){
                exp.setDésignation(result.getString("maximum"));
                exp.setNiveau(result.getInt("minimum"));
                exp.setNiveau(result.getInt("niveau"));
                exp.setId(result.getInt("id_exp"));
            }
        } catch(Exception e){
            throw e;
        } finally{
            if(result != null){
                result.close();
            }
            if(statement != null){
                statement.close();
            }
            if(connection != null){
                connection.close();
            }
        }
        return exp;
    }
}
