package com.fenixtechnology.controller;

/**
 *
 * @author Lionar Gerardy Villalta Barrientos.
 * @date 28/08/2022
 * @time 15:11:49 Codigo: IN5BV
 *
 */
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

import com.fenixtechnology.models.dao.PersonaDaoImpl;
import com.fenixtechnology.models.domain.Persona;
import com.fenixtechnology.models.dao.PersonaDaoJPA;

import java.util.List;
import java.io.IOException;

@WebServlet("/ServletPersona")
public class ServletPersona extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        System.out.println("doPost");

        String accion = request.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "insertar":
                    //Se llamará a un método para insertar
                    insertarPersona(request, response);
                    break;

                case "actualizar":
                    actualizarPersona(request, response);
                    break;
            }
        }
    }

   

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        System.out.println("doGet");

        String accion = request.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "listar":
                    listarPersona(request, response);
                    break;

                case "editar":
                    editarPersona(request, response);
                    break;

                case "eliminar":
                    eliminarPersona(request, response);
                    break;
            }
        }
    }
    
  
    

    private void listarPersona(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //List<Persona> data = new EstudianteDaoImpl().getAll();
        List<Persona> data = new PersonaDaoJPA().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("ListadoDePersona", data);
        sesion.setAttribute("totalPersonas", data.size());
        response.sendRedirect("personas/personas.jsp");
    }
    
   

    private void insertarPersona(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String nombre1 = request.getParameter("nombre1");
        String nombre2 = request.getParameter("nombre2");
        String nombre3 = request.getParameter("nombre3");
        String apellido1 = request.getParameter("apellido1");
        String apellido2 = request.getParameter("apellido2");
        String email = request.getParameter("email");
        String telefono = request.getParameter("telefono");
        String direccion = request.getParameter("direccion");

        //Creación del objeto tipo estudiante (bean)
        Persona persona = new Persona(nombre1, nombre2, nombre3, apellido1, apellido2, email, telefono, direccion);
        System.out.println(persona);
        //Insertar el nuevo objeto de tipo estudiante en la base de datos
        //int registrosInsertados = new EstudianteDaoImpl().add(estudiante);

        int registrosInsertados = new PersonaDaoJPA().add(persona);
        listarPersona(request, response);
    }
    

    

    private void eliminarPersona(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int idPersona = Integer.parseInt(request.getParameter("idPersona"));
        //Estudiante estudiante = new Estudiante(idEstudiante);
        //int registrosEliminados = new EstudianteDaoImpl().delete(estudiante);
        Persona persona = new PersonaDaoJPA().get(new Persona(idPersona));
        int registrosEliminados = new PersonaDaoJPA().delete(persona);
        System.out.println(persona);
        listarPersona(request, response);
    }


    private void editarPersona(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //Recuperar el ID del estudiante
        int idPersona = Integer.parseInt(request.getParameter("idPersona"));
        //Buscar toda la informacion del estudiant por medio de su ID
        Persona persona = new PersonaDaoImpl().get(new Persona(idPersona));

        HttpSession sesion = request.getSession();

        sesion.setAttribute("persona", persona);

        response.sendRedirect(request.getContextPath() + "/personas/editar-persona.jsp");
    }
    


    private void actualizarPersona(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //Recuperar datos del formulario
        int idPersona = Integer.parseInt(request.getParameter("id_persona"));
        String nombre1 = request.getParameter("nombre1");
        String nombre2 = request.getParameter("nombre2");
        String nombre3 = request.getParameter("nombre3");
        String apellido1 = request.getParameter("apellido1");
        String apellido2 = request.getParameter("apellido2");
        String email = request.getParameter("email");
        String telefono = request.getParameter("telefono");
        String direccion = request.getParameter("direccion");

        Persona persona = new Persona(idPersona, nombre1, nombre2, nombre3, apellido1, apellido2, email, telefono, direccion);

        //int registrosActualizados = new EstudianteDaoImpl().update(estudiante);
        int registrosActualizados = new PersonaDaoJPA().update(persona);

        listarPersona(request, response);
    }

}
