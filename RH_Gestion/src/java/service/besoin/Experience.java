/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.besoin;

import dao.besoin.ExperienceDAO;

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

    public Experience(int id){

    }
    public Experience(String id){
        
    }

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
    
    public static Experience[] findAll() {
        return ExperienceDAO.findAll();
    }
}
