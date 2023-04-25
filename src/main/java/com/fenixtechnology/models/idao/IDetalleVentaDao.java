
package com.fenixtechnology.models.idao;

import com.fenixtechnology.models.domain.DetalleVenta;
import java.util.List;

/**
 *
 * @author STEEVEN
 */
public interface IDetalleVentaDao {
    public List<DetalleVenta> getAll();
     
    public DetalleVenta get(DetalleVenta detalleVenta);
    
    //agregar
    public int add(DetalleVenta detalleVenta);
    
    //actualizar
    public int update(DetalleVenta detalleVenta);
    
    //elminar
    public int delete(DetalleVenta detalleVenta); 
}
