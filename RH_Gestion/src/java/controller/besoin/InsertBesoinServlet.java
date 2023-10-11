/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.besoin;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.besoin.Age;
import service.besoin.Besoin;
import service.besoin.Diplome;
import service.besoin.Experience;
import service.besoin.Nationalite;
import service.besoin.SMatrimoniale;

/**
 *
 * @author HERINIAINA
 */
public class InsertBesoinServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String idSMaritial = request.getParameter("sMaritial");
        String coeffMaritial = request.getParameter("coeff_maritial");
        String idExperience = request.getParameter("experience");
        String coeffExp = request.getParameter("coeff_exp");
        String idNationalite = request.getParameter("nationalite");
        String coeffNat = request.getParameter("coeff_nat");
        String idDiplome = request.getParameter("diplome");
        String coeffDiplome = request.getParameter("coeff_diplome");
        String minAge = request.getParameter("minAge");
        String maxAge = request.getParameter("maxAge");
        String coeffAge = request.getParameter("coeff_age");
        String limiteDate = request.getParameter("limite");
        
        try{
            //Adresse adresse = new Adresse(idAdresse);
            SMatrimoniale sMatrimoniale = new SMatrimoniale(idSMaritial, coeffMaritial);
            Nationalite nationalite = new Nationalite(idNationalite,coeffNat);
            Diplome diplome = new Diplome(idDiplome,coeffDiplome);
            Experience experience = new Experience(idExperience,coeffExp);
            Age age = new Age(minAge,maxAge,coeffAge);
            
            Besoin besoin = new Besoin(sMatrimoniale, nationalite, diplome, experience, age, limiteDate);
            besoin.save();
            
            RequestDispatcher dispat = request.getRequestDispatcher("index.jsp");
            dispat.forward(request,response);
        } catch(Exception e){
            e.printStackTrace(System.out);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
