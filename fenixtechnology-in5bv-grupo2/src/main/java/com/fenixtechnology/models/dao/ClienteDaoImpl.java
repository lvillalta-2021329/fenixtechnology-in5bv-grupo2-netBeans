

package com.fenixtechnology.models.dao;

/**
 *
 * @author Lionar Gerardy Villalta Barrientos.
 * @date 28/08/2022
 * @time 18:37:54
 * Codigo: IN5BV
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
    
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs =null;
    private Cliente cliente = null;
    private List<Cliente> listaClientes = new ArrayList<>();
    private static final String SQL_SELECT = "SELECT id_cliente, persona_id, nit FROM clientes";
    
    @Override
    public List<Cliente> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt= con.prepareStatement(SQL_SELECT);
            rs = pstmt .executeQuery();
           
            while(rs.next()) {
             cliente = new Cliente(rs.getInt("id_cliente"), rs.getInt("persona_id"), rs.getString("nit"));
             listaClientes.add(cliente);       
            }
            
        } catch (SQLException e) {
            System.err.println("Se produjo un error al Intentar listar los Estudiantes");
            e.printStackTrace(System.out);
        } catch(Exception e){
            e.printStackTrace(System.out);
        } finally{
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
            return listaClientes;
    }

    @Override
    public boolean add(Cliente cliente) {
            return false;
    }

    @Override
    public boolean update(Cliente cliente) {
            return false;
    }

    @Override
    public boolean delete(Cliente cliente) {
            return false;
    }
   
}
