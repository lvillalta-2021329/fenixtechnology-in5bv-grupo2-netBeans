
package com.fenixtechnology.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

import com.fenixtechnology.models.domain.TipoProducto;
import com.fenixtechnology.models.dao.TipoProductoDaoJPA;

import java.util.List;
import java.io.IOException;

/**
 *
 * @author informatica
 */

@WebServlet("/ServletTipoProducto")
public class ServletTipoProducto extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException{
    
    }
    @Override
     protected void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException{
        String accion = request.getParameter("accion");
        
        if(accion != null){
            switch (accion) {
                case "listar":
                    listarTipoProducto(request , response);
                    break;
                case "editar":
                    break;
                case "eliminar":
                     eliminarTipoProducto(request, response);
                    break;
                
            }
        }
    }
     private void listarTipoProducto(HttpServletRequest request, HttpServletResponse response) throws IOException{
        List<TipoProducto> data = new TipoProductoDaoJPA().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("totalTipoProducto", data.size());
        sesion.setAttribute("listadoDeTipoProducto", data);
        response.sendRedirect(request.getContextPath() + "/" + "tipo-producto/tipo-producto.jsp"); 
     }
      private void eliminarTipoProducto(HttpServletRequest request, HttpServletResponse response) throws IOException{
        int id = Integer.parseInt(request.getParameter("id"));
        TipoProducto tipoProducto = new TipoProductoDaoJPA().get(new TipoProducto (id));
        int registrosEliminados = new TipoProductoDaoJPA().delete(tipoProducto);
         listarTipoProducto(request, response);
    }
}

