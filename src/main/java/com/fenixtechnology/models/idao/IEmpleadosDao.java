package com.fenixtechnology.models.idao;

import com.fenixtechnology.models.domain.Empleados;
import java.util.List;

/**
 *
 * @author Edy Leonel Letona Argueta
 * 
 */
public interface IEmpleadosDao {
    public List<Empleados> getAll();
    
    //Metodo para Buscar o encontrar un registro en especifico
    public Empleados get(Empleados empleado);
    
    //Agregar un nuevo registro
    public int add(Empleados empleado);
    
    //Modiifcar un registro
    public int update(Empleados empleado);
    
    //Eliminar un registro
    public int delete(Empleados empleado);
}

