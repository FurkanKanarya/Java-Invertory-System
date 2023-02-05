/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ınventorysystem;
import com.mysql.cj.Query;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Furkan
 */
public class Product extends javax.swing.JFrame {

    /**
     * Creates new form Product
     */
    public Product() {
        initComponents();
        displayProduct();
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
        productID_txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        product_txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        productQ_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        productP_txt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        CatCombo = new javax.swing.JComboBox<>();
        editProduct_btn = new javax.swing.JButton();
        addProduct_btn = new javax.swing.JButton();
        deleteProduct_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        product_Table = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        home_lbl = new javax.swing.JButton();

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
        jLabel3.setText("ÜRÜN KAYIT EKRANI");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
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
        jLabel4.setText("Ürün ID:");

        productID_txt.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Ürün Adı:");

        product_txt.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Adet:");

        productQ_txt.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("B.Fiyat:");

        productP_txt.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText("Kategori:");

        CatCombo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        CatCombo.setForeground(new java.awt.Color(51, 51, 255));
        CatCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        editProduct_btn.setBackground(new java.awt.Color(51, 51, 255));
        editProduct_btn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        editProduct_btn.setForeground(new java.awt.Color(255, 255, 255));
        editProduct_btn.setText("Değiştir");
        editProduct_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editProduct_btnMouseClicked(evt);
            }
        });

        addProduct_btn.setBackground(new java.awt.Color(51, 51, 255));
        addProduct_btn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        addProduct_btn.setForeground(new java.awt.Color(255, 255, 255));
        addProduct_btn.setText("Ekle");
        addProduct_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addProduct_btnMouseClicked(evt);
            }
        });

        deleteProduct_btn.setBackground(new java.awt.Color(51, 51, 255));
        deleteProduct_btn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        deleteProduct_btn.setForeground(new java.awt.Color(255, 255, 255));
        deleteProduct_btn.setText("Sil");
        deleteProduct_btn.setToolTipText("");
        deleteProduct_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteProduct_btnMouseClicked(evt);
            }
        });

        product_Table.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        product_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ürün ID", "Ürün Adı", "Adet", "Fiyat", "Kategori"
            }
        ));
        product_Table.setIntercellSpacing(new java.awt.Dimension(0, 0));
        product_Table.setRowHeight(25);
        product_Table.setSelectionBackground(new java.awt.Color(51, 51, 255));
        product_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(product_Table);

        jPanel3.setBackground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        home_lbl.setBackground(new java.awt.Color(51, 51, 255));
        home_lbl.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        home_lbl.setForeground(new java.awt.Color(255, 255, 255));
        home_lbl.setIcon(new javax.swing.ImageIcon("C:\\Users\\Furkan\\Desktop\\Inventory System Java\\homeicon.png")); // NOI18N
        home_lbl.setBorder(null);
        home_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_lblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(addProduct_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(editProduct_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteProduct_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(40, 40, 40))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(87, 87, 87)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(product_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(productID_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(40, 40, 40))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(87, 87, 87)))
                                    .addComponent(jLabel8))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(productP_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(productQ_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CatCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(home_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(79, 79, 79)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(productID_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(product_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(productQ_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(productP_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(CatCombo))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editProduct_btn)
                            .addComponent(deleteProduct_btn)
                            .addComponent(addProduct_btn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(home_lbl)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)))
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

    public void displayProduct(){
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorydb?useTimezone=trueServerTimezone=UTC","root","");
            Stmt = Con.createStatement();
            Rslt = Stmt.executeQuery("select * from producttable");
            product_Table.setModel(DbUtils.resultSetToTableModel(Rslt));
 
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    
    private void addProduct_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addProduct_btnMouseClicked
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorydb?useTimezone=trueServerTimezone=UTC","root","");
            PreparedStatement add= Con.prepareStatement("insert into producttable values(?,?,?,?,?)");
            add.setInt(1,Integer.valueOf(productID_txt.getText()));
            add.setString(2,product_txt.getText());
            add.setInt(3,Integer.valueOf(productQ_txt.getText()));
            add.setDouble(4,Double.valueOf(productP_txt.getText()));
            add.setString(5,CatCombo.getSelectedItem().toString());
            int row=add.executeUpdate();
            JOptionPane.showMessageDialog(this,"Ürün Başarıyla Eklendi!!");
            Con.close();
            displayProduct(); 
            
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_addProduct_btnMouseClicked

    private void deleteProduct_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteProduct_btnMouseClicked
        if(productID_txt.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Silmek için önce ürün eklemelisin :D");
        }
        else{
            try{
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorydb?useTimezone=trueServerTimezone=UTC","root","");
                String Id=productID_txt.getText();
                String Query="Delete from producttable where ProductID="+Id;
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                displayProduct();
                JOptionPane.showMessageDialog(this,"Ürün başarıyla silindi!");
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_deleteProduct_btnMouseClicked

    private void product_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product_TableMouseClicked
        DefaultTableModel model = (DefaultTableModel)product_Table.getModel();
        int Myindex = product_Table.getSelectedRow();
        productID_txt.setText(model.getValueAt(Myindex, 0).toString());
        product_txt.setText(model.getValueAt((Myindex), 1).toString());
        productQ_txt.setText(model.getValueAt((Myindex), 2).toString());
        productP_txt.setText(model.getValueAt((Myindex), 3).toString());
        
    }//GEN-LAST:event_product_TableMouseClicked

    private void close_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_lblMouseClicked
        System.exit(0);
    }//GEN-LAST:event_close_lblMouseClicked

    private void editProduct_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editProduct_btnMouseClicked
        if(productID_txt.getText().isEmpty()||product_txt.getText().isEmpty()||productQ_txt.getText().isEmpty()||productP_txt.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Bazı bilgiler eksik,güncellenemiyor");
        }
        else{
            try{
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorydb?useTimezone=trueServerTimezone=UTC","root","");
                String UpdateQuery = "update producttable set ProductName='"+product_txt.getText()+"'"+",Quantity='"+productQ_txt.getText()+"'"
                        +",Price='"+productP_txt.getText()+"'"+",Category='"+CatCombo.getSelectedItem().toString()+"'"+"where ProductID ="+productID_txt.getText();
                Statement Add = Con.createStatement();
                Add.executeUpdate(UpdateQuery);
                JOptionPane.showMessageDialog(this, "Ürün başarıyla güncellendi!");
                displayProduct();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
    }//GEN-LAST:event_editProduct_btnMouseClicked

    private void home_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_lblMouseClicked
        new HomePage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_home_lblMouseClicked

    
    
    
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
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CatCombo;
    private javax.swing.JButton addProduct_btn;
    private javax.swing.JLabel close_lbl;
    private javax.swing.JButton deleteProduct_btn;
    private javax.swing.JButton editProduct_btn;
    private javax.swing.JButton home_lbl;
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
    private javax.swing.JTextField productID_txt;
    private javax.swing.JTextField productP_txt;
    private javax.swing.JTextField productQ_txt;
    private javax.swing.JTable product_Table;
    private javax.swing.JTextField product_txt;
    // End of variables declaration//GEN-END:variables
}
