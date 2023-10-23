package dao.cv;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.cv.Cv;
import util.Util;

public class CvDAO {
    public static void save(Cv cv) throws Exception{
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = Util.connect();
            statement = connection.prepareStatement("Insert into cv(id_personne,date_envoi_cv,id_diplome,id_nationalite,id_s_matrimo,id_exp) values(?,?,?,?,?,?)");
            statement.setInt(1, cv.getId_diplome());
            statement.setDate(2, cv.getDate_envoi_cv());
            statement.setInt(3, cv.getId_diplome());
            statement.setInt(4, cv.getId_nationalite());
            statement.setInt(5, cv.getId_s_matrimo());
            statement.setInt(6, cv.getId_exp());
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
