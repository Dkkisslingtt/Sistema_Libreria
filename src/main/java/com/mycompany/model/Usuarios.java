
package com.mycompany.model;

public class Usuarios {
    private int id;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private String domicilio;
    private String telefono;
    private int sanciones;
    private int monto_sancion;

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setSanciones(int sanciones) {
        this.sanciones = sanciones;
    }

    public void setMonto_sancion(int monto_sancion) {
        this.monto_sancion = monto_sancion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getSanciones() {
        return sanciones;
    }

    public int getMonto_sancion() {
        return monto_sancion;
    }
}
