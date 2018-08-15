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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
}
