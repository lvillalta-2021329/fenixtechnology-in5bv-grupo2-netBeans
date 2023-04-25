package com.fenixtechnology.models.dao;

import com.fenixtechnology.models.domain.Proveedores;
import com.fenixtechnology.db.ConexionPU;
import com.fenixtechnology.models.idao.IProveedoresDao;

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

public class ProveedoresDaoJPA implements IProveedoresDao{

    private ConexionPU con = ConexionPU.getInstance();
    
    @Override
    public List<Proveedores> getAll() {
    return con.getEntityManager().createNamedQuery("Proveedores.findAll").getResultList();
       
    }

    @Override
    public int add(Proveedores proveedores) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Proveedores get(Proveedores proveedores) {
     return (Proveedores) con.getEntityManager()
             .createNamedQuery("Proveedores.find")
             .setParameter("id", proveedores.getId_proveedor()).getSingleResult();
    }

    @Override
    public int update(Proveedores proveedores) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(Proveedores proveedores) {
      int rows = 0;
        try {
            con.getEntityManager().getTransaction().begin();
            con.getEntityManager().remove(proveedores);
            con.getEntityManager().getTransaction().commit();
            rows = 1;
        } catch (Exception e) {
            e.printStackTrace(System.out);
            con.getEntityManager().getTransaction().rollback();
        }
        return rows;
    }
    

}