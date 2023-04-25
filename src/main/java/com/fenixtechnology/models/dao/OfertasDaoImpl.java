package com.fenixtechnology.models.dao;

/**
 *
 * @author Jose Carlos Anzueto Rodas
 * @date 4/09/2022
 * @time 19:18:33
 * 
 */

import com.fenixtechnology.db.Conexion;
import com.fenixtechnology.models.domain.Ofertas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.fenixtechnology.models.idao.IOfertasDao;

public class OfertasDaoImpl implements IOfertasDao {
    
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs =null;
    private Ofertas oferta = null;
    private List<Ofertas> listaOfertas = new ArrayList<>();
    private static final String SQL_SELECT = "SELECT id_oferta, descuento FROM ofertas";
    
    @Override
    public List<Ofertas> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt= con.prepareStatement(SQL_SELECT);
            rs = pstmt .executeQuery();
            while (rs.next()){
                oferta = new Ofertas(rs.getInt("id_oferta"), rs.getDouble("descuento"));
                listaOfertas.add(oferta);
            }
        } catch (SQLException e) {
            System.err.println("Se produjo un error al Intentar listar las Ofertas");
            e.printStackTrace(System.out);
        } catch(Exception e){
            e.printStackTrace(System.out);
        } finally{
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
            return listaOfertas;
        
    }

    @Override
    public int add(Ofertas oferta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Ofertas oferta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(Ofertas oferta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Ofertas get(Ofertas ofertas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
