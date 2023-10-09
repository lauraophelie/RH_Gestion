/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.utilisateur;

import service.societe.Service;

/**
 *
 * @author Laura Ophélie
 */
public class Utilisateur {
    private int id;
    private String nom;
    private String email;
    private String mdp;
    private Service service;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
    
    public Utilisateur() {}
    public Utilisateur(String email, String mdp) {
        this.setEmail(email);
        this.setMdp(mdp);
    }
    public Utilisateur(int id, String nom, String email, String mdp, Service service) {
        this.setId(id);
        this.setNom(nom);
        this.setEmail(email);
        this.setMdp(mdp);
        this.setService(service);
    }
}
