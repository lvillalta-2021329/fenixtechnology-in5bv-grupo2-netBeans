
package com.fenixtechnology.controller;

import com.fenixtechnology.models.dao.DetalleVentaDaolmpl;
import com.fenixtechnology.models.domain.DetalleVenta;
import com.fenixtechnology.models.domain.DetalleVenta;
import java.io.IOException;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author STEEVEN
 */

@WebServlet("/ServletDetalleVentas")

public class ServletDetalleVentas extends HttpServlet{
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
        List<DetalleVenta> data = new DetalleVentaDaolmpl().getAll();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listadoDeDetalleVenta", data);
        response.sendRedirect("detalle-ventas/detalle-venta.jsp");
    }
}
