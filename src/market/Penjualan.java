/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package market;

import java.awt.Color;

/**
 *
 * @author aflia
 */
public class Penjualan extends javax.swing.JFrame {

    /**
     * Creates new form About
     */
    public Penjualan() {
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
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txNo_Penjualan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txPelanggan = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txNamaBarang = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txHargaJual = new javax.swing.JTextField();
        btTambah = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txJumlah = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txKeteranagn = new javax.swing.JTextArea();
        latar = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(184, 212, 173));
        jPanel2.setLayout(null);

        txHome.setText("                    Home");
        txHome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txHomeMouseExited(evt);
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

        txAbout.setText("                    Tentang");
        txAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txAboutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txAboutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txAboutMouseExited(evt);
            }
        });
        jPanel2.add(txAbout);
        txAbout.setBounds(0, 290, 150, 50);

        txBarang.setText("                    Data Barang");
        txBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txBarangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txBarangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txBarangMouseExited(evt);
            }
        });
        jPanel2.add(txBarang);
        txBarang.setBounds(0, 150, 150, 40);

        txSupplier.setText("                    Data Supplier");
        txSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txSupplierMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txSupplierMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txSupplierMouseExited(evt);
            }
        });
        jPanel2.add(txSupplier);
        txSupplier.setBounds(0, 190, 150, 50);

        txPenjualan.setText("                    Data Penjualan");
        txPenjualan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txPenjualanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txPenjualanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txPenjualanMouseExited(evt);
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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 496));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setText("Data Penjualan");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 130, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel1.setText("DATA TRANSAKSI");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel2.setText("No.Penjualan");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel6.setText("Pelanggan");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel8.setText("Keterangan");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, -1, -1));
        jPanel1.add(txNo_Penjualan, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 150, -1));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel9.setText("Jumlah");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));
        jPanel1.add(txPelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 150, -1));

        jTextField3.setText("jTextField3");
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, -1, -1));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel10.setText("INPUT BARANG");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, -1, -1));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel11.setText("Nama Barang");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        txNamaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNamaBarangActionPerformed(evt);
            }
        });
        jPanel1.add(txNamaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 150, -1));

        jLabel12.setText("jLabel12");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 190, -1, -1));

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel13.setText("Harga Jual");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, -1, -1));
        jPanel1.add(txHargaJual, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 160, -1));

        btTambah.setText("Tambah");
        jPanel1.add(btTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 320, -1, -1));

        jLabel14.setText("jLabel14");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 240, -1, -1));

        txJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txJumlahActionPerformed(evt);
            }
        });
        jPanel1.add(txJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 90, -1));

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
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 360, 600, 120));

        txKeteranagn.setColumns(20);
        txKeteranagn.setRows(5);
        jScrollPane2.setViewportView(txKeteranagn);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 280, 60));

        latar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/latarbelakang1.png"))); // NOI18N
        jPanel1.add(latar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 720, 500));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background.jpg"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 810, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 496));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txNamaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNamaBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNamaBarangActionPerformed

    private void txJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txJumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txJumlahActionPerformed

    private void txHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txHomeMouseClicked
        // TODO add your handling code here:
        Dashboard home = new Dashboard();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_txHomeMouseClicked

    private void txHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txHomeMouseEntered
        // TODO add your handling code here:
        txHome.setForeground(Color.BLUE);
    }//GEN-LAST:event_txHomeMouseEntered

    private void txHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txHomeMouseExited
        // TODO add your handling code here:
        txHome.setForeground(Color.BLACK);
    }//GEN-LAST:event_txHomeMouseExited

    private void txAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txAboutMouseClicked
        // TODO add your handling code here:
        About about = new About();
        about.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_txAboutMouseClicked

    private void txAboutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txAboutMouseEntered
        // TODO add your handling code here:
        txAbout.setForeground(Color.BLUE);
    }//GEN-LAST:event_txAboutMouseEntered

    private void txAboutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txAboutMouseExited
        // TODO add your handling code here:
        txAbout.setForeground(Color.BLACK);
    }//GEN-LAST:event_txAboutMouseExited

    private void txBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txBarangMouseClicked
        // TODO add your handling code here:
        Barang barang = new Barang();
        barang.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_txBarangMouseClicked

    private void txBarangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txBarangMouseEntered
        // TODO add your handling code here:
        txBarang.setForeground(Color.BLUE);
    }//GEN-LAST:event_txBarangMouseEntered

    private void txBarangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txBarangMouseExited
        // TODO add your handling code here:
        txBarang.setForeground(Color.BLACK);
    }//GEN-LAST:event_txBarangMouseExited

    private void txSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txSupplierMouseClicked
        // TODO add your handling code here:
        Supplier supplier = new Supplier();
        supplier.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_txSupplierMouseClicked

    private void txSupplierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txSupplierMouseEntered
        // TODO add your handling code here:
        txSupplier.setForeground(Color.BLUE);
    }//GEN-LAST:event_txSupplierMouseEntered

    private void txSupplierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txSupplierMouseExited
        // TODO add your handling code here:
        txSupplier.setForeground(Color.BLACK);
    }//GEN-LAST:event_txSupplierMouseExited

    private void txPenjualanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txPenjualanMouseClicked
        // TODO add your handling code here:
        Penjualan penjualan = new Penjualan();
        penjualan.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_txPenjualanMouseClicked

    private void txPenjualanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txPenjualanMouseEntered
        // TODO add your handling code here:
        txPenjualan.setForeground(Color.BLUE);
    }//GEN-LAST:event_txPenjualanMouseEntered

    private void txPenjualanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txPenjualanMouseExited
        // TODO add your handling code here:
        txPenjualan.setForeground(Color.BLACK);
    }//GEN-LAST:event_txPenjualanMouseExited

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
            java.util.logging.Logger.getLogger(Penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Penjualan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btTambah;
    private javax.swing.JLabel iAbout;
    private javax.swing.JLabel iBarang;
    private javax.swing.JLabel iHome;
    private javax.swing.JLabel iPenjualan;
    private javax.swing.JLabel iSupplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel latar;
    private javax.swing.JLabel txAbout;
    private javax.swing.JLabel txBarang;
    private javax.swing.JTextField txHargaJual;
    private javax.swing.JLabel txHome;
    private javax.swing.JTextField txJumlah;
    private javax.swing.JTextArea txKeteranagn;
    private javax.swing.JTextField txNamaBarang;
    private javax.swing.JTextField txNo_Penjualan;
    private javax.swing.JTextField txPelanggan;
    private javax.swing.JLabel txPenjualan;
    private javax.swing.JLabel txSupplier;
    // End of variables declaration//GEN-END:variables
}
