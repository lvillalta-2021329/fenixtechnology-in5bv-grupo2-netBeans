
package com.fenixtechnology.models.domain;

/**
 *
 * @author STEEVEN
 */
public class DetalleVenta {
    private int id_detalle_venta;
    private int cantidad;
    private double subtotal;
    private int id_producto;
    
        public DetalleVenta (){
    
    }

    public DetalleVenta(int id_detalle_venta) {
        this.id_detalle_venta = id_detalle_venta;
    }

    public DetalleVenta(int id_detalle_venta, int cantidad, double subtotal, int id_producto) {
        this.id_detalle_venta = id_detalle_venta;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.id_producto = id_producto;
    }

    public DetalleVenta(int id_detalle_venta, int cantidad, int id_producto) {
        this.id_detalle_venta = id_detalle_venta;
        this.cantidad = cantidad;
        this.id_producto = id_producto;
    }

    public int getId_detalle_venta() {
        return id_detalle_venta;
    }

    public void setId_detalle_venta(int id_detalle_venta) {
        this.id_detalle_venta = id_detalle_venta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    @Override
    public String toString() {
        return "detalleVenta{" + "id_detalle_venta=" + id_detalle_venta + ", cantidad=" + cantidad + ", subtotal=" + subtotal + ", id_producto=" + id_producto + '}';
    }
    
}
