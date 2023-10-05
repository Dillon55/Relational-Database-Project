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
public class EmployeeDB extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeDB
     */
    public EmployeeDB() {
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
        jPanel1 = new javax.swing.JPanel();
        SalaryBox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        UpdateBTN = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        RemoveBTN = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        AddBTN = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        IDBox = new javax.swing.JTextField();
        NameBox = new javax.swing.JTextField();
        PhoneBox = new javax.swing.JTextField();
        EmailBox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        RoleBox = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        SearchBtn = new javax.swing.JButton();
        ExitBTN = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dbTable = new javax.swing.JTextArea();
        ViewDB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("PhoneNo");

        UpdateBTN.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        UpdateBTN.setText("Update");
        UpdateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBTNActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Email");

        RemoveBTN.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        RemoveBTN.setText("Remove");
        RemoveBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveBTNActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Role");

        AddBTN.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        AddBTN.setText("Add");
        AddBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBTNActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Salary");

        IDBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                IDBoxKeyPressed(evt);
            }
        });

        PhoneBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneBoxActionPerformed(evt);
            }
        });
        PhoneBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PhoneBoxKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Name");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Employee Details");

        SearchBtn.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        SearchBtn.setText("Search");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        ExitBTN.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        ExitBTN.setText("Exit");
        ExitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBTNActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIAssignment2/car - Copy - Copy.png"))); // NOI18N

        jButton1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(92, 92, 92))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IDBox, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                    .addComponent(NameBox)
                                    .addComponent(PhoneBox))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SalaryBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmailBox, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RoleBox))
                        .addGap(66, 66, 66))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ExitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SearchBtn)
                        .addGap(18, 18, 18)
                        .addComponent(AddBTN)
                        .addGap(18, 18, 18)
                        .addComponent(RemoveBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(UpdateBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {EmailBox, IDBox, NameBox, PhoneBox, RoleBox, SalaryBox});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AddBTN, ExitBTN, SearchBtn, UpdateBTN});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(IDBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(NameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(PhoneBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(EmailBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(RoleBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(SalaryBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ExitBTN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SearchBtn)
                            .addComponent(AddBTN)
                            .addComponent(RemoveBTN)
                            .addComponent(UpdateBTN))))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {EmailBox, IDBox, NameBox, PhoneBox, RoleBox, SalaryBox});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AddBTN, ExitBTN, RemoveBTN, SearchBtn, UpdateBTN});

        jTabbedPane1.addTab("Create", jPanel1);

        jPanel2.setBackground(java.awt.SystemColor.activeCaption);

        dbTable.setEditable(false);
        dbTable.setBackground(java.awt.SystemColor.activeCaption);
        dbTable.setColumns(20);
        dbTable.setRows(5);
        jScrollPane1.setViewportView(dbTable);

        ViewDB.setText("View");
        ViewDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ViewDB)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ViewDB)
                .addContainerGap(203, Short.MAX_VALUE))
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
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public String url = "jdbc:sqlite:c:/mydb/Dddillon4.db";
    private void ViewDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDBActionPerformed
       //Start of text area view button
        dbTable.setText(null); //blank the text area
       dbTable.append("ID \t Name \t PhoneNo \t Email \t Role \t Salary  \n"); //set heading for table
 
     
        
      
       
        try (Connection conn = DriverManager.getConnection(url)) {
            //Statement – Used to execute string-based SQL queries
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM employees"); 
            while(rs.next()){ 
                String empid = rs.getString("EmployeeID"); 
                String empname = rs.getString("EmployeeName"); 
                String empphoneno = rs.getString("EmployeePhoneNo");
 String empemail = rs.getString("EmployeeEmail");
                             String emprole = rs.getString("EmployeeRole");
                String empsalary = rs.getString("EmployeeSalary");
                
                
               
              dbTable.append(empid + "\t" +empname + "\t" +  empemail + "\t" +empphoneno +  "\t" + emprole+  "\t" + empsalary + "\t" +  "\n"); // for every entry in the table append to text area
            }//end while    
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error"); 
        }//end try catch
        //end of text area view button	
    }//GEN-LAST:event_ViewDBActionPerformed

    private void AddBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBTNActionPerformed
         //Start of Add button
   
        try (Connection conn = DriverManager.getConnection(url)){  
          
            Statement statement = conn.createStatement();
           
      statement.execute("INSERT INTO employees VALUES('" + IDBox.getText() + "' , '" + NameBox.getText() + "' , '" + PhoneBox.getText()+ "' , '" + EmailBox.getText()+ "' , '"+ RoleBox.getText() + "' , '" + SalaryBox.getText()  + "')");
  JOptionPane.showMessageDialog(null, "employee Added");                                                                                                                                                                     
  
            statement.close(); 
            conn.close(); 
        } catch (Exception e) {  
            JOptionPane.showMessageDialog(null, (e.getMessage())); 
        } //end try catch
        //end of insert button
    }//GEN-LAST:event_AddBTNActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
  try (Connection conn = DriverManager.getConnection(url)){  
            String str = IDBox.getText();  
            //PreparedStatement – Used to execute parameterized SQL queries
            PreparedStatement st = conn.prepareStatement("select * from employees where employeeid=?");  
            st.setString(1, str); //pass id string to statement, why 1? multiple statements? location?
            //Excuting Query  
            ResultSet rs = st.executeQuery(); //get result set rs by executing the Prepared Statement
            if (rs.next()) { //iterate rs
                 String s = rs.getString(1); //get id from rs, save as s 
                String s1 = rs.getString(2); 
                String s2 = rs.getString(3); 
                String s3 = rs.getString(4); 
                String s4 = rs.getString(5); 
                String s5 = rs.getString(6); 
             
                //Sets Records in TextFields.  
                IDBox.setText(s); 
                NameBox.setText(s1);  
                PhoneBox.setText(s3);  
               EmailBox.setText(s2);
                RoleBox.setText(s4);  
                SalaryBox.setText(s5);  
            } else {  
                JOptionPane.showMessageDialog(null, "ERROR"); 
            } //end if else  
            //Create Exception Handler  
        } catch (Exception e) {  
            JOptionPane.showMessageDialog(null,"Error"); //error from try
        }//end try catch
        //end of search button
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void UpdateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBTNActionPerformed
        //Start of update button
              
        
        try (Connection conn = DriverManager.getConnection(url)){ 
         
            Statement statement = conn.createStatement();
          
           
             String query ="UPDATE employees SET employeename='" + NameBox.getText() + "', employeephoneno='" + PhoneBox.getText() + "', employeeemail='" + EmailBox.getText() + "', employeerole='" + RoleBox.getText() + "', employeesalary='" + SalaryBox.getText() +" 'WHERE employeeid='" + IDBox.getText() + "' ";
         statement.execute(query);
            JOptionPane.showMessageDialog(null, "Employee Updated");
            statement.close(); 
            conn.close();
        } catch (Exception e) {  
            JOptionPane.showMessageDialog(null,"Error");
        } //end try catch
        //end of update button
    }//GEN-LAST:event_UpdateBTNActionPerformed

    private void RemoveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveBTNActionPerformed
            //Start of delete button
      
        try (Connection conn = DriverManager.getConnection(url)){ 
          
            Statement statement = conn.createStatement();
           
            statement.executeUpdate("DELETE FROM employees WHERE employeeid=" + IDBox.getText() + "");  
            JOptionPane.showMessageDialog(null, "Employee deleted"); 
            statement.close();
            conn.close(); 
        } catch (Exception e) {  
            JOptionPane.showMessageDialog(null,"Error ID not Found"); 
        } //end try catch
        //end of delete button
    }//GEN-LAST:event_RemoveBTNActionPerformed

    private void ExitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBTNActionPerformed
         this.dispose(); //dispose of the first frame
Managerhome.main(null); 
    }//GEN-LAST:event_ExitBTNActionPerformed

    private void IDBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDBoxKeyPressed
        char c = evt.getKeyChar();
if(Character.isLetter(c)) {
    IDBox.setEditable(false);
    IDBox.setText("Please Enter Number Only");
}else
{
    IDBox.setEditable(true);
}
    }//GEN-LAST:event_IDBoxKeyPressed

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         IDBox.setText(null); 
                NameBox.setText(null);  
                PhoneBox.setText(null);  
               EmailBox.setText(null);
                RoleBox.setText(null);  
                SalaryBox.setText(null);  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void PhoneBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneBoxActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeDB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBTN;
    private javax.swing.JTextField EmailBox;
    private javax.swing.JButton ExitBTN;
    private javax.swing.JTextField IDBox;
    private javax.swing.JTextField NameBox;
    private javax.swing.JTextField PhoneBox;
    private javax.swing.JButton RemoveBTN;
    private javax.swing.JTextField RoleBox;
    private javax.swing.JTextField SalaryBox;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JButton UpdateBTN;
    private javax.swing.JButton ViewDB;
    private javax.swing.JTextArea dbTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
