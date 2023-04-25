package com.fenixtechnology.models.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Entity
@Table(name = "proveedores")
@NamedQueries({
    @NamedQuery(name = "Proveedores.findAll", query = "from Proveedores"),
    @NamedQuery(name = "Proveedores.find", query = "from Proveedores WHERE id_proveedor = :id")
})

public class Proveedores implements Serializable{

    @Id
    @Column(name = "id_proveedor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_proveedor;
    @Column
    private String nombre_proveedor;
    @Column
    private String telefono;
    @Column
    private String direccion;

    public Proveedores() {

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
        return "Proveedores{" + "id_proveedor=" + id_proveedor + ", nombre_provedoor=" + nombre_proveedor + ", telefono=" + telefono + ", direccion=" + direccion + '}';
    }

}
