package com.fenixtechnology.models.domain;

import java.time.LocalDate;

/**
 *
 * @author Elmer Steeven CumeZ Pocon
 */


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
@Table(name = "facturas")
@NamedQueries({
    @NamedQuery(name = "Factura.findAll", query = "from Factura"),
    @NamedQuery(name = "Factura.find", query = "from Factura WHERE  no_factura = :no_factura")
})
public class Factura implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int no_factura;
    @Column
    private String serie;
    @Column
    private LocalDate fecha;
    @Column
    private String nombre;
    @Column
    private String direccion;
    @Column
    private String nit;
    @Column
    private int id_detalle_venta;
    @Column
    private int id_cliente;

    public Factura (){
    
    }
    
    //Eliminar 

    public Factura(int no_factura) {
        this.no_factura = no_factura;
    }

    public Factura(String serie, LocalDate fecha, String nombre, String direccion, String nit, int id_detalle_venta, int id_cliente) {
        this.serie = serie;
        this.fecha = fecha;
        this.nombre = nombre;
        this.direccion = direccion;
        this.nit = nit;
        this.id_detalle_venta = id_detalle_venta;
        this.id_cliente = id_cliente;
    }

    public Factura(int no_factura, String serie, LocalDate fecha, String nombre, String direccion, String nit, int id_detalle_venta, int id_cliente) {
        this.no_factura = no_factura;
        this.serie = serie;
        this.fecha = fecha;
        this.nombre = nombre;
        this.direccion = direccion;
        this.nit = nit;
        this.id_detalle_venta = id_detalle_venta;
        this.id_cliente = id_cliente;
    }

    public int getNo_factura() {
        return no_factura;
    }

    public void setNo_factura(int no_factura) {
        this.no_factura = no_factura;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public int getId_detalle_venta() {
        return id_detalle_venta;
    }

    public void setId_detalle_venta(int id_detalle_venta) {
        this.id_detalle_venta = id_detalle_venta;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    @Override
    public String toString() {
        return "Factura{" + "no_factura=" + no_factura + ", serie=" + serie + ", fecha=" + fecha + ", nombre=" + nombre + ", direccion=" + direccion + ", nit=" + nit + ", id_detalle_venta=" + id_detalle_venta + ", id_cliente=" + id_cliente + '}';
    }
    
}