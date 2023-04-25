package com.fenixtechnology.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

import com.fenixtechnology.models.domain.Proveedores;
import com.fenixtechnology.models.dao.ProveedoresDaoImpl;
import com.fenixtechnology.models.dao.ProveedoresDaoJPA;

import java.util.List;
import java.io.IOException;

/**
 *
 * @author Jairo  Estuardo Alvarado del Cid
 */

@WebServlet("/ServletProveedores")
public class ServletProveedores extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException{
    
    }
    @Override
     protected void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException{
        String accion = request.getParameter("accion");
        
        if(accion != null){
            switch (accion) {
                case "listar":
                    listarProveedores(request , response);
                    break;
                case "editar":
                    break;
                case "eliminar":
                     eliminarProveedores(request, response);
                    break;
                
            }
        }
    }
     
    private void listarProveedores(HttpServletRequest request, HttpServletResponse response) throws IOException{
        List<Proveedores> listaProveedores = new ProveedoresDaoJPA().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("totalProveedores", listaProveedores.size());
        sesion.setAttribute("data", listaProveedores);
        response.sendRedirect(request.getContextPath() + "/" + "proveedores/proveedores.jsp");
    }
    
     
    private void eliminarProveedores(HttpServletRequest request, HttpServletResponse response) throws IOException{
        int id = Integer.parseInt(request.getParameter("id"));
        Proveedores proveedores = new ProveedoresDaoJPA().get(new Proveedores (id));
        int registrosEliminados = new ProveedoresDaoJPA().delete(proveedores);
        listarProveedores(request, response);
    }
    
}
