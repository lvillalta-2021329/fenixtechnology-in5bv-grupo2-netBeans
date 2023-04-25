
package com.fenixtechnology.models.domain;


public class Producto {
    
    private int id;
    private String nombreProducto;
    private String descripcion;
    private double precioUnitario;
    private int stock;
    private int idTipoProducto;
    private int idProveedor;
    private int idOferta;
    
    
    public Producto(){
    
    }

    public Producto(int id) {
        this.id = id;
    }

    public Producto(String nombreProducto, String descripcion, double precioUnitario, int stock, int idTipoProducto, int idProveedor, int idOferta) {
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.stock = stock;
        this.idTipoProducto = idTipoProducto;
        this.idProveedor = idProveedor;
        this.idOferta = idOferta;
    }

    public Producto(int id, String nombreProducto, String descripcion, double precioUnitario, int stock, int idTipoProducto, int idProveedor, int idOferta) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.stock = stock;
        this.idTipoProducto = idTipoProducto;
        this.idProveedor = idProveedor;
        this.idOferta = idOferta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getIdTipoProducto() {
        return idTipoProducto;
    }

    public void setIdTipoProducto(int idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public int getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(int idOferta) {
        this.idOferta = idOferta;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombreProducto=" + nombreProducto + ", descripcion=" + descripcion + ", precioUnitario=" + precioUnitario + ", stock=" + stock + ", idTipoProducto=" + idTipoProducto + ", idProveedor=" + idProveedor + ", idOferta=" + idOferta + '}';
    }

    
}
