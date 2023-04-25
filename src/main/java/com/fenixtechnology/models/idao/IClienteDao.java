package com.fenixtechnology.models.idao;

/**
 *
 * @author Lionar Gerardy Villalta Barrientos.
 * @date 28/08/2022
 * @time 18:25:54
 * Codigo: IN5BV
 */
import java.util.List;
import com.fenixtechnology.models.domain.Cliente;

public interface IClienteDao {
    // Listar Estudiantes
    public List<Cliente> getAll();
    
    //Metodo para Buscar o encontrar un registro en especifico
    public Cliente get(Cliente cliente);
    
    //Agregar un nuevo registro
    public int add(Cliente cliente);
    
    //Modiifcar un registro
    public int update(Cliente cliente);
    
    //Eliminar un registro
    public int delete(Cliente cliente);
    
 
  

}
