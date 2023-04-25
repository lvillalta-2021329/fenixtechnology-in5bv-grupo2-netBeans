
package com.fenixtechnology.models.dao;

import com.fenixtechnology.db.ConexionPU;
import com.fenixtechnology.models.domain.DetalleVenta;
import com.fenixtechnology.models.idao.IDetalleVentaDao;
import java.util.List;

/**
 *
 * @author STEEVEN
 */
public class DetalleVentaDaoJPA implements IDetalleVentaDao{
    
        private ConexionPU con = ConexionPU.getInstance();

    @Override
    public List<DetalleVenta> getAll() {
        return con.getEntityManager().createNamedQuery("DetalleVenta.findAll").getResultList();
    }

    @Override
    public DetalleVenta get(DetalleVenta detalleVenta) {
        return (DetalleVenta) con.getEntityManager()
                .createNamedQuery("DetalleVenta.find")
                .setParameter("id_detalle_venta", detalleVenta.getId_detalle_venta()).getSingleResult();
    }
    
    @Override
    public int add(DetalleVenta detalleVenta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(DetalleVenta detalleVenta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    
    public int delete(DetalleVenta detalleVenta) {
        int rows = 0;
        
        try{
            con.getEntityManager().getTransaction().begin();
            con.getEntityManager().remove(detalleVenta);
            con.getEntityManager().getTransaction().commit();
            rows = 1;
        } catch (Exception e){
            e.printStackTrace(System.out);
            con.getEntityManager().getTransaction().rollback();
        }
        return rows;
    }
}
