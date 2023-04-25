package com.fenixtechnology.models.domain;

public class Proveedores {

    private int id_proveedor;
    private String nombre_proveedor;
    private String telefono;
    private String direccion;

    public Proveedores(){
         
    }

    public Proveedores(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public Proveedores(int id_proveedor, String nombre_proveedor, String telefono, String direccion) {
        this.id_proveedor = id_proveedor;
        this.nombre_proveedor = nombre_proveedor;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Proveedores(String nombre_proveedor, String telefono, String direccion) {
        this.nombre_proveedor = nombre_proveedor;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Proveedores{" + "id_provedoor=" + id_proveedor + ", nombre_provedoor=" + nombre_proveedor + ", telefono=" + telefono + ", direccion=" + direccion + '}';
    }
     
}