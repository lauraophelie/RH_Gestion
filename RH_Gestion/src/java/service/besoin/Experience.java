/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.besoin;

import dao.besoin.ExperienceDAO;
import java.util.List;

/**
 *
 * @author HERINIAINA
 */
public class Experience {

    private int id;
    private String désignation;
    private int niveau;
    private int minimum;
    private int maximum;
    private double note;
    private int coeff;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDésignation() {
        return désignation;
    }

    public void setDésignation(String désignation) {
        this.désignation = désignation;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }
        
    public int getCoeff() {
        return coeff;
    }

    public void setCoeff(int coeff) {
        this.coeff = coeff;
    }
    
    public Experience(int id){
        setId(id);
    }
    
    public Experience(String id){
        int newId = Integer.parseInt(id);
        setId(newId);
    }
    
    public static Experience[] findAll() {
        List<Experience> liste = ExperienceDAO.findAll();
        Experience[] experiences = new Experience[liste.size()];
        for(int i = 0; i<liste.size(); i++){
            experiences[i] = liste.get(i);
        }
        return experiences;
    }
    
    public Experience(String idExperience, String coeffExp) {
        int newId = Integer.parseInt(idExperience);
        setId(newId);
        int coeff = Integer.parseInt(coeffExp);
        setCoeff(coeff);
    }
}
