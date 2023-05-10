/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InicioSesion;

import HistorialClinico.Historial;
import Horarios.Horario;
import Perfil_Personal.Perfil;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyectoppc.Home;

/**
 *
 * @author Paula
 */
public class inicioMedico extends javax.swing.JFrame {

    /**
     * Creates new form inicioAdministrativo
     */
    public inicioMedico() {
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

        background = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        perfilLabel = new javax.swing.JLabel();
        historiaClinicaLabel = new javax.swing.JLabel();
        salirLabel = new javax.swing.JLabel();
        horarioLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(1280, 645));
        background.setRequestFocusEnabled(false);
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.jpg"))); // NOI18N
        logo.setText("jLabel1");
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 293, -1));

        perfilLabel.setBackground(new java.awt.Color(255, 255, 255));
        perfilLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        perfilLabel.setText("PERFIL");
        perfilLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        perfilLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        perfilLabel.setMaximumSize(new java.awt.Dimension(198, 35));
        perfilLabel.setMinimumSize(new java.awt.Dimension(198, 35));
        perfilLabel.setName(""); // NOI18N
        perfilLabel.setPreferredSize(new java.awt.Dimension(198, 35));
        perfilLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                perfilLabelMouseClicked(evt);
            }
        });
        background.add(perfilLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 280, -1, -1));

        historiaClinicaLabel.setBackground(new java.awt.Color(255, 255, 255));
        historiaClinicaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        historiaClinicaLabel.setText("HISTORIA CLÍNICA");
        historiaClinicaLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        historiaClinicaLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        historiaClinicaLabel.setMaximumSize(new java.awt.Dimension(198, 35));
        historiaClinicaLabel.setMinimumSize(new java.awt.Dimension(198, 35));
        historiaClinicaLabel.setName(""); // NOI18N
        historiaClinicaLabel.setPreferredSize(new java.awt.Dimension(198, 35));
        historiaClinicaLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                historiaClinicaLabelMouseClicked(evt);
            }
        });
        background.add(historiaClinicaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 376, -1, -1));

        salirLabel.setBackground(new java.awt.Color(255, 255, 255));
        salirLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salirLabel.setText("SALIR");
        salirLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        salirLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salirLabel.setMaximumSize(new java.awt.Dimension(198, 35));
        salirLabel.setMinimumSize(new java.awt.Dimension(198, 35));
        salirLabel.setName(""); // NOI18N
        salirLabel.setPreferredSize(new java.awt.Dimension(198, 35));
        salirLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirLabelMouseClicked(evt);
            }
        });
        background.add(salirLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 424, -1, -1));

        horarioLabel.setBackground(new java.awt.Color(255, 255, 255));
        horarioLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        horarioLabel.setText("HORARIO");
        horarioLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        horarioLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        horarioLabel.setMaximumSize(new java.awt.Dimension(198, 35));
        horarioLabel.setMinimumSize(new java.awt.Dimension(198, 35));
        horarioLabel.setName(""); // NOI18N
        horarioLabel.setPreferredSize(new java.awt.Dimension(198, 35));
        horarioLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                horarioLabelMouseClicked(evt);
            }
        });
        background.add(horarioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 328, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void perfilLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_perfilLabelMouseClicked
        try {
            // TODO add your handling code here:
            this.dispose();
            new Perfil().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(inicioMedico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(inicioMedico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_perfilLabelMouseClicked

    private void historiaClinicaLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historiaClinicaLabelMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new Historial().setVisible(true);
    }//GEN-LAST:event_historiaClinicaLabelMouseClicked

    private void salirLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirLabelMouseClicked
        // TODO add your handling code here:
         this.dispose();
        new Home().setVisible(true);
        System.out.println("Cerrando Sesión");
    }//GEN-LAST:event_salirLabelMouseClicked

    private void horarioLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_horarioLabelMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new Horario().setVisible(true);
    }//GEN-LAST:event_horarioLabelMouseClicked

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
            java.util.logging.Logger.getLogger(inicioMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicioMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicioMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicioMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicioMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel historiaClinicaLabel;
    private javax.swing.JLabel horarioLabel;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel perfilLabel;
    private javax.swing.JLabel salirLabel;
    // End of variables declaration//GEN-END:variables
}
