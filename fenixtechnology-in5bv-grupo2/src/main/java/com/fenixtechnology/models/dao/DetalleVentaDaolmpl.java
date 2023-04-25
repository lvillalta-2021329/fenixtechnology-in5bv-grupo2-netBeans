
package com.fenixtechnology.models.dao;

import com.fenixtechnology.db.Conexion;
import com.fenixtechnology.models.domain.DetalleVenta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.fenixtechnology.models.idao.IDetalleVentaDao;

/**
 *
 * @author STEEVEN
 */
public class DetalleVentaDaolmpl implements IDetalleVentaDao{
    
    private static final String SQL_SELECT="SELECT id_detalle_venta, cantidad, subtotal, id_producto FROM detalle_ventas";
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private DetalleVenta detalleVenta = null;
    private List<DetalleVenta> listaDetalleVenta = new ArrayList<>();
    
    
    @Override
    public List<DetalleVenta> getAll() {
       try {
          con = Conexion.getConnection();    
          pstmt = con.prepareStatement(SQL_SELECT);
          rs = pstmt.executeQuery();
          
          while(rs.next()){
                detalleVenta = new DetalleVenta(rs.getInt("id_detalle_venta"), rs.getInt("cantidad"), rs.getDouble("subtotal"), rs.getInt("id_producto"));
                listaDetalleVenta.add(detalleVenta);
            }
       }catch (SQLException e){
           System.out.println("Se produjo error al intentar listar los Detalles de venta");
           e.printStackTrace(System.out);
       }catch(Exception e){
           e.printStackTrace(System.out);
       } finally {
           Conexion.close(rs);
           Conexion.close(pstmt);
           Conexion.close(con);
       }  
       return listaDetalleVenta;
    }

    @Override
    public boolean add(DetalleVenta detalleVenta) {
        return false;
    }

    @Override
    public boolean update(DetalleVenta detalleVenta) {
        return false;
    }

    @Override
    public boolean delete(DetalleVenta detalleVenta) {
        return false;
    }
}
