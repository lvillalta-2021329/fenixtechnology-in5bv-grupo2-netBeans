package com.fenixtechnology.models.dao;

import com.fenixtechnology.db.Conexion;
import com.fenixtechnology.models.idao.IPersonaDao;
import com.fenixtechnology.models.domain.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lionar Gerardy Villalta Barrientos.
 * @date 28/08/2022
 * @time 15:40:29 Codigo: IN5BV
 */
public class PersonaDaoImpl implements IPersonaDao {

    private static final String SQL_SELECT = "SELECT id_persona, nombre1, nombre2, nombre3, apellido1, apellido2, email, telefono, direccion FROM personas";
    private static final String SQL_SELECT_BY_ID = "SELECT id_persona, nombre1, nombre2, nombre3, apellido1, apellido2, email, telefono, direccion FROM personas WHERE id_persona = ?";
    private static final String SQL_INSERT = "INSERT INTO personas (id_persona, nombre1, nombre2, nombre3, apellido1, apellido2, email, telefono, direccion) VALUES (?, ? ,?, ?, ?, ?, ?, ?, ?)";
     private static final String SQL_UPDATE = "UPDATE personas SET nombre1=?, nombre2=?, nombre3=?, apellido1=?, apellido2=?, email=?, telefono=?, direccion WHERE id_persona=?";
    private static final String SQL_DELETE = "DELETE FROM personas WHERE id_persona = ?";
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Persona persona = null;
    private List<Persona> listaPersona = new ArrayList<>();

    @Override
    public List<Persona> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                persona = new Persona(
                        rs.getInt("id_persona"),
                        rs.getString("nombre1"),
                        rs.getString("nombre2"),
                        rs.getString("nombre3"),
                        rs.getString("apellido1"),
                        rs.getString("apellido2"),
                        rs.getString("email"),
                        rs.getString("telefono"),
                        rs.getString("direccion"));
                listaPersona.add(persona);
                
                
            }

        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar listar los Personas.");
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return listaPersona;
    }
    
        @Override
    public int add(Persona persona) {
        int rows = 0;
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_INSERT);
            pstmt.setString(1, persona.getNombre1());
            pstmt.setString(2, persona.getNombre2());
            pstmt.setString(3, persona.getNombre3());
            pstmt.setString(4, persona.getApellido1());
            pstmt.setString(5, persona.getApellido2());
            pstmt.setString(6, persona.getEmail());
            pstmt.setString(7, persona.getTelefono());
            pstmt.setString(8, persona.getDireccion());
            System.out.println(pstmt.toString());

            rows = pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar insertar el siguiente registro: " + persona);
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return rows;
    }
    
    
       @Override
    public int update(Persona persona) {
        int rows = 0;
        
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_UPDATE);
            pstmt.setString(1, persona.getNombre1());
            pstmt.setString(2, persona.getNombre2());
            pstmt.setString(3, persona.getNombre3());
            pstmt.setString(4, persona.getApellido1());
            pstmt.setString (5, persona.getApellido2());
            pstmt.setString(6, persona.getEmail());
            pstmt.setString(7, persona.getTelefono());
            pstmt.setString(8, persona.getDireccion());
            pstmt.setInt(9, persona.getIdPersona());
            
            System.out.println(pstmt.toString());
            
            rows = pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intetar listar este registro: " + persona);
            e.printStackTrace(System.out);
        } catch (Exception e){
            e.printStackTrace(System.out);
        } finally{
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return rows;
    }

    @Override
    public Persona get(Persona persona) {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT_BY_ID);
            pstmt.setInt(1, persona.getIdPersona());
            System.out.println(pstmt.toString());
            rs = pstmt.executeQuery();

            while (rs.next()) {
                persona = new Persona(
                        rs.getInt("id_persona"),
                        rs.getString("nombre1"),
                        rs.getString("nombre2"),
                        rs.getString("nombre3"),
                        rs.getString("apellido1"),
                        rs.getString("apellido2"),
                        rs.getString("email"),
                        rs.getString("telefono"),
                        rs.getString("direccion"));
                System.out.println(pstmt.toString());

            }
            System.out.println("Persona: " + persona);
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar listar los Persona.");
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return persona;
    }



 

    @Override
    public int delete(Persona persona) {
        int rows = 0;
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_DELETE);
            pstmt.setInt(1, persona.getIdPersona());
            System.out.println(pstmt.toString());

            rows = pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar eliminar el registro con el id: " + persona.getIdPersona());
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return rows;
    }

}


