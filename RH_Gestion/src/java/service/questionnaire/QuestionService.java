/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.questionnaire;

import dao.questionnaire.QuestionDAO;
import java.util.List;
import model.questionnaire.Question;
import model.questionnaire.Questionnaire;

/**
 *
 * @author Laura Ophélie
 */
public class QuestionService {
   protected QuestionDAO dao = new QuestionDAO();
   
   public List<Question> findAllByQuestionnaire(Questionnaire questionnaire) throws Exception {
        return dao.findAllByQuestionnaire(questionnaire);
    }
    
    public Question findById(int id) throws Exception {
        return dao.findById(id);
    }

    
    public Question save(Question question) throws Exception {
        return dao.save(question);
    }
}
