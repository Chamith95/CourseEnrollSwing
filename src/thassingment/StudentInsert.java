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
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import static thassingment.courseSelectM.alyear;
import static thassingment.courseSelectM.stream;

/**
 *
 * @author chamith
 */
public class StudentInsert {
    PreparedStatement pst=null;
    Connection conn=null;
    Statement statement=null;
    ResultSet rs = null;
    static int key;
    
public void populateJList(JList list, String query, Connection connection) throws SQLException
{
    DefaultListModel model = new DefaultListModel(); //create a new list model

    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery(query); //run your query

    while (resultSet.next()) //go through each row that your query returns
    {
        String itemCode = resultSet.getString("item_code"); //get the element in column "item_code"
        model.addElement(itemCode); //add each item to the model
    }
    list.setModel(model);

    resultSet.close();
    statement.close();

}
public void UnderStuInsert(){
        try{
            conn=MySqlConnect.ConnectDB();
            String sql="INSERT INTO underStudent(FirstName,LastName,Gender,School,Address,Dob,Intake,Year,Tp,Email,FacultyId,Courseid) value(?,?,?,?,?,?,?,?,?,?,?,?)";
             pst=conn.prepareStatement(sql);
            
           //rs=statement.getGeneratedKeys();
            //key=rs.getInt(1);
            pst.setString(1,MStudentDe.FName);
            pst.setString(2,MStudentDe.LName);
            pst.setString(3,MStudentDe.genderBtnGroup1);
            pst.setString(4,MStudentDe.School);
            pst.setString(5,MStudentDe.Adress);
            pst.setDate(6,MStudentDe.sdate);
            pst.setString(7,MStudentDe.intakeBtnGroup1);
            pst.setString(8,MStudentDe.Year);
            pst.setString(9,MStudentDe.Tp);
            pst.setString(10,MStudentDe.Email);
            //pst.setString(11,Faculty);
            pst.setString(11,courseSelectM.facultyid);
            pst.setString(12,courseSelectM.course1);
            
            pst.execute();
            JOptionPane.showMessageDialog(null,"Student details saved");   
            }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null,e); 
                    
                    }
    

}

public void Alinsert(){
    try{
            conn=MySqlConnect.ConnectDB();
            String sql="INSERT INTO AlResult(Stream,AlYear,Zscore,Subject1,Subject1Result,Subject2,Subject2Result,Subject3,Subject3Result,GeneralEnglish) value(?,?,?,?,?,?,?,?,?,?)";
             pst=conn.prepareStatement(sql);
             
            
            pst.setString(1,courseSelectM.stream);
            pst.setInt(2,courseSelectM.alyear);
            pst.setString(3,courseSelectM.alZscore);
            pst.setString(4,courseSelectM.alSub1);
            pst.setString(5,courseSelectM.alSub1R);
            pst.setString(6,courseSelectM.alSub2);
            pst.setString(7,courseSelectM.alSub2R);
            pst.setString(8,courseSelectM.alSub3);
            pst.setString(9,courseSelectM.alSub3R);
            pst.setString(10,courseSelectM.gEngR);
            //pst.setString(11,Faculty);

            
            pst.execute();
            JOptionPane.showMessageDialog(null,"Al results saved");   
            }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null,e); 
                    
                    }
    
}
    
    
    
    
}
