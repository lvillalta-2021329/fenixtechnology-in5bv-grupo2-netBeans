package com.fenixtechnology.controller;

import com.fenixtechnology.models.dao.OfertasDaoJPA;
import com.fenixtechnology.models.domain.Ofertas;
import java.io.IOException;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Josecarlos Anzueto Rodas
 * @date 4/09/2022
 * @time 19:40:47
 */

@WebServlet("/ServletOfertas")
public class ServletOfertas extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
       String accion = request.getParameter("accion");
       
       if(accion != null ){
           switch (accion){
               case "listar":
                   listarOfertas(request, response);
                   break;
               case "editar":
                   break;
               case "eliminar":
                   eliminarOfertas(request, response);
                   break;
           }
       }
    }

    private void eliminarOfertas(HttpServletRequest request, HttpServletResponse response) throws IOException{
        int idOfertas = Integer.parseInt(request.getParameter("idOfertas"));
        Ofertas ofertas  =  new OfertasDaoJPA().get(new Ofertas(idOfertas));
        int registrosEliminados = new OfertasDaoJPA().delete(ofertas);
        listarOfertas(request, response);
    }
    
    public double calcularSaldoTotal(List<Ofertas> listaOfertas){
        double saldoTotal = 0;
        
        for(Ofertas ofertas : listaOfertas){
            saldoTotal += ofertas.getDescuento();
        }
        return saldoTotal;
    }
    
    private void listarOfertas(HttpServletRequest request, HttpServletResponse response) throws IOException{
        List<Ofertas> listaOfertas = new OfertasDaoJPA().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("data", listaOfertas);
        sesion.setAttribute("totalOfertas", listaOfertas.size());
        sesion.setAttribute("saldoTotal", calcularSaldoTotal(listaOfertas));
        response.sendRedirect(request.getContextPath() + "/" + "ofertas/ofertas.jsp");
    }
    
}

