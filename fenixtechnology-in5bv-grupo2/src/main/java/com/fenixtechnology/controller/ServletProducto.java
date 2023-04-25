
package com.fenixtechnology.controller;


// Importar Producto
// Importar ProductoDaoImpl

import com.fenixtechnology.models.dao.ProductoDaoImpl;
import com.fenixtechnology.models.domain.Producto;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

import java.util.List;
import java.io.IOException;

    
@WebServlet("/ServletProducto")
public class ServletProducto extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException{
    
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException{
       String accion = request.getParameter("accion");
       
       if (accion != null){
           switch(accion){
               
               case "listar":
                   listarProducto(request, response);
               break;
               
               case "editar":
               break;
                   
               case "eliminar":
               break;    
                       
           }
                   
       }
    }
    
    private void listarProducto (HttpServletRequest request, HttpServletResponse response)throws IOException{
        
        List<Producto> data = new ProductoDaoImpl().getAll();
        HttpSession sesion = request.getSession(); 
        sesion.setAttribute("listadoProducto", data);
        response.sendRedirect("productos/productos.jsp");
    }  
  }
