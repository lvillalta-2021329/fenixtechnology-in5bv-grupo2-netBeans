package com.fenixtechnology.models.domain;

public class TipoProducto {

     private int id_tipo_producto;
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