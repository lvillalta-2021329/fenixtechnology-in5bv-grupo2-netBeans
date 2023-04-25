package com.fenixtechnology.models.dao;

import com.fenixtechnology.models.domain.TipoProducto;
import com.fenixtechnology.db.ConexionPU;
import com.fenixtechnology.models.idao.ITipoProductoDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/*
*@author Jairo  Estuardo Alvarado del Cid
*
*/

public class TipoProductoDaoJPA implements ITipoProductoDao{

    
    private ConexionPU con = ConexionPU.getInstance();
    
    @Override
    public List<TipoProducto> getAll() {
        return con.getEntityManager().createNamedQuery("TipoProducto.findAll").getResultList();
    }

    @Override
    public int add(TipoProducto tipoProducto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(TipoProducto tipoProducto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public TipoProducto get(TipoProducto tipoProducto) {
      return (TipoProducto) con.getEntityManager().createNamedQuery("TipoProducto.find").setParameter("id", tipoProducto.getId_tipo_producto()).getSingleResult();
    }

    @Override
    public int delete(TipoProducto tipoProducto) {
       int rows = 0;
        try {
            con.getEntityManager().getTransaction().begin();
            con.getEntityManager().remove(tipoProducto);
            con.getEntityManager().getTransaction().commit();
            rows = 1;
        } catch (Exception e) {
            e.printStackTrace(System.out);
            con.getEntityManager().getTransaction().rollback();
        }
        return rows;
    }
    
}
