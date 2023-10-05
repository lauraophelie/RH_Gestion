/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.societe;

/**
 *
 * @author HERINIAINA
 */
public class Poste {
    private int id;
    private Service service;
    private String designation;
    private int heureJour;
    private String Mission;
    private String taches;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getHeureJour() {
        return heureJour;
    }

    public void setHeureJour(int heureJour) {
        this.heureJour = heureJour;
    }

    public String getMission() {
        return Mission;
    }

    public void setMission(String Mission) {
        this.Mission = Mission;
    }

    public String getTaches() {
        return taches;
    }

    public void setTaches(String taches) {
        this.taches = taches;
    }

    
}
