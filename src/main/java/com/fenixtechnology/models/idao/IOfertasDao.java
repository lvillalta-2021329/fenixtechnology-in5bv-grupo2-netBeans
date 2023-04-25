package com.fenixtechnology.models.idao;


/**
 *
 * @author Josecarlos Anzueto Rodas
 * @date 4/09/2022
 * @time 19:11:05
 */
import java.util.List;
import com.fenixtechnology.models.domain.Ofertas;

public interface IOfertasDao {
    // Listar Estudiantes
    public List<Ofertas> getAll();
    
    //Metodo para Buscar o encontrar un registro en especifico
    public Ofertas get(Ofertas ofertas);
    
    //Agregar un nuevo registro
    public int add(Ofertas ofertas);
    
    //Modiifcar un registro
    public int update(Ofertas ofertas);
    
    //Eliminar un registro
    public int delete(Ofertas ofertas);

}
