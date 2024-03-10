
package com.mycompany.vistas;
import com.mycompany.interfaces.DAOLibros;
import com.mycompany.sistemalibreria.DAOLibroImpl;
import com.mycompany.sistemalibreria.Dashboard;
import com.mycompany.vistas.NuevoLibro;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AbstractDocument.Content;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument.Content;

/**
 *
 * @author dkkissling
 */
public class Libros extends javax.swing.JFrame {
    
    private final NuevoLibro libroNuevoFrame;


    public Libros() {
        initComponents();
        libroNuevoFrame = new NuevoLibro();
        CargarLibros();  
    }

   private void CargarLibros() {
    try {
        DAOLibros dao = new DAOLibroImpl();
        DefaultTableModel model = (DefaultTableModel) tableLibros.getModel();
        dao.listado("").forEach((libro) -> model.addRow(new Object[]{libro.getId(), libro.getTitulo(), libro.getFecha(), libro.getAutor(), libro.getCategoria(), libro.getEditorial(), libro.getIdioma(), libro.getPaginas(), libro.getDescripcion(), libro.getEjemplares(), libro.getStock(), libro.getDisponible()}));
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        buscarLibro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableLibros = new javax.swing.JTable();
        btnBorrarlibro = new javax.swing.JButton();
        btnNuevolibro = new javax.swing.JButton();
        btnEditarlibro = new javax.swing.JButton();
        btnBuscarLibros = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Gargi", 0, 24)); // NOI18N
        jLabel4.setText("Libros");

        buscarLibro.setFont(new java.awt.Font("Gargi", 0, 15)); // NOI18N
        buscarLibro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tableLibros.setFont(new java.awt.Font("Gargi", 0, 15)); // NOI18N
        tableLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "titulo", "fecha", "autor", "categoria", "edicion", "idioma", "paginas", "descripcion", "ejemplos", "stock", "disponible"
            }
        ));
        tableLibros.setRowHeight(40);
        jScrollPane1.setViewportView(tableLibros);

        btnBorrarlibro.setBackground(new java.awt.Color(51, 51, 255));
        btnBorrarlibro.setFont(new java.awt.Font("Gargi", 0, 15)); // NOI18N
        btnBorrarlibro.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrarlibro.setText("BORRAR");
        btnBorrarlibro.setBorder(null);
        btnBorrarlibro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBorrarlibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarlibroActionPerformed(evt);
            }
        });

        btnNuevolibro.setBackground(new java.awt.Color(51, 51, 255));
        btnNuevolibro.setFont(new java.awt.Font("Gargi", 0, 15)); // NOI18N
        btnNuevolibro.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevolibro.setText("NUEVO");
        btnNuevolibro.setBorder(null);
        btnNuevolibro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevolibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevolibroActionPerformed(evt);
            }
        });

        btnEditarlibro.setBackground(new java.awt.Color(51, 51, 255));
        btnEditarlibro.setFont(new java.awt.Font("Gargi", 0, 15)); // NOI18N
        btnEditarlibro.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarlibro.setText("EDITAR");
        btnEditarlibro.setBorder(null);
        btnEditarlibro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarlibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarlibroActionPerformed(evt);
            }
        });

        btnBuscarLibros.setBackground(new java.awt.Color(51, 51, 255));
        btnBuscarLibros.setFont(new java.awt.Font("Gargi", 0, 15)); // NOI18N
        btnBuscarLibros.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarLibros.setText("Buscar");
        btnBuscarLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarLibrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(btnNuevolibro, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditarlibro, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBorrarlibro, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)))
                        .addGap(0, 192, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buscarLibro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarLibros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevolibro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarlibro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrarlibro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(396, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBorrarlibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarlibroActionPerformed
    DAOLibros dao = new DAOLibroImpl();
    DefaultTableModel model = (DefaultTableModel) tableLibros.getModel();

    for (int i : tableLibros.getSelectedRows()) {
        try{
            int libroId = (int) tableLibros.getValueAt(i, 0);
            dao.eliminar(libroId);
            model.removeRow(i);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
        
    }//GEN-LAST:event_btnBorrarlibroActionPerformed

    private void btnNuevolibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevolibroActionPerformed
        Dashboard.mostrarFrame(libroNuevoFrame);

    }//GEN-LAST:event_btnNuevolibroActionPerformed

    private void btnEditarlibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarlibroActionPerformed

        // Verificar si se ha seleccionado una fila en la tabla
    int filaSeleccionada = tableLibros.getSelectedRow();
    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(this, "Por favor, seleccione un usuario para editar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }
     
    int idLibro = (int) tableLibros.getValueAt(filaSeleccionada, 0);
    
    try {
        DAOLibros dao = new DAOLibroImpl();
        com.mycompany.model.Libros libroSeleccionado = dao.getBookById(idLibro);
        
        NuevoLibro nuevoLibroFrame = new NuevoLibro(libroSeleccionado);
                
        Dashboard.mostrarFrame(nuevoLibroFrame);

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error al obtener los datos del usuario: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }        

    }//GEN-LAST:event_btnEditarlibroActionPerformed

    private void btnBuscarLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarLibrosActionPerformed
        try{
            String libroBuscar = buscarLibro.getText();

            DAOLibros dao = new DAOLibroImpl();
            DefaultTableModel model = (DefaultTableModel) tableLibros.getModel();
            model.setRowCount(0);
            dao.listado(libroBuscar).forEach((libro) -> model.addRow(new Object[]{libro.getId(), libro.getTitulo(), libro.getFecha(), libro.getAutor(), libro.getCategoria(), libro.getEditorial(), libro.getIdioma(), libro.getPaginas(), libro.getDescripcion(), libro.getEjemplares(), libro.getStock(), libro.getDisponible()}));

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarLibrosActionPerformed

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
            java.util.logging.Logger.getLogger(Libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Libros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarlibro;
    private javax.swing.JButton btnBuscarLibros;
    private javax.swing.JButton btnEditarlibro;
    private javax.swing.JButton btnNuevolibro;
    private javax.swing.JTextField buscarLibro;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableLibros;
    // End of variables declaration//GEN-END:variables
}
