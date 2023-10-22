/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.besoin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import service.besoin.SMatrimoniale;
import util.Util;

/**
 *
 * @author HERINIAINA
 */
public class SMatrimonialeDAO {
    public static SMatrimoniale findById(int id) throws Exception {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet result = null;
        SMatrimoniale sMatrimoniale = new SMatrimoniale();
        try{
            connection = Util.connect();
            statement = connection.prepareStatement("Select * from SMatrimoniale where id=?");
            statement.setInt(1, id);
            result= statement.executeQuery();
            while(result.next()){
                sMatrimoniale.setDésignation(result.getString("designation"));
                sMatrimoniale.setNiveau(result.getInt("niveau"));
                sMatrimoniale.setId(result.getInt("id"));
            }
        } catch(Exception e){
            throw e;
        } finally{
            if(result != null){
                result.close();
            }
        }
        return sMatrimoniale;
    }

    public static SMatrimoniale[] findAll() {
        return null;
    }

    public static void saveCritere(SMatrimoniale sMaritiale, int id) throws Exception {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = Util.connect();
            statement = connection.prepareStatement("Insert into critere_s_mat(id_s_matrimo,coeff,id_besoin) values(?,?,?)");
            statement.setInt(2, sMaritiale.getId());
            statement.setInt(3, sMaritiale.getCoeff());
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
