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

/**
 *
 * @author chamith
 */
public class selectStuSub extends javax.swing.JFrame {

    PreparedStatement pst=null;
    Connection conn=null;
    Statement statement=null;
    ResultSet rs = null;
    static String S1Sub1;
    static String S1Sub2;
    static String S1Sub3;
    static String S1Sub4;
    static String S2Sub1;
    static String S2Sub2;
    static String S2Sub3;
    static String S2Sub4;
    
       public void subsem1combo1(){
        try{
            conn=MySqlConnect.ConnectDB();
            String sql="SELECT `subjectid` FROM `subject` WHERE CourseId=? AND Semester=1";
             
            pst=conn.prepareStatement(sql);
            pst.setString(1,courseSelectM.course1);

           rs=pst.executeQuery();
         
        while (rs.next()) {
            Sub1sem1combo.addItem(rs.getString("subjectid"));
            
        
        }
          //  JOptionPane.showMessageDialog(null,"");   
            }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null,e); 
                    }
            finally{
            try{
                pst.close();
                rs.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ManageSubject.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
          public void subsem1combo2(){
               try{
            conn=MySqlConnect.ConnectDB();
            String sql="SELECT `subjectid` FROM `subject` WHERE CourseId=? AND Semester=1";
             
            pst=conn.prepareStatement(sql);
            pst.setString(1,courseSelectM.course1);

           rs=pst.executeQuery();
         
        while (rs.next()) {
            sub2sem2combo.addItem(rs.getString("subjectid"));
            
        
        }
          //  JOptionPane.showMessageDialog(null,"");   
            }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null,e); 
                    }
            finally{
            try{
                pst.close();
                rs.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ManageSubject.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
             public void subsem1combo3(){
               try{
            conn=MySqlConnect.ConnectDB();
            String sql="SELECT `subjectid` FROM `subject` WHERE CourseId=? AND Semester=1";
             
            pst=conn.prepareStatement(sql);
            pst.setString(1,courseSelectM.course1);

           rs=pst.executeQuery();
         
        while (rs.next()) {
            sub3sem3combo.addItem(rs.getString("subjectid"));
            
        
        }
          //  JOptionPane.showMessageDialog(null,"");   
            }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null,e); 
                    }
            finally{
            try{
                pst.close();
                rs.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ManageSubject.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
public void subsem1combo4(){
               try{
            conn=MySqlConnect.ConnectDB();
            String sql="SELECT `subjectid` FROM `subject` WHERE CourseId=? AND Semester=1";
             
            pst=conn.prepareStatement(sql);
            pst.setString(1,courseSelectM.course1);

           rs=pst.executeQuery();
         
        while (rs.next()) {
            sub4sem1combo.addItem(rs.getString("subjectid"));
            
        
        }
          //  JOptionPane.showMessageDialog(null,"");   
            }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null,e); 
                    }
            finally{
            try{
                pst.close();
                rs.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ManageSubject.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
public void subsem2combo1(){
               try{
            conn=MySqlConnect.ConnectDB();
            String sql="SELECT `subjectid` FROM `subject` WHERE CourseId=? AND Semester=2";
             
            pst=conn.prepareStatement(sql);
            pst.setString(1,courseSelectM.course1);

           rs=pst.executeQuery();
         
        while (rs.next()) {
            Sub1sem12combo.addItem(rs.getString("subjectid"));
            
        
        }
          //  JOptionPane.showMessageDialog(null,"");   
            }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null,e); 
                    }
            finally{
            try{
                pst.close();
                rs.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ManageSubject.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
public void subsem2combo2(){
               try{
            conn=MySqlConnect.ConnectDB();
            String sql="SELECT `subjectid` FROM `subject` WHERE CourseId=? AND Semester=2";
             
            pst=conn.prepareStatement(sql);
            pst.setString(1,courseSelectM.course1);

           rs=pst.executeQuery();
         
        while (rs.next()) {
            sub2sem2combo1.addItem(rs.getString("subjectid"));
            
        
        }
          //  JOptionPane.showMessageDialog(null,"");   
            }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null,e); 
                    }
            finally{
            try{
                pst.close();
                rs.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ManageSubject.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
public void subsem2combo3(){
               try{
            conn=MySqlConnect.ConnectDB();
            String sql="SELECT `subjectid` FROM `subject` WHERE CourseId=? AND Semester=2";
             
            pst=conn.prepareStatement(sql);
            pst.setString(1,courseSelectM.course1);

           rs=pst.executeQuery();
         
        while (rs.next()) {
            sub3sem2combo.addItem(rs.getString("subjectid"));
            
        
        }
          //  JOptionPane.showMessageDialog(null,"");   
            }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null,e); 
                    }
            finally{
            try{
                pst.close();
                rs.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ManageSubject.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
public void subsem2combo4(){
               try{
            conn=MySqlConnect.ConnectDB();
            String sql="SELECT `subjectid` FROM `subject` WHERE CourseId=? AND Semester=2";
             
            pst=conn.prepareStatement(sql);
            pst.setString(1,courseSelectM.course1);

           rs=pst.executeQuery();
         
        while (rs.next()) {
            sub4sem2combo.addItem(rs.getString("subjectid"));
            
        
        }
          //  JOptionPane.showMessageDialog(null,"");   
            }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null,e); 
                    }
            finally{
            try{
                pst.close();
                rs.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ManageSubject.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    public selectStuSub() {
        initComponents();
        System.out.println(courseSelectM.course1);
        subsem1combo1();
        subsem1combo2();
        subsem1combo3();
        subsem1combo4();
        subsem2combo1();
        subsem2combo2();
        subsem2combo3();
        subsem2combo4();
        if(MStudentDe.intakeBtnGroup1=="July"){
            jPanel3.setVisible(false);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Jnextbtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        sub2sem2combo = new javax.swing.JComboBox<>();
        Sub1sem1combo = new javax.swing.JComboBox<>();
        sub3sem3combo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        sub4sem1combo = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        sub2sem2combo1 = new javax.swing.JComboBox<>();
        Sub1sem12combo = new javax.swing.JComboBox<>();
        sub3sem2combo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        sub4sem2combo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Jnextbtn.setText("Next");
        Jnextbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JnextbtnActionPerformed(evt);
            }
        });

        jButton2.setText("Back");

        jButton3.setText("Exit");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel1.setText("Select 4 subjects for semester 1");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setText("Subject1");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel3.setText("Subject2");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel4.setText("Subject3");

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel9.setText("Subject4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(45, 45, 45)
                            .addComponent(Sub1sem1combo, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(sub3sem3combo, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(sub2sem2combo, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(sub4sem1combo, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sub1sem1combo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sub2sem2combo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sub3sem3combo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sub4sem1combo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel5.setText("Select 4 subjects for semester 2");

        sub3sem2combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub3sem2comboActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel6.setText("Subject1");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel7.setText("Subject2");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel8.setText("Subject3");

        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel10.setText("Subject4");

        sub4sem2combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub4sem2comboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(45, 45, 45)
                            .addComponent(Sub1sem12combo, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(sub3sem2combo, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(sub2sem2combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(sub4sem2combo, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sub1sem12combo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sub2sem2combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sub3sem2combo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sub4sem2combo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Jnextbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jnextbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sub3sem2comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub3sem2comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sub3sem2comboActionPerformed

    private void JnextbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JnextbtnActionPerformed
          S1Sub1=(String) Sub1sem1combo.getSelectedItem();
          S1Sub2=(String) sub2sem2combo.getSelectedItem();
          S1Sub3=(String) sub3sem3combo.getSelectedItem();
          S1Sub4=(String) sub4sem1combo.getSelectedItem();
          S2Sub1=(String) Sub1sem12combo.getSelectedItem();
          S2Sub2=(String) sub2sem2combo1.getSelectedItem();
          S2Sub3=(String) sub3sem2combo.getSelectedItem();
          S2Sub4=(String) sub4sem2combo.getSelectedItem();
          
          if(S1Sub1==S1Sub2 ||S1Sub1==S1Sub3 ||S1Sub2==S1Sub3 ||S1Sub1==S1Sub4 || S1Sub2==S1Sub4 ||S1Sub3==S1Sub4){
               JOptionPane.showMessageDialog(null,"Unique values need to be selected for semester 1 subjects");
               return;
          }
          if((S2Sub1==S2Sub2 ||S2Sub1==S2Sub3 ||S2Sub2==S2Sub3||S2Sub1==S2Sub4 || S2Sub2==S2Sub4 ||S2Sub3 == S2Sub4) && MStudentDe.intakeBtnGroup1=="February") {
               JOptionPane.showMessageDialog(null,"Unique values need to be selected for semester 2 subjects");
               return;
          }
        StudentInsert s1=new StudentInsert();
        StudentInsert s2=new StudentInsert();
        
        System.out.println("Statues "+courseSelectM.status);
        if (courseSelectM.status=="Undergraduate"){
                s1.UnderStuInsert();
                s1.Alinsert();
                if(MStudentDe.intakeBtnGroup1=="February"){
                    s1.subinsert1();
                    s1.subinsert2();
                }
                else {
                    s1.subinsert1();
                } 
        }  
        if(courseSelectM.status=="Postgraduate"){
               s1.PostStuInsert();
               s1.PQuaInsert();
               if(MStudentDe.intakeBtnGroup1=="February"){
                    s1.subinsert1();
                    s1.subinsert2();
                }
                else {
                    s1.subinsert1();
                } 
        }
    }//GEN-LAST:event_JnextbtnActionPerformed

    private void sub4sem2comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub4sem2comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sub4sem2comboActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(selectStuSub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(selectStuSub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(selectStuSub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(selectStuSub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new selectStuSub().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jnextbtn;
    private javax.swing.JComboBox<String> Sub1sem12combo;
    private javax.swing.JComboBox<String> Sub1sem1combo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> sub2sem2combo;
    private javax.swing.JComboBox<String> sub2sem2combo1;
    private javax.swing.JComboBox<String> sub3sem2combo;
    private javax.swing.JComboBox<String> sub3sem3combo;
    private javax.swing.JComboBox<String> sub4sem1combo;
    private javax.swing.JComboBox<String> sub4sem2combo;
    // End of variables declaration//GEN-END:variables
}
