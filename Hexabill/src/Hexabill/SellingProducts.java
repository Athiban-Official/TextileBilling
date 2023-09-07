/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Hexabill;

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Fatmicky
 */
public class SellingProducts extends javax.swing.JFrame {

    /**
     * Creates new form SellingProducts
     */
    public SellingProducts() {
        initComponents();
        KeyBordShortCut();
        Merchant_nameDisplay();
       // this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        txtBarcode_val.setEditable(true);
        txtProductID.setEditable(false);
        txtProductName.setEditable(false);
        txtQty.setEditable(true);
        txtBarcode_val.requestFocus(); 
    }
    
    Connection con;
    PreparedStatement ps;
    DefaultTableModel model;
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtBarcode_val = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtProductID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        txtRate = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Merchant_name = new javax.swing.JLabel();
        customer_name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtTOT = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        qtyTXT = new javax.swing.JLabel();
        amtTXT = new javax.swing.JLabel();
        Discount = new javax.swing.JLabel();
        Round_off = new javax.swing.JLabel();
        netamtTXT = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bill = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Product ID");

        txtBarcode_val.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBarcode_valActionPerformed(evt);
            }
        });
        txtBarcode_val.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBarcode_valKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Product Name");

        txtProductID.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Qty");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Rate");

        txtRate.setEditable(false);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Barcode Value");

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Barcode", "Product ID", "Product Name", "Price", "Qty", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(35);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        Merchant_name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Merchant_name.setForeground(new java.awt.Color(255, 255, 255));
        Merchant_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Merchant_name.setText("Merchant name ");
        Merchant_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Customer Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(457, 457, 457)
                        .addComponent(Merchant_name, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBarcode_val, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtRate, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(customer_name, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Merchant_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(customer_name, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBarcode_val, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("Total Amount ");

        txtTOT.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        txtTOT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTOT.setText("0.0 Rs");

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Qty");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Amount");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Discount");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Round Off");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Product Net Amount");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        qtyTXT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        qtyTXT.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        qtyTXT.setText("0.0");

        amtTXT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        amtTXT.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        amtTXT.setText("0.0");

        Discount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Discount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Discount.setText("0.0");

        Round_off.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Round_off.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Round_off.setText("0.0");

        netamtTXT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        netamtTXT.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        netamtTXT.setText("0.0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amtTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtyTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Discount, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Round_off, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(netamtTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(qtyTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amtTXT)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Discount)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Round_off)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(netamtTXT)
                    .addComponent(jLabel13))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        bill.setColumns(20);
        bill.setRows(5);
        jScrollPane1.setViewportView(bill);

        jPanel5.setBackground(new java.awt.Color(0, 51, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1475, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(476, 476, 476)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTOT, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTOT)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 51, 204));

        btnAdd.setBackground(new java.awt.Color(0, 102, 255));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add Item");
        btnAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(0, 102, 255));
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit Item");
        btnEdit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(0, 102, 255));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete Item");
        btnDelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(0, 102, 255));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(0, 102, 255));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnPrint.setBackground(new java.awt.Color(0, 102, 255));
        btnPrint.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(255, 255, 255));
        btnPrint.setText("Print");
        btnPrint.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void performAddAction(){
        
            String barcode = txtBarcode_val.getText();
            String productID = txtProductID.getText();
            String productName = txtProductName.getText();
            float productPrice = Float.parseFloat(txtRate.getText());
            int productQty = Integer.parseInt(txtQty.getText());
            float tot = productQty * productPrice;

            model = (DefaultTableModel) jTable1.getModel();
            
            int rowIndex = findProductRowIndex(productID);
            if (rowIndex != -1) {
                // If the product exists, update its quantity and total
                int existingQty = (int) model.getValueAt(rowIndex, 4);
                int newQty = existingQty + productQty;
                model.setValueAt(newQty, rowIndex, 4);
                float newTotal = newQty * productPrice;
                model.setValueAt(newTotal, rowIndex, 5);
            }else{
                
                 model.addRow(new Object[]{
                    barcode,
                    productID,
                    productName,
                    productPrice,
                    productQty,
                    tot
                });
                
            }
            
        float sum = 0;

        for (int i = 0; i < model.getRowCount(); i++) {
            sum = sum + Float.parseFloat(model.getValueAt(i, 5).toString());
        }
        
        int totalQuantity = 0;
        for (int i = 0; i < model.getRowCount(); i++) {
            totalQuantity += (int) model.getValueAt(i, 4);
        }
        qtyTXT.setText(totalQuantity +"Pcs");
        
        //txtTotalSum.setText(Float.toString(sum)+" "+"Rs");
        txtTOT.setText(Float.toString(sum)+" "+"Rs");
        amtTXT.setText(Float.toString(sum)+" "+"Rs");
        netamtTXT.setText(Float.toString(sum)+" "+"Rs");
        
        txtBarcode_val.setText("");
        txtProductID.setText("");
        txtProductName.setText("");
        txtQty.setText("");
        txtRate.setText("");

        txtBarcode_val.requestFocus();
    }
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
           
            performAddAction();
    }//GEN-LAST:event_btnAddActionPerformed
    
    private int findProductRowIndex(String productID) {
    for (int i = 0; i < model.getRowCount(); i++) {
        String existingProductID = (String) model.getValueAt(i, 1);
        if (existingProductID.equals(productID)) {
            return i;
        }
    }
    return -1; // Product not found
    }    
    
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
      
        txtBarcode_val.setText("");
        txtProductID.setText("");
        txtProductName.setText("");
        txtQty.setText("");
        txtRate.setText("");
        txtBarcode_val.requestFocus();
        
    }//GEN-LAST:event_btnClearActionPerformed

    private void Merchant_nameDisplay(){
        
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/hexabilling", "root", "");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT Merchant_Name FROM pos_metchant_name WHERE id = 1");

            if (resultSet.next()) {
                String merchantName = resultSet.getString("Merchant_Name");
                Merchant_name.setText(merchantName);
            } else {
                Merchant_name.setText("Merchant Name not found");
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            Merchant_name.setText("Error retrieving merchant name");
        }
        
    }
    
    private void txtBarcode_valKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBarcode_valKeyReleased
        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/hexabilling","root",""); 
            String id = txtBarcode_val.getText();
            
            ps = con.prepareStatement("SELECT id, product_ID, product_Name, Price, Qty, barcode_Value FROM add_products WHERE barcode_Value = ?");
            ps.setString(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()==true){
                
                String product_id = rs.getString(2);
                String product_name = rs.getString(3);
                String product_rate = rs.getString(4);
                
                txtProductID.setText(product_id);
                txtProductName.setText(product_name);
                txtRate.setText(product_rate);
                txtQty.requestFocus();
                
            }else {
                
                txtProductID.setText("");
                txtProductName.setText("");
                txtRate.setText(""); 
            }
             
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SellingProducts.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }//GEN-LAST:event_txtBarcode_valKeyReleased

    
    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        
        try {
            salesReport();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SellingProducts.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SellingProducts.class.getName()).log(Level.SEVERE, null, ex);
        }
        bill_print();
        
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
          
        String barcode = txtBarcode_val.getText();
        String productID = txtProductID.getText();
        String productName = txtProductName.getText();
        float productPrice = Float.parseFloat(txtRate.getText());
        int productQty = Integer.parseInt(txtQty.getText());
        float tot = productQty * productPrice;
        
     
        model.removeRow(jTable1.getSelectedRow());

        model = (DefaultTableModel) jTable1.getModel();

        model.addRow(new Object[]{
                barcode,
                productID,
                productName,
                productPrice,
                productQty,
                tot
            });
         
        float sum = 0;

        for (int i = 0; i < model.getRowCount(); i++) {
            sum = sum + Float.parseFloat(model.getValueAt(i, 5).toString());
        }
        
        int totalQuantity = 0;
        for (int i = 0; i < model.getRowCount(); i++) {
            totalQuantity += (int) model.getValueAt(i, 4);
        }
        qtyTXT.setText(totalQuantity +"Pcs");
        
        //txtTotalSum.setText(Float.toString(sum)+" "+"Rs");
        txtTOT.setText(Float.toString(sum)+" "+"Rs");
        amtTXT.setText(Float.toString(sum)+" "+"Rs");
        netamtTXT.setText(Float.toString(sum)+" "+"Rs");
        
        txtBarcode_val.setEditable(true);
        txtProductID.setEditable(false);
        txtProductName.setEditable(false);
        txtQty.setEditable(true);

        txtBarcode_val.setText("");
        txtProductID.setText("");
        txtProductName.setText("");
        txtQty.setText("");
        txtRate.setText("");
        txtBarcode_val.requestFocus();
        
        JOptionPane.showMessageDialog(this,"Prouduct Updated Successfuly");    
    }//GEN-LAST:event_btnEditActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
         DefaultTableModel DFT = (DefaultTableModel)jTable1.getModel();
         int selectedIndex = jTable1.getSelectedRow();
         
          txtBarcode_val.setText(DFT.getValueAt(selectedIndex,0).toString());
          txtProductID.setText(DFT.getValueAt(selectedIndex,1).toString());
          txtProductName.setText(DFT.getValueAt(selectedIndex,2).toString());
          txtRate.setText(DFT.getValueAt(selectedIndex,3).toString());
         //txtQty.setText(DFT.getValueAt(selectedIndex,4).toString());
          
          txtBarcode_val.setEditable(false);
          txtProductID.setEditable(false);
          txtProductName.setEditable(false);
          txtQty.setEditable(true);
          txtQty.requestFocus();
        

    }//GEN-LAST:event_jTable1MouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
       /* DefaultTableModel DFT = (DefaultTableModel)jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();   
        
        try {
             
            int id = Integer.parseInt(DFT.getValueAt(selectedIndex,0).toString());
            
            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want Delete the Record !!","Warning",JOptionPane.YES_NO_OPTION);
            if(dialogResult == JOptionPane.YES_OPTION){
                
                
            Class.forName("com.mysql.cj.jdbc.Driver");
    
            con = DriverManager.getConnection("jdbc:mysql://localhost/hexabill","root",""); 
                        
            ps = con.prepareStatement(" DELETE FROM add_products WHERE id=? ");
          /*  insert.setString(1, pid);
            insert.setString(2, pname);
            insert.setString(3, pprice);
            insert.setString(4, pqty);
            insert.setString(5, pbarcode);
            ps.setInt(1, id);
           
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"Recored Deleted..");
             //tableDisplay();
            
            
            txtProductID.setText("");
            txtProductName.setText("");
            txtRate.setText("");
            txtQty.setText("");
            txtBarcode_val.setText("");
            txtBarcode_val.requestFocus();
                
                
            }
            //tableDisplay();
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AddProducts.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        */
       
      /* DefaultTableModel DFT = (DefaultTableModel)jTable1.getModel();
       
       if(jTable1.getSelectedRowCount()==1){
           
           DFT.removeRow(jTable1.getSelectedRow());
           txtProductID.setText("");
           txtProductName.setText("");
           txtRate.setText("");
           txtQty.setText("");
           txtBarcode_val.setText("");
       }*/
      
      
      
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow != -1) {
            // Get the value of the deleted row's total and subtract it from the sum
            float deletedRowTotal = Float.parseFloat(model.getValueAt(selectedRow, 5).toString());
            float currentSum = Float.parseFloat(txtTOT.getText().replace(" Rs", ""));
            float newSum = currentSum - deletedRowTotal;
            

            // Update the sum in the GUI
            txtTOT.setText(Float.toString(newSum) + " Rs");
            amtTXT.setText(Float.toString(newSum)+" "+"Rs");
            netamtTXT.setText(Float.toString(newSum)+" "+"Rs");

            // Remove the selected row from the table
            model.removeRow(selectedRow);
            
            int totalQuantity = 0;
            for (int i = 0; i < model.getRowCount(); i++) {
                totalQuantity += (int) model.getValueAt(i, 4);
            }
            qtyTXT.setText(totalQuantity +"Pcs");

            // Clear the text fields
            txtProductID.setText("");
            txtProductName.setText("");
            txtRate.setText("");
            txtQty.setText("");
            txtBarcode_val.setText("");
            txtBarcode_val.requestFocus();
            
            txtBarcode_val.setEditable(true);
            txtProductID.setEditable(false);
            txtProductName.setEditable(false);
            txtQty.setEditable(true);
        }
      
      
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtBarcode_valActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBarcode_valActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBarcode_valActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            /* try {
            // TODO add your handling code here:
            
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/hexabill","root","");
            for (int row = 0; row < model.getRowCount(); row++){
            String name = (String) model.getValueAt(row, 2);
            int quantity = (int) model.getValueAt(row, 4);
            float price = (float) model.getValueAt(row, 5);
            
            ps = con.prepareStatement("INSERT INTO test_bill(PRODUCT_NAME,PRODUCT_QTY,PRODUCT_AMT)VALUES(?,?,?)");
            ps.setString(1, name);
            ps.setInt(2, quantity);
            ps.setFloat(3, price);
            ps.executeUpdate();
            }
            JOptionPane.showMessageDialog(this,"Billing Table Addded");
            } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SellingProducts.class.getName()).log(Level.SEVERE, null, ex);
            }*/
            
            
        salesReport();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(SellingProducts.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(SellingProducts.class.getName()).log(Level.SEVERE, null, ex);
            }
        BtnSaveBill();
       
       model.setRowCount(0);
    }//GEN-LAST:event_btnSaveActionPerformed

     public void bill_print(){
 
        try {
            bill.setText("                        HexaBill Software solutions \n");
            bill.setText(bill.getText() + "\t16 V1, Asariyar street , \n");
            bill.setText(bill.getText() + "\tTamilNadu, India, \n");
            bill.setText(bill.getText() + "\t+91 95xxxxxxxx, \n");
            bill.setText(bill.getText() + "----------------------------------------------------------------\n");
            bill.setText(bill.getText() + " ProductName \tQty \tPrice \n");
            bill.setText(bill.getText() + "----------------------------------------------------------------\n");
            
            DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                
                String name = df.getValueAt(i, 2).toString();
                String qt = df.getValueAt(i, 4).toString();
                String prc = df.getValueAt(i, 5).toString();
                
                bill.setText(bill.getText() + name+"\t"+qt+"\t"+prc+" \n");
                
            }
            bill.setText(bill.getText() + "----------------------------------------------------------------\n");
            bill.setText(bill.getText() + "SubTotal :\t"+txtTOT.getText()+"\n");
            bill.setText(bill.getText() + "====================================\n");
            bill.setText(bill.getText() +"                     Thanks For Your Business...!"+"\n");
            bill.setText(bill.getText() + "----------------------------------------------------------------\n");
            bill.setText(bill.getText() +"                     Software by HexaBill"+"\n");
            
            
            bill.print();
            
        } catch (PrinterException ex) {
            
            Logger.getLogger(SellingProducts.class.getName()).log(Level.SEVERE, null, ex);
        }
 
 }

    public static void main(String args[]) {
         
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SellingProducts().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Discount;
    private javax.swing.JLabel Merchant_name;
    private javax.swing.JLabel Round_off;
    private javax.swing.JLabel amtTXT;
    private javax.swing.JTextArea bill;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnSave;
    private javax.swing.JTextField customer_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel netamtTXT;
    private javax.swing.JLabel qtyTXT;
    private javax.swing.JTextField txtBarcode_val;
    private javax.swing.JTextField txtProductID;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtRate;
    private javax.swing.JLabel txtTOT;
    // End of variables declaration//GEN-END:variables
        
    private void KeyBordShortCut() {
        
        KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        manager.addKeyEventDispatcher(new KeyEventDispatcher() {
            @Override
            public boolean dispatchKeyEvent(KeyEvent e) {
                if (e.getID() == KeyEvent.KEY_PRESSED && e.isControlDown() && e.getKeyCode() == KeyEvent.VK_A) {
                   performAddAction();
                   return true;
                }
                return false;
            }
        });
        manager.addKeyEventDispatcher(new KeyEventDispatcher() {
            @Override
            public boolean dispatchKeyEvent(KeyEvent e) {
                if (e.getID() == KeyEvent.KEY_PRESSED && e.isControlDown() && e.getKeyCode() == KeyEvent.VK_P) {
                   bill_print();
                   return true;
                }
                return false;
            }
        });
       manager.addKeyEventDispatcher(new KeyEventDispatcher() {
            @Override
            public boolean dispatchKeyEvent(KeyEvent e) {
                if (e.getID() == KeyEvent.KEY_PRESSED && e.isControlDown()&& e.isAltDown() && e.getKeyCode() == KeyEvent.VK_S ) {
                   BtnSaveBill();
                   return true;
                }
                return false;
            }
        });
       
       manager.addKeyEventDispatcher(new KeyEventDispatcher() {
            @Override
            public boolean dispatchKeyEvent(KeyEvent e) {
                if (e.getID() == KeyEvent.KEY_PRESSED && e.isControlDown()&& e.isShiftDown() && e.getKeyCode() == KeyEvent.VK_S ) {
                   SelectProducts();
                   return true;
                }
                return false;
            }
        });
    }
    
    private int billCounter = 1; 
    private void BtnSaveBill(){
        try {
        // Generate a unique bill number
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String billNumber = generateUniqueBillNumber();
        PreparedStatement billNumberStatement = con.prepareStatement("INSERT INTO bill_number (bill_number) VALUES (?)", Statement.RETURN_GENERATED_KEYS);
        billNumberStatement.setString(1, billNumber);
        billNumberStatement.executeUpdate();
        
        ResultSet generatedKeys = billNumberStatement.getGeneratedKeys();
        int billId = -1;
        if (generatedKeys.next()) {
                billId = generatedKeys.getInt(1);
            }
        if (billId != -1) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/hexabilling", "root", "");
            for (int row = 0; row < model.getRowCount(); row++) {
                String name = (String) model.getValueAt(row, 2);
                int quantity = (int) model.getValueAt(row, 4);
                float price = (float) model.getValueAt(row, 5);
                ps = con.prepareStatement("INSERT INTO billing_products(BILL_ID, PRODUCT_NAME, PRODUCT_QTY, PRODUCT_AMT) VALUES(?,?,?,?)");
                ps.setInt(1,billId);
                //ps.setString(1, billNumber);
                ps.setString(2, name);
                ps.setInt(3, quantity);
                ps.setFloat(4, price);
                ps.executeUpdate();
            }

            JOptionPane.showMessageDialog(this, "Billing Table Added with Bill Number: " + billNumber);  
        }   
    } catch (ClassNotFoundException | SQLException ex) {
        Logger.getLogger(SellingProducts.class.getName()).log(Level.SEVERE, null, ex);
    }
}

