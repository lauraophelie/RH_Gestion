package dao.annonce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.annonce.Annonce;
import service.besoin.Besoin;
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

    public Annonce getAnnonceByBesoin(Besoin besoin) throws Exception {
        Annonce annonce = null;
        
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet res = null;

        try {
            con = Util.connect();
            statement = con.prepareStatement("select * from v_annonce where id_besoin = ?");
            statement.setInt(1, besoin.getId());

            res = statement.executeQuery();

            while(res.next()){
                annonce = new Annonce();
                annonce.setId_besoin(res.getInt("id_besoin"));
                annonce.setId_exp(res.getInt("id_exp"));
                annonce.setExp_min(res.getInt("exp_min"));
                annonce.setExp_max(res.getInt("exp_max"));
                annonce.setNiveau_experience(res.getInt("niveau_experience"));
                annonce.setNiveau_diplome(res.getInt("niveau_diplome"));
                annonce.setDesignation_diplome(res.getString("designation_diplome"));
                annonce.setNiveau_mat(res.getInt("niveau_mat"));
                annonce.setDesignation_mat(res.getString("designation_mat"));
                annonce.setNom_poste(res.getString("nom_poste"));
                annonce.setNom_service(res.getString("nom_service"));
                annonce.setDate_limite(res.getDate("date_limite"));
            }
        } catch (SQLException e) {
            //TODO: handle exception
            throw e;
        } finally {
            if(con != null) con.close();
            if(statement != null) statement.close();
            if(res != null) res.close();
        }
        return annonce;
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
