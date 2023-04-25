package com.fenixtechnology.controller;

/**
 *
 * @author Lionar Gerardy Villalta Barrientos.
 * @date 28/08/2022
 * @time 18:57:29 Codigo: IN5BV
 */
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;

import com.fenixtechnology.models.dao.ClienteDaoImpl;
import com.fenixtechnology.models.domain.Cliente;
import java.util.List;
import java.io.IOException;

@WebServlet("/ServletCliente")
public class ServletCliente extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        System.out.println("doPost");

        String accion = request.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "insertar":
                    //Se llamará a un método para insertar
                    insertarCliente(request, response);
                    break;

                case "actualizar":
                    actualizarCliente(request, response);
                    break;
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String accion = request.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "listar":
                    listarCliente(request, response);
                    break;
                case "editar":
                    editarCliente(request, response);
                    break;
                case "eliminar":
                    eliminarCliente(request, response);
                    break;

            }
        }
    }

    private void listarCliente(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Cliente> listaClientes = new ClienteDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("totalClientes", listaClientes.size());
        sesion.setAttribute("ListadoDeClientes", listaClientes);
        response.sendRedirect(request.getContextPath() + "/" + "clientes/clientes.jsp");

    }

    private void insertarCliente(HttpServletRequest request, HttpServletResponse response) throws IOException {

        int persona_id = Integer.parseInt(request.getParameter("persona_id"));
        String nit = request.getParameter("nit");

        //Creación del objeto tipo estudiante (bean)
        Cliente cliente = new Cliente(persona_id, nit);
        System.out.println(cliente);
        //Insertar el nuevo objeto de tipo estudiante en la base de datos
        //int registrosInsertados = new EstudianteDaoImpl().add(estudiante);

        int registrosInsertados = new ClienteDaoImpl().add(cliente);
        listarCliente(request, response);
    }

    private void eliminarCliente(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int idCliente = Integer.parseInt(request.getParameter("idCliente"));
        Cliente cliente = new Cliente(idCliente);
        int registrosEliminados = new ClienteDaoImpl().delete(cliente);
        System.out.println(cliente);
        listarCliente(request, response);
    }

    private void editarCliente(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //Recuperar el ID del estudiante
        int id_cliente = Integer.parseInt(request.getParameter("idCliente"));
        //Buscar toda la informacion del estudiant por medio de su ID
        Cliente cliente = new ClienteDaoImpl().get(new Cliente(id_cliente));

        HttpSession sesion = request.getSession();

        sesion.setAttribute("cliente", cliente);

        response.sendRedirect(request.getContextPath() + "/clientes/editar-cliente.jsp");
    }

    private void actualizarCliente(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //Recuperar datos del formulario
        int id_cliente = Integer.parseInt(request.getParameter("id_cliente"));
        int persona_id = Integer.parseInt(request.getParameter("persona_id"));
        String nit = request.getParameter("nit");
      
        Cliente cliente = new Cliente(id_cliente, persona_id, nit);

        //int registrosActualizados = new EstudianteDaoImpl().update(estudiante);
        int registrosActualizados = new ClienteDaoImpl().update(cliente);

        listarCliente(request, response);
    }
}
