<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
<fmt:setLocale value="es_GT"/>


<!DOCTYPE html>
<html lang="es">
    <head>
        <title>Editar Pesona</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="../assets/css/hoja-estilo-kinal.css" />
        <link rel="stylesheet" type="text/css" href="../assets/css/flexslider.css" />
        <link rel="stylesheet" type="text/css" href="../assets/css/bootstrap.css" />
        <script type="text/javascript" src="../assets/js/41afc8b3e6.js"></script>
    </head>
    <body>
        <header>
            <!-- Encabezado de la página-->
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <h1>
                            <i class="fas fa-users-cog"></i>
                            Editar persona
                        </h1>
                    </div>
                </div>
            </div>
        </header>

        <jsp:include page="../WEB-INF/paginas/comunes/cabecera.jsp" />

        <main>
            <div class="container">
                <div class="row mt-5 mb-5">
                    <div class="col-1">
                    </div>
                    <div class="col-10">
                        <div class="card">
                            <div class="card-header">
                                <h4>Editar persona</h4>
                            </div> 
                        </div>
                        <a class="btn btn-dark mt-3" href="${pageContext.request.contextPath}/personas/personas.jsp">
                            <i class="fa fa-arrow-left"></i> Regresar/cancelar
                        </a>

                        <form method="POST" action="${pageContext.request.contextPath}/ServletPersona">



                            <div class="mb-3">
                                <label for="id_persona" class="col-form-label">idPersona</label>
                                <input type="number" class="form-control" id="id_persona" name="id_persona" value="${persona.idPersona}" readonly="true" required>
                            </div>

                            <div class="mb-3">
                                <label for="nombre1" class="col-form-label">Nombre1:</label>
                                <input type="text" class="form-control" id="nombre1" name="nombre1" value="${persona.nombre1}" required>
                            </div>
                            <div class="mb-3">
                                <label for="nombre2" class="col-form-label">Nombre2:</label>
                                <input type="text" class="form-control" id="nombre2" name="nombre2" value="${persona.nombre2}" required>
                            </div>
                            <div class="mb-3">
                                <label for="nombre3" class="col-form-label">Nombre3:</label>
                                <input type="text" class="form-control" id="nombre3" name="nombre3" value="${persona.nombre3}" required>
                            </div>

                            <div class="mb-3">
                                <label for="apellido1" class="col-form-label">apellido1:</label>
                                <input type="text" class="form-control" id="apellido1" name="apellido1" value="${persona.apellido1}" required>
                            </div>
                            <div class="mb-3">
                                <label for="apellido2" class="col-form-label">apellido2:</label>
                                <input type="text" class="form-control" id="apellido2" name="apellido2" value="${persona.apellido2}" required>
                            </div>


                            <div class="mb-3">
                                <label for="email" class="col-form-label">Email:</label>
                                <input type="email" class="form-control" id="email" name="email" value="${persona.email}" required>
                            </div>

                            <div class="mb-3">
                                <label for="telefono" class="col-form-label">Telefono:</label>
                                <input type="tel" class="form-control" id="telefono" name="telefono" value="${persona.telefono}" required>
                            </div>

                            <div class="mb-3">
                                <label for="direccion" class="col-form-label">direccion:</label>
                                <input type="text" class="form-control" id="direccion" name="direccion" value="${persona.direccion}" required>
                            </div>



                            <div class="text-center">
                                <input type="hidden" id="accion" name="accion" value="actualizar">
                                <button type="submit" class="btn btn-success">
                                    <i class="fas fa-check"></i> Guardar
                                </button>
                                <a class="btn btn-primary" href="${pageContext.request.contextPath}/ServletPersona?accion=eliminar&idPersona=${persona.idPersona}" role="button"> 
                                    <i class="fa-solid fa-user-xmark"></i> Eliminar
                                </a>
                            </div>       
                        </form>
                    </div>
                    <div class="col-1">
                    </div>
                </div>
            </div>
        </main>

        <jsp:include page="../WEB-INF/paginas/comunes/pie-pagina.jsp" />

        <script type="text/javascript" src="../assets/js/jquery-3.6.0.js"></script>
        <script type="text/javascript" src="../assets/js/jquery-migrate-3.4.0.js"></script>
        <script type="text/javascript" src="../assets/js/jquery-migrate-1.4.1.js"></script>
        <script type="text/javascript" src="../assets/js/script.js"></script>
        <script type="text/javascript" src="https://unpkg.com/@popperjs/core@2"></script>
        <script type="text/javascript" src="../assets/js/bootstrap.bundle.js"></script> 
    </body>
</html>