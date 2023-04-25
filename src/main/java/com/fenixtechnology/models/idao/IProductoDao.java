
package com.fenixtechnology.models.idao;


// Importar Producto 


import com.fenixtechnology.models.domain.Producto;
import java.util.List;


public interface IProductoDao {

    public List <Producto> getAll();
    
    //Agregar un nuevo registro
    
    public int add(Producto producto);
    
    //Modificar un registro 
    
    public int update(Producto producto);
    
    //Eliminar un registro
    
    public int delete(Producto producto);
    
}
