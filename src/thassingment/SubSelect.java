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
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

/**
 *
 * @author chamith
 */
public class SubSelect extends javax.swing.JFrame {

    /**
     * Creates new form SubSelect
     */
    static String cS1Sub1;
    static String cS1Sub2;
    static String cS1Sub3;
    static String cS1Sub4;
    
    ArrayList<String> items=new ArrayList<String>();
   DefaultListModel dlm = new DefaultListModel();
    
    public SubSelect() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Sem1SubList = new javax.swing.JList<>();
        Sem1SubList.setSelectionModel(new MySelectionModel(Sem1SubList, 4));
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Andika", 1, 24)); // NOI18N
        jLabel1.setText("Select subjects");

        Sem1SubList.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        Sem1SubList.setToolTipText("");
        jScrollPane1.setViewportView(Sem1SubList);

        jLabel2.setFont(new java.awt.Font("Andika", 0, 24)); // NOI18N
        jLabel2.setText("Select 4 Subjects  for Semester 1");

        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jButton2.setText("Back");

        jButton3.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jButton3.setText("Exit");

        jButton4.setText("Generate subjects");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(255, 255, 255)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(197, 197, 197)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(239, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void setlistCS(){
         Sem1SubList.setModel(dlm);
         dlm.addElement("Computer Architecture");
         dlm.addElement("Web Based Application Development");
         dlm.addElement("Object Oriented Programming with Java");
         dlm.addElement("Professional Development ");
         dlm.addElement("Data communications and networks");
         
    }
    
    
    public void setListIS(){
                 Sem1SubList.setModel(dlm);
         dlm.addElement("Computer Architecture");
         dlm.addElement("Web Based Application Development");
         dlm.addElement("Object Oriented Programming with Java");
         dlm.addElement("Professional Development ");
         dlm.addElement("Data communications and networks");
  
    }
    
    
        public void setlistHRM(){
         Sem1SubList.setModel(dlm);
         dlm.addElement("Management Process");
         dlm.addElement("Business Communication");
         dlm.addElement("Financial Accounting");
         dlm.addElement("Managerial Accounting");
         dlm.addElement("Buisness Environment");
         
    }

    private static class MySelectionModel extends DefaultListSelectionModel
            
{
    private javax.swing.JList Sem1SubList;
    private int maxCount;

    private MySelectionModel(javax.swing.JList Sem1SubList,int maxCount)
    {
        this.Sem1SubList = Sem1SubList;

        this.maxCount = maxCount;
    }

    @Override
    public void setSelectionInterval(int index0, int index1)
    {
        if (index1 - index0 >= maxCount)
        {
            index1 = index0 + maxCount - 1;
        }
        super.setSelectionInterval(index0, index1);
    }

    @Override
    public void addSelectionInterval(int index0, int index1)
    {
        int selectionLength = Sem1SubList.getSelectedIndices().length;
        if (selectionLength >= maxCount)
            return;

        if (index1 - index0 >= maxCount - selectionLength)
        {
            index1 = index0 + maxCount - 1 - selectionLength;
        }
        if (index1 < index0)
            return;
        super.addSelectionInterval(index0, index1);
    }
    
    
}
    

    /*PreparedStatement pst=null;
    ResultSet rs = null;
    Connection conn=null;
    
    
public void populateJList(JList Sem1SubList, String query, Connection conn) throws SQLException
{
    DefaultListModel model = new DefaultListModel(); //create a new list model

    Statement statement = conn.createStatement();
    ResultSet resultSet = statement.executeQuery(query); //run your query

    while (resultSet.next()) //go through each row that your query returns
    {
        String itemCode = resultSet.getString("item_code"); //get the element in column "item_code"
        model.addElement(itemCode); //add each item to the model
    }
    Sem1SubList.setModel(model);

    resultSet.close();
    statement.close();

}
    */
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        Object[] selected =Sem1SubList.getSelectedValues();

        String[] selectedItems = new String[selected.length];
        
        for(int i=0; i<selected.length;i++){
            selectedItems[i] = selected[i].toString();
    }
        
        cS1Sub1= selectedItems[0];
        cS1Sub2= selectedItems[1];
        cS1Sub3= selectedItems[2];
        cS1Sub4= selectedItems[3];
               
    }//GEN-LAST:event_jButton1ActionPerformed
   
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        //if(courseSelectM.underComCourse=="Bsc (Honurs) in Computer Science"){
        setlistCS();
        jButton4.setVisible(false);
       // }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(SubSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubSelect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Sem1SubList;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
