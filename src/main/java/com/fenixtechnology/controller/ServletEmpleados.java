
package com.fenixtechnology.controller;

/**
 *
 * @author Edy Leonel Letona Argueta
 * 
 */

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;

import com.fenixtechnology.models.domain.Empleados;
import com.fenixtechnology.models.dao.EmpleadosDaoImpl;
import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServlet;

@WebServlet("/ServletEmpleados")
public class ServletEmpleados extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException{
    
    }
    
    @Override
     protected void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException{
        String accion = request.getParameter("accion");
        
        if(accion != null){
            switch (accion) {
                case "listar":
                    listarEmpleados(request , response);
                    break;
                case "editar":
                    break;
                case "eliminar":
                    eliminarEmpleados(request, response);
                    break;
                
            }
        }
    }
    
    private void eliminarEmpleados(HttpServletRequest request, HttpServletResponse response) throws IOException{
        int idEmpleado = Integer.parseInt(request.getParameter("idEmpleado"));
        Empleados empleado = new Empleados(idEmpleado);
        int registrosEliminados = new EmpleadosDaoImpl().delete(empleado);
        listarEmpleados(request, response);
    }
    
    private void listarEmpleados(HttpServletRequest request, HttpServletResponse response) throws IOException{
        List<Empleados> listaEmpleados = new EmpleadosDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("totalEmpleados", listaEmpleados.size());
        sesion.setAttribute("ListadoDeEmpleados", listaEmpleados);
        response.sendRedirect(request.getContextPath() + "/" + "empleados/empleados.jsp");
       
     }
}
