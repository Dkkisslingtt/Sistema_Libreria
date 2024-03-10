
package com.mycompany.vistas;

import com.mycompany.interfaces.DAOUsuarios;
import com.mycompany.sistemalibreria.DAOUsuarioImpl;
import com.mycompany.sistemalibreria.Dashboard;
import com.mycompany.vistas.NuevoUsuario;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AbstractDocument.Content;


public class Usuarios extends javax.swing.JFrame {
    
    private final NuevoUsuario usuarioNuevoFrame;


    public Usuarios() {
        initComponents();        
        usuarioNuevoFrame = new NuevoUsuario();
        cargarUsuarios();  
    }

    /**
     *
     */
    private void cargarUsuarios(){
        try{
            DAOUsuarios dao = new DAOUsuarioImpl();
            DefaultTableModel model = (DefaultTableModel) tableUsuarios.getModel();
            dao.listado("").forEach((u)-> model.addRow(new Object [] {u.getId(),u.getNombre(),u.getApellido_paterno(),u.getApellido_materno(),u.getDomicilio(),u.getTelefono()}));
        
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        buscarUsuario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUsuarios = new javax.swing.JTable();
        btnBorrarUsuario = new javax.swing.JButton();
        btnNuevoUsuario = new javax.swing.JButton();
        btnEditarUsuario = new javax.swing.JButton();
        btnBuscarUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Gargi", 0, 24)); // NOI18N
        jLabel4.setText("Usuarios");

        buscarUsuario.setFont(new java.awt.Font("Gargi", 0, 15)); // NOI18N
        buscarUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarUsuarioActionPerformed(evt);
            }
        });

        tableUsuarios.setFont(new java.awt.Font("Gargi", 0, 14)); // NOI18N
        tableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido Paterno", "Apellido Materno", "Domicilio", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableUsuarios.setAlignmentX(0.0F);
        tableUsuarios.setAlignmentY(1.0F);
        tableUsuarios.setRowHeight(40);
        jScrollPane1.setViewportView(tableUsuarios);

        btnBorrarUsuario.setBackground(new java.awt.Color(51, 51, 255));
        btnBorrarUsuario.setFont(new java.awt.Font("Gargi", 0, 15)); // NOI18N
        btnBorrarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrarUsuario.setText("BORRAR");
        btnBorrarUsuario.setBorder(null);
        btnBorrarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBorrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarUsuarioActionPerformed(evt);
            }
        });

        btnNuevoUsuario.setBackground(new java.awt.Color(51, 51, 255));
        btnNuevoUsuario.setFont(new java.awt.Font("Gargi", 0, 15)); // NOI18N
        btnNuevoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoUsuario.setText("NUEVO");
        btnNuevoUsuario.setBorder(null);
        btnNuevoUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoUsuarioActionPerformed(evt);
            }
        });

        btnEditarUsuario.setBackground(new java.awt.Color(51, 51, 255));
        btnEditarUsuario.setFont(new java.awt.Font("Gargi", 0, 15)); // NOI18N
        btnEditarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarUsuario.setText("EDITAR");
        btnEditarUsuario.setBorder(null);
        btnEditarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUsuarioActionPerformed(evt);
            }
        });

        btnBuscarUsuario.setBackground(new java.awt.Color(51, 51, 255));
        btnBuscarUsuario.setFont(new java.awt.Font("Gargi", 0, 15)); // NOI18N
        btnBuscarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarUsuario.setText("Buscar");
        btnBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(btnNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBorrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(buscarUsuario)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buscarUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(396, Short.MAX_VALUE))
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

    private void btnBorrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarUsuarioActionPerformed
    DAOUsuarios dao = new DAOUsuarioImpl();
    DefaultTableModel model = (DefaultTableModel) tableUsuarios.getModel();

    for (int i : tableUsuarios.getSelectedRows()) {
        try{
            int usuarioId = (int) tableUsuarios.getValueAt(i, 0);
            dao.eliminar(usuarioId);
            model.removeRow(i);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    }//GEN-LAST:event_btnBorrarUsuarioActionPerformed

    private void btnNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoUsuarioActionPerformed
        Dashboard.mostrarFrame(usuarioNuevoFrame);
    }//GEN-LAST:event_btnNuevoUsuarioActionPerformed

    private void btnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUsuarioActionPerformed
    // Verificar si se ha seleccionado una fila en la tabla
    int filaSeleccionada = tableUsuarios.getSelectedRow();
    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(this, "Por favor, seleccione un usuario para editar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }
     
    int idUsuario = (int) tableUsuarios.getValueAt(filaSeleccionada, 0);
    
    try {
        DAOUsuarios dao = new DAOUsuarioImpl();
        com.mycompany.model.Usuarios usuarioSeleccionado = dao.getUserById(idUsuario);
        
        NuevoUsuario nuevoUsuarioFrame = new NuevoUsuario(usuarioSeleccionado);
                
        Dashboard.mostrarFrame(nuevoUsuarioFrame);

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error al obtener los datos del usuario: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }        
    }//GEN-LAST:event_btnEditarUsuarioActionPerformed

    private void buscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarUsuarioActionPerformed
        try{
            String usuarioBuscar = buscarUsuario.getText();
            
            DAOUsuarios dao = new DAOUsuarioImpl();
            DefaultTableModel model = (DefaultTableModel) tableUsuarios.getModel();
            model.setRowCount(0);
            dao.listado(usuarioBuscar).forEach((u)-> model.addRow(new Object [] {u.getId(),u.getNombre(),u.getApellido_paterno(),u.getApellido_materno(),u.getDomicilio(),u.getTelefono()}));
        
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_buscarUsuarioActionPerformed

    private void btnBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUsuarioActionPerformed
         try{
            String usuarioBuscar = buscarUsuario.getText();
            
            DAOUsuarios dao = new DAOUsuarioImpl();
            DefaultTableModel model = (DefaultTableModel) tableUsuarios.getModel();
            model.setRowCount(0);
            dao.listado(usuarioBuscar).forEach((u)-> model.addRow(new Object [] {u.getId(),u.getNombre(),u.getApellido_paterno(),u.getApellido_materno(),u.getDomicilio(),u.getTelefono()}));
        
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarUsuarioActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarUsuario;
    private javax.swing.JButton btnBuscarUsuario;
    private javax.swing.JButton btnEditarUsuario;
    private javax.swing.JButton btnNuevoUsuario;
    private javax.swing.JTextField buscarUsuario;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableUsuarios;
    // End of variables declaration//GEN-END:variables

}
