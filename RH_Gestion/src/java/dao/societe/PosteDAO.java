/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.societe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import service.societe.Poste;
import service.societe.Service;
import util.Util;

/**
 *
 * @author HERINIAINA
 */
public class PosteDAO {
    public static List<Poste> findAll(Service service) throws Exception{
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet result = null;
        List<Poste> liste = new ArrayList<>();
        try{
            connection = Util.connect();
            statement = connection.prepareStatement("Select * from poste where id_service = ?");
            statement.setInt(1, service.getId());
            result= statement.executeQuery();
            while(result.next()){
                Poste poste = new Poste();
                poste.setId(result.getInt("id_poste"));
                poste.setDesignation(result.getString("nom_poste"));
                poste.setHeureJour(result.getInt("heure_jour"));
                liste.add(poste);
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
        return liste;
    }
    public static Poste findByid(int idPoste) throws Exception{
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet result = null;
        Poste poste = null;
        try{
            connection = Util.connect();
            statement = connection.prepareStatement("Select * from poste where id_poste = ?");
            statement.setInt(1, idPoste);
            result= statement.executeQuery();
            while(result.next()){
                poste = new Poste();
                poste.setId(result.getInt("id"));
                poste.setDesignation(result.getString("designation"));
                poste.setHeureJour(result.getInt("heure_jour"));
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
        return poste;
    }
}