/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thassingment;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author chamith
 */
public class ManageInstructors extends javax.swing.JFrame {

    /**
     * Creates new form ManageLecturers
     */
    static String InsFName1;
    static String InsLName1;
    static java.sql.Date InsDob1;
    static java.sql.Date Inssdate1;
    static String InsTp1;
    static String InsEmail1;
    static String InsYear1;
    static String InsId1;
    static String InsAdress1;
    static String InsId;
    LecInsmanage I1=new LecInsmanage();
    public ManageInstructors() {
        initComponents();
        I1.fillInsTable(jTable1,"");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        InsIdtxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        FInsName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        LInsName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Insdob = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        InseMail = new javax.swing.JTextField();
        Insadress = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Jupdatebtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSearchfiled = new javax.swing.JTextField();
        jExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Andika", 1, 24)); // NOI18N
        jLabel1.setText("Edit Instructor Details");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel3.setText("LecturerId");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setText("First Name");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel7.setText("Last Name");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel8.setText("Date of birth");
        jLabel8.setToolTipText("");

        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel10.setText("E mail");

        Insadress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsadressActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel11.setText("Address");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "LecId", "FirstName", "LastName", "DateOfBirth", "Email", "Adress"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Jupdatebtn.setText("Update");
        Jupdatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JupdatebtnActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel4.setText("Enter Value to search");

        jSearchfiled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchfiledActionPerformed(evt);
            }
        });
        jSearchfiled.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jSearchfiledKeyPressed(evt);
            }
        });

        jExit.setText("Exit");
        jExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jSearchfiled, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(FInsName, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(Insdob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(LInsName, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(InseMail, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(InsIdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Insadress, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(84, 84, 84)
                                        .addComponent(Jupdatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(405, 405, 405)
                        .addComponent(jExit, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InsIdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSearchfiled, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FInsName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LInsName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(Insdob, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(InseMail, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Insadress, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Jupdatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jExit, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InsadressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsadressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InsadressActionPerformed

    private void jSearchfiledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchfiledActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSearchfiledActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
                int rowIndex=jTable1.getSelectedRow();
        DefaultTableModel model1=(DefaultTableModel) jTable1.getModel();
        InsId=model1.getValueAt(rowIndex,0).toString();
        InsIdtxt.setText(model1.getValueAt(rowIndex,0).toString());
        FInsName.setText(model1.getValueAt(rowIndex,1).toString());
        LInsName.setText(model1.getValueAt(rowIndex,2).toString());
        InseMail.setText(model1.getValueAt(rowIndex,4).toString());
        Insadress.setText(model1.getValueAt(rowIndex,5).toString());
        
     
        Date bdate;
        try {
            bdate=new SimpleDateFormat("yyyy-MM-dd").parse(model1.getValueAt(rowIndex,3).toString());
            System.out.println(bdate);
            Insdob.setDate(bdate);           
              } catch (ParseException ex) {
            Logger.getLogger(ManageStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(InsId);
       
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void JupdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JupdatebtnActionPerformed
             try
       {
              InsId1=InsIdtxt.getText();
       InsFName1=FInsName.getText();
       InsLName1=LInsName.getText();
       

       Insdob.setDateFormatString("dd/MM/yyyy");
        java.util.Date Dob=Insdob.getDate();
       java.sql.Date sqlDate = new java.sql.Date(Dob.getTime());
       Inssdate1=sqlDate;
       
       InsEmail1=InseMail.getText();
       InsAdress1=Insadress.getText();
       

       }
       
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
       
       I1.InsUpdate();
      
       DefaultTableModel model2=(DefaultTableModel)jTable1.getModel();
       model2.setRowCount(0);
     
       I1.fillInsTable(jTable1,"");
       
       
    }//GEN-LAST:event_JupdatebtnActionPerformed

    private void jSearchfiledKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSearchfiledKeyPressed
        jTable1.setModel(new DefaultTableModel(null,new Object []{"InstructorId","FirstName","LastName","Date of birth", "Email", "Adress"}));
        I1.fillInsTable(jTable1,jSearchfiled.getText());
    }//GEN-LAST:event_jSearchfiledKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         I1.InsDelete();
        DefaultTableModel model3=(DefaultTableModel)jTable1.getModel();
       model3.setRowCount(0);

       I1.fillInsTable(jTable1,"");
   
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitActionPerformed
        close();
    }//GEN-LAST:event_jExitActionPerformed

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
            java.util.logging.Logger.getLogger(ManageInstructors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageInstructors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageInstructors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageInstructors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageInstructors().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FInsName;
    private javax.swing.JTextField InsIdtxt;
    private javax.swing.JTextField Insadress;
    private com.toedter.calendar.JDateChooser Insdob;
    private javax.swing.JTextField InseMail;
    private javax.swing.JButton Jupdatebtn;
    private javax.swing.JTextField LInsName;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jSearchfiled;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    private void SystemExit(){
        WindowEvent winClosing=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        
    }
    public void close(){
        WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
        
    }


}


