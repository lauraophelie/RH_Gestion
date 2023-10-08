/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.questionnaire;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.questionnaire.Question;
import model.questionnaire.Reponse;
import service.questionnaire.QuestionService;
import util.Util;

/**
 *
 * @author Laura Ophélie
 */
public class ReponseDAO {
    public List<Reponse> findAllByQuestion(Question question) throws Exception {
        List<Reponse> liste = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet result = null;
        
        try {
            connection = Util.connect();
            statement = connection.prepareStatement("select * from reponse where id_question = ?");
            statement.setInt(1, question.getId());
            
            result = statement.executeQuery();
            
            while(result.next()) {
                Reponse reponse = new Reponse();
                
                reponse.setQuestion(question);
                reponse.setNumeroReponse(result.getInt("numero_reponse"));
                reponse.setReponse(result.getString("reponse"));
                reponse.setSolution(result.getBoolean("solution"));
                reponse.setQuestion(new QuestionService().findById(question.getId()));
                        
                liste.add(reponse);
            }
        } catch(SQLException e) {
            throw e;
        } finally {
            if(statement != null) {
                statement.close();
            }
            if(connection != null) {
                connection.close();
            }
            if(result != null) {
                result.close();
            }
        }
        
        return liste;
    }
    
    public Reponse save(Connection connect, Reponse reponse) throws Exception {
        PreparedStatement statement = null;
        
        try{
            statement = connect.prepareStatement("insert into reponse(id_question, numero_reponse, reponse, solution) values(?, ?, ?, ?)");
            statement.setInt(1, reponse.getQuestion().getId());
            statement.setInt(2, reponse.getNumeroReponse());
            statement.setString(3, reponse.getReponse());
            statement.setBoolean(4, reponse.isSolution());
            
            statement.executeUpdate();
        } catch(SQLException e){
            throw e;
        } finally{
            if(statement != null){
                statement.close();
            }
        }
        return reponse;
    }
    
    public Reponse save(Reponse reponse) throws Exception {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try{
            connection = Util.connect();
            statement = connection.prepareStatement("insert into reponse(id_question, numero_reponse, reponse, solution) values(?, ?, ?, ?)");
            statement.setInt(1, reponse.getQuestion().getId());
            statement.setInt(2, reponse.getNumeroReponse());
            statement.setString(3, reponse.getReponse());
            statement.setBoolean(4, reponse.isSolution());
            
            statement.executeUpdate();
        } catch(SQLException e){
            throw e;
        } finally{
            if(statement != null){
                statement.close();
            }
            if(connection != null){
                connection.close();
            }
        }
        return reponse;
    }
}
