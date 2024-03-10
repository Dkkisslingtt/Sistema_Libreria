
package com.mycompany.model;

public class Prestamos {
    private int id;
    private int usuario_id;
    private int libro_id;
    private String fecha_salida;
    private String fecha_devuelto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public int getLibro_id() {
        return libro_id;
    }

    public void setLibro_id(int libro_id) {
        this.libro_id = libro_id;
    }

    public String getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public String getFecha_devuelto() {
        return fecha_devuelto;
    }

    public void setFecha_devuelto(String fecha_devuelto) {
        this.fecha_devuelto = fecha_devuelto;
    }
    
}
