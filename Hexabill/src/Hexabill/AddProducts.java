package Hexabill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fatmicky
 * 
 * Developed By Mr PoPs 
 */
public class AddProducts extends javax.swing.JFrame {

    /** Creates new form AddProducts */
    public AddProducts() {
        initComponents();
        tableDisplay();
        taxListDisplay();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //JFileChooser fileChooser = new JFileChooser();

    }

    @SuppressWarnings("unchecked")
    
    
     Connection con1;
     PreparedStatement insert;
     
     
     private void taxListDisplay(){
         
         DefaultListModel Lmodel = new DefaultListModel();
        try {   
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/hexabilling","root","");
            insert = con1.prepareStatement("SELECT * FROM tax_classes");
            ResultSet rs = insert.executeQuery();
            while (rs.next()){
                String Tax = rs.getString("TAX_NAME");
                Lmodel.addElement(Tax); 
            }
            tax_list.setModel(Lmodel);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AddProducts.class.getName()).log(Level.SEVERE, null, ex);
        } 
     }
     
     
     private void tableDisplay(){
         
         int c;
         
          try {
            Class.forName("com.mysql.cj.jdbc.Driver");
    
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/hexabilling","root",""); 
            
            insert = con1.prepareStatement("SELECT * FROM add_products");
            
            ResultSet rs = insert.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            
            c = rsm.getColumnCount();
            DefaultTableModel DFT = (DefaultTableModel)jTable1.getModel();
           
            DFT.setRowCount(0);
            while(rs.next()){
                Vector v2 = new Vector();
                
                for(int a=1;a<=c;a++){
                    v2.add(rs.getString("id"));
                    v2.add(rs.getString("product_ID"));
                    v2.add(rs.getString("product_Name"));
                    v2.add(rs.getString("Price"));
                    v2.add(rs.getString("Qty"));
                    v2.add(rs.getString("barcode_Value"));
                }
                
                DFT.addRow(v2);
            }
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AddProducts.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pPrice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pQty = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pBarcode = new javax.swing.JTextField();
        pID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Addbtn = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        Deletebtn = new javax.swing.JButton();
        Editbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bulk_import = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        c_search_tbl = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        pID1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pID2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tax_list = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Item Name");

        pName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pNameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Item Price");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Item Qty");

        pQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pQtyActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Barcode value");

        pID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pIDActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Item ID");

        Addbtn.setText("Add Data");
        Addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbtnActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.setMaximumSize(new java.awt.Dimension(102, 29));
        btnClear.setMinimumSize(new java.awt.Dimension(102, 29));
        btnClear.setPreferredSize(new java.awt.Dimension(102, 29));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        Deletebtn.setText("Delete");
        Deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletebtnActionPerformed(evt);
            }
        });

        Editbtn.setText("Edit");
        Editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditbtnActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Item ID", "Item Name", "Item Price", "Item Qty", "Barcode Value"
            }
        ));
        jTable1.setRowHeight(32);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        bulk_import.setText("Import Data");
        bulk_import.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bulk_importActionPerformed(evt);
            }
        });

        jButton2.setText("View Stock");
        jButton2.setPreferredSize(new java.awt.Dimension(90, 29));

        c_search_tbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        c_search_tbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_search_tblActionPerformed(evt);
            }
        });
        c_search_tbl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                c_search_tblKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Search :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Unit");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Category");

        pID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pID1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Print Name");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("Tax Classes");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Merchant Name");

        pID2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pID2ActionPerformed(evt);
            }
        });

        tax_list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(tax_list);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pID, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pName, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pQty, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pID1)
                    .addComponent(jComboBox1, 0, 203, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(c_search_tbl, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Editbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bulk_import, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pID2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(pID, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pID2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(Editbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(Addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bulk_import, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(c_search_tbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(pName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(pPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel9)
                                .addComponent(pID1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pQty, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(pBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        
        pID.setText("");
        pName.setText("");
        pPrice.setText("");
        pQty.setText("");
        pBarcode.setText("");
        pID.requestFocus();
        
    }//GEN-LAST:event_btnClearActionPerformed

    private void AddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbtnActionPerformed

        
        String pid = pID.getText();
        String pname = pName.getText();
        String pprice = pPrice.getText();
        String pqty = pQty.getText();
        String pbarcode = pBarcode.getText();
        
        if(pID.getText().equals("")&&pName.getText().equals("")&&pPrice.getText().equals("")&&
                pQty.getText().equals("")&&pBarcode.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please fill the All fields ....");
        } else{
        
            try {
            Class.forName("com.mysql.cj.jdbc.Driver");
    
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/hexabilling","root",""); 
            
            insert = con1.prepareStatement("INSERT INTO add_products (product_ID, product_Name, Price, Qty, barcode_Value) VALUES (?, ?, ?, ?, ?)");
            insert.setString(1, pid);
            insert.setString(2, pname);
            insert.setString(3, pprice);
            insert.setString(4, pqty);
            insert.setString(5, pbarcode);
            insert.executeUpdate();
            
            
            pID.setText("");
            pName.setText("");
            pPrice.setText("");
            pQty.setText("");
            pBarcode.setText("");
            pID.requestFocus();
            
            
            tableDisplay();
            
            JOptionPane.showMessageDialog(this,"Prouduct Added Successfuly");
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AddProducts.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
        }
    }//GEN-LAST:event_AddbtnActionPerformed

    private void DeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletebtnActionPerformed
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
            
            
            pID.setText("");
            pName.setText("");
            pPrice.setText("");
            pQty.setText("");
            pBarcode.setText("");
            pID.requestFocus();
                
            }
            
            //tableDisplay();
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AddProducts.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_DeletebtnActionPerformed

    private void EditbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditbtnActionPerformed
            // TODO add your handling code here:
            
        DefaultTableModel DFT = (DefaultTableModel)jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();   
        
        
         try {
             
            int id = Integer.parseInt(DFT.getValueAt(selectedIndex,0).toString());
             
            String pid = pID.getText();
            String pname = pName.getText();
            String pprice = pPrice.getText();
            String pqty = pQty.getText();
            String pbarcode = pBarcode.getText();
            
             
            Class.forName("com.mysql.cj.jdbc.Driver");
    
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/hexabilling","root",""); 
            
            //(product_ID ,product_Name,Price ,Qty ,barcode_Value )
            
            insert = con1.prepareStatement(" UPDATE add_products SET product_ID=?,product_Name=?,Price=?,Qty=?,barcode_Value=? WHERE id=? ");
            insert.setString(1, pid);
            insert.setString(2, pname);
            insert.setString(3, pprice);
            insert.setString(4, pqty);
            insert.setString(5, pbarcode);
            insert.setInt(6, id);
           
            insert.executeUpdate();
            
            
            pID.setText("");
            pName.setText("");
            pPrice.setText("");
            pQty.setText("");
            pBarcode.setText("");
            pID.requestFocus();
            
            
            tableDisplay();
            
            JOptionPane.showMessageDialog(this,"Prouduct Updated Successfuly");
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AddProducts.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_EditbtnActionPerformed

       
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        
         DefaultTableModel DFT = (DefaultTableModel)jTable1.getModel();
         int selectedIndex = jTable1.getSelectedRow();
         
          pID.setText(DFT.getValueAt(selectedIndex,1).toString());
          pName.setText(DFT.getValueAt(selectedIndex,2).toString());
          pPrice.setText(DFT.getValueAt(selectedIndex,3).toString());
          pQty.setText(DFT.getValueAt(selectedIndex,4).toString());
          pBarcode.setText(DFT.getValueAt(selectedIndex,5).toString());
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void pIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pIDActionPerformed

    private void pNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pNameActionPerformed

    private void pQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pQtyActionPerformed

    private void bulk_importActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bulk_importActionPerformed
        // TODO add your handling code here
   
    }//GEN-LAST:event_bulk_importActionPerformed

    private void c_search_tblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_search_tblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_search_tblActionPerformed

    private void c_search_tblKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c_search_tblKeyReleased

        String name = c_search_tbl.getText();
        try {

            DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
            dt.setRowCount(0);
          //  Statement s = db.mycon().createStatement();
            
            Class.forName("com.mysql.cj.jdbc.Driver");
    
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/hexabilling","root",""); 
            
             insert = con1.prepareStatement("SELECT * FROM add_products WHERE product_Name LIKE '%"+name+"%' ");
             ResultSet rs = insert.executeQuery();
           // ResultSet rs = executeQuery("SELECT * FROM product WHERE Product_Name LIKE '%"+name+"%' ");

            while (rs.next()) {
                Vector v = new Vector();

                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                v.add(rs.getString(6));

                dt.addRow(v);

            }

        } catch (Exception e) {
            tableDisplay();

        }

    }//GEN-LAST:event_c_search_tblKeyReleased

    private void pID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pID1ActionPerformed

    private void pID2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pID2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pID2ActionPerformed
                        
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
            java.util.logging.Logger.getLogger(AddProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AddProducts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbtn;
    private javax.swing.JButton Deletebtn;
    private javax.swing.JButton Editbtn;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton bulk_import;
    private javax.swing.JTextField c_search_tbl;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField pBarcode;
    private javax.swing.JTextField pID;
    private javax.swing.JTextField pID1;
    private javax.swing.JTextField pID2;
    private javax.swing.JTextField pName;
    private javax.swing.JTextField pPrice;
    private javax.swing.JTextField pQty;
    private javax.swing.JList<String> tax_list;
    // End of variables declaration//GEN-END:variables

}