private String generateUniqueBillNumber() {
    String formattedCounter = String.format("%d", billCounter);
    // Increment the bill counter for the next bill
    billCounter++;
    
    return "BILL-" + formattedCounter;
}

private void SelectProducts(){
    
     String billNumber =JOptionPane.showInputDialog("Enter Bill Number:");
     if (billNumber != null) {
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                   model.setRowCount(0); // Clear existing data from the table
    
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/hexabilling", "root", "");

                PreparedStatement ps = con.prepareStatement(
                    "SELECT * FROM billing_products WHERE BILL_ID IN (SELECT bill_id FROM bill_number WHERE bill_number = ?)"
                );
                ps.setString(1, billNumber);

                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    int billId = rs.getInt("BILL_ID");
                    String productName = rs.getString("PRODUCT_NAME");
                    int productQty = rs.getInt("PRODUCT_QTY");
                    float productAmt = rs.getFloat("PRODUCT_AMT");
                    
                    
                    
                    

                    model.addRow(new Object[]{billId, productName, productQty, productAmt});
                }

                con.close();
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(SellingProducts.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
}
   /*
        private void InvoiceTable(){
            
         try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/hexabilling", "root", "");
                for (int row = 0; row < model.getRowCount(); row++) {
                    String name = (String) model.getValueAt(row, 2);
                    int quantity = (int) model.getValueAt(row, 4);
                    float price = (float) model.getValueAt(row, 5);
                    ps = con.prepareStatement("INSERT INTO billing_products(BILL_ID, PRODUCT_NAME, PRODUCT_QTY, PRODUCT_AMT) VALUES(?,?,?,?)");
                    ps.setString(2, name);
                    ps.setInt(3, quantity);
                    ps.setFloat(4, price);
                    ps.executeUpdate();
                }

            JOptionPane.showMessageDialog(this, "Billing Table Added with Bill Number: ");  
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AddProducts.class.getName()).log(Level.SEVERE, null, ex);
        }
           

        }*/

        private void salesReport() throws ClassNotFoundException, SQLException{
            
            String billNumber = generateUniqueBillNumber();
            String Customer_name = customer_name.getText();
            String qty_txt = qtyTXT.getText();
            float amt_TXT = Float.parseFloat(amtTXT.getText());
            float discount = Float.parseFloat(Discount.getText());
            int round_off = Integer.parseInt(Round_off.getText());
            float netamt_TXT = Float.parseFloat(netamtTXT.getText());
            
            String sql = "INSERT INTO sales_report (bill_number, bill_date, customer_name, Qty, amount, discount, round_off, net_amt) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(sql);

            // Set values for other fields
            pstmt.setString(1, billNumber);
            
            // Set the current date for the bill_date field
            pstmt.setDate(2, java.sql.Date.valueOf(LocalDate.now()));
            
            pstmt.setString(3, Customer_name);
            pstmt.setString(4, qty_txt);
            pstmt.setFloat(5, amt_TXT);
            pstmt.setFloat(6, discount);
            pstmt.setInt(7, round_off);
            pstmt.setFloat(8, netamt_TXT);

            pstmt.executeUpdate();
            System.out.println("Record inserted successfully!");
      
        }
}
