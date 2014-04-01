/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto_Archisoft;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author prueba
 */
public class Empleados extends javax.swing.JInternalFrame {

    /**
     * Creates new form Empleados
     */
    public Empleados() {
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

        jLabel_Id_Empleado = new javax.swing.JLabel();
        jButton_Consultar = new javax.swing.JButton();
        jLabel_Nombre = new javax.swing.JLabel();
        jLabel_Cargo = new javax.swing.JLabel();
        jLabel_Correo = new javax.swing.JLabel();
        jLabel_Telefono = new javax.swing.JLabel();
        jLabel_Celular = new javax.swing.JLabel();
        jTextField_Texto_Nombre = new javax.swing.JTextField();
        jTextField_Texto_Cargo = new javax.swing.JTextField();
        jTextField_Correo = new javax.swing.JTextField();
        jTextField_Texto_Fijo = new javax.swing.JTextField();
        jTextField_Texto_Celular = new javax.swing.JTextField();
        jButton_Aceptar = new javax.swing.JButton();
        jPassword_Empleado = new javax.swing.JPasswordField();
        jButton_Cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField_Correo1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField_Correo2 = new javax.swing.JTextField();
        jLabel_Telefono1 = new javax.swing.JLabel();
        jLabel_Telefono2 = new javax.swing.JLabel();
        jTextField_Texto_Celular1 = new javax.swing.JTextField();
        jTextField_Texto_Celular2 = new javax.swing.JTextField();
        jButton_Consultar1 = new javax.swing.JButton();
        jLabel_Cargo1 = new javax.swing.JLabel();
        jTextField_Texto_Celular3 = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consulta de Empleados");

        jLabel_Id_Empleado.setText("Id_Empleado");

        jButton_Consultar.setText("Registrar");
        jButton_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ConsultarActionPerformed(evt);
            }
        });

        jLabel_Nombre.setText("Nombre");

        jLabel_Cargo.setText("Jefe");

        jLabel_Correo.setText("Cargo");

        jLabel_Telefono.setText("Télefono Fijo");

        jLabel_Celular.setText("Celular");

        jTextField_Correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CorreoActionPerformed(evt);
            }
        });

        jTextField_Texto_Celular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Texto_CelularActionPerformed(evt);
            }
        });

        jButton_Aceptar.setText("Aceptar");

        jButton_Cancelar.setText("Cancelar");

        jLabel1.setText("Ciudad");

        jTextField_Correo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Correo1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Direccion");

        jTextField_Correo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Correo2ActionPerformed(evt);
            }
        });

        jLabel_Telefono1.setText("Fecha_Ingreso");

        jLabel_Telefono2.setText("Nombre_Contacto");

        jTextField_Texto_Celular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Texto_Celular1ActionPerformed(evt);
            }
        });

        jTextField_Texto_Celular2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Texto_Celular2ActionPerformed(evt);
            }
        });

        jButton_Consultar1.setText("Consultar");
        jButton_Consultar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Consultar1ActionPerformed(evt);
            }
        });

        jLabel_Cargo1.setText("Dependencia");

        jTextField_Texto_Celular3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Texto_Celular3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Id_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Nombre)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Telefono)
                            .addComponent(jLabel_Celular))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jPassword_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_Consultar1)
                            .addGap(47, 47, 47)
                            .addComponent(jButton_Consultar)
                            .addGap(148, 148, 148))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextField_Correo2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField_Texto_Cargo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                        .addComponent(jTextField_Correo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField_Texto_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(34, 34, 34)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel_Cargo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField_Texto_Celular2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel_Cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField_Texto_Celular3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton_Cancelar)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel_Telefono2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel_Telefono1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel_Correo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField_Texto_Fijo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField_Texto_Celular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField_Texto_Celular1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_Aceptar)
                            .addComponent(jTextField_Correo1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Telefono1)
                            .addComponent(jTextField_Texto_Fijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Id_Empleado)
                            .addComponent(jPassword_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Consultar)
                            .addComponent(jButton_Consultar1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Texto_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Nombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_Telefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_Texto_Celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_Correo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_Texto_Cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Correo)
                    .addComponent(jTextField_Texto_Celular1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Telefono)
                    .addComponent(jTextField_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Cargo)
                    .addComponent(jTextField_Texto_Celular3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Celular)
                    .addComponent(jTextField_Correo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Cargo1)
                    .addComponent(jTextField_Texto_Celular2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Aceptar)
                    .addComponent(jButton_Cancelar))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ConsultarActionPerformed
        DefaultTableModel model;
        String Cedula = jPassword_Empleado.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = null;
            String[] Titulos = {"Nombre", "Direccion", "Ciudad", "Telefono", "Celular", "Fecha_Ingreso", "Nombre_Contacto", "Telefono_Contacto", "Cargo", "Jefe", "Dependencia"};
            model = new DefaultTableModel(null, Titulos);

            try {
                conexion = DriverManager.getConnection("jdbc:mysql://Localhost:3306/tecnoproyectos", "root", "andres0122");
            } catch (SQLException ex) {
                Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
            }
            Statement s2 = null;
            s2 = conexion.createStatement();
            ResultSet rs = null;
            rs = s2.executeQuery("select * from empleados");

            String[] fila = new String[11];
            while (rs.next()) {
                if (Cedula.equals(rs.getString(2))) {
                    //JOptionPane.showMessageDialog(null, "Supervisor encontrado");
                    fila[0] = rs.getString(3);
                    fila[1] = rs.getString(4);
                    fila[2] = rs.getString(5);
                    fila[3] = rs.getString(6);
                    fila[4] = rs.getString(7);
                    fila[5] = rs.getString(8);
                    fila[6] = rs.getString(9);
                    fila[7] = rs.getString(10);
                    fila[8] = rs.getString(11);
                    fila[9] = rs.getString(12);
                    fila[10] = rs.getString(13);
                    model.addRow(fila);
                }
            }
            //jTable1.setModel(model);


        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_ConsultarActionPerformed

    private void jTextField_CorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CorreoActionPerformed

    private void jTextField_Texto_CelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Texto_CelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Texto_CelularActionPerformed

    private void jTextField_Correo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Correo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Correo1ActionPerformed

    private void jTextField_Correo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Correo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Correo2ActionPerformed

    private void jTextField_Texto_Celular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Texto_Celular1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Texto_Celular1ActionPerformed

    private void jTextField_Texto_Celular2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Texto_Celular2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Texto_Celular2ActionPerformed

    private void jButton_Consultar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Consultar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Consultar1ActionPerformed

    private void jTextField_Texto_Celular3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Texto_Celular3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Texto_Celular3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Aceptar;
    private javax.swing.JButton jButton_Cancelar;
    private javax.swing.JButton jButton_Consultar;
    private javax.swing.JButton jButton_Consultar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Cargo;
    private javax.swing.JLabel jLabel_Cargo1;
    private javax.swing.JLabel jLabel_Celular;
    private javax.swing.JLabel jLabel_Correo;
    private javax.swing.JLabel jLabel_Id_Empleado;
    private javax.swing.JLabel jLabel_Nombre;
    private javax.swing.JLabel jLabel_Telefono;
    private javax.swing.JLabel jLabel_Telefono1;
    private javax.swing.JLabel jLabel_Telefono2;
    private javax.swing.JPasswordField jPassword_Empleado;
    private javax.swing.JTextField jTextField_Correo;
    private javax.swing.JTextField jTextField_Correo1;
    private javax.swing.JTextField jTextField_Correo2;
    private javax.swing.JTextField jTextField_Texto_Cargo;
    private javax.swing.JTextField jTextField_Texto_Celular;
    private javax.swing.JTextField jTextField_Texto_Celular1;
    private javax.swing.JTextField jTextField_Texto_Celular2;
    private javax.swing.JTextField jTextField_Texto_Celular3;
    private javax.swing.JTextField jTextField_Texto_Fijo;
    private javax.swing.JTextField jTextField_Texto_Nombre;
    // End of variables declaration//GEN-END:variables
}
