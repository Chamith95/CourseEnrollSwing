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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static thassingment.StudentInsert.key;

/**
 *
 * @author chamith
 */
public class StudentManage {
    PreparedStatement pst=null;
    Connection conn=null;
    Statement statement=null;
    ResultSet rs = null;
    
    public void filltable(JTable table,String ValueToSearch){
 
        try {
            conn=MySqlConnect.ConnectDB(); 
            pst=conn.prepareStatement("SELECT * FROM `underStudent` WHERE CONCAT(`StuId`,`FirstName`,`LastName`,`Gender`,`School`,`Address`,`Dob`,`Intake`,`Year`,`Tp`,`Email`,`Facultyid`,`CourseId`)LIKE ?");
            pst.setString(1, "%"+ValueToSearch+"%");
            DefaultTableModel model=(DefaultTableModel)table.getModel();
            rs=pst.executeQuery();
            
            Object column[];

            
            while(rs.next()){
                column=new Object[13];
                column[0]=rs.getInt(1);
                column[1]=rs.getString(2);
                column[2]=rs.getString(3);
                column[3]=rs.getString(4);
                column[4]=rs.getString(5);
                column[5]=rs.getString(6);
                column[6]=rs.getString(7);
               // java.util.Date uDate = rs.getDate(8);
                //DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
                //String strDate = dateFormat.format(uDate);
                //System.out.println(strDate);
                column[7]=rs.getString(8);
                column[8]=rs.getString(9);
                column[9]=rs.getString(10);
                column[10]=rs.getString(11);
                column[11]=rs.getString(12);
                column[12]=rs.getString(13);
              
                
                model.addRow(column);
            }
                    } catch (SQLException e) {
            Logger.getLogger(StudentManage.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }
    
        public void filltable2(JTable table,String ValueToSearch2){
 
        try {
            conn=MySqlConnect.ConnectDB(); 
            pst=conn.prepareStatement("SELECT * FROM `AlResult` WHERE (`StuId`)LIKE ?");
            pst.setString(1, "%"+ValueToSearch2+"%");
            DefaultTableModel model=(DefaultTableModel)table.getModel();
            rs=pst.executeQuery();
            
            Object column[];

            
            while(rs.next()){
                column=new Object[13];
                column[0]=rs.getInt(1);
                column[1]=rs.getString(2);
                column[2]=rs.getInt(3);
                column[3]=rs.getString(4);
                column[4]=rs.getString(5);
                column[5]=rs.getString(6);
                column[6]=rs.getString(7);
               // java.util.Date uDate = rs.getDate(8);
                //DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
                //String strDate = dateFormat.format(uDate);
                //System.out.println(strDate);
                column[7]=rs.getString(8);
                column[8]=rs.getString(9);
                column[9]=rs.getString(10);
                column[10]=rs.getString(11);
               
              
              
                
                model.addRow(column);
            }
                    } catch (SQLException ex) {
            Logger.getLogger(StudentManage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }


 public void fillPosttable(JTable table,String ValueToSearch){
 
        try {
            conn=MySqlConnect.ConnectDB(); 
            pst=conn.prepareStatement("SELECT * FROM `postStudent` WHERE CONCAT(`StuId`,`FirstName`,`LastName`,`Gender`,`School`,`Address`,`Dob`,`Intake`,`Year`,`Tp`,`Email`,`Facultyid`,`CourseId`)LIKE ?");
            pst.setString(1, "%"+ValueToSearch+"%");
            DefaultTableModel model=(DefaultTableModel)table.getModel();
            rs=pst.executeQuery();
            
            Object column[];

            
            while(rs.next()){
                column=new Object[13];
                column[0]=rs.getInt(1);
                column[1]=rs.getString(2);
                column[2]=rs.getString(3);
                column[3]=rs.getString(4);
                column[4]=rs.getString(5);
                column[5]=rs.getString(6);
                column[6]=rs.getString(7);
               // java.util.Date uDate = rs.getDate(8);
                //DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
                //String strDate = dateFormat.format(uDate);
                //System.out.println(strDate);
                column[7]=rs.getString(8);
                column[8]=rs.getString(9);
                column[9]=rs.getInt(10);
                column[10]=rs.getString(11);
                column[11]=rs.getString(12);
                column[12]=rs.getString(13);
              
                
                model.addRow(column);
            }
                    } catch (SQLException ex) {
            Logger.getLogger(StudentManage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
         public void fillPoQutable(JTable table,String ValueToSearch2){
 
        try {
            conn=MySqlConnect.ConnectDB(); 
            pst=conn.prepareStatement("SELECT * FROM `postQualifications` WHERE (`StuId`)LIKE ?");
            pst.setString(1, "%"+ValueToSearch2+"%");
            DefaultTableModel model=(DefaultTableModel)table.getModel();
            rs=pst.executeQuery();
            
            Object column[];

            
            while(rs.next()){
                column=new Object[5];
                column[0]=rs.getInt(1);
                column[1]=rs.getString(2);
                column[2]=rs.getString(3);
                column[3]=rs.getInt(4);
                column[4]=rs.getString(5);
              
              
               // java.util.Date uDate = rs.getDate(8);
                //DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
                //String strDate = dateFormat.format(uDate);
                //System.out.println(strDate);
               
               
              
              
                
                model.addRow(column);
            }
                    } catch (SQLException ex) {
            Logger.getLogger(StudentManage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
         
    public void UnderStuUpdate(){
        try{
            conn=MySqlConnect.ConnectDB();
            String sql="UPDATE `underStudent` SET `FirstName`=?,`LastName`=?,`Gender`=?,`School`=?,`Address`=?,`Dob`=?,`Year`=?,`Tp`=?,`Email`=? WHERE StuId=?";
             pst=conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
             
             


           //rs=statement.getGeneratedKeys();
            //key=rs.getInt(1);
            pst.setString(1,ManageStudent.FName1);
            pst.setString(2,ManageStudent.LName1);
            pst.setString(3,ManageStudent.genderBtnGroup11);
            pst.setString(4,ManageStudent.School1);
            pst.setString(5,ManageStudent.Adress1);
            pst.setDate(6,ManageStudent.sdate1);
            pst.setString(7,ManageStudent.Year1);
           
            pst.setString(8,ManageStudent.Tp1);
            pst.setString(9,ManageStudent.Email1);

             pst.setString(10,ManageStudent.tStdId);
            //pst.setString(11,Faculty);

            
            pst.execute();
            
            ResultSet rs = pst.getGeneratedKeys();
 
       
        if (rs.next()) {
            // Value of ID (Index 1 by table design).
            key = rs.getInt(1);
        }
 
        System.out.println("ID value: " +key);
 
   
            JOptionPane.showMessageDialog(null,"Student details Updated");   
            }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null,e); 
                    
                    }
    
     
}
    public void AlUpdate(){
    try{
            conn=MySqlConnect.ConnectDB();
            String sql="UPDATE `AlResult` SET `Stream`=?,`AlYear`=?,`Zscore`=?,`Subject1`=?,`Subject1Result`=?,`Subject2`=?,`Subject2Result`=?,`Subject3`=?,`Subject3Result`=?,`GeneralEnglish`=? WHERE StuId=?";
             pst=conn.prepareStatement(sql);
           
 
            pst.setString(1,ManageStudent.stream1);
            pst.setInt(2,ManageStudent.alyear1);
            pst.setString(3,ManageStudent.al1Zscore);
            pst.setString(4,ManageStudent.al1Sub1);
            pst.setString(5,ManageStudent.al1Sub1R);
            pst.setString(6,ManageStudent.al1Sub2);
            pst.setString(7,ManageStudent.al1Sub2R);
            pst.setString(8,ManageStudent.al1Sub3);
            pst.setString(9,ManageStudent.al1Sub3R);
            pst.setString(10,ManageStudent.gEngR1);
            pst.setString(11,ManageStudent.tStdId);


            
            pst.execute();
            JOptionPane.showMessageDialog(null,"Al results Updated");   
            }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null,e); 
                    
                    }
    
}
    
    public void underStuDelete(){
        try{
            conn=MySqlConnect.ConnectDB();
            String sql="DELETE FROM `underStudent` WHERE StuId= ?";
             pst=conn.prepareStatement(sql);
             pst.setString(1,ManageStudent.tStdId);
             System.out.println(sql);
               pst.execute();
             JOptionPane.showMessageDialog(null,"Student Deleted");   
            }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null,e); 
                    
                    }
    }
    
        public void PostStuUpdate(){
        try{
            conn=MySqlConnect.ConnectDB();
            String sql="UPDATE `postStudent` SET `FirstName`=?,`LastName`=?,`Gender`=?,`School`=?,`Address`=?,`Dob`=?,`Year`=?,`Tp`=?,`Email`=? WHERE StuId=?";
             pst=conn.prepareStatement(sql);
             
             


           //rs=statement.getGeneratedKeys();
            //key=rs.getInt(1);
            pst.setString(1,ManageStudent.FName2);
            pst.setString(2,ManageStudent.LName2);
            pst.setString(3,ManageStudent.genderBtnGroup12);
            pst.setString(4,ManageStudent.School2);
            pst.setString(5,ManageStudent.Adress2);
            pst.setDate(6,ManageStudent.sdate2);
            pst.setString(7,ManageStudent.Year2);
           
            pst.setString(8,ManageStudent.Tp2);
            pst.setString(9,ManageStudent.Email2);

             pst.setString(10,ManageStudent.tStdId2);
            //pst.setString(11,Faculty);

            
            pst.execute();
            
 
 

 
   
            JOptionPane.showMessageDialog(null,"Postgraduate Student details Updated");   
            }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null,e); 
                    
                    }
    
     
}
 public void PQuaUpdate(){
    try{
            conn=MySqlConnect.ConnectDB();
            String sql="UPDATE `postQualifications` SET `Institute`=?,`Degree`=?,`Year`=?,`Gpa`=? WHERE StuId=?";
             pst=conn.prepareStatement(sql);
             
        
            pst.setString(1,ManageStudent.pInstitute1);
            pst.setString(2,ManageStudent.pDegree1);
            pst.setInt(3,ManageStudent.postYear1);
            pst.setString(4,ManageStudent.gpa1);
             pst.setString(5,ManageStudent.tStdId2);
          
           
            //pst.setString(11,Faculty);

            
            pst.execute();
            JOptionPane.showMessageDialog(null,"post quali updated");   
            }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null,e); 
                    
                    }
    
}
    
    public void PostStuDelete(){
        try{
            conn=MySqlConnect.ConnectDB();
            String sql="DELETE FROM `postStudent` WHERE StuId= ?";
             pst=conn.prepareStatement(sql);
             pst.setString(1,ManageStudent.tStdId);
             System.out.println(sql);
               pst.execute();
             JOptionPane.showMessageDialog(null,"Student Deleted");   
            }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null,e); 
                    
                    }
    }
}