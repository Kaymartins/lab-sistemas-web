/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


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
              response.sendRedirect("success");
        }else{
            response.sendRedirect("index.html");
        }
    }
}
