package com.fenixtechnology.models.idao;

import com.fenixtechnology.models.domain.Ofertas;
import java.util.List;

/**
 *
 * @author Jose Carlos Anzueto Rodas
 */
public interface IOfertasDao {
    public List<Ofertas> getAll();

    public boolean add(Ofertas oferta);

    public boolean update(Ofertas oferta);

    public boolean delete(Ofertas oferta);
}

