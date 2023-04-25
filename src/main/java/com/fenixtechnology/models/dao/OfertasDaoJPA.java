package com.fenixtechnology.models.dao;

import com.fenixtechnology.db.ConexionPU;
import com.fenixtechnology.models.domain.Ofertas;
import com.fenixtechnology.models.idao.IOfertasDao;
import java.util.List;

/**
 *
 * @author Josecarlos Anzueto Rodas
 * @date 13/09/2022
 * @time 08:22:06
 */
public class OfertasDaoJPA implements IOfertasDao {

    private ConexionPU con = ConexionPU.getInstance();

    @Override
    public List<Ofertas> getAll() {
    return con.getEntityManager().createNamedQuery("Oferta.findAll").getResultList();
    
    }

    @Override
    public Ofertas get(Ofertas ofertas) {
        return (Ofertas) con.getEntityManager()
                .createNamedQuery("Oferta.find")
                .setParameter("id", ofertas.getId()).getSingleResult();
    }

    @Override
    public int add(Ofertas ofertas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Ofertas ofertas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(Ofertas ofertas) {
        int rows = 0;

        try {
            con.getEntityManager().getTransaction().begin();
            con.getEntityManager().remove(ofertas);
            con.getEntityManager().getTransaction().commit();
            rows = 1;
        } catch (Exception e) {
            e.printStackTrace(System.out);
            con.getEntityManager().getTransaction().rollback();
        }
        return rows;
    }
}

 