package com.fenixtechnology.models.domain;

/**
 *
 * @author Josecarlos Anzueto Rodas
 * @date 4/09/2022
 * @time 19:01:21
 */
public class Ofertas {
private int id;
private double descuento;

   //constructor nulo
    public Ofertas() {
    }

    public Ofertas(int id) {
        this.id = id;
    }

    public Ofertas(double descuento) {
        this.descuento = descuento;
    }
    
    public Ofertas(int id, double descuento) {
        this.id = id;
        this.descuento = descuento;
    }

    //Metodos Getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    //Metodo String

    @Override
    public String toString() {
        return "ofertas{" + "id=" + id + ", descuento=" + descuento + '}';
    }
    
}
