/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.questionnaire;

import java.util.List;

/**
 *
 * @author Laura Ophélie
 */
public class Question {
    private int id;
    private Questionnaire questionnaire;
    private int numeroQuestion;
    private String question;
    private int nombrePoint;
    private List<Reponse> reponses;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Questionnaire getQuestionnaire() {
        return questionnaire;
    }

    public void setQuestionnaire(Questionnaire questionnaire) {
        this.questionnaire = questionnaire;
    }

    public int getNumeroQuestion() {
        return numeroQuestion;
    }

    public void setNumeroQuestion(int numeroQuestion) {
        this.numeroQuestion = numeroQuestion;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getNombrePoint() {
        return nombrePoint;
    }

    public void setNombrePoint(int nombrePoint) {
        this.nombrePoint = nombrePoint;
    }

    public List<Reponse> getReponses() {
        return reponses;
    }

    public void setReponses(List<Reponse> reponses) {
        this.reponses = reponses;
    }
    
    public Question() {}
    public Question(Questionnaire questionnaire, int numeroQuestion, String question, int nombrePoint) {
        this.setQuestionnaire(questionnaire);
        this.setNumeroQuestion(numeroQuestion);
        this.setQuestion(question);
        this.setNombrePoint(nombrePoint);
    }
    public Question(Questionnaire questionnaire, int numeroQuestion, String question, int nombrePoint, List<Reponse> reponses) {
        this.setQuestionnaire(questionnaire);
        this.setNumeroQuestion(numeroQuestion);
        this.setQuestion(question);
        this.setNombrePoint(nombrePoint);
        this.setReponses(reponses);
    }
    public Question(int id, Questionnaire questionnaire, int numeroQuestion, String question, int nombrePoint, List<Reponse> reponses) {
        this.setId(id);
        this.setQuestionnaire(questionnaire);
        this.setNumeroQuestion(numeroQuestion);
        this.setQuestion(question);
        this.setNombrePoint(nombrePoint);
        this.setReponses(reponses);
    }

    @Override
    public String toString() {
        return "Question{" + "questionnaire=" + questionnaire + ", numeroQuestion=" + numeroQuestion + ", question=" + question + ", nombrePoint=" + nombrePoint + ", reponses=" + reponses + '}';
    }
    
}
