/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import javax.swing.JOptionPane;
import moviedatabase.database;

/**
 *
 * @author Abdurrahman Khairi
 */
public class editMovieForm extends javax.swing.JFrame {

    private String s, curMovie;

    /**
     * Creates new form editMovieForm
     *
     * @param s
     */
    public editMovieForm(String s) {
        this.s = database.getMovieDetails(s);
        initComponents();
        this.setDesign(this.s);
    }

    public editMovieForm() {
        initComponents();
        this.setDesign(this.s);
    }

    private void setDesign(String s) {
        String temp[] = s.split(",");
        this.movieName.setText(temp[0]);
        genreComboBox.setSelectedItem(temp[0]);
        this.movieDirector.setText(temp[2]);
        this.movieLength.setText(temp[3]);
        this.movieRating.setText(temp[4]);
        if (!temp[5].equals("nothing")) {
            this.url.setText(temp[5]);
        }
        this.curMovie = temp[0];
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        movieName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        movieDirector = new javax.swing.JTextField();
        movieLength = new javax.swing.JTextField();
        movieRating = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        genreComboBox = new javax.swing.JComboBox<>();
        url = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Movie");
        setBounds(new java.awt.Rectangle(650, 200, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Movie Details");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        movieName.setBackground(new java.awt.Color(0, 0, 51));
        movieName.setForeground(new java.awt.Color(255, 255, 255));
        movieName.setMaximumSize(null);
        movieName.setMinimumSize(null);
        movieName.setName(""); // NOI18N
        movieName.setPreferredSize(new java.awt.Dimension(80, 30));
        movieName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movieNameActionPerformed(evt);
            }
        });
        getContentPane().add(movieName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 240, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Genre     :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 93, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Director :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 93, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Length   :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 93, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Rating   :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 93, -1));

        movieDirector.setBackground(new java.awt.Color(0, 0, 51));
        movieDirector.setForeground(new java.awt.Color(255, 255, 255));
        movieDirector.setMaximumSize(null);
        movieDirector.setMinimumSize(null);
        movieDirector.setName(""); // NOI18N
        movieDirector.setPreferredSize(new java.awt.Dimension(80, 30));
        getContentPane().add(movieDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 238, -1));

        movieLength.setBackground(new java.awt.Color(0, 0, 51));
        movieLength.setForeground(new java.awt.Color(255, 255, 255));
        movieLength.setMaximumSize(null);
        movieLength.setMinimumSize(null);
        movieLength.setName(""); // NOI18N
        movieLength.setPreferredSize(new java.awt.Dimension(80, 30));
        getContentPane().add(movieLength, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 238, -1));

        movieRating.setBackground(new java.awt.Color(0, 0, 51));
        movieRating.setForeground(new java.awt.Color(255, 255, 255));
        movieRating.setMaximumSize(null);
        movieRating.setMinimumSize(null);
        movieRating.setName(""); // NOI18N
        movieRating.setPreferredSize(new java.awt.Dimension(80, 30));
        getContentPane().add(movieRating, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 238, -1));

        updateButton.setBackground(new java.awt.Color(0, 0, 51));
        updateButton.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviedatabase/Images/icons8-ok-25.png"))); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 340, -1));

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Name     : ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 91, -1));

        genreComboBox.setBackground(new java.awt.Color(0, 0, 51));
        genreComboBox.setForeground(new java.awt.Color(255, 255, 255));
        genreComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACTION", "ADVENTURE", "ANIMATION", "BIOGRAPHY", "COMEDY", "CRIME", "DOCUMENTARY", "DRAMA", "FICTION", "FANTASY", "HORROR", "MUSICAL", "NOIR", "ROMANCE", "SCIENCE_FICTION", "SCIENCE", "SPORTS", "THRILLER", "WAR" }));
        getContentPane().add(genreComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 230, -1));

        url.setBackground(new java.awt.Color(0, 0, 51));
        url.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(url, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 238, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 51));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Image Url:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviedatabase/Images/FormBackground (2).png"))); // NOI18N
        jLabel7.setText("jLabel7");
        jLabel7.setPreferredSize(new java.awt.Dimension(600, 600));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void movieNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movieNameActionPerformed

    }//GEN-LAST:event_movieNameActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        String genre = genreComboBox.getSelectedItem().toString();
        if (this.movieName.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Movie Name Required");
        } else if (genre.length() == 0) {
            JOptionPane.showMessageDialog(null, "Movie Genre Required");
        } else if (this.movieDirector.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Movie Director Required");
        } else if (this.movieLength.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Movie Length Required");
        } else if (this.movieRating.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Movie Rating Required");
        } else {
            database.deleteMovieOrRequest(this.curMovie, 1);
            database.addMovie(this.movieName.getText().toUpperCase(), genre.toUpperCase(), this.movieDirector.getText().toUpperCase(),
                    this.movieLength.getText(), this.movieRating.getText(), this.url.getText());
            JOptionPane.showMessageDialog(null, "Movie Updated Successfully!");
            this.setVisible(false);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

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
            java.util.logging.Logger.getLogger(editMovieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editMovieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editMovieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editMovieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editMovieForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> genreComboBox;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField movieDirector;
    private javax.swing.JTextField movieLength;
    private javax.swing.JTextField movieName;
    private javax.swing.JTextField movieRating;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField url;
    // End of variables declaration//GEN-END:variables
}
