/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank_account;

import javax.swing.JOptionPane;

/**
 *
 * @author qwerty
 */
public class Admin_Customer extends javax.swing.JFrame {

    /**
     * Creates new form Admin_Customer
     */
    public Admin_Customer() {
        initComponents();
        setLocationRelativeTo(null);
        expiry.setEnabled(false);
        cvv.setEnabled(false);
        creditnumber.setEnabled(false);
      
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
        adress1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        birth = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Adress = new javax.swing.JTextField();
        Fname = new javax.swing.JTextField();
        Lname = new javax.swing.JTextField();
        TypeAccount = new javax.swing.JComboBox<>();
        D = new javax.swing.JComboBox<>();
        M = new javax.swing.JComboBox<>();
        Y = new javax.swing.JComboBox<>();
        b = new javax.swing.JLabel();
        Initial = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        expirydate = new javax.swing.JLabel();
        expiry = new javax.swing.JTextField();
        cvvN = new javax.swing.JLabel();
        cvv = new javax.swing.JTextField();
        cc = new javax.swing.JLabel();
        creditnumber = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        searchbutton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin Dashboard");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Last Name");

        adress1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        adress1.setText("Address");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("First Name");

        birth.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        birth.setText("Birthday");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Type Account");

        Adress.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N

        Fname.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N

        Lname.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        Lname.setPreferredSize(new java.awt.Dimension(7, 19));

