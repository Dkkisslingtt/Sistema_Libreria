package com.mycompany.vistas;

import com.mycompany.utiles.Utiles;
import com.mycompany.sistemalibreria.DAOLibroImpl;
import com.mycompany.sistemalibreria.DAOPrestamoImpl;
import com.mycompany.sistemalibreria.DAOUsuarioImpl;
import com.mycompany.interfaces.DAOLibros;
import com.mycompany.interfaces.DAOPrestamos;
import com.mycompany.interfaces.DAOUsuarios;
import javax.swing.JOptionPane;


public class Prestamos extends javax.swing.JFrame {

    public Prestamos() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        libroIdTxt = new javax.swing.JTextField();
        folioTxt = new javax.swing.JTextField();
        btnConfirmarprestamo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Gargi", 1, 48)); // NOI18N
        jLabel1.setText("Nuevo Prestamo");

        jLabel2.setFont(new java.awt.Font("Gargi", 0, 18)); // NOI18N
        jLabel2.setText("Usuario ID");

        jLabel3.setFont(new java.awt.Font("Gargi", 0, 18)); // NOI18N
        jLabel3.setText("Libro ID");

        libroIdTxt.setFont(new java.awt.Font("Gargi", 0, 15)); // NOI18N
        libroIdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libroIdTxtActionPerformed(evt);
            }
        });

        folioTxt.setFont(new java.awt.Font("Gargi", 0, 15)); // NOI18N
        folioTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                folioTxtActionPerformed(evt);
            }
        });

        btnConfirmarprestamo.setBackground(new java.awt.Color(51, 51, 255));
        btnConfirmarprestamo.setFont(new java.awt.Font("Gargi", 1, 18)); // NOI18N
        btnConfirmarprestamo.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmarprestamo.setText("Confirmar");
        btnConfirmarprestamo.setBorder(null);
        btnConfirmarprestamo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmarprestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarprestamoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 216, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(folioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnConfirmarprestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(libroIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(192, 192, 192))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(folioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(libroIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(btnConfirmarprestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(373, Short.MAX_VALUE))
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

    private void libroIdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libroIdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_libroIdTxtActionPerformed

    private void folioTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_folioTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_folioTxtActionPerformed

    private void btnConfirmarprestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarprestamoActionPerformed
        String folio = folioTxt.getText();
        String bookId = libroIdTxt.getText();

        // Validaciones para los campos
        if (folio.isEmpty() || bookId.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos. \n", "AVISO", JOptionPane.ERROR_MESSAGE);
            folioTxt.requestFocus();
            return;
        } else if (!Utiles.isNumeric(folio) || !Utiles.isNumeric(bookId)) {
            JOptionPane.showMessageDialog(this, "Los campos Folio y el ID del libro deben ser números enteros. \n", "AVISO", JOptionPane.ERROR_MESSAGE);
            folioTxt.requestFocus();
            return;
        } else if (Integer.parseInt(folio) <= 0 || Integer.parseInt(bookId) <= 0) {
            JOptionPane.showMessageDialog(this, "Los campos Folio y el ID del libro deben ser mayor que 0. \n", "AVISO", JOptionPane.ERROR_MESSAGE);
            folioTxt.requestFocus();
            return;
        }

        try {
            DAOUsuarios daoUsers = new DAOUsuarioImpl();
            
            // Validamos existencia del usuario
            com.mycompany.model.Usuarios currentUser = daoUsers.getUserById(Integer.parseInt(folio));
            if (currentUser == null) {
                JOptionPane.showMessageDialog(this, "No se encontró ningún usuario con ese folio. \n", "AVISO", JOptionPane.ERROR_MESSAGE);
                folioTxt.requestFocus();
                return;
            }
            
            DAOLibros daoBooks = new DAOLibroImpl();
            
            // Validamos existencia del libro
            com.mycompany.model.Libros currentBook = daoBooks.getBookById(Integer.parseInt(bookId));
            if (currentBook == null){
                JOptionPane.showMessageDialog(this, "No se encontró ningún libro con ese ID. \n", "AVISO", JOptionPane.ERROR_MESSAGE);
                libroIdTxt.requestFocus();
                return;
            }
            // Validamos disponibilidad del libro.
            else if (currentBook.getDisponible() < 1) {
                JOptionPane.showMessageDialog(this, "Ya no hay más libros disponibles con esa ID para prestar. \n", "AVISO", JOptionPane.ERROR_MESSAGE);
                libroIdTxt.requestFocus();
                return;
            }
            
            DAOPrestamos daoLendings = new DAOPrestamoImpl();
            
            // Validamos que el usuario no tenga ya ese libro prestado.
            com.mycompany.model.Prestamos currentLending = daoLendings.getLending(currentUser, currentBook);
            if (currentLending != null) {
                JOptionPane.showMessageDialog(this, "Esa persona ya cuenta con el préstamo de ese mismo Libro. \n", "AVISO", JOptionPane.ERROR_MESSAGE);
                libroIdTxt.requestFocus();
                return;
            }
            
            // Todo OK: Prestamos libro.
            com.mycompany.model.Prestamos lending = new com.mycompany.model.Prestamos();
            lending.setLibro_id(currentBook.getId());
            lending.setUsuario_id(currentUser.getId());
            lending.setFecha_salida(Utiles.getFechaActual());
            daoLendings.registrar(lending);
            
            // Modificamos el libro restandole 1 en disponibilidad.
            currentBook.setDisponible(currentBook.getDisponible() - 1);
            daoBooks.modificar(currentBook);
            
            JOptionPane.showMessageDialog(this, "Libro ID: " + currentBook.getId() + " prestado exitosamente a " + currentUser.getNombre() + ".\n", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            folioTxt.setText("");
            libroIdTxt.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error al prestar el libro. \n", "AVISO", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_btnConfirmarprestamoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prestamos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmarprestamo;
    private javax.swing.JTextField folioTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField libroIdTxt;
    // End of variables declaration//GEN-END:variables
}
