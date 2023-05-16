/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perfil_Personal;

import InicioSesion.inicioMedico;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import personal.persona;

/**
 *
 * @author DELL
 */
public class Perfil extends javax.swing.JFrame {

    /**
     * Creates new form Perfil
     * AQUI DEBEERIA IR EL DNI DE LA PERSONA QUE SE HA LOGEADO, HAY QUE SOLUCIONAR ESO LUEGO. 
     */
    persona perf= new Perfil_Controlador().datos(12345676);
    
   
    
    public Perfil() throws SQLException, IOException {
        initComponents();
        colocar(perf); 
    }
   public void colocar(persona per) throws SQLException, IOException{
        this.nombres.setText(per.getNombres());
        this.apellido_materno.setText(per.getAm());
        this.apellido_paterno.setText(per.getAp());
//        this.turno.setSelectedIndex(Integer.parseInt(per.getTurno().trim()));
//        this.foto.setText(per.getFoto());
       this.dni.setText(per.getDni()+"");
        this.telefono.setText(per.getTelef()+"");
        this.fecha_nac.setText(per.getNacim()+"");
        this.sexo.setText(per.getSexo());
        this.especialidad.setText(per.getEspecialidad());
        this.turno.setText(per.getTurno().trim());
        InputStream in = per.getFoto().getBinaryStream();  
        BufferedImage imagen = ImageIO.read(in);
        Image image = imagen.getScaledInstance(200, 250, Image.SCALE_DEFAULT);
        this.foto.setIcon((new ImageIcon(image)));
        this.foto.setText("");
        
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
        jLabel2 = new javax.swing.JLabel();
        foto = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombres = new javax.swing.JTextField();
        nombreLabel = new javax.swing.JLabel();
        sexo = new javax.swing.JTextField();
        dniLabel = new javax.swing.JLabel();
        fecha_nac = new javax.swing.JTextField();
        nacimientoLabel = new javax.swing.JLabel();
        apellido_paterno = new javax.swing.JTextField();
        apePaternoLabel = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        telefonoLabel = new javax.swing.JLabel();
        apellido_materno = new javax.swing.JTextField();
        apeMaternoLabel = new javax.swing.JLabel();
        sexLabel = new javax.swing.JLabel();
        especialidadLabel = new javax.swing.JLabel();
        turnoLabel = new javax.swing.JLabel();
        dni = new javax.swing.JTextField();
        turno = new javax.swing.JTextField();
        especialidad = new javax.swing.JTextField();
        botonRegresar_Perfil = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 645));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel2.setText("PERFIL");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 100, 40));

        foto.setText("foto");
        jPanel1.add(foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setText("DATOS PERSONALES");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, -1));

        nombres.setDisabledTextColor(new java.awt.Color(217, 217, 217));
        nombres.setPreferredSize(new java.awt.Dimension(284, 35));
        jPanel1.add(nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, -1, -1));

        nombreLabel.setText("NOMBRES");
        jPanel1.add(nombreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));

        sexo.setDisabledTextColor(new java.awt.Color(217, 217, 217));
        sexo.setPreferredSize(new java.awt.Dimension(284, 35));
        jPanel1.add(sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 530, -1, -1));

        dniLabel.setText("DNI");
        jPanel1.add(dniLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, -1, -1));

        fecha_nac.setDisabledTextColor(new java.awt.Color(217, 217, 217));
        fecha_nac.setPreferredSize(new java.awt.Dimension(284, 35));
        jPanel1.add(fecha_nac, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, -1, -1));

        nacimientoLabel.setText("FECHA DE NACIMIENTO");
        jPanel1.add(nacimientoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 150, -1));

        apellido_paterno.setDisabledTextColor(new java.awt.Color(217, 217, 217));
        apellido_paterno.setPreferredSize(new java.awt.Dimension(284, 35));
        jPanel1.add(apellido_paterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, -1, -1));

        apePaternoLabel.setText("APELLIDO PATERNO");
        jPanel1.add(apePaternoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, -1, -1));

        telefono.setDisabledTextColor(new java.awt.Color(217, 217, 217));
        telefono.setPreferredSize(new java.awt.Dimension(284, 35));
        jPanel1.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 460, -1, -1));

        telefonoLabel.setText("TELÉFONO");
        jPanel1.add(telefonoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 440, -1, -1));

        apellido_materno.setDisabledTextColor(new java.awt.Color(217, 217, 217));
        apellido_materno.setPreferredSize(new java.awt.Dimension(284, 35));
        jPanel1.add(apellido_materno, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 390, -1, -1));

        apeMaternoLabel.setText("APELLIDO MATERNO");
        jPanel1.add(apeMaternoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 370, 120, -1));

        sexLabel.setText("SEXO");
        jPanel1.add(sexLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 510, -1, -1));

        especialidadLabel.setText("ESPECIALIDAD");
        jPanel1.add(especialidadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, -1, -1));

        turnoLabel.setText("TURNO");
        jPanel1.add(turnoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, -1, -1));

        dni.setDisabledTextColor(new java.awt.Color(217, 217, 217));
        dni.setPreferredSize(new java.awt.Dimension(284, 35));
        jPanel1.add(dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, -1, -1));

        turno.setDisabledTextColor(new java.awt.Color(217, 217, 217));
        turno.setPreferredSize(new java.awt.Dimension(284, 35));
        jPanel1.add(turno, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, -1, -1));

        especialidad.setDisabledTextColor(new java.awt.Color(217, 217, 217));
        especialidad.setPreferredSize(new java.awt.Dimension(284, 35));
        jPanel1.add(especialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, -1, -1));

        botonRegresar_Perfil.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonRegresar_Perfil.setForeground(new java.awt.Color(41, 98, 255));
        botonRegresar_Perfil.setText("< REGRESAR");
        botonRegresar_Perfil.setBorder(null);
        botonRegresar_Perfil.setBorderPainted(false);
        botonRegresar_Perfil.setContentAreaFilled(false);
        botonRegresar_Perfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRegresar_Perfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegresar_PerfilMouseClicked(evt);
            }
        });
        botonRegresar_Perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresar_PerfilActionPerformed(evt);
            }
        });
        jPanel1.add(botonRegresar_Perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 80, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 1100, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresar_PerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresar_PerfilMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new inicioMedico().setVisible(true);
    }//GEN-LAST:event_botonRegresar_PerfilMouseClicked

    private void botonRegresar_PerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresar_PerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresar_PerfilActionPerformed

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
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Perfil().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Perfil.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Perfil.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apeMaternoLabel;
    private javax.swing.JLabel apePaternoLabel;
    private javax.swing.JTextField apellido_materno;
    private javax.swing.JTextField apellido_paterno;
    private javax.swing.JButton botonRegresar_Perfil;
    private javax.swing.JTextField dni;
    private javax.swing.JLabel dniLabel;
    private javax.swing.JTextField especialidad;
    private javax.swing.JLabel especialidadLabel;
    private javax.swing.JTextField fecha_nac;
    private javax.swing.JLabel foto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel nacimientoLabel;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombres;
    private javax.swing.JLabel sexLabel;
    private javax.swing.JTextField sexo;
    private javax.swing.JTextField telefono;
    private javax.swing.JLabel telefonoLabel;
    private javax.swing.JTextField turno;
    private javax.swing.JLabel turnoLabel;
    // End of variables declaration//GEN-END:variables
}
