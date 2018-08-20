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
public class Subject {
    PreparedStatement pst=null;
    Connection conn=null;
    Statement statement=null;
    ResultSet rs = null;
    
    
public void fillsubTable(JTable table,String ValueToSearch){

        try {
            conn=MySqlConnect.ConnectDB(); 
            pst=conn.prepareStatement("SELECT * FROM `subject` WHERE CONCAT(`subjectid`, `subjectName`, `CourseId`, `lecId`, `Semester`, `Credits`, `fees`)LIKE ?");
            pst.setString(1, "%"+ValueToSearch+"%");
            DefaultTableModel model=(DefaultTableModel)table.getModel();
            rs=pst.executeQuery();
            
            Object column[];

            
            while(rs.next()){
                column=new Object[7];
                column[0]=rs.getString(1);
                column[1]=rs.getString(2);
                column[2]=rs.getString(3);
                column[3]=rs.getString(4);
                column[4]=rs.getString(5);
                column[5]=rs.getInt(6);
                column[6]=rs.getInt(7);

              
                
                model.addRow(column);
            }
                    } catch (SQLException e) {
            Logger.getLogger(Subject.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }
public void subInsert(){
    
    try{
            conn=MySqlConnect.ConnectDB();
            String sql="INSERT INTO `subject`(`subjectid`,`subjectName`,`CourseId`,`lecId`,`Semester`,`Credits`,`fees`) VALUES (?,?,?,?,?,?,?)";
             pst=conn.prepareStatement(sql);
             
            pst.setString(1,ManageSubject.SubId);
            pst.setString(2,ManageSubject.SubjectName);
            pst.setString(3,ManageSubject.CourseId);
            pst.setString(4,ManageSubject.lecId);
            pst.setString(5,ManageSubject.Semester);
            pst.setInt(6,ManageSubject.Credits);
            pst.setInt(7,ManageSubject.fees);
        
            pst.execute();
            

 
            JOptionPane.showMessageDialog(null,"Subject details entered");   
            }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null,e); 
                    
                    }
    
    
}
     public void subUpdate(){
        try{
            conn=MySqlConnect.ConnectDB();
            String sql="UPDATE `subject` SET `subjectid`=?,`subjectName`=?,`CourseId`=?,`lecId`=?,`Semester`=?,`Credits`=? ,`fees`=? WHERE subjectid=?";
             pst=conn.prepareStatement(sql);
             
             


           //rs=statement.getGeneratedKeys();
            //key=rs.getInt(1);
            pst.setString(1,ManageSubject.SubId);
            pst.setString(2,ManageSubject.SubjectName);
            pst.setString(3,ManageSubject.CourseId);
            pst.setString(4,ManageSubject.lecId);
            pst.setString(5,ManageSubject.Semester);
            pst.setInt(6,ManageSubject.Credits);
            pst.setInt(7,ManageSubject.fees);
            pst.setString(8,ManageSubject.subId);
            pst.execute();

            JOptionPane.showMessageDialog(null,"subject details Updated");   
            }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null,e); 
                    
                    }
    
     
} 
public void subDelete(){
        try{
            conn=MySqlConnect.ConnectDB();
            String sql="DELETE FROM `subject` WHERE subjectid=?";
             pst=conn.prepareStatement(sql);
             pst.setString(1,ManageSubject.subId);
             System.out.println(sql);
               pst.execute();
             JOptionPane.showMessageDialog(null,"Subject Deleted");   
            }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null,e); 
                    
                    }
    }   
}
