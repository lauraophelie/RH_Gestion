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
import model.questionnaire.Questionnaire;
import model.questionnaire.Reponse;
import service.questionnaire.QuestionnaireService;
import service.questionnaire.ReponseService;
import util.Util;

/**
 *
 * @author Laura Ophélie
 */
public class QuestionDAO {
    public Question saveQuestionnaire(Question quest) throws Exception {
        Connection connect = null;
        Question last = null;
        
        try {
            connect = Util.connect();
            connect.setAutoCommit(false);
            
            quest = this.save(connect, quest);
            last = this.lastQuestion(connect);
            
            quest.setId(last.getId());
            
            List<Reponse> reponses = quest.getReponses();
            
            for(Reponse reponse : reponses) {
                reponse.setQuestion(last);
                reponse = new ReponseDAO().save(connect, reponse);
            }
            connect.commit();
        } catch(SQLException e) {
            connect.rollback();
            throw e;
        } finally {
            connect.close();
        }
        return quest;
    }
    
    public Question lastQuestion(Connection connection) throws Exception {
        Question question = null;
        
        PreparedStatement statement = null;
        ResultSet result = null;
        
        try {
            statement = connection.prepareStatement("select * from question order by id desc limit 1");
            
            result = statement.executeQuery();
            
            while(result.next()) {
                question = new Question();
                
                question.setId(result.getInt("id"));
                question.setNumeroQuestion(result.getInt("numero_question"));
                question.setQuestion(result.getString("question"));
                question.setNombrePoint(result.getInt("nombre_point"));
                question.setQuestionnaire(new QuestionnaireService().findById(result.getInt("id_questionnaire")));
            }
        } catch(SQLException e) {
            throw e;
        } finally {
            if(statement != null) {
                statement.close();
            }
            if(result != null) {
                result.close();
            }
        }
        return question;
    }
    
    public Question lastQuestion() throws Exception {
        Question question = null;
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet result = null;
        
        try {
            connection = Util.connect();
            statement = connection.prepareStatement("select * from question order by id desc limit 1");
            
            result = statement.executeQuery();
            
            while(result.next()) {
                question = new Question();
                
                question.setId(result.getInt("id"));
                question.setNumeroQuestion(result.getInt("numero_question"));
                question.setQuestion(result.getString("question"));
                question.setNombrePoint(result.getInt("nombre_point"));
                question.setQuestionnaire(new QuestionnaireService().findById(result.getInt("id_questionnaire")));
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
        return question;
    }
    
    public List<Question> findAllByQuestionnaire(Questionnaire questionnaire) throws Exception {
        List<Question> liste = new ArrayList<>();
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet result = null;
        
        try {
            connection = Util.connect();
            statement = connection.prepareStatement("select * from question where id_questionnaire = ?");
            statement.setInt(1, questionnaire.getId());
            
            result = statement.executeQuery();
            
            while(result.next()) {
                Question question = new Question();
                
                question.setId(result.getInt("id"));
                question.setQuestionnaire(questionnaire);
                question.setNumeroQuestion(result.getInt("numero_question"));
                question.setQuestion(result.getString("question"));
                question.setNombrePoint(result.getInt("nombre_point"));
                question.setReponses(new ReponseService().findAllByQuestion(question));
                
                liste.add(question);
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
    
    public Question findById(int id) throws Exception {
        Question question = null;
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet result = null;
        
        try {
            connection = Util.connect();
            statement = connection.prepareStatement("select * from question where id = ?");
            statement.setInt(1, id);
            
            result = statement.executeQuery();
            
            while(result.next()) {
                question = new Question();
                
                question.setId(id);
                question.setNumeroQuestion(result.getInt("numero_question"));
                question.setQuestion(result.getString("question"));
                question.setNombrePoint(result.getInt("nombre_point"));
                question.setQuestionnaire(new QuestionnaireService().findById(result.getInt("id_questionnaire")));
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
        return question;
    }
    
    public Question save(Connection connection, Question question) throws Exception {
        PreparedStatement statement = null;
        
        try{
            statement = connection.prepareStatement("insert into question(id_questionnaire, numero_question, question, nombre_point) values(?, ?, ?, ?)");
            statement.setInt(1, question.getQuestionnaire().getId());
            statement.setInt(2, question.getNumeroQuestion());
            statement.setString(3, question.getQuestion());
            statement.setInt(4, question.getNombrePoint());
            
            statement.executeUpdate();
        } catch(SQLException e){
            throw e;
        } finally{
            if(statement != null){
                statement.close();
            }
        }
        return question;
    }
    
    public Question save(Question question) throws Exception {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try{
            connection = Util.connect();
            statement = connection.prepareStatement("insert into question(id_questionnaire, numero_question, question, nombre_point) values(?, ?, ?, ?)");
            statement.setInt(1, question.getQuestionnaire().getId());
            statement.setInt(2, question.getNumeroQuestion());
            statement.setString(3, question.getQuestion());
            statement.setInt(4, question.getNombrePoint());
            
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
        return question;
    }
}
