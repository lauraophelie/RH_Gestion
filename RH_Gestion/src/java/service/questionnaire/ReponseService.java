/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.questionnaire;

import dao.questionnaire.ReponseDAO;
import java.util.List;
import model.questionnaire.Question;
import model.questionnaire.Reponse;

/**
 *
 * @author Laura Ophélie
 */
public class ReponseService {
    protected ReponseDAO dao = new ReponseDAO();
    
    public List<Reponse> findAllByQuestion(Question question) {
        return dao.findAllByQuestion(question);
    }
    
    public Reponse save(Reponse reponse) {
        return dao.save(reponse);
    }
}
