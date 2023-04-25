package com.fenixtechnology.models.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Josecarlos Anzueto Rodas
 * @date 4/09/2022
 * @time 19:01:21
 */


@Entity
@Table (name = "ofertas")
@NamedQueries({
    @NamedQuery(name = "Oferta.findAll", query="from Ofertas"),
    @NamedQuery(name = "Oferta.find", query="from Ofertas WHERE id = :id")
})

public class Ofertas implements Serializable{
private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id_oferta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column
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