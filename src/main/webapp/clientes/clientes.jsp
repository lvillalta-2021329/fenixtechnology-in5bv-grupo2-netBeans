<%-- 
    Document   : index
    Created on : 9/08/2022, 17:08:46
    Author     : Lionar Villalta
    Código técnico : IN5BV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<fmt:setLocale value="es_GT" />

<!DOCTYPE html>
<html lang="es">

    <!-- Cabeza de la página-->

    <head>
        <title>Listar Clientes</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1">       
        <link rel="stylesheet" type="text/css" href="../assets/css/hoja-estilos-principal.css" />  
        <link rel="stylesheet" type="text/css" href="../assets/css/flexslider.css" />
        <link rel="stylesheet" type="text/css" href="../assets/css/bootstrap.css" />    
        <script src="../assets/js/ef0cc6c186.js"></script>

    </head>
    <!-- Cuerpo de la página-->

    <body>
        <header>
            <!-- Encabezado de la página-->
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <h1>
                            <i class="fas fa-users-cog"></i> Control de cliente
                        </h1>
                    </div>
                </div>
            </div>
        </header>

        <jsp:include page="../WEB-INF/paginas/comunes/cabecera.jsp" />

        <aside>
            <!-- Información secundaria-->
        </aside>
        <main>
            <!-- Contenido principal-->
            <section id="accions" class="py-4 mb-4">
                <div class="container">
                    <div class="row">
                        <div class="col-12">
                            <a class="btn btn-primary btn-lg" href="#" data-bs-toggle="modal" data-bs-target="#addModal">Agregar Cliente</a>
                        </div>
                    </div>
                </div>
            </section>

            <div class="modal fade" id="addModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header bg-black text-white">
                            <h5 class="modal-title" id="exampleModalLabel">Agregar Estudiante</h5>
                            <button type="button" class="btn-close bg-white" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>

                        <form method="POST" action="${pageContext.request.contextPath}/ServletCliente" class="was-validated">
                            <div class="modal-body">

                                

                                <div class="mb-3">
                                    <label for="persona_id" class="col-form-label">personaId</label>
                                    <input type="number" class="form-control" id="persona_id" name="persona_id" required>
                                </div>

                                <div class="mb-3">
                                    <label for="nit" class="col-form-label">nit:</label>
                                    <input type="text" class="form-control" id="nit" name="nit" required>
                                </div>

                                <input type="hidden" class="form-control" id="accion" name="accion" value="insertar">

                                <div class="modal-footer">
                                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancelar</button>
                                    <button type="submit" class="btn btn-primary">Guardar</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>

            <section id="cliente">
                <div class="container mb-5 pb-5">
                    <div class="row">
                        <div class="col-12 col-md-9">

                            <div class="card">
                                <div class="card-header">
                                    <h4>Listado de Clientes</h4>
                                </div>
                            </div>

                            <div>
                                <table class="table  table-striped">
                                    <thead class="table-dark">
                                        <tr>
                                            <th>Id_Cliente</th>
                                            <th>Id_Persona</th>
                                            <th>Nit</th>
                                            <th>Editar</th>
                                            <th>Eliminar</th>
                                        </tr>
                                    </thead> 

                                    <tbody>
                                        <c:forEach var="cliente" items="${ListadoDeClientes}">
                                            <tr>
                                                <td>${cliente.id_cliente}</td>
                                                <td>${cliente.persona_id}</td>
                                                <td>${cliente.nit}</td>

                                                <td>
                                                    <a class="btn btn-primary" href="${pageContext.request.contextPath}/ServletCliente?accion=editar&idCliente=${cliente.id_cliente}" role="button"> 
                                                        <i class="fa-solid fa-user-pen"></i> editar
                                                    </a>
                                                </td>
                                                <td>
                                                    <a class="btn btn-primary" href="${pageContext.request.contextPath}/ServletCliente?accion=eliminar&idCliente=${cliente.id_cliente}" role="button"> 
                                                        <i class="fa-solid fa-user-xmark"></i> Eliminar
                                                    </a>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>

                        <div class="col-12 col-md-3">
                            <div class="card text-center bg-primary text-white mb-3">
                                <div class="card-body">
                                    <h3>Total de clientes</h3>
                                    <h4 class="display-4">${totalClientes}</h4>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>   
                </div>
            </section>

        </main>

        <jsp:include page="../WEB-INF/paginas/comunes/pie-pagina.jsp"/>

        <script type="text/javascript" src="../assets/js/jquery-3.6.0.js"></script>
        <script type="text/javascript" src="../assets/js/jquery-migrate-3.4.0.js"></script>
        <script type="text/javascript" src="../assets/js/jquery-migrate-1.4.1.js"></script>
        <script type="text/javascript" src="../assets/js/jquery.flexslider.js"></script>
        <script type="text/javascript" src="../assets/js/script.js"></script>
        <script type="text/javascript" src="https://unpkg.com/@popperjs/core@2"></script>
        <script type="text/javascript" src="../assets/js/bootstrap.bundle.js"></script>
    </body>
</html>