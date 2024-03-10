
package com.mycompany.sistemalibreria;

import com.mycompany.db.Conexion;
import com.mycompany.interfaces.DAOLibros;
import com.mycompany.model.Libros;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAOLibroImpl extends Conexion implements DAOLibros {

    @Override
    public void registrar(Libros libro) throws Exception {
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO Libros (titulo, fecha, autor, categoria, editorial, idioma, paginas, descripcion, ejemplares, stock, disponible) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
            st.setString(1, libro.getTitulo());
            st.setString(2, libro.getFecha());
            st.setString(3, libro.getAutor());
            st.setString(4, libro.getCategoria());
            st.setString(5, libro.getEditorial());
            st.setString(6, libro.getIdioma());
            st.setString(7, libro.getPaginas());
            st.setString(8, libro.getDescripcion());
            st.setString(9, libro.getEjemplares());
            st.setInt(10, libro.getStock());
            st.setInt(11, libro.getDisponible());
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
    public void modificar(Libros libro) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(int libroId) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM Libros WHERE id = ?");
            st.setInt(1, libroId);
            st.executeUpdate();
    } catch (Exception e) {
            throw e;
    } finally {
            this.Cerrar();
    }
    }

    @Override
    public List<Libros> listado(String name) throws Exception {
        List<Libros> lista = null;
        try{
            this.Conectar();
            String Query = name.isEmpty() ? "SELECT * FROM Libros;" : "SELECT * FROM Libros WHERE titulo LIKE '%" + name + "%';";
            PreparedStatement st = this.conexion.prepareStatement(Query);
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Libros libro = new Libros();
                libro.setId(rs.getInt("id"));
                libro.setTitulo(rs.getString("titulo"));
                libro.setFecha(rs.getString("fecha"));
                libro.setAutor(rs.getString("autor"));
                libro.setCategoria(rs.getString("categoria"));
                libro.setEditorial(rs.getString("editorial"));
                libro.setIdioma(rs.getString("idioma"));
                libro.setPaginas(rs.getString("paginas"));
                libro.setDescripcion(rs.getString("descripcion"));
                libro.setEjemplares(rs.getString("ejemplares"));
                libro.setStock(rs.getInt("stock"));
                libro.setDisponible(rs.getInt("disponible"));
                lista.add(libro);
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
    public Libros getBookById(int libroId) throws Exception {
        Libros libro = new Libros();
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM Libros WHERE id = ? LIMIT 1;");
            st.setInt(1, libroId);
            
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                libro.setId(rs.getInt("id"));
                libro.setTitulo(rs.getString("titulo"));
                libro.setFecha(rs.getString("fecha"));
                libro.setAutor(rs.getString("autor"));
                libro.setCategoria(rs.getString("categoria"));
                libro.setEditorial(rs.getString("editorial"));
                libro.setIdioma(rs.getString("idioma"));
                libro.setPaginas(rs.getString("paginas"));
                libro.setDescripcion(rs.getString("descripcion"));
                libro.setEjemplares(rs.getString("ejemplares"));
                libro.setStock(rs.getInt("stock"));
                libro.setDisponible(rs.getInt("disponible"));
            }
            rs.close();
            st.close();
        
        }catch(Exception e){
            throw e;
        } finally{
            this.Cerrar();
        }
        return libro;
    }        

    }
