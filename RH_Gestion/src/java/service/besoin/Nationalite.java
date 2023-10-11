/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.besoin;

import dao.besoin.NationaliteDAO;
/**
 *
 * @author HERINIAINA
 */
public class Nationalite {
    private int id;
    private String désignation;
    private int niveau;
    private double note;
    private int coeff;

    public Nationalite(String idNationalite, String coeffNat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
    public static Nationalite[] findAll() {
        return NationaliteDAO.findAll();
    }

    public Nationalite(String idNationalite) {
        int newId = Integer.parseInt(idNationalite);
        setId(id);
    }
    public Nationalite(int id){
        setId(id);
    }
    public Nationalite(){}
}
