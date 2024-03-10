package com.mycompany.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    protected Connection conexion;
    private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  // Corrección aquí
    private final String DB_URL = "jdbc:mysql://localhost/iLib";
    
    private final String USER = "root";
    private final String PASS = "1234";
    
    
    public void Conectar() throws ClassNotFoundException {
        try {
            Class.forName(JDBC_DRIVER);  // Corrección aquí
            conexion = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Cerrar() throws SQLException {
        if (conexion != null) {
            if (!conexion.isClosed()) {
                conexion.close();
            }
        }
    }
}

