/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thassingment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JList;

/**
 *
 * @author chamith
 */
public class StudentInsert {
    PreparedStatement pst=null;
    Connection conn=null;
    
    
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
    
    try{
            conn=MySqlConnect.ConnectDB();
            String sql="INSERT INTO Student(FirstName,LastName,Gender,School,Adress,Dob,Intake,Year,Tp,Email,FacultyId,) value(?,?,?,?,?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            
            pst.setString(1,FName);
            pst.setString(2,LName);
            pst.setString(3,genderBtnGroup.getSelection().getActionCommand());
            pst.setString(4,School);
            pst.setString(5,Adress);
            pst.setDate(6,sqlDate);
            pst.setString(7,intakeBtnGroup.getSelection().getActionCommand());
            pst.setString(8,Year);
            pst.setString(9,Tp);
            pst.setString(10,Email);
            //pst.setString(11,Faculty);
            pst.setString(12,GraduateBtnGroup.getSelection().getActionCommand());
            
            pst.execute();
            JOptionPane.showMessageDialog(null,"saved");   
            }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null,e); 
                    
                    }
    

    
    
    
    
    
}
