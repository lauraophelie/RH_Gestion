/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.besoin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import service.besoin.Nationalite;
import util.Util;

/**
 *
 * @author HERINIAINA
 */
public class NationaliteDAO {

    public static Nationalite[] findAll() {
        return null;
    }

    public static void saveCritere(Nationalite nationalite, int id) throws Exception {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = Util.connect();
            statement = connection.prepareStatement("Insert into critere_nat(id_nat,coeff,id_besoin) values(?,?,?)");
            statement.setInt(1, nationalite.getId());
            statement.setInt(2, nationalite.getCoeff());
            statement.setInt(3, id);
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
