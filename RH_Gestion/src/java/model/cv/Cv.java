package model.cv;

import java.sql.Date;

public class Cv {
    int id_cv;
    int id_personne;
    Date date_envoi_cv;
    int id_diplome;
    int id_nationalite;
    int id_s_matrimo;
    int id_exp;
    
    public int getId_cv() {
        return id_cv;
    }
    public void setId_cv(int id_cv) {
        this.id_cv = id_cv;
    }
    public int getId_personne() {
        return id_personne;
    }
    public void setId_personne(int id_personne) {
        this.id_personne = id_personne;
    }
    public Date getDate_envoi_cv() {
        return date_envoi_cv;
    }
    public void setDate_envoi_cv(Date date_envoi_cv) {
        this.date_envoi_cv = date_envoi_cv;
    }
    public int getId_diplome() {
        return id_diplome;
    }
    public void setId_diplome(int id_diplome) {
        this.id_diplome = id_diplome;
    }
    public int getId_nationalite() {
        return id_nationalite;
    }
    public void setId_nationalite(int id_nationalite) {
        this.id_nationalite = id_nationalite;
    }
    public int getId_s_matrimo() {
        return id_s_matrimo;
    }
    public void setId_s_matrimo(int id_s_matrimo) {
        this.id_s_matrimo = id_s_matrimo;
    }
    public int getId_exp() {
        return id_exp;
    }
    public void setId_exp(int id_exp) {
        this.id_exp = id_exp;
    }
}
