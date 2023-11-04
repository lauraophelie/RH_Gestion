/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.utilisateur;

import dao.utilisateur.UtilisateurDAO;
import model.utilisateur.Utilisateur;

/**
 *
 * @author Laura Ophélie
 */
public class UtilisateurService {
    protected UtilisateurDAO dao = new UtilisateurDAO();
    
    public Utilisateur find(Utilisateur utilisateur) throws Exception {
        return dao.find(utilisateur);
    }
}
