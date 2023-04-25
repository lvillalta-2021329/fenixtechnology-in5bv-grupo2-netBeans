
package com.fenixtechnology.controller;

/**
 *
 * @author hp
 * @date 4/09/2022
 * @time 19:40:47
 */

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

import com.fenixtechnology.models.dao.OfertasDaoImpl;
import com.fenixtechnology.models.domain.Ofertas;
import java.util.List;
import java.io.IOException;

@WebServlet("/ServletOfertas")
public class ServletOfertas extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException{
    
    }
    @Override
     protected void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException{
        String accion = request.getParameter("accion");
        
        if(accion != null){
            switch (accion) {
                case "listar":
                    listarOfertas(request , response);
                    break;
                case "editar":
                    break;
                case "eliminar":
                    break;
                
            }
        }
    }
    private void listarOfertas(HttpServletRequest request, HttpServletResponse response) throws IOException{
        List<Ofertas> data = new OfertasDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listadoDeOfertas", data);
        response.sendRedirect("ofertas/ofertas.jsp"); 
       
     }
}

