/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIAssignment2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author dillon
 */
public class PurchasedCars extends javax.swing.JFrame {

    /**
     * Creates new form PurchasedCars
     */
    public PurchasedCars() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        edit = new javax.swing.JPanel();
        SearchBTN = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        colourbox = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        idbox = new javax.swing.JTextField();
        Makebox = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        modelbox = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        milagebox = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        costoutbox = new javax.swing.JTextField();
        doorbox = new javax.swing.JComboBox<>();
        yearbox1 = new javax.swing.JComboBox<>();
        taxNumber = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        ExitBTN = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        emailBox = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        NameBox = new javax.swing.JTextField();
        PhoneBox = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        taxbox1 = new javax.swing.JSlider();
        jButton1 = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        dbtable = new javax.swing.JTextArea();
        ViewDB1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        edit.setBackground(java.awt.SystemColor.activeCaption);
        edit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));

        SearchBTN.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        SearchBTN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SearchBTN.setText("search");
        SearchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBTNActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Tax");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Doors");

        colourbox.setToolTipText("enter the colour of the car \n");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Colour");

        idbox.setToolTipText("Please Enter the cars ID here ");
        idbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idboxKeyPressed(evt);
            }
        });

        Makebox.setToolTipText("");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Make");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Model");

        modelbox.setToolTipText("please enter cars model here  ");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Year");

        milagebox.setToolTipText("Enter the milage on the car ");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Milage");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("ID");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Bought For");

        costoutbox.setToolTipText("Enter the amount we are selling the car for ");

        doorbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7", "8" }));
        doorbox.setToolTipText("select the amount of doors ");

        yearbox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010" }));
        yearbox1.setToolTipText("Select the year the car was made ");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("Welcome Search cars here by their ID");

        ExitBTN.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        ExitBTN.setText("Exit");
        ExitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBTNActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIAssignment2/car - Copy - Copy.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Email");

        PhoneBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PhoneBoxKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Phone Number");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Purchased By");

        taxbox1.setMajorTickSpacing(200);
        taxbox1.setMaximum(2000);
        taxbox1.setMinimum(50);
        taxbox1.setMinorTickSpacing(50);
        taxbox1.setPaintLabels(true);
        taxbox1.setPaintTicks(true);
        taxbox1.setToolTipText("select the tax of the car");
        taxbox1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                taxbox1StateChanged(evt);
            }
        });

        jButton1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jButton1.setText("Remove");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Clear.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editLayout = new javax.swing.GroupLayout(edit);
        edit.setLayout(editLayout);
        editLayout.setHorizontalGroup(
            editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editLayout.createSequentialGroup()
                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editLayout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(idbox, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(editLayout.createSequentialGroup()
                                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(editLayout.createSequentialGroup()
                                        .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(editLayout.createSequentialGroup()
                                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(9, 9, 9)
                                                .addComponent(yearbox1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(editLayout.createSequentialGroup()
                                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(9, 9, 9)
                                                .addComponent(milagebox, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(editLayout.createSequentialGroup()
                                                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(9, 9, 9)
                                                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(doorbox, 0, 300, Short.MAX_VALUE)
                                                    .addComponent(colourbox))))
                                        .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(editLayout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel5))
                                            .addGroup(editLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(editLayout.createSequentialGroup()
                                        .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(editLayout.createSequentialGroup()
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editLayout.createSequentialGroup()
                                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Makebox, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(editLayout.createSequentialGroup()
                                                .addComponent(modelbox, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(12, 12, 12)
                                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailBox, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PhoneBox, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(costoutbox, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(editLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(SearchBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editLayout.createSequentialGroup()
                                .addGap(289, 289, 289)
                                .addComponent(taxNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(editLayout.createSequentialGroup()
                                .addGap(251, 251, 251)
                                .addComponent(taxbox1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(editLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(ExitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(Clear)))))
                .addGap(143, 143, 143))
        );

        editLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {NameBox, PhoneBox, costoutbox, emailBox});

        editLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {SearchBTN, jButton1});

        editLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Clear, ExitBTN});

        editLayout.setVerticalGroup(
            editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel19))
                            .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(idbox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel15))
                            .addGroup(editLayout.createSequentialGroup()
                                .addComponent(Makebox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(modelbox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))))
                        .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel17))
                            .addGroup(editLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(yearbox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel18))
                            .addComponent(milagebox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel13))
                            .addComponent(colourbox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(editLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(taxbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(taxNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(costoutbox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(PhoneBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(18, 18, 18)
                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doorbox, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1)
                                .addComponent(ExitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(SearchBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Clear)
                        .addGap(14, 14, 14))))
        );

        editLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {NameBox, PhoneBox, costoutbox, emailBox});

        editLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {SearchBTN, jButton1});

        editLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Clear, ExitBTN});

        jTabbedPane1.addTab("Search", edit);

        dbtable.setEditable(false);
        dbtable.setBackground(java.awt.SystemColor.activeCaption);
        dbtable.setColumns(20);
        dbtable.setRows(5);
        jScrollPane2.setViewportView(dbtable);

        ViewDB1.setText("View");
        ViewDB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDB1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1056, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ViewDB1)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ViewDB1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("View", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public String url = "jdbc:sqlite:c:/mydb/Dddillon4.db";

    private void taxbox1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_taxbox1StateChanged
        taxNumber.setText("Tax =  " + (taxbox1).getValue());
    }//GEN-LAST:event_taxbox1StateChanged

    private void PhoneBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PhoneBoxKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)) {
            PhoneBox.setEditable(false);
            PhoneBox.setText("Please Enter Number Only");
        }else
        {
            PhoneBox.setEditable(true);
        }
    }//GEN-LAST:event_PhoneBoxKeyPressed

    private void ExitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBTNActionPerformed
        this.dispose(); //dispose of the first frame
        Managerhome.main(null);
    }//GEN-LAST:event_ExitBTNActionPerformed

    private void idboxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idboxKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)) {
            idbox.setEditable(false);
            idbox.setText("Please Enter Number Only");
        }else
        {
            idbox.setEditable(true);
    }//GEN-LAST:event_idboxKeyPressed
    }
    private void ViewDB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDB1ActionPerformed
       //Start of text area view button
        dbtable.setText(null); //blank the text area
       dbtable.append("ID \t Make \t Model \t Year \t Milage \t Colour \t Doors  \t Cost \t PhoneNo \tCarTax \t customerName  \t CustomerEmail  \n"); //set heading for table
 
     
        
      
       
        try (Connection conn = DriverManager.getConnection(url)) {
            //Statement – Used to execute string-based SQL queries
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM purchase"); 
            while(rs.next()){ 
                String carid = rs.getString("ID"); 
                String carmake = rs.getString("Make"); 
                String carmodel = rs.getString("Model");
                String caryear = rs.getString("Year");
                String carmilage = rs.getString("Milage");
                String carcolour = rs.getString("Colour");
                String cardoors = rs.getString("Doors");
                String costout = rs.getString("CostOut");
                     String customername = rs.getString("Name");
                  String customeremail = rs.getString("Email");
                   String customerphone = rs.getString("PhoneNo");
                 String cartax = rs.getString("Tax"); 
                
               
              dbtable.append(carid + "\t" + carmake + "\t" + carmodel +  "\t" + caryear+  "\t" + carmilage + "\t" + carcolour + "\t" + cardoors + "\t" + costout+ "\t"+ cartax+ "\t"+ customername+ "\t"+  customeremail+ "\t" + customerphone +"\t"+ "\n"); // for every entry in the table append to text area
            }//end while    
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,(e.getMessage())); 
        }//end try catch
        //end of text area view button	

    }//GEN-LAST:event_ViewDB1ActionPerformed

    private void SearchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBTNActionPerformed
        //Start of search button
        //try and make a connection to the DB using the global URL variable
        //The connection and statements objects might be better if global?
        try (Connection conn = DriverManager.getConnection(url)){
            String str = idbox.getText();
            //PreparedStatement – Used to execute parameterized SQL queries
            PreparedStatement st = conn.prepareStatement("select * from purchase where id=?");
            st.setString(1, str); //pass id string to statement, why 1? multiple statements? location?
            //Excuting Query
            ResultSet rs = st.executeQuery(); //get result set rs by executing the Prepared Statement
            if (rs.next()) { //iterate rs
                   String s = rs.getString(1); //get id from rs, save as s 
                String s1 = rs.getString(2); //make
                String s2 = rs.getString(3); //model
                String s3 = rs.getString(4); //year
                String s4 = rs.getString(5); //milage
                String s5 = rs.getString(6); //colour
                String s6 = rs.getString(7); //doors
                String s7 = rs.getString(8); //cost
                Integer s8 = rs.getInt(9); //tax
                   String s9 = rs.getString(10);//name
               String s10 = rs.getString(11); //email 
                
                String s11 = rs.getString(12); //phone
                //Sets Records in TextFields.  
                idbox.setText(s); //set id in textbox  
                Makebox.setText(s1);  //set make in textbox 
                modelbox.setText(s2);  //set model in textbox 
               yearbox1.setSelectedItem(s3); //set year in textbox  
                milagebox.setText(s4);  //set milage in textbox 
                colourbox.setText(s5);  //set colour in textbox
                doorbox.setSelectedItem(s6);  //set dorrs in textbox
                costoutbox.setText(s7);  //set costout in textbox
               NameBox.setText(s9);
               emailBox.setText(s10);
               PhoneBox.setText(s11);
               
               
               
                taxbox1.setValue(s8);  //set tax in textbox
            } else {
                JOptionPane.showMessageDialog(null, "ERROR");
            } //end if else
            //Create Exception Handler
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,(e.getMessage())); //error from try
        }//end try catch
        //end of search button
    }//GEN-LAST:event_SearchBTNActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Start of delete button
      
        try (Connection conn = DriverManager.getConnection(url)){ 
          
            Statement statement = conn.createStatement();
           
            statement.executeUpdate("DELETE FROM purchase WHERE id=" + idbox.getText() + "");  
            JOptionPane.showMessageDialog(null, "purchase deleted"); 
            statement.close();
            conn.close(); 
        } catch (Exception e) {  
            JOptionPane.showMessageDialog(null,"Error ID not Found"); 
        } //end try catch
        //end of delete button
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        idbox.setText(null); 
                Makebox.setText(null);  
                modelbox.setText(null); 
               yearbox1.setSelectedItem(null);  
                milagebox.setText(null); 
                colourbox.setText(null);  
                doorbox.setSelectedItem(null);  
                costoutbox.setText(null);  
               NameBox.setText(null);
               emailBox.setText(null);
               PhoneBox.setText(null);
    }//GEN-LAST:event_ClearActionPerformed

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
            java.util.logging.Logger.getLogger(PurchasedCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PurchasedCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PurchasedCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PurchasedCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PurchasedCars().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton ExitBTN;
    private javax.swing.JTextField Makebox;
    private javax.swing.JTextField NameBox;
    private javax.swing.JTextField PhoneBox;
    private javax.swing.JButton SearchBTN;
    private javax.swing.JButton ViewDB1;
    private javax.swing.JTextField colourbox;
    private javax.swing.JTextField costoutbox;
    private javax.swing.JTextArea dbtable;
    private javax.swing.JComboBox<String> doorbox;
    private javax.swing.JPanel edit;
    private javax.swing.JTextField emailBox;
    private javax.swing.JTextField idbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField milagebox;
    private javax.swing.JTextField modelbox;
    private javax.swing.JLabel taxNumber;
    private javax.swing.JSlider taxbox1;
    private javax.swing.JComboBox<String> yearbox1;
    // End of variables declaration//GEN-END:variables
}
