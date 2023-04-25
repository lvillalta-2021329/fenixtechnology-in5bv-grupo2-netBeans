package com.fenixtechnology.models.dao;

/**
 *
 * @author Edy Leonel Letona Argueta
 * 
 */

import com.fenixtechnology.db.Conexion;
import com.fenixtechnology.models.domain.Empleados;
import com.fenixtechnology.models.idao.IEmpleadosDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpleadosDaoImpl implements IEmpleadosDao{

    private static final String SQL_SELECT = "SELECT id_empleado, persona_id FROM empleados";
    private static final String SQL_SELECT_BY_ID = "SELECT id_cliente, persona_id, nit FROM empleados WHERE id_empleado = ?";
    private static final String SQL_INSERT = "INSERT INTO empleados (id_empleado, persona_id) VALUES (?, ? ,?)";
    private static final String SQL_DELETE = "DELETE FROM empleados WHERE id_empleado = ?";
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Empleados empleado = null;
    private final List<Empleados> listaEmpleados = new ArrayList<>();
   
    @Override
    public List<Empleados> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                empleado = new Empleados(
                        rs.getInt("id_empleado"),
                        rs.getInt("persona_id"));
                        
                System.out.println(empleado.toString());
                listaEmpleados.add(empleado);
            }

        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar listar los Empleados.");
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return listaEmpleados;
    }

    @Override
    public Empleados get(Empleados empleado) {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT_BY_ID);
            pstmt.setInt(1, empleado.getId_empleado());
            System.out.println(pstmt.toString());
            rs = pstmt.executeQuery();

            while (rs.next()) {
                empleado = new Empleados (
                        rs.getInt("id_cliente"),
                        rs.getInt("persona_id"));
                System.out.println(empleado.toString());

            }
            System.out.println("Persona: " + empleado);
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar listar los Clients.");
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return empleado;
    }

    @Override
    public int add(Empleados cliente) {
        int rows = 0;
        return rows;
    }

    @Override
    public int update(Empleados empleado) {
        int rows = 0;
        return rows;
    }

    @Override
    public int delete(Empleados empleado) {
        int rows = 0;
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_DELETE);
            pstmt.setInt(1, empleado.getId_empleado());
            System.out.println(pstmt.toString());

            rows = pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar eliminar el registro con el id: " + empleado.getId_empleado());
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
