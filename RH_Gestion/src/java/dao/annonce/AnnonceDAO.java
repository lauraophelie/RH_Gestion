package dao.annonce;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import model.annonce.Annonce;
import util.Util;

public class AnnonceDAO {
    public int nbre_ligne_annonce() throws Exception{
        Connection connection = Util.connect();
        int size = 0;
         try { 
            Statement stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("select * from v_annonce");
            while(res.next()){
                size++; 
            } 
            connection.close();
        } catch(Exception e) { 
           System.out.println(e);
        } 
        return size;
    }

    public Annonce[] getAllAnnonce() throws Exception{
        Annonce[] annonces = new Annonce[this.nbre_ligne_annonce()];
        int i = 0;
        Connection con = Util.connect();
        try {
            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery("select * from v_annonce");
            while(res.next()){
                annonces[i] = new Annonce();
                annonces[i].setId_besoin(res.getInt("id_besoin"));
                annonces[i].setId_exp(res.getInt("id_exp"));
                annonces[i].setExp_min(res.getInt("exp_min"));
                annonces[i].setExp_max(res.getInt("exp_max"));
                annonces[i].setNiveau_experience(res.getInt("niveau_experience"));
                annonces[i].setNiveau_diplome(res.getInt("niveau_diplome"));
                annonces[i].setDesignation_diplome(res.getString("designation_diplome"));
                annonces[i].setNiveau_mat(res.getInt("niveau_mat"));
                annonces[i].setDesignation_mat(res.getString("designation_mat"));
                annonces[i].setNom_poste(res.getString("nom_poste"));
                annonces[i].setNom_service(res.getString("nom_service"));
                annonces[i].setDate_limite(res.getDate("date_limite"));
                i++;
            }
            con.close();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
        return annonces;
    }

}
