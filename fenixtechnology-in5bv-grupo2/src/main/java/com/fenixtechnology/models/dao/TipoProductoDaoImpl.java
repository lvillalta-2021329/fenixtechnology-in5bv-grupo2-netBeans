
package com.fenixtechnology.models.dao;
import com.fenixtechnology.models.domain.TipoProducto;
import com.fenixtechnology.db.Conexion;
import com.fenixtechnology.models.idao.ITipoProductoDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author informatica
 */
public class TipoProductoDaoImpl implements ITipoProductoDao{

    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs =null;
    private TipoProducto tipoProducto = null;
    private List<TipoProducto> listaTipoProducto = new ArrayList<>();
    private static final String SQL_SELECT = "SELECT id_tipo_producto, categoria FROM tipo_productos";
    
    
    
    @Override
    public List<TipoProducto> getAll() {

        try {
            
            con = Conexion.getConnection();
            pstmt= con.prepareStatement(SQL_SELECT);
            rs = pstmt .executeQuery();
           
            while(rs.next()) {
             tipoProducto = new TipoProducto(rs.getInt("id_tipo_producto"),rs.getString("categoria"));
             listaTipoProducto.add(tipoProducto);       
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
            return listaTipoProducto;
        
    }

    @Override
    public boolean add(TipoProducto tipoProducto) {
            return false;
    }

    @Override
    public boolean update(TipoProducto tipoProducto) {
            return false;
    }

    @Override
    public boolean delete(TipoProducto tipoProducto) {
            return false;
    }
    
}
