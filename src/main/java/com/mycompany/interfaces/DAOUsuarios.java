package com.mycompany.interfaces;

import com.mycompany.model.Usuarios;
import java.util.List;

public interface DAOUsuarios {
    public void registrar(Usuarios usuario) throws Exception;
    public void modificar(Usuarios usuario) throws Exception;
    public void sancionar(Usuarios usuario) throws Exception;
    public void eliminar(int usuarioId) throws Exception;
    public List<Usuarios> listado(String name) throws Exception;
    public Usuarios getUserById(int usuarioId) throws Exception;

}

