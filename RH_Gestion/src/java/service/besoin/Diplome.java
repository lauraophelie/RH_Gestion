/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.besoin;

import dao.besoin.DiplomeDAO;

/**
 *
 * @author HERINIAINA
 */
public class Diplome {
    private int id;
    private String désignation;
    private int niveau;
    private double note;

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

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }
    
    public Diplome(){}
    
    public Diplome(int id){
        setId(id);
    }
        
    public static Diplome get(int id) throws Exception{
        return DiplomeDAO.findById(id);
    }
    public static Diplome get(String id) throws Exception{
        int newId = Integer.parseInt(id);
        return get(newId);
    }
    public void save(){
        DiplomeDAO.save(this);
    }
}
