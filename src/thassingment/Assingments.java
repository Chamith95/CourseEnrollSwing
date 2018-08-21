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
public class Assingments {
    PreparedStatement pst=null;
    Connection conn=null;
    Statement statement=null;
    ResultSet rs = null;
    
public void fillassingTable(JTable table,String ValueToSearch){

        try {
            conn=MySqlConnect.ConnectDB(); 
            pst=conn.prepareStatement("SELECT * FROM `Asingment` WHERE CONCAT(`AssingmentId`,`CourseId`,`SubjectId`,`Type`,`Date`,`Time`)LIKE ?");
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
                column[5]=rs.getString(6);
      
                
                model.addRow(column);
            }
                    } catch (SQLException e) {
            Logger.getLogger(Subject.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }
 public void Assingmentinsert(){
        try{
            conn=MySqlConnect.ConnectDB();
            String sql="INSERT INTO Asingment(AssingmentId,CourseId,SubjectId,Type,Date,Time) value(?,?,?,?,?,?)";
             pst=conn.prepareStatement(sql);
             

            pst.setString(1,ManAssingments.AssingId);
            pst.setString(2,ManAssingments.CourseId);
            pst.setString(3,ManAssingments.SubId);
            pst.setString(4,ManAssingments.type);
            pst.setDate(5,ManAssingments.sdate);
            pst.setString(6,ManAssingments.timeslot);

            
            pst.execute();

   
            JOptionPane.showMessageDialog(null,"Assingment details saved");   
            }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null,e); 
                    
                    }
    

}
      public void asinUpdate(){
        try{
            conn=MySqlConnect.ConnectDB();
            String sql="UPDATE `Asingment` SET `AssingmentId`=?,`CourseId`=?,`SubjectId`=?,`Type`=?,`Date`=?,`Time`=?  WHERE AssingmentId=?";
             pst=conn.prepareStatement(sql);
             
             


           //rs=statement.getGeneratedKeys();
            //key=rs.getInt(1);
            pst.setString(1,ManAssingments.AssingId);
            pst.setString(2,ManAssingments.CourseId);
            pst.setString(3,ManAssingments.SubId);
            pst.setString(4,ManAssingments.type);
            pst.setDate(5,ManAssingments.sdate);
            pst.setString(6,ManAssingments.timeslot);
             pst.setString(7,ManAssingments.AID);
            pst.execute();

            JOptionPane.showMessageDialog(null,"Assingment details Updated");   
            }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null,e); 
                    
                    }
    
     
} 
public void asinDelete(){
        try{
            conn=MySqlConnect.ConnectDB();
            String sql="DELETE FROM `Asingment` WHERE AssingmentId=?";
             pst=conn.prepareStatement(sql);
             pst.setString(1,ManAssingments.AID);
             System.out.println(sql);
               pst.execute();
             JOptionPane.showMessageDialog(null,"Assingment Deleted");   
            }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null,e); 
                    
                    }
    }   
    
}
