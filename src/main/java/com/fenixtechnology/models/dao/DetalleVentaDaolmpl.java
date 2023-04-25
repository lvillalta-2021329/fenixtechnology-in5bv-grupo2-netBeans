
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
     private static final String SQL_SELECT_BY_ID ="SELECT id_detalle_venta FROM detalle_ventas WHERE id_detalle_venta = ?";
     
     private static final String SQL_DELETE = "DELETE FROM factura WHERE no_factura = ? ";
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private DetalleVenta Detalle_venta = null;
    private List<DetalleVenta> ListaDetalle_venta = new ArrayList<>();



    @Override
    public int add(DetalleVenta detalleVenta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(DetalleVenta detalleVenta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }   
    
    @Override
    public List<DetalleVenta> getAll() {
        try{
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            System.out.println(pstmt.toString());
            rs = pstmt.executeQuery();
            while (rs.next()){
                Detalle_venta = new DetalleVenta(rs.getInt("id_detalle_venta"),rs.getInt("cantidad"), (int) rs.getDouble("subtotal"),rs.getInt("id_producto"));
                ListaDetalle_venta.add(Detalle_venta);
            }
        }catch(SQLException e){
            System.err.println("Se produjo un error al intentar listar los estudiante");
            e.printStackTrace(System.out);
        }catch(Exception e){
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
            return ListaDetalle_venta;
    }
    
    @Override
    public DetalleVenta get(DetalleVenta Detalle_venta) {
        try{
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT_BY_ID);
            pstmt.setInt(1, Detalle_venta.getId_detalle_venta());
            System.out.println(pstmt.toString());
            rs = pstmt.executeQuery();
            while (rs.next()){
                Detalle_venta = new DetalleVenta(rs.getInt("id_detalle_venta"),rs.getInt("cantidad"), (int) rs.getDouble("subtotal"),rs.getInt("id_producto"));
                
            }
            System.out.println("Detalle_venta " + Detalle_venta);
        }catch(SQLException e){
            System.err.println("Se produjo un error al intentar listar los estudiante");
            e.printStackTrace(System.out);
        }catch(Exception e){
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return Detalle_venta;
    }

    @Override
    public int delete(DetalleVenta detalleVenta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
