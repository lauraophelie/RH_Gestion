/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.questionnaire;

/**
 *
 * @author Laura Ophélie
 */
public class Reponse {
    private Question question;
    private int numeroReponse;
    private String reponse;
    private boolean solution;

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public int getNumeroReponse() {
        return numeroReponse;
    }

    public void setNumeroReponse(int numeroReponse) {
        this.numeroReponse = numeroReponse;
    }

    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    public boolean isSolution() {
        return solution;
    }

    public void setSolution(boolean solution) {
        this.solution = solution;
    }
    
    public Reponse() {}
    public Reponse(Question question, int numeroReponse, String reponse, boolean solution) {
        this.setQuestion(question);
        this.setNumeroReponse(numeroReponse);
        this.setReponse(reponse);
        this.setSolution(solution);
    }
}
