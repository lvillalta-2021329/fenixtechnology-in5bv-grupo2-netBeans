
package com.fenixtechnology.models.idao;

import com.fenixtechnology.models.domain.DetalleVenta;
import java.util.List;

/**
 *
 * @author STEEVEN
 */
public interface IDetalleVentaDao {
     public List<DetalleVenta> getAll();
    
    //agregar
    public boolean add(DetalleVenta detalleVenta);
    
    //actualizar
    public boolean update(DetalleVenta detalleVenta);
    
    //elminar
    public boolean delete(DetalleVenta detalleVenta); 
}
