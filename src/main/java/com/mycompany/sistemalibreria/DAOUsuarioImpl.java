
package com.mycompany.sistemalibreria;

import com.mycompany.db.Conexion;
import com.mycompany.interfaces.DAOUsuarios;
import com.mycompany.model.Usuarios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAOUsuarioImpl extends Conexion implements DAOUsuarios {

    @Override
    public void registrar(Usuarios usuario) throws Exception {
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO Usuarios (nombre, apellido_paterno, apellido_materno, domicilio, telefono) VALUES(?,?,?,?,?);");
            st.setString(1,usuario.getNombre());
            st.setString(2,usuario.getApellido_paterno());
            st.setString(3,usuario.getApellido_materno());
            st.setString(4,usuario.getDomicilio());
            st.setString(5,usuario.getTelefono());
            st.executeUpdate();
            
        }
        catch(Exception e){
            throw e;
        }
        finally{
            this.Cerrar();
        }
    }   

    @Override
    public void modificar(Usuarios usuario) throws Exception {
     try {
        this.Conectar();
        PreparedStatement st = this.conexion.prepareStatement("UPDATE Usuarios SET nombre=?, apellido_paterno=?, apellido_materno=?, domicilio=?, telefono=? WHERE id=?");
        st.setString(1, usuario.getNombre());
        st.setString(2, usuario.getApellido_paterno());
        st.setString(3, usuario.getApellido_materno());
        st.setString(4, usuario.getDomicilio());
        st.setString(5, usuario.getTelefono());
        st.setInt(6, usuario.getId());
        st.executeUpdate();
    } catch (Exception e) {
        throw e;
    } finally {
        this.Cerrar();
    }
    }

    @Override
    public void eliminar(int usuarioId) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM Usuarios WHERE id = ?");
            st.setInt(1, usuarioId);
            st.executeUpdate();
    } catch (Exception e) {
            throw e;
    } finally {
            this.Cerrar();
    }
    }

    @Override
    public List<Usuarios> listado(String name) throws Exception {
        List<Usuarios> lista = null;
        try{
            this.Conectar();
            String Query = name.isEmpty() ? "SELECT * FROM Usuarios;" : "SELECT * FROM Usuarios WHERE nombre LIKE '%" + name + "%';";
            PreparedStatement st = this.conexion.prepareStatement(Query);
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                Usuarios usuario = new Usuarios();
                usuario.setId(rs.getInt("id"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido_paterno(rs.getString("apellido_paterno"));
                usuario.setApellido_materno(rs.getString("apellido_materno"));
                usuario.setDomicilio(rs.getString("domicilio"));
                usuario.setTelefono(rs.getString("telefono"));
                usuario.setSanciones(rs.getInt("sanciones"));
                usuario.setMonto_sancion(rs.getInt("monto_sancion"));
                lista.add(usuario);
            }
            rs.close();
            st.close();
        
        }catch(Exception e){
            throw e;
        } finally{
            this.Cerrar();
        }
        return lista;
    }

    @Override
    public Usuarios getUserById(int usuarioId) throws Exception {
        Usuarios usuario = new Usuarios();
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM Usuarios WHERE id = ? LIMIT 1;");
            st.setInt(1, usuarioId);
            
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                usuario.setId(rs.getInt("id"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido_paterno(rs.getString("apellido_paterno"));
                usuario.setApellido_materno(rs.getString("apellido_materno"));
                usuario.setDomicilio(rs.getString("domicilio"));
                usuario.setTelefono(rs.getString("telefono"));
                usuario.setSanciones(rs.getInt("sanciones"));
                usuario.setMonto_sancion(rs.getInt("monto_sancion"));
            }
            rs.close();
            st.close();
        
        }catch(Exception e){
            throw e;
        } finally{
            this.Cerrar();
        }
        return usuario;
    }    

    @Override
    public void sancionar(Usuarios usuario) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE Usuarios SET sanciones = ?, monto_sancion = ? WHERE id = ?");
            st.setInt(1, usuario.getSanciones());
            st.setInt(2, usuario.getMonto_sancion());
            st.setInt(3, usuario.getId());
            st.executeUpdate();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    
    }
}

