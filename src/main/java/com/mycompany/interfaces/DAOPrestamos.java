
package com.mycompany.interfaces;

import com.mycompany.model.Libros;
import com.mycompany.model.Prestamos;
import com.mycompany.model.Usuarios;

import java.util.List;

public interface DAOPrestamos {
public void registrar(Prestamos prestamo) throws Exception;
public void modificar(Prestamos prestamo) throws Exception;
public Prestamos getLending(Usuarios usuario, Libros libro) throws Exception;
public List<Prestamos> listar() throws Exception;
    
}
