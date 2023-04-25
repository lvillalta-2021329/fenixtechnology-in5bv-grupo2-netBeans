
package com.fenixtechnology.models.idao;

import java.util.List;
import com.fenixtechnology.models.domain.Factura;

/**
 *
 * @author Elmer Steeven CumeZ Pocon
 */
public interface IFacturaDao {
    //listar registros
    
    public List<Factura> getAll();
    
    public Factura get(Factura factura);
        
    //agregar
    public int add(Factura factura);
    
    //actualizar
    public int update(Factura factura);
    
    //elminar
    public int delete(Factura factura); 
}
