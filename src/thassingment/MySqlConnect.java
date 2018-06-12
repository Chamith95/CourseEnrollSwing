/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thassingment;

import java.sql.*;
import javax.swing.*;
/**
 *
 * @author chamith
 */
public class MySqlConnect  {
    Connection conn=null;
    public static Connection ConnectDB(){
        try{
            Connection conn=null;
            String url = "jdbc:mysql://localhost:3306/NSBM?autoReconnect=true&useSSL=false";
            String username = "admin";
            String password = "123";

            // Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
            //JOptionPane.showMessageDialog(null,"Connected to database");
            return conn;
             
             }
               
         catch(Exception e){
         JOptionPane.showMessageDialog(null,e);
         return null;
        
        }
        }
}
    

