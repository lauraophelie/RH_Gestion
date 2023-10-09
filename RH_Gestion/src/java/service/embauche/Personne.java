/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.embauche;

import java.sql.Date;
import service.besoin.Diplome;
import service.besoin.Experience;
import service.besoin.Nationalite;
import service.besoin.SMatrimoniale;

/**
 *
 * @author HERINIAINA
 */
public class Personne {
    private int id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private SMatrimoniale smatrimoniale;
    private Diplome diplome;
    private Experience experience;
    private Nationalite nationalite;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public SMatrimoniale getSmatrimoniale() {
        return smatrimoniale;
    }

    public void setSmatrimoniale(SMatrimoniale smatrimoniale) {
        this.smatrimoniale = smatrimoniale;
    }

    public Diplome getDiplome() {
        return diplome;
    }

    public void setDiplome(Diplome diplome) {
        this.diplome = diplome;
    }

    public Experience getExperience() {
        return experience;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
    }

    public Nationalite getNationalite() {
        return nationalite;
    }

    public void setNationalite(Nationalite nationalite) {
        this.nationalite = nationalite;
    }
    
    
}
