/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.besoin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import service.besoin.Diplome;
import util.Util;

/**
 *
 * @author HERINIAINA
 */
public class DiplomeDAO {

    public static Diplome findById(int id) throws Exception {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet result = null;
        Diplome diplome = new Diplome();
        try{
            connection = Util.connect();
            statement = connection.prepareStatement("Select * from Diplome where id=?");
            statement.setInt(1, id);
            result= statement.executeQuery();
            while(result.next()){
                diplome.setDésignation(result.getString("designation"));
                diplome.setNiveau(result.getInt("niveau"));
                diplome.setId(result.getInt("id"));
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
        return diplome;
    }

    public static void save(Diplome diplome) {
        
    }
    
}
