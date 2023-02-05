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
public class Category extends javax.swing.JFrame {

    /**
     * Creates new form Category
     */
    public Category() {
        initComponents();
        displayCategory();
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
        categoryID_txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        category_txt = new javax.swing.JTextField();
        editCategory_btn = new javax.swing.JButton();
        addCategory_btn = new javax.swing.JButton();
        deleteCategory_btn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        home_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        categoryTable = new javax.swing.JTable();

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
        jLabel3.setText("KATEGORİ KAYIT EKRANI");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(325, 325, 325)
                .addComponent(close_lbl))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(361, 361, 361)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(close_lbl)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Kategori ID:");

        categoryID_txt.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Kategori Adı:");

        category_txt.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N

        editCategory_btn.setBackground(new java.awt.Color(51, 51, 255));
        editCategory_btn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        editCategory_btn.setForeground(new java.awt.Color(255, 255, 255));
        editCategory_btn.setText("Değiştir");
        editCategory_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editCategory_btnMouseClicked(evt);
            }
        });

        addCategory_btn.setBackground(new java.awt.Color(51, 51, 255));
        addCategory_btn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        addCategory_btn.setForeground(new java.awt.Color(255, 255, 255));
        addCategory_btn.setText("Ekle");
        addCategory_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCategory_btnMouseClicked(evt);
            }
        });

        deleteCategory_btn.setBackground(new java.awt.Color(51, 51, 255));
        deleteCategory_btn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        deleteCategory_btn.setForeground(new java.awt.Color(255, 255, 255));
        deleteCategory_btn.setText("Sil");
        deleteCategory_btn.setToolTipText("");
        deleteCategory_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteCategory_btnMouseClicked(evt);
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

        categoryTable.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        categoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kategori ID", "Kategori Adı"
            }
        ));
        categoryTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        categoryTable.setRowHeight(25);
        categoryTable.setSelectionBackground(new java.awt.Color(51, 51, 255));
        categoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(categoryTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(home_btn)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(categoryID_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(category_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addCategory_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(editCategory_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteCategory_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
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
                            .addComponent(categoryID_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(category_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addCategory_btn)
                            .addComponent(editCategory_btn)
                            .addComponent(deleteCategory_btn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(home_btn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

     public void displayCategory(){
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorydb?useTimezone=trueServerTimezone=UTC","root","");
            Stmt = Con.createStatement();
            Rslt = Stmt.executeQuery("select * from categorytable");
            categoryTable.setModel(DbUtils.resultSetToTableModel(Rslt));
 
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    private void addCategory_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCategory_btnMouseClicked
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorydb?useTimezone=trueServerTimezone=UTC","root","");
            PreparedStatement add= Con.prepareStatement("insert into categorytable values(?,?)");
            add.setInt(1,Integer.valueOf(categoryID_txt.getText()));
            add.setString(2,category_txt.getText());
            
            int row=add.executeUpdate();
            JOptionPane.showMessageDialog(this,"Kategori Başarıyla Eklendi!!");
            Con.close();
            displayCategory(); 
            
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_addCategory_btnMouseClicked

    private void deleteCategory_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteCategory_btnMouseClicked
        if(categoryID_txt.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Silmek için önce kategori eklemelisin :D");
        }
        else{
            try{
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorydb?useTimezone=trueServerTimezone=UTC","root","");
                String Id=categoryID_txt.getText();
                String Query="Delete from categorytable where categoryID="+Id;
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                displayCategory();
                JOptionPane.showMessageDialog(this,"Kategori başarıyla silindi!");
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_deleteCategory_btnMouseClicked

    private void categoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)categoryTable.getModel();
        int Myindex = categoryTable.getSelectedRow();
        categoryID_txt.setText(model.getValueAt(Myindex, 0).toString());
        category_txt.setText(model.getValueAt((Myindex), 1).toString());
       
    }//GEN-LAST:event_categoryTableMouseClicked

    private void close_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_lblMouseClicked
        System.exit(0);
    }//GEN-LAST:event_close_lblMouseClicked

    private void home_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_btnMouseClicked
        new HomePage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_home_btnMouseClicked

    private void editCategory_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editCategory_btnMouseClicked
        if(categoryID_txt.getText().isEmpty()||category_txt.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Güncellemek için kategori eklemelisin :D");
        }
        else{
            try{
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorydb?useTimezone=trueServerTimezone=UTC","root","");
                String UpdateQuery = "update categorytable set categoryName='"+category_txt.getText()+"'"+"where categoryID="+categoryID_txt.getText();
                Statement Add = Con.createStatement();
                Add.executeUpdate(UpdateQuery);
                JOptionPane.showMessageDialog(this, "Kategori Başarıyla Güncellendi!");
                displayCategory();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_editCategory_btnMouseClicked

    
    
    
    
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
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Category().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCategory_btn;
    private javax.swing.JTextField categoryID_txt;
    private javax.swing.JTable categoryTable;
    private javax.swing.JTextField category_txt;
    private javax.swing.JLabel close_lbl;
    private javax.swing.JButton deleteCategory_btn;
    private javax.swing.JButton editCategory_btn;
    private javax.swing.JButton home_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
