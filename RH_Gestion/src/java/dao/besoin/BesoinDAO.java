/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.besoin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import service.besoin.Besoin;
import util.Util;

/**
 *
 * @author HERINIAINA
 */
public class BesoinDAO {
    public static void save(Besoin besoin) throws Exception{
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = Util.connect();
            statement = connection.prepareStatement("Insert into besoin(id_diplome,id_experience,id_nationalite,id_dic) values(?,?,?)");
            statement.setInt(1, besoin.getDiplome().getId());
            statement.setInt(2, besoin.getId());
            statement.setInt(3, besoin.getId());
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
