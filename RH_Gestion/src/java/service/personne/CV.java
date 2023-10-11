/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service.personne;

import dao.personne.CVDAO;
import java.sql.Date;
import service.besoin.Diplome;
import service.besoin.Experience;
import service.besoin.Nationalite;
import service.besoin.SMatrimoniale;

/**
 *
 * @author HERINIAINA
 */

public class CV {
    private Diplome diplome;
    private Experience experience;
    private SMatrimoniale sMatrimoniale;
    private Nationalite nationalite;
    
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

    public SMatrimoniale getSMatrimoniale() {
        return sMatrimoniale;
    }

    public void setSMatrimoniale(SMatrimoniale sMatrimoniale) {
        this.sMatrimoniale = sMatrimoniale;
    }

    public Nationalite getNationalite() {
        return nationalite;
    }

    public void setNationalite(Nationalite nationalite) {
        this.nationalite = nationalite;
    }

    public void save(){
        CVDAO.save(this);
    }

}
