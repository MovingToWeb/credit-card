/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.io.*;
import java.net.*;

import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Administrator
 */
public class fser extends HttpServlet {
   
    /** 
    * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
    * @param request servlet request
    * @param response servlet response
    */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
       
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet fser</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet fser at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
            */
        
            response.setContentType("text/html");
        HttpSession sn = request.getSession();
       
           
            String fname=(String)request.getParameter("fname");
            String lname= (String)request.getParameter("lname");
            String credit=(String)request.getParameter("credit");
         Class.forName ( "com.mysql.jdbc.Driver" ); 
         String url  = "jdbc:mysql://localhost:3306/promoter";
            java.sql.Connection con  =  DriverManager.getConnection(url,"root","root");
            java.sql.Statement s = con.createStatement();            java.sql.Statement s1 = con.createStatement();
          ResultSet rs=s.executeQuery("select credit from login where fname='"+fname+"';");
          String user=" ";
          String cre=" ";
 String book=" "; String cre1=" ";
           String query="insert into booked values(?,?);";
       
        PreparedStatement ps=(PreparedStatement) con.prepareStatement(query);
       ResultSet rs1=s1.executeQuery("select book from booked where credit='"+credit+"';");
          while(rs1.next())
          {
    cre1=rs1.getString("book");}
       while(rs.next())
       {
          cre=rs.getString("credit");
                    }
 if(cre1.equals(" "))
 {
         if(credit.equals(cre))
          {
           //  sn.setAttribute("ans", ans);
            book="yes";
                    
            
       
        ps.setString(1, credit);
        ps.setString(2, book);
        
        ps.executeUpdate();
       out.println("Successfully booked !!!!");
              Thread.sleep(3000);response.sendRedirect("index.jsp");
              //response.sendRedirect("login.jsp");
          }
          else
          {
              out.println("Sorry Try Again");
              Thread.sleep(3000);response.sendRedirect("index.jsp");
          }
          
        } 
          
        else
        {
            out.println("SORRY ALREADY BOOKED");
            Thread.sleep(3000);response.sendRedirect("index.jsp");
        }
        }
        catch(Exception e)
        {
            System.out.println(" db connection error");
        }
        
                out.close();
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
    * Handles the HTTP <code>GET</code> method.
    * @param request servlet request
    * @param response servlet response
    */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
    * Handles the HTTP <code>POST</code> method.
    * @param request servlet request
    * @param response servlet response
    */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
    * Returns a short description of the servlet.
    */
    public String getServletInfo() {
        return "Short description";
    }
    // </editor-fold>
}