        TypeAccount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "REGULAR", "VIP" }));

        D.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));

        M.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MActionPerformed(evt);
            }
        });

        Y.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0000", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022" }));

        b.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        b.setText("Initial Deposit");

        Initial.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N

        submit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        submit.setText("Add Account");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        expirydate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        expirydate.setText("Expiry Date");

        cvvN.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cvvN.setText("CVV");

        cc.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cc.setText("Credit Card");

        jButton2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jButton2.setText("Remove Account");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        searchbutton.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        searchbutton.setText("Search Account");
        searchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbuttonActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jButton4.setText("ADD Account");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jButton5.setText("BANN Account");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Address", "Date of Birth", "Account Type", "Balance", "Credit Card Number", "CVV", "Expiry Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(searchbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton2)
                                    .addGap(252, 252, 252)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Fname, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Lname, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(M, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Y, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(Adress, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Initial, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52)
                                        .addComponent(TypeAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(submit))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(expirydate)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cc)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(creditnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(cvvN, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(56, 56, 56)
                                    .addComponent(cvv, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(129, 129, 129)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(birth, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(adress1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(expiry, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(51, 51, 51)
                        .addComponent(searchbutton)
                        .addGap(46, 46, 46)
                        .addComponent(jButton5)
                        .addGap(149, 149, 149))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Fname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(expirydate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(expiry, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Lname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cvv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cvvN))))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adress1)
                            .addComponent(Adress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(creditnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(birth, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(M, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TypeAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Initial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
Admin a=new Admin();
Customer c;
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
    
        if(TypeAccount.getSelectedItem().toString().equalsIgnoreCase("regular")){
           c=new Regular_Account();
           c.setBalance(Integer.parseInt(Initial.getText()));
           c.name=Fname.getText()+" "+Lname.getText();
           c.Adress=Adress.getText();
           expiry.setText(a.generateExpD());
           cvv.setText(a.generateCVV()+"");
           creditnumber.setText(a.generateCreditNumber());
           String Date=Y.getSelectedItem().toString()+D.getSelectedItem().toString()+M.getSelectedItem().toString();
           c.Date_Of_Birth=Date;
           a.AddCustomer(c);
           a.MaxWithDraw(c); 
           
       }    
       else{
          c=new Vip_Account();
           c.setBalance(Integer.parseInt(Initial.getText()));
           c.name=Fname.getText()+" "+Lname.getText();
           c.Adress=Adress.getText();
           expiry.setText(a.generateExpD());
           cvv.setText(a.generateCVV()+"");
           creditnumber.setText(a.generateCreditNumber());
           String Date=Y.getSelectedItem().toString()+D.getSelectedItem().toString()+M.getSelectedItem().toString();
           c.Date_Of_Birth=Date;        
           a.AddCustomer(c);
           a.MaxWithDraw(c);
            
       }
       JOptionPane.showMessageDialog(null,a.DisplayCustomer(c.name));
       
       
       
    }//GEN-LAST:event_submitActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  adress1.setVisible(true);
        adress1.setText("ID ");
        TypeAccount.setVisible(false);
        jLabel6.setVisible(false);
        Adress.setVisible(true);
        expiry.setVisible(false);        
        cvv.setVisible(false);
        cc.setVisible(true);
        creditnumber.setVisible(false);
        cvvN.setVisible(false);
        expirydate.setVisible(false);
        creditnumber.setEnabled(false);
        birth.setVisible(false);
        cc.setVisible(false);
        Initial.setVisible(false);
        D.setVisible(false);
        b.setVisible(false);
        Y.setVisible(false);
        M.setVisible(false);
        
        submit.setVisible(true);
        submit.setText("Remove");
       
         Fname.setText(null);
        Lname.setText(null);
        Adress.setText(null);
        Initial.setText(null);
        expiry.setText(null);
        cvv.setText(null);
        creditnumber.setText(null);         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         adress1.setVisible(true);
        adress1.setText("Address");
        Adress.setVisible(true);
        expirydate.setVisible(true);
        cvvN.setVisible(true);
        cc.setVisible(true);
        cvv.setVisible(true);
        expiry.setVisible(true);
        expirydate.setText("Expiry Date");
        creditnumber.setVisible(true);
        submit.setText("Add Account");
        birth.setVisible(true);
        jLabel6.setVisible(true);
        TypeAccount.setVisible(true);
        submit.setVisible(true);
        D.setVisible(true);
        b.setText("Initial Deposit");
        Y.setVisible(true);
        M.setVisible(true);
        b.setVisible(true);
        Initial.setVisible(true);
        cvv.setEnabled(false);
        creditnumber.setEnabled(false); 
         Fname.setText(null);
        Lname.setText(null);
        Adress.setText(null);
        Initial.setText(null);
        expiry.setText(null);
        cvv.setText(null);
        creditnumber.setText(null);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void searchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbuttonActionPerformed
        adress1.setVisible(true);
        adress1.setText("ID ");
        TypeAccount.setVisible(false);
        jLabel6.setVisible(false);
        Adress.setVisible(true);
        expiry.setVisible(false);        
        cvv.setVisible(false);
        cc.setVisible(true);
        creditnumber.setVisible(false);
        cvvN.setVisible(false);
        expirydate.setVisible(false);
        creditnumber.setEnabled(false);
        birth.setVisible(false);
        cc.setVisible(false);
        Initial.setVisible(false);
        D.setVisible(false);
        b.setVisible(false);
        Y.setVisible(false);
        M.setVisible(false);
        
        submit.setVisible(true);
        submit.setText("Search");
       
         Fname.setText(null);
        Lname.setText(null);
        Adress.setText(null);
        Initial.setText(null);
        expiry.setText(null);
        cvv.setText(null);
        creditnumber.setText(null);
    }//GEN-LAST:event_searchbuttonActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         adress1.setVisible(true);
        adress1.setText("ID ");
        TypeAccount.setVisible(false);
        jLabel6.setVisible(false);
        Adress.setVisible(true);
        expiry.setVisible(false);        
        cvv.setVisible(false);
        cc.setVisible(true);
        creditnumber.setVisible(false);
        cvvN.setVisible(false);
        expirydate.setVisible(false);
        creditnumber.setEnabled(false);
        birth.setVisible(false);
        cc.setVisible(false);
        Initial.setVisible(false);
        D.setVisible(false);
        b.setVisible(false);
        Y.setVisible(false);
        M.setVisible(false);
        
        submit.setVisible(true);
        submit.setText("Bann");
       
         Fname.setText(null);
        Lname.setText(null);
        Adress.setText(null);
        Initial.setText(null);
        expiry.setText(null);
        cvv.setText(null);
        creditnumber.setText(null);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Adress;
    private javax.swing.JComboBox<String> D;
    private javax.swing.JTextField Fname;
    private javax.swing.JTextField Initial;
    private javax.swing.JTextField Lname;
    private javax.swing.JComboBox<String> M;
    private javax.swing.JComboBox<String> TypeAccount;
    private javax.swing.JComboBox<String> Y;
    private javax.swing.JLabel adress1;
    private javax.swing.JLabel b;
    private javax.swing.JLabel birth;
    private javax.swing.JLabel cc;
    private javax.swing.JTextField creditnumber;
    private javax.swing.JTextField cvv;
    private javax.swing.JLabel cvvN;
    private javax.swing.JTextField expiry;
    private javax.swing.JLabel expirydate;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton searchbutton;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
