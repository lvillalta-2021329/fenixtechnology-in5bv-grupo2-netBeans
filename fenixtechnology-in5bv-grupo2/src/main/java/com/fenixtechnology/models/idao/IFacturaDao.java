
package com.fenixtechnology.models.idao;

import java.util.List;
import com.fenixtechnology.models.domain.Factura;

/**
 *
 * @author informatica
 */
public interface IFacturaDao {
    //listar registros
    
    public List<Factura> getAll();
    
    //agregar
    public boolean add(Factura facrura);
    
    //actualizar
    public boolean update(Factura factura);
    
    //elminar
    public boolean delete(Factura factura); 
}
