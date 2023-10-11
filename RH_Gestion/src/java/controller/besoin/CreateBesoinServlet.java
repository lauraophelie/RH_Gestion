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
import service.besoin.Diplome;
import service.besoin.Experience;
import service.besoin.Nationalite;
import service.besoin.SMatrimoniale;

/**
 *
 * @author HERINIAINA
 */
public class CreateBesoinServlet extends HttpServlet {

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
            throws ServletException, IOException{
        try{
            Diplome[] diplome = Diplome.findAll();
            Experience[] experience = Experience.findAll();
            SMatrimoniale[] sMatrimoniale = SMatrimoniale.findAll();
            Nationalite[] nationalite = Nationalite.findAll();

            request.setAttribute("diplomes", diplome);
            request.setAttribute("experiences", experience);
            request.setAttribute("smatrimoniales", sMatrimoniale);
            request.setAttribute("nationalites", nationalite);
            
            RequestDispatcher dispat = request.getRequestDispatcher("besoin/ajout_besoin.jsp");
            dispat.forward(request,response);
        }
        catch(Exception e){
            System.out.println("Error : " + e);
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
