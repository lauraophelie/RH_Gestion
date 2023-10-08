/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.questionnaire;

import dao.questionnaire.QuestionnaireDAO;
import model.questionnaire.Questionnaire;

/**
 *
 * @author Laura Ophélie
 */
public class QuestionnaireService {
    
    protected QuestionnaireDAO dao = new QuestionnaireDAO();
    
    public Questionnaire findById(int id) throws Exception {
        return dao.findById(id);
    }
    
    public Questionnaire save(Questionnaire quest) throws Exception {
         return dao.save(quest);
    }
    
    public Questionnaire lastQuestionnaire() throws Exception {
        return dao.lastQuestionnaire();
    }
}
