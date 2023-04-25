package com.fenixtechnology.models.dao;

import com.fenixtechnology.models.domain.Proveedores;
import com.fenixtechnology.db.Conexion;
import com.fenixtechnology.models.idao.IProveedoresDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jairo  Estuardo Alvarado del Cid
 * 
 */
public class ProveedoresDaoImpl implements IProveedoresDao {

    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Proveedores proveedores = null;
    private List<Proveedores> listaProveedores = new ArrayList<>();
    private static final String SQL_SELECT = "SELECT id_proveedor, nombre_proveedor, telefono, direccion FROM proveedores";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM provedores WHRE id_proveedor = ?";

    @Override
    public List<Proveedores> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                proveedores = new Proveedores(rs.getInt("id_proveedor"),
                        rs.getString("nombre_proveedor"),
                        rs.getString("telefono"),
                        rs.getString("direccion"));
                listaProveedores.add(proveedores);
            }

        } catch (SQLException e) {
            System.err.println("Se produjo un error al Intentar listar los Estudiantes");
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return listaProveedores;

    }

    @Override
    public int add(Proveedores proveedores) {
        int rows = 0;
        return rows;
    }

    @Override
    public int update(Proveedores proveedores) {
        int rows = 0;
        return rows;
    }

    @Override
    public int delete(Proveedores proveedores) {
        int rows = 0;
        return rows;
    }

    @Override
    public Proveedores get(Proveedores estudiante) {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT_BY_ID);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                proveedores = new Proveedores(rs.getInt("id_proveedor"),
                        rs.getString("nombre_proveedor"),
                        rs.getString("telefono"),
                        rs.getString("direccion"));
                listaProveedores.add(proveedores);
            }

        } catch (SQLException e) {
            System.err.println("Se produjo un error al Intentar listar los Estudiantes");
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return proveedores;

    }

}
