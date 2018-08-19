/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thassingment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


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
    
 public void filllecTable(JTable table,String ValueToSearch){

        try {
            conn=MySqlConnect.ConnectDB(); 
            pst=conn.prepareStatement("SELECT * FROM `Lecturer` WHERE CONCAT(`lecId`, `FirstName`, `LastName`, `Date of birth`, `Email`, `Adress`)LIKE ?");
            pst.setString(1, "%"+ValueToSearch+"%");
            DefaultTableModel model=(DefaultTableModel)table.getModel();
            rs=pst.executeQuery();
            
            Object column[];

            
            while(rs.next()){
                column=new Object[13];
                column[0]=rs.getString(1);
                column[1]=rs.getString(2);
                column[2]=rs.getString(3);
                column[3]=rs.getString(4);
                column[4]=rs.getString(5);
                column[5]=rs.getString(6);

              
                
                model.addRow(column);
            }
                    } catch (SQLException e) {
            Logger.getLogger(StudentManage.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }
      public void lecUpdate(){
        try{
            conn=MySqlConnect.ConnectDB();
            String sql="UPDATE `Lecturer` SET `lecId`=?,`FirstName`=?,`LastName`=?,`Date of birth`=?,`Email`=?,`Adress`=? WHERE lecId=?";
             pst=conn.prepareStatement(sql);
             
             


           //rs=statement.getGeneratedKeys();
            //key=rs.getInt(1);
            pst.setString(1,ManageLecturers.lecId1);
            pst.setString(2,ManageLecturers.lecFName1);
            pst.setString(3,ManageLecturers.lecLName1);
            pst.setDate(4,ManageLecturers.lecsdate1);
            pst.setString(5,ManageLecturers.lecEmail1);
            pst.setString(6,ManageLecturers.lecAdress1);
            pst.setString(7,ManageLecturers.lecId1);
           

            pst.execute();

            JOptionPane.showMessageDialog(null,"Lecturer details Updated");   
            }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null,e); 
                    
                    }
    
     
} 
public void lecDelete(){
        try{
            conn=MySqlConnect.ConnectDB();
            String sql="DELETE FROM `Lecturer` WHERE lecId=?";
             pst=conn.prepareStatement(sql);
             pst.setString(1,ManageLecturers.lecId);
             System.out.println(sql);
               pst.execute();
             JOptionPane.showMessageDialog(null,"Lecturer Deleted");   
            }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null,e); 
                    
                    }
    }   
public void fillInsTable(JTable table,String ValueToSearch){

        try {
            conn=MySqlConnect.ConnectDB(); 
            pst=conn.prepareStatement("SELECT * FROM `Instructer` WHERE CONCAT(`InstructerId`, `FirstName`, `LastName`, `Date of birth`, `Email`, `Adress`)LIKE ?");
            pst.setString(1, "%"+ValueToSearch+"%");
            DefaultTableModel model=(DefaultTableModel)table.getModel();
            rs=pst.executeQuery();
            
            Object column[];

            
            while(rs.next()){
                column=new Object[6];
                column[0]=rs.getString(1);
                column[1]=rs.getString(2);
                column[2]=rs.getString(3);
                column[3]=rs.getString(4);
                column[4]=rs.getString(5);
                column[5]=rs.getString(6);

              
                
                model.addRow(column);
            }
                    } catch (SQLException e) {
            Logger.getLogger(StudentManage.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }
      public void InsUpdate(){
        try{
            conn=MySqlConnect.ConnectDB();
            String sql="UPDATE `Instructer` SET `InstructerId`=?,`FirstName`=?,`LastName`=?,`Date of birth`=?,`Email`=?,`Adress`=? WHERE InstructerId=?";
             pst=conn.prepareStatement(sql);
             
             


           //rs=statement.getGeneratedKeys();
            //key=rs.getInt(1);
            pst.setString(1,ManageInstructors.InsId1);
            pst.setString(2,ManageInstructors.InsFName1);
            pst.setString(3,ManageInstructors.InsLName1);
            pst.setDate(4,ManageInstructors.Inssdate1);
            pst.setString(5,ManageInstructors.InsEmail1);
            pst.setString(6,ManageInstructors.InsAdress1);
            pst.setString(7,ManageInstructors.InsId1);
           

            pst.execute();

            JOptionPane.showMessageDialog(null,"Instructor details Updated");   
            }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null,e); 
                    
                    }
    
     
} 
public void InsDelete(){
        try{
            conn=MySqlConnect.ConnectDB();
            String sql="DELETE FROM `Instructer` WHERE InstructerId=?";
             pst=conn.prepareStatement(sql);
             pst.setString(1,ManageInstructors.InsId);
             System.out.println(sql);
               pst.execute();
             JOptionPane.showMessageDialog(null,"Instructor Deleted");   
            }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null,e); 
                    
                    }
    }   
    
}
