package model.contrat;

import java.sql.Date;

public class Contrat_personne {
    int id_contrat;
    String id_personne;
    String nom;
    String prenom;
    Date date_naissance;
    String cin;
    int type_contrat;
    double salaire_brut;
    int id_poste;
    String nom_poste;
    int heure_jour;
    String mission;
    Date debut;
    Date fin;
    
    public int getId_contrat() {
        return id_contrat;
    }
    public void setId_contrat(int id_contrat) {
        this.id_contrat = id_contrat;
    }
    public String getId_personne() {
        return id_personne;
    }
    public void setId_personne(String id_personne) {
        this.id_personne = id_personne;
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
    public Date getDate_naissance() {
        return date_naissance;
    }
    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }
    public String getCin() {
        return cin;
    }
    public void setCin(String cin) {
        this.cin = cin;
    }
    public int getType_contrat() {
        return type_contrat;
    }
    public void setType_contrat(int type_contrat) {
        this.type_contrat = type_contrat;
    }
    public double getSalaire_brut() {
        return salaire_brut;
    }
    public void setSalaire_brut(double salaire_brut) {
        this.salaire_brut = salaire_brut;
    }
    public int getId_poste() {
        return id_poste;
    }
    public void setId_poste(int id_poste) {
        this.id_poste = id_poste;
    }
    public String getNom_poste() {
        return nom_poste;
    }
    public void setNom_poste(String nom_poste) {
        this.nom_poste = nom_poste;
    }
    public int getHeure_jour() {
        return heure_jour;
    }
    public void setHeure_jour(int heure_jour) {
        this.heure_jour = heure_jour;
    }
    public String getMission() {
        return mission;
    }
    public void setMission(String mission) {
        this.mission = mission;
    }
    public Date getDebut() {
        return debut;
    }
    public void setDebut(Date debut) {
        this.debut = debut;
    }
    public Date getFin() {
        return fin;
    }
    public void setFin(Date fin) {
        this.fin = fin;
    }
    
}
