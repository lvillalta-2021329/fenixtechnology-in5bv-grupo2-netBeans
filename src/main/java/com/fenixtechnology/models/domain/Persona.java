
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
@Table(name = "personas")
@NamedQueries({
    @NamedQuery(name = "Persona.findAll", query="from Persona"), 
    @NamedQuery(name = "Persona.find", query="from Persona WHERE id_persona = :id_persona")
})
public class Persona implements Serializable {
    
    private static final long serialVersionUID = 1L; 
    
    @Id
    @Column(name="id_persona")
    @GeneratedValue(strategy = GenerationType.IDENTITY) //para auto incrementables si no es autoincrement no se agrega
    private int idPersona;
    @Column
    private String nombre1;
    @Column
    private String nombre2;
    @Column
    private String nombre3;
    @Column
    private String apellido1;
    @Column
    private String apellido2;
    @Column
    private String email;
    @Column
    private String telefono;
    @Column
    private String direccion;
    
    
    public Persona(){
    }

    public Persona(int idPersona) {
        this.idPersona = idPersona;
    }

    public Persona(String nombre1, String nombre2, String nombre3, String apellido1, String apellido2, String email, String telefono, String direccion) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.nombre3 = nombre3;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
        
    }

    public Persona(int idPersona, String nombre1, String nombre2, String nombre3, String apellido1, String apellido2, String email, String telefono, String direccion) {
        this.idPersona = idPersona;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.nombre3 = nombre3;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
        
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getNombre3() {
        return nombre3;
    }

    public void setNombre3(String nombre3) {
        this.nombre3 = nombre3;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        return "Persona{" + "idPersona=" + idPersona + ", nombre1=" + nombre1 + ", nombre2=" + nombre2 + ", nombre3=" + nombre3 + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", email=" + email + ", telefono=" + telefono + ", direccion=" + direccion + '}';
    }
    
    
   

   

}

