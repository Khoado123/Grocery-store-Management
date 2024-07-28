/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WriteFeedback;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TuanTuti
 */
public class Product_Frame extends javax.swing.JFrame {

    /**
     * Creates new form frmForm
     */
    public Product_Frame() {
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

        pnlform = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblMaSanPham = new javax.swing.JLabel();
        txtLoaiSP = new javax.swing.JTextField();
        lblTenSanPham = new javax.swing.JLabel();
        txtTenSanPham = new javax.swing.JTextField();
        lblSoLuong = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        lblGiaBan = new javax.swing.JLabel();
        txtGiaBan = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnTaoMoi = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlform.setBackground(new java.awt.Color(0, 153, 102));
        pnlform.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 241, 11));
        jLabel1.setText("THÔNG TIN SẢN PHẨM");

        lblMaSanPham.setText("Category");

        txtLoaiSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoaiSPActionPerformed(evt);
            }
        });

        lblTenSanPham.setText("Product Name");

        txtTenSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenSanPhamActionPerformed(evt);
            }
        });

        lblSoLuong.setText("Quantity");

        lblGiaBan.setText("Price");

        txtGiaBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGiaBanActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnTaoMoi.setText("Tạo Mới");
        btnTaoMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoMoiActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        jButton5.setText("Home/Users");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlformLayout = new javax.swing.GroupLayout(pnlform);
        pnlform.setLayout(pnlformLayout);
        pnlformLayout.setHorizontalGroup(
            pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlformLayout.createSequentialGroup()
                .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlformLayout.createSequentialGroup()
                        .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlformLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(btnTaoMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlformLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5))))
                    .addGroup(pnlformLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGiaBan)
                            .addComponent(lblTenSanPham))
                        .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlformLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                                .addComponent(lblMaSanPham))
                            .addGroup(pnlformLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSoLuong)))
                        .addGap(18, 18, 18)
                        .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlformLayout.createSequentialGroup()
                                .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49))
                            .addComponent(txtLoaiSP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlformLayout.setVerticalGroup(
            pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlformLayout.createSequentialGroup()
                .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlformLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton5))
                    .addComponent(jLabel1))
                .addGap(47, 47, 47)
                .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTenSanPham)
                    .addComponent(txtLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaSanPham))
                .addGap(18, 18, 18)
                .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGiaBan)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSoLuong))
                .addGap(42, 42, 42)
                .addComponent(btnThem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua)
                    .addComponent(btnTaoMoi))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "product_id", "product_name", "price", "category", "quantity_inventory"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSanPham);
        if (tblSanPham.getColumnModel().getColumnCount() > 0) {
            tblSanPham.getColumnModel().getColumn(0).setHeaderValue("product_id");
            tblSanPham.getColumnModel().getColumn(1).setHeaderValue("product_name");
            tblSanPham.getColumnModel().getColumn(2).setHeaderValue("price");
            tblSanPham.getColumnModel().getColumn(3).setHeaderValue("category");
            tblSanPham.getColumnModel().getColumn(4).setHeaderValue("quantity_inventory");
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlform, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlform, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void LayDuLieu(){
        String SQL = "Select * from dbo.Product";
        ResultSet rs= null;
        try (var conn = dsConnectDatabase.dataSource.getConnection()){
        Statement st = conn.createStatement();
             rs = st.executeQuery(SQL);
        Object [] obj = new Object[]{"product_id", "product_name", "price", "category", "quantity_inventory"};        DefaultTableModel tableModel = new DefaultTableModel(obj,0);
        DefaultTableModel tableModel2  = new DefaultTableModel(obj, 0);
        tblSanPham.setModel(tableModel2);
        
            while(rs.next()){
                Object [] item = new Object[5];
//                item[0] = tblSanPham.getRowCount() + 1;
                item[0] = rs.getString("product_id");
                item[1] = rs.getString("product_name");
                item[2] = rs.getFloat("price");
                item[3] = rs.getString("category");
                item[4] = rs.getInt("quantity_inventory");        
                tableModel2.addRow(item);
            
        }
          
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
   
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        LayDuLieu();
    }//GEN-LAST:event_formWindowOpened

    private void btnTaoMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoMoiActionPerformed
        // TODO add your handling code here:
        txtTenSanPham.setText("");
        txtGiaBan.setText("");
        txtLoaiSP.setText("");
        txtSoLuong.setText("");
    }//GEN-LAST:event_btnTaoMoiActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
    String product_name = txtTenSanPham.getText();
    int index = tblSanPham.getSelectedRow();
    float price = Float.parseFloat(txtGiaBan.getText());
    String category = txtLoaiSP.getText();
    int quantity_inventory = Integer.parseInt(txtSoLuong.getText());
     String id = tblSanPham.getValueAt(index, 0).toString();
    int product_id = Integer.parseInt(id);
    //
    String SQL = "UPDATE dbo.Product SET "
    + "product_name = '"+product_name+"', "
    + "price = "+price+", "
    + "category = '"+category+"', "
    + "quantity_inventory = "+quantity_inventory+" "
    + "WHERE product_id = "+product_id;
    Inventory.connection.executeQueryUpdateDB(SQL);
        LayDuLieu();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        if(txtLoaiSP.getText().isEmpty() || txtTenSanPham.getText().isEmpty() || txtSoLuong.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin!", "Thông báo", JOptionPane.WARNING_MESSAGE);
}
        String product_name = txtTenSanPham.getText();
        float price = Float.parseFloat(txtGiaBan.getText());
        String category = txtLoaiSP.getText();
        int quantity_inventory = Integer.parseInt(txtSoLuong.getText());
        
        //

        String SQL = "INSERT INTO dbo.Product(product_name, price, category, quantity_inventory) VALUES ('" + product_name + "', " + price + ", N'" + category + "', " + quantity_inventory + ")";
        if( "".equals(product_name) && "".equals(price) && "".equals(category) && "".equals(quantity_inventory)){
            Inventory.thongBao("Bạn chưa nhập đầy đủ dữ liệu", "Thông Báo", 1);
        }
        else{
            Inventory.connection.executeQueryUpdateDB(SQL);
        }
        LayDuLieu();
    }//GEN-LAST:event_btnThemActionPerformed

    private void txtLoaiSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoaiSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoaiSPActionPerformed

    private void txtGiaBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiaBanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGiaBanActionPerformed

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        // TODO add your handling code here:
    int index = tblSanPham.getSelectedRow();
    txtTenSanPham.setText(tblSanPham.getValueAt(index, 1).toString());
    txtGiaBan.setText(tblSanPham.getValueAt(index, 2).toString());
    txtLoaiSP.setText(tblSanPham.getValueAt(index, 3).toString());
    txtSoLuong.setText(tblSanPham.getValueAt(index, 4).toString());
    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void txtTenSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenSanPhamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenSanPhamActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed
    
    
    

    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Product_Frame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTaoMoi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGiaBan;
    private javax.swing.JLabel lblMaSanPham;
    private javax.swing.JLabel lblSoLuong;
    private javax.swing.JLabel lblTenSanPham;
    private javax.swing.JPanel pnlform;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtGiaBan;
    private javax.swing.JTextField txtLoaiSP;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenSanPham;
    // End of variables declaration//GEN-END:variables
}
