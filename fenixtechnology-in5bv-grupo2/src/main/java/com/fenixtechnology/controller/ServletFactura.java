package com.fenixtechnology.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

import com.fenixtechnology.models.dao.FacturaDaoImpl;
import com.fenixtechnology.models.domain.Factura;

import java.util.List;
import java.io.IOException;

/**
 *
 * @author informatica
 */
@WebServlet("/ServletFactura")
public class ServletFactura extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String accion = request.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "listar":
                    listarEstudiante(request, response);
                    break;
                case "editar":
                    break;
                case "eliminar":
                    break;
            }
        }
    }

    private void listarEstudiante(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Factura> data = new FacturaDaoImpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listadoDeFacturas", data);
        response.sendRedirect("factura/factura.jsp");
    }

}
