/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.besoin;

import service.societe.Service;

import dao.besoin.AgeDAO;
import dao.besoin.BesoinDAO;
import dao.besoin.DiplomeDAO;
import dao.besoin.ExperienceDAO;
import dao.besoin.NationaliteDAO;
import dao.besoin.SMatrimonialeDAO;
import java.sql.Date;
import java.util.List;
import service.societe.Poste;

/**
 *
 * @author HERINIAINA
 */
public class Besoin {
    private int id;
    private Service service;
    private Poste poste;
    private Diplome diplome;
    private Adresse adresse;
    private SMatrimoniale sMaritiale;
    private Experience experience;
    private Nationalite nationalite;
    private double volumeTache;
    private Unite unite;
    private Age age;
    private Date dateLimite;
    private int nombre;

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

    public Poste getPoste() {
        return poste;
    }

    public void setPoste(Poste poste) {
        this.poste = poste;
    }

    public void setDateLimite(Date dateFin) {
        this.dateLimite = dateFin;
    }
    public Date getDateLimite() {
        return dateLimite;
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }
    
    private void setDateLimite(String dateFin) {
        Date newDate = Date.valueOf(dateFin);
        setDateLimite(newDate);
    }
    
    public Besoin(){}
    
    public Besoin(int id){
        setId(id);
    }
    public Besoin(String id){
        setId(Integer.parseInt(id));
    }
    
    public Besoin(SMatrimoniale sMatrimoniale, Nationalite nationalite, Diplome diplome, Experience experience, Age age, String dateFin) {
        setsMaritiale(sMatrimoniale);
        setNationalite(nationalite);
        setDiplome(diplome);
        setAge(age);
        setExperience(experience);
        setDateLimite(dateFin);
    }

    public void save()throws Exception {
        DiplomeDAO.saveCritere(this.getDiplome(),this.getId());
        ExperienceDAO.saveCritere(this.getExperience(),this.getId());
        NationaliteDAO.saveCritere(this.getNationalite(),this.getId());
        SMatrimonialeDAO.saveCritere(this.getsMaritiale(),this.getId());
        AgeDAO.saveCritere(this.getAge(),this.getId());
        BesoinDAO.save(this);
    }    
    
    public Besoin findById(String id) throws Exception{
        return BesoinDAO.findById(id);
    }
    
    public List<Besoin> findAll()throws Exception{
        return BesoinDAO.findAll();
    }
    
    public List<Besoin> findByService(String idService){
        return BesoinDAO.findByService(idService);
    }
    
    public int getNombre(){
        return nombre;
    }
}
