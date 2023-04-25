
package com.fenixtechnology.models.idao;

import com.fenixtechnology.models.domain.Proveedores;
import java.util.List;

/**
 *
 * @author informatica
 */
public interface IProveedoresDao {
    public List<Proveedores> getAll();
    
    public boolean add(Proveedores proveedores);
    
    public boolean update(Proveedores proveedores);
    
    public boolean delete(Proveedores proveedores);
    
}
