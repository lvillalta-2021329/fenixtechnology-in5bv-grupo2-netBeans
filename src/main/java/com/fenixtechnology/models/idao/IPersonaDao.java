
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
    // Listar Estudiantes
    public List<Persona> getAll();
    
    //Metodo para Buscar o encontrar un registro en especifico
    public Persona get(Persona persona);
    
    //Agregar un nuevo registro
    public int add(Persona persona);
    
    //Modiifcar un registro
    public int update(Persona persona);
    
    //Eliminar un registro
    public int delete(Persona persona);
    
}
