
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
    public List<Cliente> getAll();
    
    public boolean add(Cliente cliente);
    
    public boolean update(Cliente cliente);
    
    public boolean delete(Cliente cliente);

}
