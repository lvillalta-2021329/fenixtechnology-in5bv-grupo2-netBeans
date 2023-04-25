
package com.fenixtechnology.models.idao;

import com.fenixtechnology.models.domain.TipoProducto;
import java.util.List;

/**
 *
 * @author informatica
 */
public interface ITipoProductoDao {
    public List<TipoProducto> getAll();
    
    public boolean add(TipoProducto tipoProducto);
    
    public boolean update(TipoProducto tipoProducto);
    
    public boolean delete(TipoProducto tipoProducto);
    
}
