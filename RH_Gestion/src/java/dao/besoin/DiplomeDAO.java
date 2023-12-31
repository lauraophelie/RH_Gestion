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

    public static void save(Diplome diplome) throws Exception {
        Connection connection = null;
        PreparedStatement statement = null;
        try{
            connection = Util.connect();
            statement = connection.prepareStatement("Insert into Diplome(designation,niveau) values(?,?)");
            statement.setString(1, diplome.getDésignation());
            statement.setInt(2, diplome.getNiveau());
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

    public static Diplome[] findAll() throws Exception {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet result = null;
        Diplome[] diplomes = null;
        List<Diplome> liste = new ArrayList<>();
        try{
            connection = Util.connect();
            statement = connection.prepareStatement("Select * from Diplome");
            result= statement.executeQuery();
            while(result.next()){
                Diplome diplome = new Diplome();
                diplome.setDésignation(result.getString("designation"));
                diplome.setNiveau(result.getInt("niveau"));
                diplome.setId(result.getInt("id_diplome"));
                liste.add(diplome);
            }
            Diplome[] diplome = new Diplome[liste.size()];
            for (int i = 0; i < diplome.length; i++) {
                diplome[i] = liste.get(i);
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
        return diplomes;
    }

    public static void saveCritere(Diplome diplome, int id) throws Exception {
        Connection connection = null;
        PreparedStatement statement = null;
        try{
            connection = Util.connect();
            statement = connection.prepareStatement("Insert into critere_diplome(id_diplome,id_besoin,coeff) values(?,?,?)");
            statement.setInt(1, diplome.getId());
            statement.setInt(2, id);
            statement.setInt(3, diplome.getCoeff());
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
