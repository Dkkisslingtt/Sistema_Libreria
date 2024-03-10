package com.mycompany.sistemalibreria;

import com.mycompany.db.Conexion;
import com.mycompany.interfaces.DAOPrestamos;
import com.mycompany.model.Libros;
import com.mycompany.model.Prestamos;
import com.mycompany.model.Usuarios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class DAOPrestamoImpl extends Conexion implements DAOPrestamos {
    
    
    @Override
    public void registrar(Prestamos prestamo) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO Prestamos (usuario_id, libro_id, fecha_salida) VALUES(?,?,?);");
            st.setInt(1, prestamo.getUsuario_id());
            st.setInt(2, prestamo.getLibro_id());
            st.setString(3, prestamo.getFecha_salida());
            st.executeUpdate();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }
    
    @Override
    public void modificar(Prestamos prestamo) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE Prestamos SET usuario_id = ?, libro_id = ?, fecha_salida = ?, fecha_devuelto = ? WHERE id = ?");
            st.setInt(1, prestamo.getUsuario_id());
            st.setInt(2, prestamo.getLibro_id());
            st.setString(3, prestamo.getFecha_salida());
            st.setString(4, prestamo.getFecha_devuelto());
            st.setInt(5, prestamo.getId());
            st.executeUpdate();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }
    public Prestamos getLending(Usuarios usuario, Libros libro) throws Exception {
        Prestamos prestamo = null;
        
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM Prestamos WHERE usuario_id = ? AND libro_id = ? AND fecha_devuelto IS NULL ORDER BY id DESC LIMIT 1");
            st.setInt(1, usuario.getId());
            st.setInt(2, libro.getId());
            
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                prestamo = new Prestamos();
                prestamo.setId(rs.getInt("id"));
                prestamo.setUsuario_id(rs.getInt("usuario_id"));
                prestamo.setLibro_id(rs.getInt("libro_id"));
                prestamo.setFecha_salida(rs.getString("fecha_salida"));
                prestamo.setFecha_devuelto(rs.getString("fecha_devuelto"));
            }
            
            st.close();
            rs.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        
        return prestamo;
    }
    
        @Override
    public List<Prestamos> listar() throws Exception {
        List<Prestamos> lista = null;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM Prestamos ORDER BY id DESC");
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                Prestamos prestamo = new Prestamos();
                prestamo.setId(rs.getInt("id"));
                prestamo.setUsuario_id(rs.getInt("usuario_id"));
                prestamo.setLibro_id(rs.getInt("libro_id"));
                prestamo.setFecha_salida(rs.getString("fecha_salida"));
                prestamo.setFecha_devuelto(rs.getString("fecha_devuelto"));
                lista.add(prestamo);
            }
            rs.close();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return lista;
    }
}
