package com.fenixtechnology.models.dao;

/**
 *
 * @author Lionar Gerardy Villalta Barrientos.
 * @date 28/08/2022
 * @time 18:37:54 Codigo: IN5BV
 */
import com.fenixtechnology.db.Conexion;
import com.fenixtechnology.models.idao.IClienteDao;
import com.fenixtechnology.models.domain.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDaoImpl implements IClienteDao {

    private static final String SQL_SELECT = "SELECT id_cliente, persona_id, nit FROM clientes";
    private static final String SQL_SELECT_BY_ID = "SELECT id_cliente, persona_id, nit FROM clientes WHERE id_cliente = ?";
    private static final String SQL_INSERT = "INSERT INTO clientes (id_cliente, persona_id, nit) VALUES (?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE clientes SET   persona_id=?, nit=?,  WHERE id_cliente=?";
    private static final String SQL_DELETE = "DELETE FROM clientes WHERE id_cliente = ?";

    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Cliente cliente = null;
    private final List<Cliente> listaClientes = new ArrayList<>();

    @Override
    public List<Cliente> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                cliente = new Cliente(
                        rs.getInt("id_cliente"),
                        rs.getInt("persona_id"),
                        rs.getString("nit"));

                System.out.println(cliente.toString());
                listaClientes.add(cliente);
            }

        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar listar los Clientes.");
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return listaClientes;
    }

    @Override
    public int add(Cliente cliente) {
        int rows = 0;
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_INSERT);
            pstmt.setInt(1, cliente.getId_cliente());
            pstmt.setInt(2, cliente.getPersona_id());
            pstmt.setString(3, cliente.getNit());

            System.out.println(pstmt.toString());

            rows = pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar insertar el siguiente registro: " + cliente);
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
    public int update(Cliente cliente) {
        int rows = 0;

        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_UPDATE);

            pstmt.setInt(1, cliente.getPersona_id());
            pstmt.setString(2, cliente.getNit());
            pstmt.setInt(3, cliente.getId_cliente());

            System.out.println(pstmt.toString());

            rows = pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intetar listar este registro: " + cliente);
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
    public int delete(Cliente cliente) {
        int rows = 0;
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_DELETE);
            pstmt.setInt(1, cliente.getId_cliente());
            System.out.println(pstmt.toString());

            rows = pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar eliminar el registro con el id: " + cliente.getId_cliente());
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
    public Cliente get(Cliente cliente) {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT_BY_ID);
            pstmt.setInt(1, cliente.getId_cliente());
            System.out.println(pstmt.toString());
            rs = pstmt.executeQuery();

            while (rs.next()) {
                cliente = new Cliente(
                        rs.getInt("id_cliente"),
                        rs.getInt("persona_id"),
                        rs.getString("nit"));
                System.out.println(cliente.toString());

            }
            System.out.println("Persona: " + cliente);
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
        return cliente;
    }

   

}
