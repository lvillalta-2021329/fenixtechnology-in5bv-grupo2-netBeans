
package com.fenixtechnology.models.dao;

/**
 *
 * @author Elmer Steeven CumeZ Pocon
 */

import com.fenixtechnology.db.Conexion;
import com.fenixtechnology.models.domain.Factura;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException; 
import java.util.ArrayList;
import java.util.List;
import com.fenixtechnology.models.idao.IFacturaDao;


public class FacturaDaoImpl implements IFacturaDao{
    
    private static final String SQL_SELECT="SELECT no_factura, serie, fecha, nombre, serie, direccion, nit, id_detalle_venta, id_cliente FROM facturas";
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Factura factura = null;
    private List<Factura> listaFactura = new ArrayList<>();
    
    
    @Override
    public List<Factura> getAll() {
       try {
          con = Conexion.getConnection();    
          pstmt = con.prepareStatement(SQL_SELECT);
          rs = pstmt.executeQuery();
          
          while(rs.next()){
            factura = new Factura(rs.getInt("no_factura"), rs.getString("serie"), (rs.getDate("fecha").toLocalDate()), rs.getString("nombre"), rs.getString("direccion"), rs.getString("nit"), rs.getInt("id_detalle_venta"), rs.getInt("id_cliente"));
            listaFactura.add(factura);
          }
       }catch (SQLException e){
           System.out.println("Se produjo error al intentar listar los estudiantes");
           e.printStackTrace(System.out);
       }catch(Exception e){
           e.printStackTrace(System.out);
       } finally {
           Conexion.close(rs);
           Conexion.close(pstmt);
           Conexion.close(con);
       }  
       return listaFactura;
    }

    @Override
    public boolean add(Factura factura) {
        return false;
    }

    @Override
    public boolean update(Factura factura) {
        return false;
    }

    @Override
    public boolean delete(Factura factura) {
        return false;
    }
    
}
