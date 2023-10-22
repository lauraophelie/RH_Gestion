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
import service.besoin.Besoin;
import service.besoin.Diplome;
import service.besoin.Experience;
import service.besoin.Nationalite;
import service.besoin.SMatrimoniale;
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
            statement = connection.prepareStatement("Insert into besoin(id_poste,nombre,date_demande,date_limite) values(?,?,NOW(),?)");
            statement.setInt(1, besoin.getPoste().getId());
            statement.setDate(3, besoin.getDateLimite());
            statement.setInt(2, besoin.getNombre());
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

    public static Besoin findById(String id) throws Exception  {
        Besoin besoin = null;
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet result = null;
        Diplome diplome = null;
        Experience experience = null;
        SMatrimoniale smatrimoniale = null;
        Nationalite nationalite = null;
        try{
            connection = Util.connect();
            statement = connection.prepareStatement("Select * from v_besoin where id = ?");
            statement.setInt(1,Integer.parseInt(id));
            result= statement.executeQuery();
            while(result.next()){
                besoin = new Besoin();
                besoin.setId(result.getInt("id"));
                diplome = new Diplome(result.getInt("id_diplome"));
                diplome.setDésignation(result.getString("desgination_diplome"));
                experience = new Experience(result.getInt("id_experience"));
                experience.setMinimum(result.getInt("min_exp"));
                experience.setMaximum(result.getInt("max_exp"));
                smatrimoniale = new SMatrimoniale(result.getInt("id_s_matrimoniale"));
                smatrimoniale.setDésignation(result.getString("desgination_s_matrimoniale"));
                nationalite = new Nationalite(result.getInt("id_nationalite"));
                nationalite.setDésignation(result.getString("desgination_nationalite"));
                
                besoin.setDiplome(diplome);
                besoin.setExperience(experience);
                besoin.setNationalite(nationalite);
                besoin.setsMaritiale(smatrimoniale);
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
        return besoin;
    }

    public static List<Besoin> findByService(String idService) {
        return null;
    }

    public static List<Besoin> findAll() throws Exception {
        List<Besoin> listeBesoin = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet result = null;
        try{
            connection = Util.connect();
            statement = connection.prepareStatement("Select * from v_besoin");
            result= statement.executeQuery();
            while(result.next()){
                Besoin besoin = new Besoin();
                besoin.setId(result.getInt("id"));
                Diplome diplome = new Diplome(result.getInt("id_diplome"));
                diplome.setDésignation(result.getString("desgination_diplome"));
                Experience experience = new Experience(result.getInt("id_experience"));
                experience.setMinimum(result.getInt("min_exp"));
                experience.setMaximum(result.getInt("max_exp"));
                SMatrimoniale smatrimoniale = new SMatrimoniale(result.getInt("id_s_matrimoniale"));
                smatrimoniale.setDésignation(result.getString("desgination_s_matrimoniale"));
                Nationalite nationalite = new Nationalite(result.getInt("id_nationalite"));
                nationalite.setDésignation(result.getString("desgination_nationalite"));
                
                besoin.setDiplome(diplome);
                besoin.setExperience(experience);
                besoin.setNationalite(nationalite);
                besoin.setsMaritiale(smatrimoniale);
                besoin.setDateLimite(result.getDate("dateLimite"));
                
                listeBesoin.add(besoin);
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
        return listeBesoin;
    }
}
