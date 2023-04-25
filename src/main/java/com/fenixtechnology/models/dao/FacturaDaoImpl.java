
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
    private static final String SQL_DELETE = "DELETE FROM facturas WHERE no_factura = ?";
    private static final String SQL_SELECT_BY_ID = "SELECT no_factura, serie, fecha, nombre, serie, direccion, nit, id_detalle_venta, id_cliente FROM facturas WHERE no_factura = ?";

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
    public int add(Factura factura) {
        int rows = 0;
        return rows;
    }

    @Override
    public int update(Factura factura) {
        int rows = 0;
        return rows;
    }

    @Override
    public int delete(Factura factura) {
        int rows = 0;
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_DELETE);
            pstmt.setInt(1, factura.getNo_factura());
            System.out.println(pstmt.toString());

            rows = pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar eliminar el registro con el id: " + factura.getNo_factura());
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
    public Factura get(Factura factura) {
try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT_BY_ID);
            pstmt.setInt(1, factura.getNo_factura());
            System.out.println(pstmt.toString());
            rs = pstmt.executeQuery();

            while (rs.next()) {
                factura = new Factura (rs.getInt("no_factura"), 
                        rs.getString("serie"), 
                        (rs.getDate("fecha").toLocalDate()), 
                        rs.getString("nombre"), 
                        rs.getString("direccion"), 
                        rs.getString("nit"), 
                        rs.getInt("id_detalle_venta"), 
                        rs.getInt("id_cliente"));
                System.out.println(factura.toString());

            }
            System.out.println("Factura: " + factura);
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
        return factura;    
    }
    
}
