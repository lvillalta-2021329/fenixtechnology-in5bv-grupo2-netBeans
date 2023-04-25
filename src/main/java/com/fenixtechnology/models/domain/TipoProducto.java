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
@Table(name = "tipo_productos")
@NamedQueries({
    @NamedQuery(name = "TipoProducto.findAll", query = "from TipoProducto"),
    @NamedQuery(name = "TipoProducto.find", query = "from TipoProducto WHERE  id_tipo_producto = :id")
})
public class TipoProducto implements Serializable{
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column
     private int id_tipo_producto;
     @Column
     private String categoria;
     
     public TipoProducto(){
         
     }

    public TipoProducto(int id_tipo_producto, String categoria) {
        this.id_tipo_producto = id_tipo_producto;
        this.categoria = categoria;
    }

    public int getId_tipo_producto() {
        return id_tipo_producto;
    }

 

    public void setId_tipo_producto(int id_tipo_producto) {
        this.id_tipo_producto = id_tipo_producto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public TipoProducto(String categoria) {
        this.categoria = categoria;
    }

    public TipoProducto(int id_tipo_producto) {
        this.id_tipo_producto = id_tipo_producto;
    }
       @Override
    public String toString() {
        return "TipoProducto{" + "id_tipo_producto=" + id_tipo_producto + ", categoria=" + categoria + '}';
    }
}