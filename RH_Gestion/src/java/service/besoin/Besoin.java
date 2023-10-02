/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.besoin;

/**
 *
 * @author HERINIAINA
 */
public class Besoin {
    private int id;
    private Diplome diplome;
    private Adresse adresse;
    private SMatrimoniale sMaritiale;
    private Experience experience;
    private Nationalite nationalite;
    private double volumeTache;
    private Unite unite;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Diplome getDiplome() {
        return diplome;
    }

    public void setDiplome(Diplome diplome) {
        this.diplome = diplome;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public SMatrimoniale getsMaritiale() {
        return sMaritiale;
    }

    public void setsMaritiale(SMatrimoniale sMaritiale) {
        this.sMaritiale = sMaritiale;
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

    public double getVolumeTache() {
        return volumeTache;
    }

    public void setVolumeTache(double volumeTache) {
        this.volumeTache = volumeTache;
    }

    public Unite getUnite() {
        return unite;
    }

    public void setUnite(Unite unite) {
        this.unite = unite;
    }
    
    public Besoin(){}
    
    public Besoin(String idDiplome, String adresse, String idSMAritiale, String idExperience, String idNationalite, String volumeTache, String unite){
        
    }
    
    public Besoin(int id){

    }
    public Besoin(String id){

    }

    public void save(){

    }

}
