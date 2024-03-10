/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.vistas;

import com.mycompany.interfaces.DAOLibros;
import com.mycompany.sistemalibreria.DAOLibroImpl;
import javax.swing.JOptionPane;

public class NuevoLibro extends javax.swing.JFrame {

    private boolean modoEdicion = false;
    private com.mycompany.model.Libros libroEditar;

    public NuevoLibro() {
        initComponents();
    }

    public NuevoLibro(com.mycompany.model.Libros libro) {
        initComponents();
        modoEdicion = true;
        libroEditar = libro;
    
        textTitulo.setText(libro.getTitulo());
        textFecha.setText(libro.getFecha());
        textAutor.setText(libro.getAutor());
        textCategoria.setText(libro.getCategoria());
        textEditorial.setText(libro.getEditorial());
        textIdioma.setText(libro.getIdioma());
        textPaginas.setText(libro.getPaginas());
        textDescripcion.setText(libro.getDescripcion());
        textEjemplares.setText(libro.getEjemplares());
        textStock.setText(String.valueOf(libro.getStock()));
        textDisponible.setText(String.valueOf(libro.getDisponible()));
        btnCargarLibro.setText("Editar");
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        textTitulo = new javax.swing.JTextField();
        textDisponible = new javax.swing.JTextField();
        textFecha = new javax.swing.JTextField();
        textAutor = new javax.swing.JTextField();
        textEditorial = new javax.swing.JTextField();
        textStock = new javax.swing.JTextField();
        textDescripcion = new javax.swing.JTextField();
        textEjemplares = new javax.swing.JTextField();
        textPaginas = new javax.swing.JTextField();
        textIdioma = new javax.swing.JTextField();
        textCategoria = new javax.swing.JTextField();
        btnCargarLibro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Gargi", 0, 15)); // NOI18N
        jLabel3.setText("Titulo");

        jLabel4.setFont(new java.awt.Font("Gargi", 0, 15)); // NOI18N
        jLabel4.setText("Fecha de Publicacion");

        jLabel5.setFont(new java.awt.Font("Gargi", 0, 15)); // NOI18N
        jLabel5.setText("Autor");

        jLabel6.setFont(new java.awt.Font("Gargi", 0, 15)); // NOI18N
        jLabel6.setText("Editorial");

        jLabel7.setFont(new java.awt.Font("Gargi", 0, 15)); // NOI18N
        jLabel7.setText("Categoria");

        jLabel8.setFont(new java.awt.Font("Gargi", 0, 15)); // NOI18N
        jLabel8.setText("Idioma");

        jLabel9.setFont(new java.awt.Font("Gargi", 0, 15)); // NOI18N
        jLabel9.setText("Descripcion");

        jLabel10.setFont(new java.awt.Font("Gargi", 0, 15)); // NOI18N
        jLabel10.setText("Stock");

        jLabel11.setFont(new java.awt.Font("Gargi", 0, 15)); // NOI18N
        jLabel11.setText("Paginas");

        jLabel12.setFont(new java.awt.Font("Gargi", 0, 15)); // NOI18N
        jLabel12.setText("Ejemplares");

        jLabel13.setFont(new java.awt.Font("Gargi", 0, 15)); // NOI18N
        jLabel13.setText("Disponibles");

        textTitulo.setFont(new java.awt.Font("Gargi", 0, 15)); // NOI18N
        textTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTituloActionPerformed(evt);
            }
        });

        textDisponible.setFont(new java.awt.Font("Gargi", 0, 15)); // NOI18N
        textDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDisponibleActionPerformed(evt);
            }
        });

        textFecha.setFont(new java.awt.Font("Gargi", 0, 15)); // NOI18N
        textFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFechaActionPerformed(evt);
            }
        });

        textAutor.setFont(new java.awt.Font("Gargi", 0, 15)); // NOI18N
        textAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAutorActionPerformed(evt);
            }
        });

        textEditorial.setFont(new java.awt.Font("Gargi", 0, 15)); // NOI18N
        textEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEditorialActionPerformed(evt);
            }
        });

        textStock.setFont(new java.awt.Font("Gargi", 0, 15)); // NOI18N
        textStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textStockActionPerformed(evt);
            }
        });

        textDescripcion.setFont(new java.awt.Font("Gargi", 0, 15)); // NOI18N
        textDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDescripcionActionPerformed(evt);
            }
        });

        textEjemplares.setFont(new java.awt.Font("Gargi", 0, 15)); // NOI18N
        textEjemplares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEjemplaresActionPerformed(evt);
            }
        });

        textPaginas.setFont(new java.awt.Font("Gargi", 0, 15)); // NOI18N
        textPaginas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPaginasActionPerformed(evt);
            }
        });

        textIdioma.setFont(new java.awt.Font("Gargi", 0, 15)); // NOI18N
        textIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIdiomaActionPerformed(evt);
            }
        });

        textCategoria.setFont(new java.awt.Font("Gargi", 0, 15)); // NOI18N
        textCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCategoriaActionPerformed(evt);
            }
        });

        btnCargarLibro.setBackground(new java.awt.Color(51, 51, 255));
        btnCargarLibro.setFont(new java.awt.Font("Gargi", 1, 18)); // NOI18N
        btnCargarLibro.setForeground(new java.awt.Color(255, 255, 255));
        btnCargarLibro.setText("Cargar");
        btnCargarLibro.setBorder(null);
        btnCargarLibro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCargarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarLibroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(textStock, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(81, 81, 81)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(btnCargarLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(199, 199, 199)
                                .addComponent(jLabel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(textFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(81, 81, 81)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7)
                                    .addComponent(textCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                    .addComponent(textAutor))))
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textDescripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(textPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(textDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textEjemplares, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(textIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(180, 180, 180))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textEjemplares, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textStock, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnCargarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(591, Short.MAX_VALUE))
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

    private void textDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDisponibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDisponibleActionPerformed

    private void textTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTituloActionPerformed

    private void textFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFechaActionPerformed

    private void textAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAutorActionPerformed

    private void textEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEditorialActionPerformed

    private void textStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textStockActionPerformed

    private void textDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDescripcionActionPerformed

    private void textEjemplaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEjemplaresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEjemplaresActionPerformed

    private void textPaginasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPaginasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPaginasActionPerformed

    private void textIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIdiomaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIdiomaActionPerformed

    private void textCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCategoriaActionPerformed

    private void btnCargarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarLibroActionPerformed
        com.mycompany.model.Libros book = new com.mycompany.model.Libros();
        
        String titulo = textTitulo.getText();
        String fecha = textFecha.getText();
        String autor = textAutor.getText();
        String categoria = textCategoria.getText();
        String editorial = textEditorial.getText();
        String idioma = textIdioma.getText();
        String paginas = textPaginas.getText();
        String descripcion = textDescripcion.getText();
        String ejemplares = textEjemplares.getText();
        int stock = 0;
        int disponible = 0;
        
        if (titulo.isEmpty() || fecha.isEmpty() || autor.isEmpty() || categoria.isEmpty() || editorial.isEmpty() || idioma.isEmpty() || paginas.isEmpty() || descripcion.isEmpty() || ejemplares.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
           
        book.setTitulo(titulo);
        book.setFecha(fecha);
        book.setAutor(autor);
        book.setCategoria(categoria);
        book.setEditorial(editorial);
        book.setIdioma(idioma); 
        book.setPaginas(paginas);
        book.setDescripcion(descripcion);
        book.setEjemplares(ejemplares);
        book.setStock(stock);
        book.setDisponible(disponible);

        try{
            DAOLibros dao = new DAOLibroImpl();
            dao.registrar(book);
            JOptionPane.showMessageDialog(null, "Libro cargado exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);

            limpiarCampos();
        } catch(Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error en la carga del usuario: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }                                            

    private void editarLibro() {
        String titulo = textTitulo.getText();
        String fecha = textFecha.getText();
        String autor = textAutor.getText();
        String categoria = textCategoria.getText();
        String editorial = textEditorial.getText();
        String idioma = textIdioma.getText();
        String paginas = textPaginas.getText();
        String descripcion = textDescripcion.getText();
        String ejemplares = textEjemplares.getText();
        int stock = Integer.parseInt(textStock.getText()); // Obteniendo el valor del campo de texto para stock
        int disponible = Integer.parseInt(textDisponible.getText());
        
        libroEditar.setTitulo(titulo);
        libroEditar.setFecha(fecha);
        libroEditar.setAutor(autor);
        libroEditar.setCategoria(categoria);
        libroEditar.setEditorial(editorial);
        libroEditar.setIdioma(idioma);
        libroEditar.setPaginas(paginas);
        libroEditar.setDescripcion(descripcion);
        libroEditar.setEjemplares(ejemplares);
        libroEditar.setStock(stock);
        libroEditar.setDisponible(disponible);
            
        try{
            DAOLibros dao = new DAOLibroImpl();
            dao.modificar(libroEditar);
            JOptionPane.showMessageDialog(null, "Libro actualizado exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch(Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error en la edición del usuario: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }                                            

    private void limpiarCampos() {
        textTitulo.setText("");
        textFecha.setText("");
        textAutor.setText("");
        textCategoria.setText("");
        textEditorial.setText("");
        textIdioma.setText("");
        textPaginas.setText("");
        textDescripcion.setText("");
        textEjemplares.setText("");
        textStock.setText("");
        textDisponible.setText("");
   

    }//GEN-LAST:event_btnCargarLibroActionPerformed

    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarLibro;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textAutor;
    private javax.swing.JTextField textCategoria;
    private javax.swing.JTextField textDescripcion;
    private javax.swing.JTextField textDisponible;
    private javax.swing.JTextField textEditorial;
    private javax.swing.JTextField textEjemplares;
    private javax.swing.JTextField textFecha;
    private javax.swing.JTextField textIdioma;
    private javax.swing.JTextField textPaginas;
    private javax.swing.JTextField textStock;
    private javax.swing.JTextField textTitulo;
    // End of variables declaration//GEN-END:variables
}
