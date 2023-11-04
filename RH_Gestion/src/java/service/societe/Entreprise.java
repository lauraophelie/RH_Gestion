/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.societe;

/**
 *
 * @author HERINIAINA
 */
public class Entreprise {
    private int id;
    private Dept[] dept;
    private String nom;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Dept[] getDept() {
        return dept;
    }

    public void setDept(Dept[] dept) {
        this.dept = dept;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
}
