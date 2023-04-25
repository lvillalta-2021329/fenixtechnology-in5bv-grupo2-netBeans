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
        <title>Listar Persona</title>
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
                            <i class="fas fa-users-cog"></i> Control de Persona
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
                            <a class="btn btn-primary btn-lg" href="#" data-bs-toggle="modal" data-bs-target="#addModal">Agregar persona</a>
                        </div>
                    </div>
                </div>
            </section>

            <div class="modal fade" id="addModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header bg-black text-white">
                            <h5 class="modal-title" id="exampleModalLabel">Agregar persona</h5>
                            <button type="button" class="btn-close bg-white" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>

                        <form method="POST" action="${pageContext.request.contextPath}/ServletPersona" class="was-validated">
                            <div class="modal-body">

                                <div class="mb-3">
                                    <label for="nombre1" class="col-form-label">Nombre1:</label>
                                    <input type="text" class="form-control" id="nombre1" name="nombre1" required>
                                </div>
                                <div class="mb-3">
                                    <label for="nombre2" class="col-form-label">Nombre2:</label>
                                    <input type="text" class="form-control" id="nombre2" name="nombre2" required>
                                </div>
                                <div class="mb-3">
                                    <label for="nombre3" class="col-form-label">Nombre3:</label>
                                    <input type="text" class="form-control" id="nombre3" name="nombre3" required>
                                </div>
                                <div class="mb-3">
                                    <label for="apellido1" class="col-form-label">Apellido:</label>
                                    <input type="text" class="form-control" id="apellido1" name="apellido1" required>
                                </div>
                                <div class="mb-3">
                                    <label for="apellido2" class="col-form-label">Apellido2:</label>
                                    <input type="text" class="form-control" id="apellido2" name="apellido2" required>
                                </div>

                                <div class="mb-3">
                                    <label for="email" class="col-form-label">Email:</label>
                                    <input type="email" class="form-control" id="email" name="email" required>
                                </div>

                                <div class="mb-3">
                                    <label for="telefono" class="col-form-label">Telefono:</label>
                                    <input type="tel" class="form-control" id="telefono" name="telefono" required>
                                </div>
                                <div class="mb-3">
                                    <label for="direccion" class="col-form-label">Direccion:</label>
                                    <input type="text" class="form-control" id="direccion" name="direccion" required>
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

            <section id="persona">
                <div class="container mb-5 pb-5">
                    <div class="row">
                        <div class="col-12 col-md-9">

                            <div class="card">
                                <div class="card-header">
                                    <h4>Listado de persona</h4>
                                </div>
                            </div>

                            <div>
                                <table class="table  table-striped">
                                    <thead class="table-dark">
                                        <tr>
                                            <th>Id</th>
                                            <th>Nombres</th>
                                            <th>Apellidos</th>
                                            <th>E-mail</th>
                                            <th>Teléfono</th>
                                            <th>Dirección</th>
                                            <th>Editar</th>
                                            <th>Eliminar</th>
                                        </tr>
                                    </thead> 

                                    <tbody>
                                        <c:forEach var="persona" items="${ListadoDePersona}">
                                            <tr>
                                                <td>${persona.idPersona}</td>
                                                <td>${persona.nombre1} ${persona.nombre2} ${persona.nombre3}</td>
                                                <td>${persona.apellido1} ${persona.apellido2}</td>
                                                <td>${persona.email}</td>
                                                <td>${persona.telefono}</td>
                                                <td>${persona.direccion}</td>

                                                <td>
                                                    <a class="btn btn-primary" href="${pageContext.request.contextPath}/ServletPersona?accion=editar&idPersona=${persona.idPersona}" role="button"> 
                                                        <i class="fa-solid fa-user-pen"></i> editar
                                                    </a>
                                                </td>
                                                <td>
                                                    <a class="btn btn-primary" href="${pageContext.request.contextPath}/ServletPersona?accion=eliminar&idPersona=${persona.idPersona}" role="button"> 
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
                                    <h3>Total de Personas</h3>
                                    <h4 class="display-4">${totalPersonas}</h4>
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