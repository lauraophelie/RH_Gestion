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
    
    public Questionnaire findById(int id) {
        return dao.findById(id);
    }
    
    public Questionnaire save(Questionnaire quest) {
        return dao.save(quest);
    }
}
