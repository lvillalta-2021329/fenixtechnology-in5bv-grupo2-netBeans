
package com.fenixtechnology.models.idao;

/**
 *
 * @author Lionar Gerardy Villalta Barrientos.
 * @date 28/08/2022
 * @time 15:50:59
 * Codigo: IN5BV
 */

import java.util.List;
import com.fenixtechnology.models.domain.Persona;

public interface IPersonaDao {
    public List<Persona> getAll();
    
    public boolean add(Persona persona);
    
    public boolean update(Persona persona);
    
    public boolean delete(Persona persona);
    
}
