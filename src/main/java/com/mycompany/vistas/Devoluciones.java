
package com.mycompany.vistas;

import com.mycompany.sistemalibreria.DAOLibroImpl;
import com.mycompany.sistemalibreria.DAOPrestamoImpl;
import com.mycompany.sistemalibreria.DAOUsuarioImpl;
import com.mycompany.interfaces.DAOLibros;
import com.mycompany.interfaces.DAOPrestamos;
import com.mycompany.interfaces.DAOUsuarios;
import com.mycompany.utiles.Utiles;
import java.awt.Color;
import java.util.Date;
import javax.swing.JOptionPane;

public class Devoluciones extends javax.swing.JFrame {

    private final int MAX_DAYS_RETURN = 5;
    private final int COST_DAY_SANC = 10;
    
    public Devoluciones() {
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
        btnConfirmardevolucion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Gargi", 1, 48)); // NOI18N
        jLabel1.setText("Devoluciones");

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

        btnConfirmardevolucion.setBackground(new java.awt.Color(51, 51, 255));
        btnConfirmardevolucion.setFont(new java.awt.Font("Gargi", 1, 18)); // NOI18N
        btnConfirmardevolucion.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmardevolucion.setText("Confirmar");
        btnConfirmardevolucion.setBorder(null);
        btnConfirmardevolucion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmardevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmardevolucionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 232, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(210, 210, 210))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(folioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(37, 37, 37)
                                .addComponent(libroIdTxt)))
                        .addGap(186, 186, 186))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnConfirmardevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(270, 270, 270))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(folioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(libroIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(btnConfirmardevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnConfirmardevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmardevolucionActionPerformed
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
            
            DAOPrestamos daoLendings = new DAOPrestamoImpl();
            
            // Validamos que el usuario tenga ese libro prestado.
            com.mycompany.model.Prestamos currentLending = daoLendings.getLending(currentUser, currentBook);
            System.out.println("ID del usuario: " + currentUser + " ID del libro: " + currentBook);
            if (currentLending == null) {
                JOptionPane.showMessageDialog(this, "No se ha podido encontrar el préstamo correspiendote a los datos ingresados. \n", "AVISO", JOptionPane.ERROR_MESSAGE);
                libroIdTxt.requestFocus();
                return;
            }

            // Todo OK: Devolvemos libro.
            currentLending.setFecha_devuelto(Utiles.getFechaActual());
            daoLendings.modificar(currentLending);
            
            // Modificamos el libro sumandole 1 en disponibilidad.
            currentBook.setDisponible(currentBook.getDisponible() + 1);
            daoBooks.modificar(currentBook);
            
            JOptionPane.showMessageDialog(this, "Libro ID: " + currentBook.getId() + " devuelto exitosamente por " + currentUser.getNombre() + ".\n", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            folioTxt.setText("");
            libroIdTxt.setText("");
            
            // Verificamos sanciones
            int days = Utiles.diferenciasDeFechas(Utiles.stringToDate(currentLending.getFecha_devuelto()), new Date());
            if (days > MAX_DAYS_RETURN) {
                int daysDelayed = days - MAX_DAYS_RETURN;
                int sancMoney = daysDelayed * COST_DAY_SANC;
                
                // Aumentamos sanción del usuario y en dinero.
                currentUser.setSanciones(currentUser.getSanciones() + 1);
                currentUser.setMonto_sancion(currentUser.getMonto_sancion() + sancMoney);
                daoUsers.sancionar(currentUser);
                JOptionPane.showMessageDialog(this, "¡USUARIO SANCIONADO POR ENTREGA A DESTIEMPO! ($" + sancMoney + ") \n", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error al devolver el libro. \n", "AVISO", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnConfirmardevolucionActionPerformed

    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Devoluciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmardevolucion;
    private javax.swing.JTextField folioTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField libroIdTxt;
    // End of variables declaration//GEN-END:variables
}
