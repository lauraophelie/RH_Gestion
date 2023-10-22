/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.personnel;

import service.personne.Personne;
import service.societe.Poste;

/**
 *
 * @author HERINIAINA
 */
public class Employe {
    private Personne personne;
    private int nMatricule;
    private Poste poste;

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public int getnMatricule() {
        return nMatricule;
    }

    public void setnMatricule(int nMatricule) {
        this.nMatricule = nMatricule;
    }

    public Poste getPoste() {
        return poste;
    }

    public void setPoste(Poste poste) {
        this.poste = poste;
    }
    
    
}
