package model.annonce;

import java.sql.Date;

public class Annonce {
    int id_besoin;
    int id_exp;
    int exp_min;
    int exp_max;
    int niveau_experience;
    int niveau_diplome;
    String designation_diplome;
    int niveau_mat;
    String designation_mat;
    String nom_poste;
    String nom_service;
    Date date_limite;
    
    public int getId_besoin() {
        return id_besoin;
    }
    public void setId_besoin(int id_besoin) {
        this.id_besoin = id_besoin;
    }
    public int getId_exp() {
        return id_exp;
    }
    public void setId_exp(int id_exp) {
        this.id_exp = id_exp;
    }
    public int getExp_min() {
        return exp_min;
    }
    public void setExp_min(int exp_min) {
        this.exp_min = exp_min;
    }
    public int getExp_max() {
        return exp_max;
    }
    public void setExp_max(int exp_max) {
        this.exp_max = exp_max;
    }
    public int getNiveau_experience() {
        return niveau_experience;
    }
    public void setNiveau_experience(int niveau_experience) {
        this.niveau_experience = niveau_experience;
    }
    public int getNiveau_diplome() {
        return niveau_diplome;
    }
    public void setNiveau_diplome(int niveau_diplome) {
        this.niveau_diplome = niveau_diplome;
    }
    public String getDesignation_diplome() {
        return designation_diplome;
    }
    public void setDesignation_diplome(String designation_diplome) {
        this.designation_diplome = designation_diplome;
    }
    public int getNiveau_mat() {
        return niveau_mat;
    }
    public void setNiveau_mat(int niveau_mat) {
        this.niveau_mat = niveau_mat;
    }
    public String getDesignation_mat() {
        return designation_mat;
    }
    public void setDesignation_mat(String designation_mat) {
        this.designation_mat = designation_mat;
    }
    public String getNom_poste() {
        return nom_poste;
    }
    public void setNom_poste(String nom_poste) {
        this.nom_poste = nom_poste;
    }
    public String getNom_service() {
        return nom_service;
    }
    public void setNom_service(String nom_service) {
        this.nom_service = nom_service;
    }
    public Date getDate_limite() {
        return date_limite;
    }
    public void setDate_limite(Date date_limite) {
        this.date_limite = date_limite;
    }
}
