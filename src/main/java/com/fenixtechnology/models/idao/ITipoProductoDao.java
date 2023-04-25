
package com.fenixtechnology.models.idao;

import com.fenixtechnology.models.domain.TipoProducto;
import java.util.List;

/**
 *
 * @author informatica
 */
public interface ITipoProductoDao {
    public List<TipoProducto> getAll();
    
    public int add(TipoProducto tipoProducto);
    
    public int update(TipoProducto tipoProducto);
    
    public TipoProducto get(TipoProducto tipoProducto);
    
    public int delete(TipoProducto tipoProducto);
    
}
