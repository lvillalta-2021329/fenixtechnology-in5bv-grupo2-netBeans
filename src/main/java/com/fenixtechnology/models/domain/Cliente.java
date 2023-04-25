package com.fenixtechnology.models.domain;

/**
 *
 * @author Lionar Gerardy Villalta Barrientos.
 * @date 28/08/2022
 * @time 18:29:06 Codigo: IN5BV
 */

public class Cliente {

    private int id_cliente;
    private int persona_id;
    private String nit;

    public Cliente() {
    }

    public Cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Cliente(int persona_id, String nit) {
        this.persona_id = persona_id;
        this.nit = nit;
    }

    public Cliente(int id_cliente, int persona_id, String nit) {
        this.id_cliente = id_cliente;
        this.persona_id = persona_id;
        this.nit = nit;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    

    public int getPersona_id() {
        return persona_id;
    }

    public void setPersona_id(int persona_id) {
        this.persona_id = persona_id;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id_cliente=" + id_cliente + ", persona_id=" + persona_id + ", nit=" + nit + '}';
    }

}