/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package market;

import java.sql.*;
import javax.swing.table.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author aflia
 */
public class Supplier extends javax.swing.JFrame {
private Connection conn;
private boolean isUpdateEnabled = false;

private void koneksi() {
    try {
        String url = "jdbc:mysql://localhost:3306/market"; // Ganti sesuai konfigurasi database
        String user = "root"; // Username database
        String pass = "1"; // Password database
        conn = DriverManager.getConnection(url, user, pass);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Koneksi ke database gagal: " + e.getMessage());
    }
}
    /**
     * Creates new form About
     */
    public Supplier() {
        initComponents();
        koneksi();
    loadData();
    }
    
    private void loadData() {
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("Kode Supplier");
    model.addColumn("Nama Supplier");
    model.addColumn("No.Telepon");
    model.addColumn("Alamat");

    try {
        String query = "SELECT * FROM t_supplier";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getString("id_supplier"),
                rs.getString("nama_supplier"),
                rs.getString("no_telp"),
                rs.getString("Alamat")
            });
        }

        jTable1.setModel(model);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Gagal memuat data: " + e.getMessage());
    }
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txHome = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txAbout = new javax.swing.JLabel();
        txBarang = new javax.swing.JLabel();
        txSupplier = new javax.swing.JLabel();
        txPenjualan = new javax.swing.JLabel();
        iHome = new javax.swing.JLabel();
        iBarang = new javax.swing.JLabel();
        iSupplier = new javax.swing.JLabel();
        iPenjualan = new javax.swing.JLabel();
        iAbout = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txKode_Supplier = new javax.swing.JTextField();
        txNama_Supplier = new javax.swing.JTextField();
        txNoTelp = new javax.swing.JTextField();
        txCari = new javax.swing.JTextField();
        btInput = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();
        btCari = new javax.swing.JButton();
        btHapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txAlamat = new javax.swing.JTextArea();
        btClear = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        latar = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(184, 212, 173));
        jPanel2.setLayout(null);

        txHome.setText("                    Home");
        txHome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txHomeMouseClicked(evt);
            }
        });
        jPanel2.add(txHome);
        txHome.setBounds(0, 100, 150, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon.keranjang.png"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 10, 130, 80);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/garis0.png"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 90, 110, 10);

        txAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txAboutMouseClicked(evt);
            }
        });
        jPanel2.add(txAbout);
        txAbout.setBounds(30, 350, 150, 40);

        txBarang.setText("                    Data Barang");
        txBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txBarangMouseClicked(evt);
            }
        });
        jPanel2.add(txBarang);
        txBarang.setBounds(0, 150, 150, 40);

        txSupplier.setText("                    Data Supplier");
        txSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txSupplierMouseClicked(evt);
            }
        });
        jPanel2.add(txSupplier);
        txSupplier.setBounds(0, 190, 150, 50);

        txPenjualan.setText("                    Data Penjualan");
        txPenjualan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txPenjualanMouseClicked(evt);
            }
        });
        jPanel2.add(txPenjualan);
        txPenjualan.setBounds(0, 240, 150, 50);

        iHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.Icon1.png"))); // NOI18N
        jPanel2.add(iHome);
        iHome.setBounds(10, 100, 40, 40);

        iBarang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon.barang.png"))); // NOI18N
        iBarang.setAlignmentY(0.0F);
        iBarang.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(iBarang);
        iBarang.setBounds(4, 140, 50, 50);

        iSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon.supplier.png"))); // NOI18N
        jPanel2.add(iSupplier);
        iSupplier.setBounds(2, 190, 50, 50);

        iPenjualan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/penjualan.icon1.png"))); // NOI18N
        jPanel2.add(iPenjualan);
        iPenjualan.setBounds(4, 240, 60, 50);

        iAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon.about1.png"))); // NOI18N
        jPanel2.add(iAbout);
        iAbout.setBounds(6, 290, 60, 50);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 496));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setText("Data Supplier");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel1.setText("Kode:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel2.setText("Nama Supplier:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel6.setText("Alamat:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 80, 30));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel7.setText("No.Telepon :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 100, 30));
        jPanel1.add(txKode_Supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 280, 40));
        jPanel1.add(txNama_Supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 320, 40));
        jPanel1.add(txNoTelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 280, 40));
        jPanel1.add(txCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, 130, -1));

        btInput.setText("Input");
        btInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInputActionPerformed(evt);
            }
        });
        jPanel1.add(btInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        btUpdate.setText("Update");
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, -1));

        btCari.setText("Search");
        btCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCariActionPerformed(evt);
            }
        });
        jPanel1.add(btCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 280, -1, -1));

        btHapus.setBackground(new java.awt.Color(255, 51, 51));
        btHapus.setForeground(new java.awt.Color(255, 255, 255));
        btHapus.setText("Delete");
        btHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapusActionPerformed(evt);
            }
        });
        jPanel1.add(btHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 660, 170));

        txAlamat.setColumns(20);
        txAlamat.setRows(5);
        jScrollPane2.setViewportView(txAlamat);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 320, 100));

        btClear.setText("Clear");
        btClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearActionPerformed(evt);
            }
        });
        jPanel1.add(btClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, -1, -1));

        btEdit.setBackground(new java.awt.Color(102, 102, 255));
        btEdit.setForeground(new java.awt.Color(255, 255, 255));
        btEdit.setText("Edit");
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });
        jPanel1.add(btEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, -1, -1));

        latar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/latarbelakang1.png"))); // NOI18N
        jPanel1.add(latar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 720, 500));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background.jpg"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 810, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 496));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txHomeMouseClicked
        // TODO add your handling code here:
        Dashboard home = new Dashboard();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_txHomeMouseClicked

    private void txBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txBarangMouseClicked
        // TODO add your handling code here:
        Barang barang = new Barang();
        barang.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_txBarangMouseClicked

    private void txSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txSupplierMouseClicked
        // TODO add your handling code here:
        Supplier supplier = new Supplier();
        supplier.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_txSupplierMouseClicked

    private void txPenjualanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txPenjualanMouseClicked
        // TODO add your handling code here:
        Penjualan penjualan = new Penjualan();
        penjualan.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_txPenjualanMouseClicked

    private void txAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txAboutMouseClicked
        // TODO add your handling code here:
        About about = new About();
        about.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_txAboutMouseClicked

    private void btInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInputActionPerformed
        // TODO add your handling code here:
    String kode = txKode_Supplier.getText();
    String nama = txNama_Supplier.getText();
    String notelp = txNoTelp.getText();
    String alamat = txAlamat.getText();

    try {
        String query = "INSERT INTO t_supplier (id_supplier, nama_supplier, no_telp, alamat) VALUES (?, ?, ?, ?)";
        PreparedStatement pst = conn.prepareStatement(query);
        pst.setString(1, kode);
        pst.setString(2, nama);
        pst.setString(3, notelp);
        pst.setString(4, alamat);
        pst.executeUpdate();

        JOptionPane.showMessageDialog(this, "Data berhasil disimpan.");
        loadData(); // Perbarui tabel setelah input
        clearForm(); // Hapus isi form
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Gagal menyimpan data: " + e.getMessage());
    }
    }//GEN-LAST:event_btInputActionPerformed

    private void clearForm() {
    txKode_Supplier.setText("");
    txNama_Supplier.setText("");
    txNoTelp.setText("");
    txAlamat.setText("");
}

    
    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        // TODO add your handling code here:
        if (txKode_Supplier.getText().isEmpty() || 
        txNama_Supplier.getText().isEmpty() || 
        txNoTelp.getText().isEmpty() || 
        txAlamat.getText().isEmpty()) {
        
        JOptionPane.showMessageDialog(this, "Semua field harus diisi.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    try {
        // Retrieve data dari form
        String kode = txKode_Supplier.getText(); // id_supplier
        String nama = txNama_Supplier.getText(); // nama_supplier
        String notelp = txNoTelp.getText();     // no_telp
        String alamat = txAlamat.getText();     // alamat

        // Query UPDATE
        String query = "UPDATE t_supplier SET nama_supplier = ?, no_telp = ?, alamat = ? WHERE id_supplier = ?";
        PreparedStatement pst = conn.prepareStatement(query);

        // Set parameter query
        pst.setString(1, nama);   // nama_supplier
        pst.setString(2, notelp); // no_telp
        pst.setString(3, alamat); // alamat
        pst.setString(4, kode);   // id_supplier

        // Eksekusi query
        int rowsUpdated = pst.executeUpdate();
        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(this, "Data berhasil diperbarui.");
            loadData();  // Refresh data pada tabel
            clearForm(); // Kosongkan form input
            isUpdateEnabled = false; // Reset update status
        } else {
            JOptionPane.showMessageDialog(this, "Data gagal diperbarui. Periksa ID yang dimasukkan.");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Gagal memperbarui data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btUpdateActionPerformed

    private void loadData(ResultSet rs) {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0); // Bersihkan tabel sebelum memuat data baru

    try {
        String query = "SELECT * FROM t_supplier";
        PreparedStatement pst = conn.prepareStatement(query);

        while (rs.next()) {
            // Tambahkan data ke tabel
            Object[] row = new Object[]{
                rs.getString("id_supplier"),
                rs.getString("nama_supplier"),
                rs.getString("no_telp"),
                rs.getString("alamat")
            };
            model.addRow(row);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Gagal memuat data: " + e.getMessage());
    }
}
    
    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
        // TODO add your handling code here:
        String kode = txKode_Supplier.getText();

    if (kode.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Kode barang tidak boleh kosong.");
        return;
    }

    int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        try {
            String query = "DELETE FROM t_supplier WHERE id_supplier = ?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, kode);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Data berhasil dihapus.");
            loadData();
            clearForm();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal menghapus data: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_btHapusActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if (!isUpdateEnabled) {
        JOptionPane.showMessageDialog(this, "Klik tombol Edit terlebih dahulu untuk memilih data.");
        return; // Hentikan proses lebih lanjut
    }
        
        int selectedRow = jTable1.getSelectedRow();
    if (selectedRow != -1) {
        // Retrieve data from the selected row
        String kode = jTable1.getValueAt(selectedRow, 0).toString();
        String nama = jTable1.getValueAt(selectedRow, 1).toString();
        String notelp = jTable1.getValueAt(selectedRow, 2).toString();
        String alamat = jTable1.getValueAt(selectedRow, 3).toString();
        
        // Populate form fields with the selected row's data
        txKode_Supplier.setText(kode);
        txNama_Supplier.setText(nama);
        txNoTelp.setText(notelp);
        txAlamat.setText(alamat);
    }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCariActionPerformed
        // TODO add your handling code here:
        String keyword = txCari.getText().trim();

    if (keyword != null && !keyword.isEmpty()) {
        try {
            // Kueri SQL untuk mencari data berdasarkan kode_barang, nama_barang, atau kategori
            String query = "SELECT * FROM t_supplier WHERE id_supplier LIKE ? OR nama_supplier LIKE ? OR no_telp LIKE ?";
            PreparedStatement pst = conn.prepareStatement(query);

            // Mengisi parameter kueri dengan keyword
            pst.setString(1, "%" + keyword + "%");
            pst.setString(2, "%" + keyword + "%");
            pst.setString(3, "%" + keyword + "%");

            ResultSet rs = pst.executeQuery();

            // Memuat hasil pencarian ke dalam tabel
            loadData(rs);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal mencari data: " + e.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(this, "Silakan masukkan kata kunci untuk pencarian.");
    }
    }//GEN-LAST:event_btCariActionPerformed

    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearActionPerformed
        // TODO add your handling code here:
        txKode_Supplier.setText("");
    txNama_Supplier.setText("");
    txNoTelp.setText("");
    txAlamat.setText("");
    
    isUpdateEnabled = false;
    }//GEN-LAST:event_btClearActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        // TODO add your handling code here:
        isUpdateEnabled = true;
    JOptionPane.showMessageDialog(this, "Anda sekarang dapat memilih data dari tabel.");
    }//GEN-LAST:event_btEditActionPerformed

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
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btCari;
    private javax.swing.JButton btClear;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btInput;
    private javax.swing.JButton btUpdate;
    private javax.swing.JLabel iAbout;
    private javax.swing.JLabel iBarang;
    private javax.swing.JLabel iHome;
    private javax.swing.JLabel iPenjualan;
    private javax.swing.JLabel iSupplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel latar;
    private javax.swing.JLabel txAbout;
    private javax.swing.JTextArea txAlamat;
    private javax.swing.JLabel txBarang;
    private javax.swing.JTextField txCari;
    private javax.swing.JLabel txHome;
    private javax.swing.JTextField txKode_Supplier;
    private javax.swing.JTextField txNama_Supplier;
    private javax.swing.JTextField txNoTelp;
    private javax.swing.JLabel txPenjualan;
    private javax.swing.JLabel txSupplier;
    // End of variables declaration//GEN-END:variables
}
