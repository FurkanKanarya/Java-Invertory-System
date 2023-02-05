/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ınventorysystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Furkan
 */
public class Customer extends javax.swing.JFrame {

    /**
     * Creates new form Customer
     */
    public Customer() {
        initComponents();
        displayCustomer();
    }
    
    Connection Con = null;
    Statement Stmt =null;
    ResultSet Rslt= null;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        close_lbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        customerID_txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        customer_txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        customerP_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        customerA_txt = new javax.swing.JTextField();
        customerEdit_txt = new javax.swing.JButton();
        customerAdd_btn = new javax.swing.JButton();
        customerDelete_btn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        customerMail_txt = new javax.swing.JTextField();
        home_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ENVANTER KONTROL SİSTEMİ");

        close_lbl.setIcon(new javax.swing.ImageIcon("C:\\Users\\Furkan\\Desktop\\Inventory System Java\\close.png")); // NOI18N
        close_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_lblMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MÜŞTERİ KAYIT EKRANI");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 402, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(325, 325, 325)
                .addComponent(close_lbl))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(440, 440, 440))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(close_lbl)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Müşteri ID:");

        customerID_txt.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Müşteri Adı:");

        customer_txt.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Telefon:");

        customerP_txt.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("Adres:");

        customerA_txt.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N

        customerEdit_txt.setBackground(new java.awt.Color(51, 51, 255));
        customerEdit_txt.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        customerEdit_txt.setForeground(new java.awt.Color(255, 255, 255));
        customerEdit_txt.setText("Değiştir");
        customerEdit_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerEdit_txtMouseClicked(evt);
            }
        });

        customerAdd_btn.setBackground(new java.awt.Color(51, 51, 255));
        customerAdd_btn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        customerAdd_btn.setForeground(new java.awt.Color(255, 255, 255));
        customerAdd_btn.setText("Ekle");
        customerAdd_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerAdd_btnMouseClicked(evt);
            }
        });

        customerDelete_btn.setBackground(new java.awt.Color(51, 51, 255));
        customerDelete_btn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        customerDelete_btn.setForeground(new java.awt.Color(255, 255, 255));
        customerDelete_btn.setText("Sil");
        customerDelete_btn.setToolTipText("");
        customerDelete_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerDelete_btnMouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText("E-Posta:");

        customerMail_txt.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N

        home_btn.setBackground(new java.awt.Color(51, 51, 255));
        home_btn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        home_btn.setForeground(new java.awt.Color(255, 255, 255));
        home_btn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Furkan\\Desktop\\Inventory System Java\\homeicon.png")); // NOI18N
        home_btn.setBorder(null);
        home_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_btnMouseClicked(evt);
            }
        });

        customerTable.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Müşteri ID", "Müşteri Adı", "Telefon", "Adres", "E-Posta"
            }
        ));
        customerTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        customerTable.setRowHeight(25);
        customerTable.setSelectionBackground(new java.awt.Color(51, 51, 255));
        customerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(customerTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(customerAdd_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(49, 49, 49)
                            .addComponent(customerEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(customerDelete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(40, 40, 40))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(87, 87, 87)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(customer_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(customerID_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addGap(135, 135, 135)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(customerP_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(customerA_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(customerMail_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(home_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(customerID_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(customer_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(customerP_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(customerA_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(customerMail_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customerDelete_btn)
                            .addComponent(customerEdit_txt)
                            .addComponent(customerAdd_btn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(home_btn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void displayCustomer(){
           try{
               Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorydb?useTimezone=trueServerTimezone=UTC","root","");
               Stmt = Con.createStatement();
               Rslt = Stmt.executeQuery("select * from customertable");
               customerTable.setModel(DbUtils.resultSetToTableModel(Rslt));

           }catch(SQLException e)
           {
               e.printStackTrace();
           }
       }
    
    private void customerAdd_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerAdd_btnMouseClicked
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorydb?useTimezone=trueServerTimezone=UTC","root","");
            PreparedStatement add= Con.prepareStatement("insert into customertable values(?,?,?,?,?)");
            add.setInt(1,Integer.valueOf(customerID_txt.getText()));
            add.setString(2,customer_txt.getText());
            add.setString(3,customerP_txt.getText());
            add.setString(4,customerA_txt.getText());
            add.setString(5,customerMail_txt.getText());
            int row=add.executeUpdate();
            JOptionPane.showMessageDialog(this,"Müşteri Başarıyla Eklendi!!");
            Con.close();
            displayCustomer(); 
            
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_customerAdd_btnMouseClicked

    private void customerDelete_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerDelete_btnMouseClicked
        if(customerID_txt.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Silmek için önce ürün eklemelisin :D");
        }
        else{
            try{
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorydb?useTimezone=trueServerTimezone=UTC","root","");
                String Id=customerID_txt.getText();
                String Query="Delete from customertable where customerID="+Id;
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                displayCustomer();
                JOptionPane.showMessageDialog(this,"Müşteri başarıyla silindi!");
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_customerDelete_btnMouseClicked

    private void customerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerTableMouseClicked
       DefaultTableModel model = (DefaultTableModel)customerTable.getModel();
        int Myindex = customerTable.getSelectedRow();
        customerID_txt.setText(model.getValueAt(Myindex, 0).toString());
        customer_txt.setText(model.getValueAt((Myindex), 1).toString());
        customerP_txt.setText(model.getValueAt((Myindex), 2).toString());
        customerA_txt.setText(model.getValueAt((Myindex), 3).toString());
        customerMail_txt.setText(model.getValueAt((Myindex), 4).toString());
    }//GEN-LAST:event_customerTableMouseClicked

    private void close_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_lblMouseClicked
        System.exit(0);
    }//GEN-LAST:event_close_lblMouseClicked

    private void customerEdit_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerEdit_txtMouseClicked
         if(customerID_txt.getText().isEmpty()||customer_txt.getText().isEmpty()||customerP_txt.getText().isEmpty()||customerA_txt.getText().isEmpty()||customerMail_txt.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Bazı bilgiler eksik,güncellenemiyor");
        }
        else{
            try{
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorydb?useTimezone=trueServerTimezone=UTC","root","");
                String UpdateQuery = "update customertable set customerName='"+customer_txt.getText()+"'"+",customerPhone='"+customerP_txt.getText()+"'"
                        +",customerAddress='"+customerA_txt.getText()+"'"+",customerMail='"+customerMail_txt.getText()+"'"+"where customerID ="+customerID_txt.getText();
                Statement Add = Con.createStatement();
                Add.executeUpdate(UpdateQuery);
                JOptionPane.showMessageDialog(this, "Müşteri başarıyla güncellendi!");
                displayCustomer();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
    }//GEN-LAST:event_customerEdit_txtMouseClicked

    private void home_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_btnMouseClicked
       new HomePage().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_home_btnMouseClicked
    
    
    
    
    
   
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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close_lbl;
    private javax.swing.JTextField customerA_txt;
    private javax.swing.JButton customerAdd_btn;
    private javax.swing.JButton customerDelete_btn;
    private javax.swing.JButton customerEdit_txt;
    private javax.swing.JTextField customerID_txt;
    private javax.swing.JTextField customerMail_txt;
    private javax.swing.JTextField customerP_txt;
    private javax.swing.JTable customerTable;
    private javax.swing.JTextField customer_txt;
    private javax.swing.JButton home_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
