package com.fenixtechnology.models.domain;

/**
 *
 * @author Edy Leonel Letona Argueta
 * 
 */
public class Empleados {
    private int id_empleado;
    private int persona_id;

    public Empleados() {
    }

    public Empleados(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public Empleados(int id_empleado, int persona_id) {
        this.id_empleado = id_empleado;
        this.persona_id = persona_id;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public int getPersona_id() {
        return persona_id;
    }

    public void setPersona_id(int persona_id) {
        this.persona_id = persona_id;
    }

    @Override
    public String toString() {
        return "Empleados{" + "id_empleado=" + id_empleado + ", persona_id=" + persona_id + '}';
    }
    
}
