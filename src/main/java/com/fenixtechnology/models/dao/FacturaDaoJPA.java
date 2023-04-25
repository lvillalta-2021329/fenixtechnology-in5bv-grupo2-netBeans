
package com.fenixtechnology.models.dao;

import com.fenixtechnology.db.ConexionPU;
import com.fenixtechnology.models.domain.Factura;
import com.fenixtechnology.models.idao.IFacturaDao;
import java.util.List;

/**
 *
 * @author Elmer Steeven CumeZ Pocon
 */
public class FacturaDaoJPA implements IFacturaDao{

  private ConexionPU con = ConexionPU.getInstance();

    @Override
    public List<Factura> getAll() {
        return con.getEntityManager().createNamedQuery("Factura.findAll").getResultList();
    }

    @Override
    public Factura get(Factura Factura) {
        return (Factura) con.getEntityManager()
                .createNamedQuery("Factura.find")
                .setParameter("no_factura", Factura.getNo_factura()).getSingleResult();
    }

    @Override
    public int add(Factura facrura) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Factura factura) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(Factura Factura) {
        int rows = 0;
        
        try{
            con.getEntityManager().getTransaction().begin();
            con.getEntityManager().remove(Factura);
            con.getEntityManager().getTransaction().commit();
            rows = 1;
        } catch (Exception e){
            e.printStackTrace(System.out);
            con.getEntityManager().getTransaction().rollback();
        }
        return rows;
    }

}
