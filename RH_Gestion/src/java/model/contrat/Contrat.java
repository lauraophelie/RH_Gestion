package model.contrat;

import java.sql.Date;

public class Contrat {
    int id_contrat;
    int id_personne;
    int type_contrat;
    double salaire_brut;
    int id_poste;
    Date debut;
    Date fin;
    
    public int getId_contrat() {
        return id_contrat;
    }
    public void setId_contrat(int id_contrat) {
        this.id_contrat = id_contrat;
    }
    public int getId_personne() {
        return id_personne;
    }
    public void setId_personne(int id_personne) {
        this.id_personne = id_personne;
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
