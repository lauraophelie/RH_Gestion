package dao.contrat;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import model.annonce.Annonce;
import model.contrat.Contrat;
import util.Util;

public class ContratDAO {
    public int nbre_ligne_contrat() throws Exception{
        Connection connection = Util.connect();
        int size = 0;
         try { 
            Statement stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("select * from contrat");
            while(res.next()){
                size++; 
            } 
            connection.close();
        } catch(Exception e) { 
           System.out.println(e);
        } 
        return size;
    }

    public Contrat[] getAllContrat() throws Exception{
        Contrat[] contrats = new Contrat[this.nbre_ligne_contrat()];
        int i = 0;
        Connection con = Util.connect();
        try {
            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery("select * from contrat");
            while(res.next()){
                contrats[i] = new Contrat();
                contrats[i].setId_contrat(res.getInt("id_contrat"));
                contrats[i].setId_personne(res.getInt("id_personne"));
                contrats[i].setType_contrat((res.getInt("type_contrat")));
                contrats[i].setSalaire_brut(res.getDouble("salaire_brut"));
                contrats[i].setId_poste((res.getInt("id_poste")));
                contrats[i].setDebut((res.getDate("debut")));
                contrats[i].setFin(res.getDate("fin"));
               
                i++;
            }
            con.close();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
        return contrats;
    }
}
