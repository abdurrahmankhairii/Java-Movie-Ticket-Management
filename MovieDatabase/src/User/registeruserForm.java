/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import javax.swing.JOptionPane;
import moviedatabase.database;

/**
 *
 * @author Abdurrahman Khairi
 */
public class registeruserForm extends javax.swing.JFrame {

    /**
     * Creates new form registeruserForm
     */
    public registeruserForm() {
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

        register = new javax.swing.JButton();
        username = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        backButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration Form");
        setBounds(new java.awt.Rectangle(650, 200, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        register.setBackground(new java.awt.Color(0, 0, 51));
        register.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        register.setForeground(java.awt.Color.white);
        register.setText("Register");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        getContentPane().add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 280, -1));

        username.setBackground(new java.awt.Color(0, 0, 51));
        username.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        username.setForeground(java.awt.Color.white);
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 222, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviedatabase/Images/icons8-user-40.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        password.setBackground(new java.awt.Color(0, 0, 51));
        password.setForeground(java.awt.Color.white);
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 222, 39));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviedatabase/Images/icons8-password-40.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        backButton2.setBackground(new java.awt.Color(0, 0, 51));
        backButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backButton2.setForeground(java.awt.Color.white);
        backButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviedatabase/Images/icons8-back-40.png"))); // NOI18N
        backButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(backButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 60, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviedatabase/Images/FormBackground (3).png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setMaximumSize(new java.awt.Dimension(0, 0));
        jLabel3.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel3.setPreferredSize(new java.awt.Dimension(600, 600));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        String user = this.username.getText();
        String pwd = new String(this.password.getPassword());
        if (user.length() == 0) {
            JOptionPane.showMessageDialog(null, "Username required");
        } else if (user.length() < 5) {
            JOptionPane.showMessageDialog(null, "Username is too short");
        } else if (user.length() > 10) {
            JOptionPane.showMessageDialog(null, "Username is too long");
        } else if (pwd.length() == 0) {
            JOptionPane.showMessageDialog(null, "Password required");
        } else if (pwd.length() < 5) {
            JOptionPane.showMessageDialog(null, "Password is too short");
        } else if (pwd.length() > 10) {
            JOptionPane.showMessageDialog(null, "Password is too long");
        } else {
            if (database.bannedUser(user)) {
                JOptionPane.showMessageDialog(null, "This user is banned!");
            } else if (database.adminOrNormalExists(user, 2)) {
                JOptionPane.showMessageDialog(null, "User exists");
            } else {
                JOptionPane.showMessageDialog(null, "Registration Successfull!");
                database.insertAdminOrNormalUser(user, pwd, 2);
                this.setVisible(false);
                new userForm().setVisible(true);
            }
        }
    }//GEN-LAST:event_registerActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void backButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton2ActionPerformed
        this.setVisible(false);
        new userForm().setVisible(true);
    }//GEN-LAST:event_backButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(registeruserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registeruserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registeruserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registeruserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registeruserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton register;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
