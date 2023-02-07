/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inventorymanagementsystem.ProductManagement.View;

import inventorymanagementsystem.ProductManagement.Controller.ProductController;
import inventorymanagementsystem.UserManagement.Model.DBConnection;
import inventorymanagementsystem.UserManagement.Model.User;
import inventorymanagementsystem.UserManagement.View.UserManagement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author arnab
 */
public class MainMenuFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainMenuFrame
     */

    User user = User.getInstance();
    public MainMenuFrame() {
        initComponents();
        loadData();
    }
    
    private void loadData(){
        DBConnection dbc = new DBConnection();
        lblWelcome.setText("Welcome, " + user.getFirstName() + " " + user.getLastName() + " (" + user.getUsername() + ")" );
        String userRoles = "";
        if(user.getIsAdmin().equals("true")){
            userRoles = "Admin";
            
        }else{
            userRoles = "Staff";
        }
        lblLoginas.setText("You are login as : " + userRoles);
        
        
        dbc.setQuery("SELECT * FROM product");
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.fireTableDataChanged();
        
        try{
            Connection con = DriverManager.getConnection(dbc.getUrl(), dbc.getUser(), dbc.getPassword());
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery(dbc.getQuery());
            
            int rowcount = 0;
            if (res.last()) {
              rowcount = res.getRow();
              res.beforeFirst(); 
            }
            
            String data[][] = new String[rowcount][9];
            
            int i = 0;
            while (res.next()) {
              //int id = res.getInt("ID");
              //String brand = res.getString("brand");
              //String getmodel = res.getString("model");
              //String type = res.getString("type");
              //String username = res.getString("username");

              data[i][0] = res.getInt("ID") + "";
              data[i][1] = res.getString("brand");
              data[i][2] = res.getString("model");
              data[i][3] = res.getString("type");
              data[i][4] = res.getString("storage") + " GB";
              data[i][5] = res.getString("ram") + " GB";
              data[i][6] = "RM " + res.getString("price");
              data[i][7] = res.getString("quantity");
              double calcInv = Double.parseDouble(res.getString("price"))*Double.parseDouble(res.getString("quantity")); 
              data[i][8] = "RM " + String.format("%,.2f", calcInv);
  
            
              model.addRow(data[i]);
              
              i++;
            }
            
        }catch(SQLException e){
        
            
        }//END TRY-CATCH
    }
    
        public void reloadTable(){
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblWelcome = new javax.swing.JLabel();
        lblLoginas = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAddProd = new javax.swing.JButton();
        btnEditProd = new javax.swing.JButton();
        btnDeleteProd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 0, 102));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));

        lblWelcome.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcome.setText("Welcome username !");

        lblLoginas.setForeground(new java.awt.Color(255, 255, 255));
        lblLoginas.setText("You are login as : ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventorymanagementsystem/box (1).png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Product Management");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(140, 140, 140)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(367, 367, 367))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblWelcome)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLoginas)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(22, 22, 22)
                                .addComponent(lblWelcome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(20, 20, 20)))
                        .addComponent(lblLoginas)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(29, 29, 29))))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Brand", "Model", "Type", "Storage", "RAM", "Price", "Quantity", "Inventory Value"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnAddProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventorymanagementsystem/plus.png"))); // NOI18N
        btnAddProd.setText("Add Product");
        btnAddProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProdActionPerformed(evt);
            }
        });

        btnEditProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventorymanagementsystem/edit.png"))); // NOI18N
        btnEditProd.setText("Edit Product");
        btnEditProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditProdActionPerformed(evt);
            }
        });

        btnDeleteProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventorymanagementsystem/delete.png"))); // NOI18N
        btnDeleteProd.setText("Delete Product");
        btnDeleteProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeleteProd))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddProd)
                    .addComponent(btnEditProd)
                    .addComponent(btnDeleteProd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProdActionPerformed
        AddProductFrame apf = new AddProductFrame();
        apf.setVisible(true);
        apf.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAddProdActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
           reloadTable();
    }//GEN-LAST:event_formWindowGainedFocus

    private void btnEditProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditProdActionPerformed
         try{
            int row = jTable1.getSelectedRow();
            String userID = jTable1.getModel().getValueAt(row, 0).toString();
            EditProductFrame epf = new EditProductFrame();
            epf.loadData(userID);
            epf.setVisible(true);
            epf.setLocationRelativeTo(null);
         }catch(ArrayIndexOutOfBoundsException e){
             JOptionPane.showMessageDialog(null, "Please select product item from table !", "Error", JOptionPane.ERROR_MESSAGE);
         }
        

    }//GEN-LAST:event_btnEditProdActionPerformed

    private void btnDeleteProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteProdActionPerformed
        
        try{
            int row = jTable1.getSelectedRow();
            String userID = jTable1.getModel().getValueAt(row, 0).toString();
            DeleteProductFrame dpf = new DeleteProductFrame();
            dpf.loadData(userID);
            dpf.setVisible(true);
            dpf.setLocationRelativeTo(null);
        }catch(ArrayIndexOutOfBoundsException e){
             JOptionPane.showMessageDialog(null, "Please select product item from table !", 
                     "Error", JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_btnDeleteProdActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProd;
    private javax.swing.JButton btnDeleteProd;
    private javax.swing.JButton btnEditProd;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblLoginas;
    private javax.swing.JLabel lblWelcome;
    // End of variables declaration//GEN-END:variables
}
