package dao.contrat;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import model.contrat.Contrat;
import model.contrat.Contrat_personne;
import util.Util;

public class Contrat_personneDAO {
    public int nbre_ligne_contrat_personne() throws Exception{
        Connection connection = Util.connect();
        int size = 0;
         try { 
            Statement stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("select * from contrat_personne");
            while(res.next()){
                size++; 
            } 
            connection.close();
        } catch(Exception e) { 
           System.out.println(e);
        } 
        return size;
    }

    public Contrat_personne[] getAllContrat() throws Exception{
        Contrat_personne[] contrats = new Contrat_personne[this.nbre_ligne_contrat_personne()];
        int i = 0;
        Connection con = Util.connect();
        try {
            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery("select * from contrat_personne");
            while(res.next()){
                contrats[i] = new Contrat_personne();
                contrats[i].setId_contrat(res.getInt("id_contrat"));
                contrats[i].setId_personne(res.getString("id_personne"));
                contrats[i].setNom(res.getString("nom"));
                contrats[i].setPrenom(res.getString("prenom"));
                contrats[i].setDate_naissance(res.getDate("date_naissance"));
                contrats[i].setCin(res.getString("cin"));
                // contrats[i].set
                contrats[i].setId_poste(res.getInt("id_poste"));
                contrats[i].setNom_poste(res.getString("nom_poste"));
                contrats[i].setHeure_jour(res.getInt("heure_jour"));
                contrats[i].setMission(res.getString("mission"));
                contrats[i].setDebut(res.getDate("debut"));
                contrats[i].setFin(res.getDate("fin"));
                
                i++;
            }
            con.close();
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        return contrats;
    }

    public Contrat_personne getContrat_personneById(int id_contrat) throws Exception{
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet res = null;
        Contrat_personne contrat_personne = new Contrat_personne();
        try {
            connection = Util.connect();
            statement = connection.prepareStatement("select * from contrat_personne where id_contrat=?");
            statement.setInt(1, id_contrat);
            res = statement.executeQuery();
            while(res.next()){
                contrat_personne = new Contrat_personne();
                contrat_personne.setId_contrat(res.getInt("id_contrat"));
                contrat_personne.setId_personne(res.getString("id_personne"));
                contrat_personne.setNom(res.getString("nom"));
                contrat_personne.setPrenom(res.getString("prenom"));
                contrat_personne.setDate_naissance(res.getDate("date_naissance"));
                contrat_personne.setCin(res.getString("cin"));
                // contrat_personne[i].set
                contrat_personne.setId_poste(res.getInt("id_poste"));
                contrat_personne.setNom_poste(res.getString("nom_poste"));
                contrat_personne.setHeure_jour(res.getInt("heure_jour"));
                contrat_personne.setMission(res.getString("mission"));
                contrat_personne.setDebut(res.getDate("debut"));
                contrat_personne.setFin(res.getDate("fin"));
                
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return contrat_personne;
    }

}
