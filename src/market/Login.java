/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package market;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import market.Config;
import static market.Config.writeLog;
import market.Dashboard;

/**
 *
 * @author aflia
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        ImageIcon appIcon = new ImageIcon("src/image/iconMarket..png");
        this.setIconImage(appIcon.getImage());
        
        // Mengatur judul jendela
        this.setTitle("Organic Life");
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btLogin = new javax.swing.JButton();
        gambar = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(60, 94, 47));
        jLabel1.setText("LOGIN");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 40, 110, 40);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(52, 96, 66));
        jLabel2.setText("User");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 80, 30, 14);

        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 94, 47), 2));
        jPanel1.add(txtEmail);
        txtEmail.setBounds(30, 100, 160, 20);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(52, 96, 66));
        jLabel3.setText("Password");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 140, 70, 14);

        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 94, 47), 2));
        jPanel1.add(txtPassword);
        txtPassword.setBounds(30, 160, 160, 20);

        btLogin.setBackground(new java.awt.Color(60, 94, 47));
        btLogin.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btLogin.setForeground(new java.awt.Color(221, 255, 230));
        btLogin.setText("LOGIN");
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btLogin);
        btLogin.setBounds(30, 200, 160, 30);

        gambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/gambariconsamping.png"))); // NOI18N
        gambar.setText("jLabel4");
        jPanel1.add(gambar);
        gambar.setBounds(190, 0, 230, 310);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/360_F_135628942_wAZhAFbDfQpTI533KoCSG3Vq9YfuSA8F[1].jpg"))); // NOI18N
        background.setText("jLabel1");
        jPanel1.add(background);
        background.setBounds(0, 0, 400, 300);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
        // TODO add your handling code here:
        String email = txtEmail.getText();
    String password = txtPassword.getText();
    String sql = "SELECT COUNT(*) AS apakahAda FROM t_user WHERE email = ? AND password = ?";

    try {
        // Menginisialisasi koneksi menggunakan Config
        java.sql.Connection conn = Config.getConfig();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, email);    // Set parameter pertama (email)
        pst.setString(2, password); // Set parameter kedua (password)

        java.sql.ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            int apakahAda = rs.getInt("apakahAda");
            if (apakahAda > 0) {
                // Jika pengguna ditemukan
                JOptionPane.showMessageDialog(null, "Selamat datang");
                Dashboard formUtama = new Dashboard();
                formUtama.setVisible(true);
                dispose();
            } else {
                // Jika pengguna tidak ditemukan
                JOptionPane.showMessageDialog(null, "Silakan masukkan email dan password dengan benar.");
            }
        }
    } catch (java.sql.SQLException e) {
        // Menampilkan pesan error
        JOptionPane.showMessageDialog(null, "Terjadi kegagalan: " + e.getMessage());
        Config.writeLog("Koneksi gagal: " + e.getMessage()); // Catat log kegagalan
    }
    }//GEN-LAST:event_btLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         

      

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btLogin;
    private javax.swing.JLabel gambar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
