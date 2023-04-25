<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
<fmt:setLocale value="es_GT"/>


<!DOCTYPE html>
<html lang="es">
    <head>
        <title>Editar Cliente</title>
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
                            Editar Cliente
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
                                <h4>Editar Cliente</h4>
                            </div> 
                        </div>
                        <a class="btn btn-dark mt-3" href="${pageContext.request.contextPath}/clientes/clientes.jsp">
                            <i class="fa fa-arrow-left"></i> Regresar/cancelar
                        </a>

                        <form method="POST" action="${pageContext.request.contextPath}/ServletCliente">

                            <div class="mb-3">
                                <label for="id_cliente" class="col-form-label">ID cliente</label>
                                <input type="number" class="form-control" id="id_cliente" name="id_cliente" value="${cliente.id_cliente}" readonly="true" required>
                            </div>

                            <div class="mb-3">
                                <label for="persona_id" class="col-form-label">ID estudiante</label>
                                <input type="number" class="form-control" id="persona_id" name="persona_id" value="${cliente.persona_id}" required>
                            </div>

                            <div class="mb-3">
                                <label for="nit" class="col-form-label">Nit:</label>
                                <input type="text" class="form-control" id="nit" name="nit" value="${cliente.nit}" required>
                            </div>



                            <div class="text-center">
                                <input type="hidden" id="accion" name="accion" value="actualizar">
                                <button type="submit" class="btn btn-success">
                                    <i class="fas fa-check"></i> Guardar
                                </button>
                                <a class="btn btn-danger m-4" href="${pageContext.request.contextPath}/ServletCliente?accion=eliminar&idCliente=${cliente.id_cliente}">
                                    <i class="fas fa-trash"></i> Eliminar
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




