package com.fenixtechnology.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

import com.fenixtechnology.models.domain.Factura;
import com.fenixtechnology.models.dao.FacturaDaoImpl;
import com.fenixtechnology.models.dao.FacturaDaoJPA;

import java.util.List;
import java.io.IOException;

/**
 *
 * @author Elmer Steeven CumeZ Pocon
 */
@WebServlet("/ServletFactura")
public class ServletFactura extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
       String accion = request.getParameter("accion");
       
       if(accion != null ){
           switch (accion){
               case "listar":
                   listarFactura(request, response);
                   break;
               case "editar":
                   break;
               case "eliminar":
                   eliminarFactura(request, response);
                   break;
           }
       }
    }
    
    private void eliminarFactura(HttpServletRequest request, HttpServletResponse response) throws IOException{
        int idFactura = Integer.parseInt(request.getParameter("idFactura"));
        Factura factura  =  new FacturaDaoJPA().get(new Factura(idFactura));
        int registrosEliminados = new FacturaDaoJPA().delete(factura);
        listarFactura(request, response);
    }
    
     private void listarFactura(HttpServletRequest request, HttpServletResponse response) throws IOException{
        List<Factura> listaFactura = new FacturaDaoJPA().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("data", listaFactura);
        sesion.setAttribute("totalFactura", listaFactura.size());
        response.sendRedirect(request.getContextPath() + "/" + "factura/factura.jsp");
    }

}

