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
public class Service {
    private int id;
    private Poste[] poste;
    private String nom;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Poste[] getPoste() {
        return poste;
    }

    public void setPoste(Poste[] poste) {
        this.poste = poste;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
}
