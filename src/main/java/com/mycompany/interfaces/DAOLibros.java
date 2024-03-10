package com.mycompany.interfaces;

import com.mycompany.model.Libros;
import java.util.List;

public interface DAOLibros {
    public void registrar(Libros libro) throws Exception;
    public void modificar(Libros libro) throws Exception;
    public void eliminar(int libroId) throws Exception;
    public List<Libros> listado(String name) throws Exception;
    public Libros getBookById(int libroId) throws Exception;
}
