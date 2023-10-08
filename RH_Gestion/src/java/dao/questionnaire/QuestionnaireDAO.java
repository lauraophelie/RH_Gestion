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
import model.questionnaire.Questionnaire;
import service.questionnaire.QuestionService;
import util.Util;

/**
 *
 * @author Laura Ophélie
 */
public class QuestionnaireDAO {
    public Questionnaire lastQuestionnaire() throws Exception {
        Questionnaire quest = null;
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet result = null;
        
        try {
            connection = Util.connect();
            statement = connection.prepareStatement("select * from questionnaire order by id desc limit 1");
            
            result = statement.executeQuery();
            
            while(result.next()) {
                quest = new Questionnaire();
                
                quest.setId(result.getInt("id"));
                quest.setDateCreation(result.getDate("date_creation"));
            }
        } catch(SQLException e) {
            throw e;
        } finally {
            if(statement != null){
                statement.close();
            }
            if(connection != null){
                connection.close();
            }
            if(result != null) {
                result.close();
            }
        }
        return quest;
    }
    
    public Questionnaire findById(int id) throws Exception {
        Questionnaire quest = null;
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet result = null;
        
        try {
            connection = Util.connect();
            statement = connection.prepareStatement("select * from questionnaire where id = ?");
            statement.setInt(1, id);
            
            result = statement.executeQuery();
            
            while(result.next()) {
                quest = new Questionnaire();
                
                quest.setId(id);
                quest.setDateCreation(result.getDate("date_creation"));
                quest.setQuestions(new QuestionService().findAllByQuestionnaire(quest));
            }
        } catch(SQLException e) {
            throw e;
        } finally {
            if(statement != null){
                statement.close();
            }
            if(connection != null){
                connection.close();
            }
            if(result != null) {
                result.close();
            }
        }
        
        return quest;
    }
    
    public Questionnaire save(Questionnaire quest) throws Exception {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try{
            connection = Util.connect();
            statement = connection.prepareStatement("insert into questionnaire(id_besoin) values(?)");
            statement.setInt(1, quest.getBesoin().getId());
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
        return quest;
    }
}
