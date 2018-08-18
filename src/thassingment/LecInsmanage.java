/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thassingment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


/**
 *
 * @author chamith
 */
public class LecInsmanage {
    PreparedStatement pst=null;
    Connection conn=null;
    Statement statement=null;
    ResultSet rs = null;
    
public void lecInsert(){
    
    try{
            conn=MySqlConnect.ConnectDB();
            String sql="INSERT INTO `Lecturer`(`lecId`, `FirstName`, `LastName`, `Date of birth`, `Email`, `Adress`) VALUES (?,?,?,?,?,?)";
             pst=conn.prepareStatement(sql);
             
            pst.setString(1,AddLecturer.lecId);
            pst.setString(2,AddLecturer.lecFName);
            pst.setString(3,AddLecturer.lecLName);
            pst.setDate(4,AddLecturer.lecsdate);
            pst.setString(5,AddLecturer.lecEmail);
            pst.setString(6,AddLecturer.lecAdress);
        
            pst.execute();
            

 
            JOptionPane.showMessageDialog(null,"Lecturer details saved");   
            }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null,e); 
                    
                    }
    
    
}
    public void InsInsert(){
    
    try{
            conn=MySqlConnect.ConnectDB();
            String sql="INSERT INTO `Instructer`(`InstructerId`, `FirstName`, `LastName`, `Date of birth`, `Email`, `Adress`) VALUES (?,?,?,?,?,?)";
             pst=conn.prepareStatement(sql);
             
            pst.setString(1,AddInstructer.InsId);
            pst.setString(2,AddInstructer.InsFName);
            pst.setString(3,AddInstructer.InsLName);
            pst.setDate(4,AddInstructer.Inssdate);
            pst.setString(5,AddInstructer.InsEmail);
            pst.setString(6,AddInstructer.InsAdress);
            pst.execute();
            

 
            JOptionPane.showMessageDialog(null,"Instructor details saved");   
            }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null,e); 
                    
                    }
    
    
}
}
