package com.fenixtechnology.models.idao;

import com.fenixtechnology.models.domain.Proveedores;
import java.util.List;

/**
 *
 * @author Jairo Estuardo Alvarado Del Cid
 * 
 */
public interface IProveedoresDao {
    public List<Proveedores> getAll();
    
    public int add(Proveedores proveedores);
    
    public Proveedores get(Proveedores estudiante);
    
    public int update(Proveedores proveedores);
    
    public int delete(Proveedores proveedores);
    
}
