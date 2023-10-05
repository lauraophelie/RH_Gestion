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
public class SMatrimoniale {
    int id;
    String désignation;
    int niveau;
    double note;


    public SMatrimoniale(int id){

    }
    public SMatrimoniale(String id) throws Exception{
        int newId = Integer.parseInt(id);
        
    }
}
