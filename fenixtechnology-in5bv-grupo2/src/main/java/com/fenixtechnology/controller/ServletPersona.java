package com.fenixtechnology.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

import com.fenixtechnology.models.dao.PersonaDaoImpl;
import com.fenixtechnology.models.domain.Persona;
import java.util.List;
import java.io.IOException;
/**
 *
 * @author Lionar Gerardy Villalta Barrientos.
 * @date 28/08/2022
 * @time 15:11:49
 * Codigo: IN5BV
 */

@WebServlet("/ServletPersona")
public class ServletPersona extends HttpServlet{
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
        List<Persona> data = new PersonaDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listadoDePersonas", data);
        response.sendRedirect("personas/personas.jsp"); 
       
     }
}

