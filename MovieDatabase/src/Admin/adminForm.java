/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import Admin.addAdmin;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Abdurrahman Khairi
 */
public class adminForm extends javax.swing.JFrame {

    /**
     * Creates new form adminForm
     */
    public adminForm() {
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

        addAdmin = new javax.swing.JButton();
        removeAdmin = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        banUser = new javax.swing.JButton();
        editMovie = new javax.swing.JButton();
        deleteMovie = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        requestedMovieButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Mode");
        setBounds(new java.awt.Rectangle(650, 200, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addAdmin.setBackground(new java.awt.Color(0, 51, 51));
        addAdmin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addAdmin.setForeground(new java.awt.Color(255, 255, 255));
        addAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviedatabase/Images/icons8-ok-35.png"))); // NOI18N
        addAdmin.setText("Add Admin");
        addAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAdminActionPerformed(evt);
            }
        });
        getContentPane().add(addAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 232, -1));

        removeAdmin.setBackground(new java.awt.Color(0, 51, 51));
        removeAdmin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        removeAdmin.setForeground(new java.awt.Color(255, 255, 255));
        removeAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviedatabase/Images/icons8-remove-35.png"))); // NOI18N
        removeAdmin.setText("Remove Admin");
        removeAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAdminActionPerformed(evt);
            }
        });
        getContentPane().add(removeAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 232, -1));

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviedatabase/Images/icons8-movie-35.png"))); // NOI18N
        jButton1.setText("Add Movie");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 232, -1));

        banUser.setBackground(new java.awt.Color(0, 51, 51));
        banUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        banUser.setForeground(new java.awt.Color(255, 255, 255));
        banUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviedatabase/Images/icons8-remove-user-35.png"))); // NOI18N
        banUser.setText("Ban User");
        banUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                banUserActionPerformed(evt);
            }
        });
        getContentPane().add(banUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 232, -1));

        editMovie.setBackground(new java.awt.Color(0, 51, 51));
        editMovie.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        editMovie.setForeground(new java.awt.Color(255, 255, 255));
        editMovie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviedatabase/Images/icons8-edit-35.png"))); // NOI18N
        editMovie.setText("Edit Movie");
        editMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMovieActionPerformed(evt);
            }
        });
        getContentPane().add(editMovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 232, -1));

        deleteMovie.setBackground(new java.awt.Color(0, 51, 51));
        deleteMovie.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deleteMovie.setForeground(new java.awt.Color(255, 255, 255));
        deleteMovie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviedatabase/Images/icons8-remove-35.png"))); // NOI18N
        deleteMovie.setText("Delete Movie");
        deleteMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMovieActionPerformed(evt);
            }
        });
        getContentPane().add(deleteMovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 232, -1));

        logout.setBackground(new java.awt.Color(0, 51, 51));
        logout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviedatabase/Images/icons8-logout-rounded-left-35.png"))); // NOI18N
        logout.setText("Log Out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 232, -1));

        requestedMovieButton.setBackground(new java.awt.Color(0, 51, 51));
        requestedMovieButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        requestedMovieButton.setForeground(new java.awt.Color(255, 255, 255));
        requestedMovieButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviedatabase/Images/head.png"))); // NOI18N
        requestedMovieButton.setText("Requested Movies");
        requestedMovieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestedMovieButtonActionPerformed(evt);
            }
        });
        getContentPane().add(requestedMovieButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 232, 43));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviedatabase/Images/FormBackground (4).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(600, 600));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAdminActionPerformed
        new addAdmin().setVisible(true);
    }//GEN-LAST:event_addAdminActionPerformed

    private void removeAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAdminActionPerformed
        new removeAdmin().setVisible(true);
    }//GEN-LAST:event_removeAdminActionPerformed

    private void banUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banUserActionPerformed
        new banUser().setVisible(true);
    }//GEN-LAST:event_banUserActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new addMovie().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        int value = JOptionPane.showConfirmDialog(null, "Are You sure?", "Warning", JOptionPane.YES_NO_OPTION);
        if (value == 0) {
            this.setVisible(false);
            new adminLoginForm().setVisible(true);
        }
    }//GEN-LAST:event_logoutActionPerformed

    private void editMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMovieActionPerformed
        new editMovie().setVisible(true);
    }//GEN-LAST:event_editMovieActionPerformed

    private void deleteMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMovieActionPerformed
        new deleteMovieForm().setVisible(true);
    }//GEN-LAST:event_deleteMovieActionPerformed

    private void requestedMovieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestedMovieButtonActionPerformed
        new requestedMovie().setVisible(true);
    }//GEN-LAST:event_requestedMovieButtonActionPerformed

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
            java.util.logging.Logger.getLogger(adminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAdmin;
    private javax.swing.JButton banUser;
    private javax.swing.JButton deleteMovie;
    private javax.swing.JButton editMovie;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logout;
    private javax.swing.JButton removeAdmin;
    private javax.swing.JButton requestedMovieButton;
    // End of variables declaration//GEN-END:variables
}
