
package com.fenixtechnology.models.dao;

// importar conexion
// importar Producto
// importar IProductoDao

import com.fenixtechnology.models.idao.IProductoDao;
import com.fenixtechnology.db.Conexion;
import com.fenixtechnology.models.domain.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductoDaoImpl implements IProductoDao {
    
    private static final String SQL_SELECT = "SELECT id_producto, nombre_producto, descripcion, precio_unitario, stock, id_tipo_producto, id_proveedor, id_oferta FROM productos";
    private static final String SQL_DELETE = "DELETE FROM productos WHERE id_producto = ?";
     
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Producto producto = null;
    private List <Producto> listaProductos = new ArrayList<>();
    
    @Override
    public List<Producto> getAll() {
       try{
           con = Conexion.getConnection();
           pstmt = con.prepareStatement(SQL_SELECT);
           rs = pstmt.executeQuery();
           
           
           while(rs.next()){
              producto = new Producto (rs.getInt("id_producto"),rs.getString("nombre_producto"),
                      rs.getString("descripcion"), rs.getDouble("precio_unitario"), 
                      rs.getInt("stock"), rs.getInt("id_tipo_producto"), rs.getInt("id_proveedor"),
                      rs.getInt("id_oferta"));
              listaProductos.add(producto);
           }
           
       }catch(SQLException e){
           System.out.println("Se produjo un error al intentar listar los estudiantes");
           e.printStackTrace(System.out);
       }catch(Exception e){
          e.printStackTrace(System.out);
       }finally{
           Conexion.close(rs);
           Conexion.close(pstmt);
           Conexion.close(con);
       }
       
       return listaProductos;
    }

    @Override
    public int add(Producto producto) {
       return 0;
    }

    @Override
    public int update(Producto producto) {
        return 0;
    }

    @Override
    public int delete(Producto producto) {
        int rows = 0;
        
        try {
            con =  Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_DELETE);
            pstmt.setInt(1, producto.getId());
            
            System.out.println(pstmt.toString());
            rows = pstmt.executeUpdate();
            
        }catch(SQLException e){
            System.out.println("se produjo un error al intentar eliminar el registro con el id" + producto.getId());
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        return rows; 
    }
}