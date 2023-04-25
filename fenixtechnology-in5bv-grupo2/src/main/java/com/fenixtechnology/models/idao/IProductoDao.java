
package com.fenixtechnology.models.idao;


// Importar Producto 


import com.fenixtechnology.models.domain.Producto;
import java.util.List;


public interface IProductoDao {

    public List <Producto> getAll();
    
    //Agregar un nuevo registro
    
    public boolean addd(Producto producto);
    
    //Modificar un registro 
    
    public boolean update(Producto producto);
    
    //Eliminar un registro
    
    public boolean delete(Producto producto);
    
}
