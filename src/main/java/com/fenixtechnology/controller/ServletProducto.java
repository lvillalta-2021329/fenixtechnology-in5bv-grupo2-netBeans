
package com.fenixtechnology.controller;


// Importar Producto
// Importar ProductoDaoImpl

import com.fenixtechnology.models.dao.ProductoDaoImpl;
import com.fenixtechnology.models.domain.Producto;
import com.mysql.cj.Session;
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
                   eliminarProducto(request,response);
               break;    
                       
           }          
       }     
    }
    
    private void eliminarProducto(HttpServletRequest request, HttpServletResponse response)throws IOException{
        int idProducto = Integer.parseInt(request.getParameter("id"));
        Producto producto = new Producto(idProducto);
        int registrosEliminados = new ProductoDaoImpl().delete(producto);
        listarProducto(request, response);
        
    }
    
    public double calcularSaldoTotal(List<Producto> listaProductos){
    
        double saldoTotal = 0;
        
        for(Producto producto : listaProductos){
            saldoTotal += producto.getPrecioUnitario();
        }
        return saldoTotal;
    }
    
    private void listarProducto (HttpServletRequest request, HttpServletResponse response)throws IOException{
        
        List<Producto> listadoProducto = new ProductoDaoImpl().getAll();
        HttpSession sesion = request.getSession(); 
        sesion.setAttribute("data", listadoProducto);
        sesion.setAttribute("totalProductos", listadoProducto.size());
        sesion.setAttribute("saldoTotal", calcularSaldoTotal(listadoProducto));
        response.sendRedirect(request.getContextPath() + "/" + "productos/productos.jsp");
    }  
  }
