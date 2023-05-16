package Asistencia;

import Conexion.ConnectionPool;
import InicioSesion.inicioAdministrativo;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Asistencia extends javax.swing.JFrame {

    Connection conetE;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int idE;
    private TableRowSorter trsfiltro;
    String filtro;

    public Asistencia() {
        initComponents();
        setLocationRelativeTo(null);
        mostrarAsistencias();
    }

    public void mostrarAsistencias() {

        String sql = "SELECT personal.nombres, personal.apellido_paterno, personal.apellido_materno, medico.id_dni_personal,\n"
                + "especialidad.nombre_especialidad, turno.descripcion, ,medico.hora_entrada, lector_asistencia.hora, timediff(lector_asistencia.hora, hora_entrada)FROM medico\n"
                + "INNER JOIN lector_asistencia ON lector_asistencia.dni_medico = medico.codigo_medico\n"
                + "INNER JOIN personal ON personal.id_dni = medico.id_dni_personal\n"
                + "INNER JOIN especialidad ON medico.codigo_especialidad = especialidad.codigo_especialidad\n"
                + "INNER JOIN turno ON personal.turno = turno.codigo_turno\n"
                + "GROUP BY id_dni_personal";

        try {
            conetE = ConnectionPool.getInstance().getConnection();
            st = conetE.createStatement();
            rs = st.executeQuery(sql);
            Object[] datosAsistencia = new Object[9];
            modelo = (DefaultTableModel) susAsistenciasTable_Asistencia.getModel();

            while (rs.next()) {
                datosAsistencia[0] = rs.getString("nombres");
                datosAsistencia[1] = rs.getString("apellido_paterno");
                datosAsistencia[2] = rs.getString("apellido_materno");
                datosAsistencia[3] = rs.getInt("id_dni_personal");
                datosAsistencia[4] = rs.getString("nombre_especialidad");
                datosAsistencia[5] = rs.getString("descripcion");
                datosAsistencia[6] = rs.getTime("hora_entrada");
                datosAsistencia[7] = rs.getTime("hora");
                datosAsistencia[8] = rs.getTime("timediff(lector_asistencia.hora, hora_entrada)");

                modelo.addRow(datosAsistencia);
            }
            susAsistenciasTable_Asistencia.setModel(modelo);
        } catch (SQLException e) {
            System.out.println("Error en conexion db");
        }

    }

    public void buscarAsistencias(String buscar) {
        susAsistenciasTable_Asistencia.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundAsistencia = new javax.swing.JPanel();
        asistenciaTitle_Asistencia = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        botonRegresar_Asistencia = new javax.swing.JButton();
        dniBuscadorLabel_Asistencia = new javax.swing.JLabel();
        dniBuscadorTxtField_Asistencia = new javax.swing.JTextField();
        susAsistenciasLabel_Asistencia = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        susAsistenciasTable_Asistencia = new javax.swing.JTable();
        botonBuscarPanel_Asistencia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundAsistencia.setBackground(new java.awt.Color(255, 255, 255));
        backgroundAsistencia.setMinimumSize(new java.awt.Dimension(1280, 431));
        backgroundAsistencia.setPreferredSize(new java.awt.Dimension(1280, 645));
        backgroundAsistencia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        asistenciaTitle_Asistencia.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        asistenciaTitle_Asistencia.setText("ASISTENCIA");
        backgroundAsistencia.add(asistenciaTitle_Asistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 47, -1, -1));

        jSeparator8.setBackground(new java.awt.Color(217, 217, 217));
        jSeparator8.setForeground(new java.awt.Color(217, 217, 217));
        jSeparator8.setPreferredSize(new java.awt.Dimension(1280, 0));
        backgroundAsistencia.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 98, 1280, 20));

        botonRegresar_Asistencia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonRegresar_Asistencia.setForeground(new java.awt.Color(41, 98, 255));
        botonRegresar_Asistencia.setText("< REGRESAR");
        botonRegresar_Asistencia.setBorder(null);
        botonRegresar_Asistencia.setBorderPainted(false);
        botonRegresar_Asistencia.setContentAreaFilled(false);
        botonRegresar_Asistencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRegresar_Asistencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegresar_AsistenciaMouseClicked(evt);
            }
        });
        botonRegresar_Asistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresar_AsistenciaActionPerformed(evt);
            }
        });
        backgroundAsistencia.add(botonRegresar_Asistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 80, 30));

        dniBuscadorLabel_Asistencia.setText("DNI");
        backgroundAsistencia.add(dniBuscadorLabel_Asistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 156, -1, -1));

        dniBuscadorTxtField_Asistencia.setDisabledTextColor(new java.awt.Color(217, 217, 217));
        dniBuscadorTxtField_Asistencia.setPreferredSize(new java.awt.Dimension(284, 35));
        backgroundAsistencia.add(dniBuscadorTxtField_Asistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 177, -1, -1));

        susAsistenciasLabel_Asistencia.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        susAsistenciasLabel_Asistencia.setText("SUS ASISTENCIAS");
        backgroundAsistencia.add(susAsistenciasLabel_Asistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 242, -1, -1));

        susAsistenciasTable_Asistencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRES", "APELLIDO PATERNO", "APELLIDO MATERNO", "DNI", "ESPECIALIDAD", "TURNO", "HORA LLEGADA", "HORA SALIDA", "TARDANZA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        susAsistenciasTable_Asistencia.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(susAsistenciasTable_Asistencia);
        if (susAsistenciasTable_Asistencia.getColumnModel().getColumnCount() > 0) {
            susAsistenciasTable_Asistencia.getColumnModel().getColumn(0).setResizable(false);
            susAsistenciasTable_Asistencia.getColumnModel().getColumn(1).setResizable(false);
            susAsistenciasTable_Asistencia.getColumnModel().getColumn(2).setResizable(false);
            susAsistenciasTable_Asistencia.getColumnModel().getColumn(3).setResizable(false);
            susAsistenciasTable_Asistencia.getColumnModel().getColumn(4).setResizable(false);
            susAsistenciasTable_Asistencia.getColumnModel().getColumn(5).setResizable(false);
            susAsistenciasTable_Asistencia.getColumnModel().getColumn(6).setResizable(false);
            susAsistenciasTable_Asistencia.getColumnModel().getColumn(7).setResizable(false);
            susAsistenciasTable_Asistencia.getColumnModel().getColumn(8).setResizable(false);
        }

        backgroundAsistencia.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 1060, 180));

        botonBuscarPanel_Asistencia.setBackground(new java.awt.Color(199, 247, 247));
        botonBuscarPanel_Asistencia.setText("BUSCAR");
        botonBuscarPanel_Asistencia.setBorder(null);
        botonBuscarPanel_Asistencia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonBuscarPanel_Asistencia.setPreferredSize(new java.awt.Dimension(136, 31));
        botonBuscarPanel_Asistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarPanel_AsistenciaActionPerformed(evt);
            }
        });
        backgroundAsistencia.add(botonBuscarPanel_Asistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(backgroundAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 645, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(backgroundAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresar_AsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresar_AsistenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresar_AsistenciaActionPerformed
    public void buscar(String buscar) {
        BuscarAsistencia p = new BuscarAsistencia();

        DefaultTableModel modelo = p.buscarAsistencias(buscar);
        susAsistenciasTable_Asistencia.setModel(modelo);
    }
    private void botonBuscarPanel_AsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarPanel_AsistenciaActionPerformed
        // TODO add your handling code here:
        buscar(dniBuscadorTxtField_Asistencia.getText());
    }//GEN-LAST:event_botonBuscarPanel_AsistenciaActionPerformed

    private void botonRegresar_AsistenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresar_AsistenciaMouseClicked
        this.dispose();
        new inicioAdministrativo().setVisible(true);
    }//GEN-LAST:event_botonRegresar_AsistenciaMouseClicked

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
            java.util.logging.Logger.getLogger(Asistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Asistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Asistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Asistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Asistencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel asistenciaTitle_Asistencia;
    private javax.swing.JPanel backgroundAsistencia;
    private javax.swing.JButton botonBuscarPanel_Asistencia;
    private javax.swing.JButton botonRegresar_Asistencia;
    private javax.swing.JLabel dniBuscadorLabel_Asistencia;
    private javax.swing.JTextField dniBuscadorTxtField_Asistencia;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel susAsistenciasLabel_Asistencia;
    private javax.swing.JTable susAsistenciasTable_Asistencia;
    // End of variables declaration//GEN-END:variables
}
