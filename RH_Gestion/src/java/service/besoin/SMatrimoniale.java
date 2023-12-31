/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.besoin;

import dao.besoin.SMatrimonialeDAO;

/**
 *
 * @author HERINIAINA
 */
public class SMatrimoniale {
    private int id;
    private String désignation;
    private int niveau;
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

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    // constructeur
    public SMatrimoniale() {}
    public int getCoeff() {
        return coeff;
    }

    public void setCoeff(int coeff) {
        this.coeff = coeff;
    }
    public SMatrimoniale(int id){
        setId(id);
    }
    public SMatrimoniale(String id) throws Exception{
        int newId = Integer.parseInt(id);
        setId(newId);
    }
    
    public static SMatrimoniale[] findAll() {
        return SMatrimonialeDAO.findAll();
    }
    
    public SMatrimoniale(String idSMaritial, String coeffMaritial) {
        int newId = Integer.parseInt(idSMaritial);
        setId(newId);
        int coeff = Integer.parseInt(coeffMaritial);
        setCoeff(coeff);
    }
    
}
