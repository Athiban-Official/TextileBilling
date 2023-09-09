/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Hexabill;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fatmicky
 */
public class Tax_Classes extends javax.swing.JFrame {

    /**
     * Creates new form Tax_Classes
     */
    public Tax_Classes() {
        initComponents();
        sysTime();
        tableDisplay();
    }
    
    private void sysTime(){
      
       
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
        jLabel2 = new javax.swing.JLabel();
        tax_id = new javax.swing.JTextField();
        tax_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rate_percent = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tbl_search = new javax.swing.JTextField();
        date_lable = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tax Classes");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tax ID");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tax Name");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Rate Percent");

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        saveBtn.setText("Save");

        addBtn.setText("Add New");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TAX ID", "TAX NAME", "RATE PERCENT"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        tbl_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbl_searchKeyReleased(evt);
            }
        });

        date_lable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date_lable.setText("date");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Total Tax Class Found :");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tax_id, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(tax_name)
                    .addComponent(rate_percent))
                .addGap(305, 305, 305)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tbl_search, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(129, 129, 129))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1171, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(392, 392, 392)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(date_lable, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tax_id, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tax_name, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rate_percent, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tbl_search, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date_lable)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(9, 9, 9))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    Connection con1;
    PreparedStatement insert;
    
    private void tableDisplay(){
        
         int c;
         
          try {
            Class.forName("com.mysql.cj.jdbc.Driver");
    
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/hexabilling","root",""); 
            
            insert = con1.prepareStatement("SELECT * FROM tax_classes");
            
            ResultSet rs = insert.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            
            c = rsm.getColumnCount();
            DefaultTableModel DFT = (DefaultTableModel)jTable1.getModel();
           
            DFT.setRowCount(0);
            while(rs.next()){
                Vector v2 = new Vector();
                
                for(int a=1;a<=c;a++){
                    v2.add(rs.getInt("TAX_ID"));
                    v2.add(rs.getString("TAX_NAME"));
                    v2.add(rs.getFloat("RATE_OF_PERCENT"));
              
                }
                
                DFT.addRow(v2);
            }
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AddProducts.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    private void addButton(){
        
        int tax_ID = Integer.parseInt(tax_id.getText());
        String tax_Name = tax_name.getText();
        float rate_of_percent = Float.parseFloat(rate_percent.getText());
        
        
        if(tax_id.getText().equals("")&&tax_name.getText().equals("")&&rate_percent.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please fill the All fields ....");
        } else{
        
            try {
            Class.forName("com.mysql.cj.jdbc.Driver");
    
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/hexabilling","root",""); 
            
            insert = con1.prepareStatement("INSERT INTO tax_classes (TAX_ID, TAX_NAME, RATE_OF_PERCENT) VALUES (?, ?, ?)");
            insert.setInt(1, tax_ID);
            insert.setString(2, tax_Name);
            insert.setFloat(3,rate_of_percent);
            insert.executeUpdate();
            
            
            tax_id.setText("");
            tax_name.setText("");
            //rate_of_percent.setText("");
            tableDisplay();
            
            JOptionPane.showMessageDialog(this,"Prouduct Added Successfuly");
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AddProducts.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
        }
    }
    
    
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        
        addButton();
        
    }//GEN-LAST:event_addBtnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
         DefaultTableModel DFT = (DefaultTableModel)jTable1.getModel();
         int selectedIndex = jTable1.getSelectedRow();
         
          tax_id.setText(DFT.getValueAt(selectedIndex,0).toString());
          tax_name.setText(DFT.getValueAt(selectedIndex,1).toString());
          rate_percent.setText(DFT.getValueAt(selectedIndex,2).toString());
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel DFT = (DefaultTableModel) jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();   

        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to edit.");
            return;
        }

        try {
            int tax_ID = Integer.parseInt(tax_id.getText());
            String tax_Name = tax_name.getText();
            float rate_of_percent = Float.parseFloat(rate_percent.getText());

            Class.forName("com.mysql.cj.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/hexabilling","root",""); 

            // Using a PreparedStatement
            String sql = "UPDATE tax_classes SET TAX_ID=?, TAX_NAME=?, RATE_OF_PERCENT=? WHERE TAX_ID=?";
            insert = con1.prepareStatement(sql);
            insert.setInt(1, tax_ID);
            insert.setString(2, tax_Name);
            insert.setFloat(3, rate_of_percent);
            insert.setInt(4, tax_ID); // Assuming the 4th parameter is the tax_ID you want to update

            int rowsAffected = insert.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Tax Class Updated Successfully");
                tax_id.setText("");
                tax_name.setText("");
                rate_percent.setText("");
                tableDisplay();
            } else {
                JOptionPane.showMessageDialog(this, "No record updated. Please check the tax ID.");
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numerical values for Tax ID and Rate Percent.");
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace(); // Print the stack trace for debugging
            JOptionPane.showMessageDialog(this, "An error occurred while updating the tax class.");
        } finally {
            try {
                if (con1 != null) con1.close();
                if (insert != null) insert.close();
            } catch (SQLException e) {
                e.printStackTrace(); // Print the stack trace for debugging
            }
        }
        
    }//GEN-LAST:event_editBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel DFT = (DefaultTableModel)jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();   
        
        try {
             
            int id = Integer.parseInt(DFT.getValueAt(selectedIndex,0).toString());
            
            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want Delete the Record !!","Warning",JOptionPane.YES_NO_OPTION);
            if(dialogResult == JOptionPane.YES_OPTION){
                
                
            Class.forName("com.mysql.cj.jdbc.Driver");
    
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/hexabilling","root",""); 
            
            
            
            insert = con1.prepareStatement(" DELETE FROM add_products WHERE id=? ");
            insert.setInt(1, id);
           
            insert.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"Recored Deleted..");
             tableDisplay();
            
            
            tax_id.setText("");
            tax_name.setText("");
            rate_percent.setText("");
                
            }
            
            //tableDisplay();
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AddProducts.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void tbl_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_searchKeyReleased
        // TODO add your handling code here:
        
                String name = tbl_search.getText();
        try {

            DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
            dt.setRowCount(0);
          //  Statement s = db.mycon().createStatement();
            
            Class.forName("com.mysql.cj.jdbc.Driver");
    
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/hexabilling","root",""); 
            
             insert = con1.prepareStatement("SELECT * FROM tax_classes WHERE TAX_NAME LIKE '%"+name+"%' ");
             ResultSet rs = insert.executeQuery();
           // ResultSet rs = executeQuery("SELECT * FROM product WHERE Product_Name LIKE '%"+name+"%' ");

            while (rs.next()) {
                Vector v = new Vector();

                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                dt.addRow(v);

            }

        } catch (Exception e) {
            tableDisplay();

        }
        
        search_TID();
        
    }//GEN-LAST:event_tbl_searchKeyReleased

    
    private void search_TID(){
        
        String name = tbl_search.getText();
        try {

            DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
            dt.setRowCount(0);
          //  Statement s = db.mycon().createStatement();
            
            Class.forName("com.mysql.cj.jdbc.Driver");
    
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/hexabilling","root",""); 
            
             insert = con1.prepareStatement("SELECT * FROM tax_classes WHERE TAX_ID LIKE '%"+name+"%' ");
             ResultSet rs = insert.executeQuery();
           // ResultSet rs = executeQuery("SELECT * FROM product WHERE Product_Name LIKE '%"+name+"%' ");

            while (rs.next()) {
                Vector v = new Vector();

                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                dt.addRow(v);

            }

        } catch (Exception e) {
            tableDisplay();

        }
        
    }
    
    
    
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
            java.util.logging.Logger.getLogger(Tax_Classes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tax_Classes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tax_Classes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tax_Classes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tax_Classes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel date_lable;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField rate_percent;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField tax_id;
    private javax.swing.JTextField tax_name;
    private javax.swing.JTextField tbl_search;
    // End of variables declaration//GEN-END:variables
}
