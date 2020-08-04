/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*; 
/**
 *
 * @author ASUS
 */
public class Contorller extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
             String _username=request.getParameter("username");
              String _password=request.getParameter("password");
            try 
            {
         if (_username!=null)
         {
         Class.forName("com.mysql.jdbc.Driver").newInstance();
         Connection  conn = DriverManager.getConnection("jdbc:mysql://localhost/user","root","");
       String Query="SELECT * FROM users where u_name = ? and u_pass = ? "; 
        PreparedStatement psm=conn.prepareStatement(Query);
        psm.setString(1,_username);
         psm.setString(2,_password);
         ResultSet rs=psm.executeQuery();
         if( rs.next())
         {
             response.sendRedirect("welcome.jsp");
         }
         else {
         out.println("Login Failed!Try agin");
         }
         }
            }
            catch (Exception ex)
            {
            out.println("Exception :"+ex.getMessage());
            }
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
