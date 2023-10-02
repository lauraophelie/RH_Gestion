/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.societe;

import service.societe.Service;

/**
 *
 * @author HERINIAINA
 */
public class PosteDAO {
    private Service service;
    private int id;
    private String nom;
    private int heureJour;

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

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

    public int getHeureJour() {
        return heureJour;
    }

    public void setHeureJour(int heureJour) {
        this.heureJour = heureJour;
    }
    
    
}
