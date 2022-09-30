/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author ice
 */
@WebServlet(urlPatterns = {"/avalia"}, initParams = {
    @WebInitParam(name = "name", value = "admin"),
    @WebInitParam(name = "password", value = "1234"),
    @WebInitParam(name = "option", value = "true"),})
public class avalia extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    String name;
    String password;
    String option;
    
    public void init(){
        name = getInitParameter("name");
        password = getInitParameter("password");
        option = getInitParameter("option");
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String Pnome = request.getParameter("name");
        String Psenha = request.getParameter("password");
        
        
        
        if(Pnome.equals(name) && Psenha.equals(password)){
              request.getSession().setAttribute("usuario", name);
              response.sendRedirect("success");
        }else{
            response.sendRedirect("index.html");
        }
    }
}
