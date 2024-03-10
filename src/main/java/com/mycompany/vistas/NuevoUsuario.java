package com.mycompany.vistas;

import com.mycompany.interfaces.DAOUsuarios;
import com.mycompany.sistemalibreria.DAOUsuarioImpl;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NuevoUsuario extends javax.swing.JFrame {
    
    private boolean modoEdicion = false;
    private com.mycompany.model.Usuarios usuarioEditar;
    
    public NuevoUsuario() {
    
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    
    public NuevoUsuario(com.mycompany.model.Usuarios usuario) {
        initComponents();
        modoEdicion = true;
        usuarioEditar = usuario;
        // Llenar los JTextField con los datos del usuario
        textNombre.setText(usuario.getNombre());
        textApellidoP.setText(usuario.getApellido_paterno());
        textApellidoM.setText(usuario.getApellido_materno());
        textDomicilio.setText(usuario.getDomicilio());
        textTelefono.setText(usuario.getTelefono());
        btnRegistrar.setText("Editar");
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        textApellidoM = new javax.swing.JTextField();
        textDomicilio = new javax.swing.JTextField();
        textTelefono = new javax.swing.JTextField();
        textApellidoP = new javax.swing.JTextField();
        textNombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Gargi", 0, 18)); // NOI18N
        jLabel3.setText("Nombre");

        btnRegistrar.setBackground(new java.awt.Color(51, 51, 255));
        btnRegistrar.setFont(new java.awt.Font("Gargi", 1, 18)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(null);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Gargi", 0, 18)); // NOI18N
        jLabel4.setText("Apellido Paterno");

        jLabel5.setFont(new java.awt.Font("Gargi", 0, 18)); // NOI18N
        jLabel5.setText("Domicilio");

        jLabel7.setFont(new java.awt.Font("Gargi", 0, 18)); // NOI18N
        jLabel7.setText("Telefono");

        jLabel10.setFont(new java.awt.Font("Gargi", 0, 18)); // NOI18N
        jLabel10.setText("Apellido Materno");

        textApellidoM.setFont(new java.awt.Font("Gargi", 0, 15)); // NOI18N
        textApellidoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textApellidoMActionPerformed(evt);
            }
        });

        textDomicilio.setFont(new java.awt.Font("Gargi", 0, 15)); // NOI18N
        textDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDomicilioActionPerformed(evt);
            }
        });

        textTelefono.setFont(new java.awt.Font("Gargi", 0, 15)); // NOI18N
        textTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTelefonoActionPerformed(evt);
            }
        });

        textApellidoP.setFont(new java.awt.Font("Gargi", 0, 15)); // NOI18N
        textApellidoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textApellidoPActionPerformed(evt);
            }
        });

        textNombre.setFont(new java.awt.Font("Gargi", 0, 15)); // NOI18N
        textNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(textDomicilio, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addComponent(textNombre))
                    .addComponent(textApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(textTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 370, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textNombre)
                    .addComponent(textTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textApellidoM)
                    .addComponent(textApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(727, 727, 727))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreActionPerformed

    private void textApellidoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textApellidoPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textApellidoPActionPerformed

    private void textTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTelefonoActionPerformed

    private void textDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDomicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDomicilioActionPerformed

    private void textApellidoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textApellidoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textApellidoMActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
       if (modoEdicion) {
            // Modo edición
            editarUsuario();
        } else {
            // Modo registro
            registrarUsuario();
        }
    }                                            

    private void registrarUsuario() {
        com.mycompany.model.Usuarios user = new com.mycompany.model.Usuarios();
        
        String nombre = textNombre.getText();
        String apellidoP = textApellidoP.getText();
        String apellidoM = textApellidoM.getText();
        String domicilio = textDomicilio.getText();
        String telefono = textTelefono.getText();
        
        if (nombre.isEmpty() || apellidoP.isEmpty() || apellidoM.isEmpty() || domicilio.isEmpty() || telefono.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }   
        user.setNombre(nombre);
        user.setApellido_paterno(apellidoP);
        user.setApellido_materno(apellidoM);
        user.setDomicilio(domicilio);
        user.setTelefono(telefono);
        
        try{
            DAOUsuarios dao = new DAOUsuarioImpl();
            dao.registrar(user);
            JOptionPane.showMessageDialog(null, "Usuario cargado exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);

            limpiarCampos();
        } catch(Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error en la carga del usuario: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }                                            

    private void editarUsuario() {
        // Obtener datos actualizados del usuario
        String nombre = textNombre.getText();
        String apellidoP = textApellidoP.getText();
        String apellidoM = textApellidoM.getText();
        String domicilio = textDomicilio.getText();
        String telefono = textTelefono.getText();
        
        // Actualizar los datos del usuario
        usuarioEditar.setNombre(nombre);
        usuarioEditar.setApellido_paterno(apellidoP);
        usuarioEditar.setApellido_materno(apellidoM);
        usuarioEditar.setDomicilio(domicilio);
        usuarioEditar.setTelefono(telefono);
        
        try{
            DAOUsuarios dao = new DAOUsuarioImpl();
            dao.modificar(usuarioEditar);
            JOptionPane.showMessageDialog(null, "Usuario actualizado exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch(Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error en la edición del usuario: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }                                            

    private void limpiarCampos() {
        textNombre.setText("");
        textApellidoP.setText("");
        textApellidoM.setText("");
        textDomicilio.setText("");
        textTelefono.setText("");
    
    }//GEN-LAST:event_btnRegistrarActionPerformed

    public static void main(String args[]) {
     
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textApellidoM;
    private javax.swing.JTextField textApellidoP;
    private javax.swing.JTextField textDomicilio;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textTelefono;
    // End of variables declaration//GEN-END:variables
}
