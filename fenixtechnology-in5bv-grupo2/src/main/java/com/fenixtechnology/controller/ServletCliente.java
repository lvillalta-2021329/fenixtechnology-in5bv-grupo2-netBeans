
package com.fenixtechnology.controller;

/**
 *
 * @author Lionar Gerardy Villalta Barrientos.
 * @date 28/08/2022
 * @time 18:57:29
 * Codigo: IN5BV
 */


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fenixtechnology.models.dao.ClienteDaoImpl;
import com.fenixtechnology.models.domain.Cliente;
import java.util.List;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ServletCliente")
public class ServletCliente extends HttpServlet {
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException{
    
    }
    @Override
     protected void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException{
        String accion = request.getParameter("accion");
        
        if(accion != null){
            switch (accion) {
                case "listar":
                    listarPersona(request , response);
                    break;
                case "editar":
                    break;
                case "eliminar":
                    break;
                
            }
        }
    }
    private void listarPersona(HttpServletRequest request, HttpServletResponse response) throws IOException{
        List<Cliente> data = new ClienteDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listadoDeClientes", data);
        response.sendRedirect("clientes/clientes.jsp"); 
       
     }

}
