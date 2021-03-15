/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation.servlet;

import business.Rol;
import business.User;
import business.Address;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ignacio
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

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
        if(isLogged(request)){
             getServletContext().getRequestDispatcher("/MainFrame.jsp").forward(request, response);
        } else {
            login(request, response);
        }
    }
    
    private void login(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        String nickname = request.getParameter("nickname");
        String password = request.getParameter("password");
        User user = new User(nickname, password,"Ignacio", "Marín Reyes",Rol.Student, new Address("Polizón", "24", "35118", "Agüimes", "Canarias"), "ULPGC", "Grado en Ingeniería Informática");
        try {
            if(nickname.equals("ignacio") && password.equals("1234")){
                session.setAttribute("user", user);            
                getServletContext().getRequestDispatcher("/MainFrame.jsp").forward(request, response);            
            } else {          
                getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);            
            }
        } catch (ServletException ex) {
                ex.printStackTrace();
        } catch (IOException ex) {
                ex.printStackTrace();
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

    private boolean isLogged(HttpServletRequest request) {
        return request.getSession().getAttribute("user") != null;
    }

}
