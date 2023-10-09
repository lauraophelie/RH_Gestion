/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.questionnaire;

import java.sql.Date;
import java.util.List;
import service.besoin.Besoin;

/**
 *
 * @author Laura Ophélie
 */
public class Questionnaire {
    private int id;
    private Besoin besoin;
    private Date dateCreation;
    private List<Question> questions;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Besoin getBesoin() {
        return besoin;
    }

    public void setBesoin(Besoin besoin) {
        this.besoin = besoin;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
    
    public Questionnaire() {}
    public Questionnaire(Besoin besoin, Date dateCreation) {
        this.setId(id);
        this.setBesoin(besoin);
        this.setDateCreation(dateCreation);
    }
    public Questionnaire(int id, Besoin besoin, Date dateCreation) {
        this.setId(id);
        this.setBesoin(besoin);
        this.setDateCreation(dateCreation);
    }
    public Questionnaire(int id, Besoin besoin, Date dateCreation, List<Question> questions) {
        this.setId(id);
        this.setBesoin(besoin);
        this.setDateCreation(dateCreation);
        this.setQuestions(questions);
    }
}
