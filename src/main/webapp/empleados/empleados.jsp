<%-- 
    Document   : empleados
    Created on : 04/09/2022, 00:26:41
    Author     : Edy Leonel Letona Argueta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<fmt:setLocale value="es_GT" />

<!DOCTYPE html>
<html lang="es">

    <!-- Cabeza de la página-->

    <head>
        <title>Listar Empleados</title>
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
                          <i class="fa-solid fa-restroom"></i> Control de Empleados</h1>
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
                            <a href="#" class="btn btn-primary"> Agregar Empleados </a>
                        </div>
                    </div>
                </div>
            </section>
            
            <section id="cliente">
                <div class="container mb-5 pb-5">
                    <div class="row">
                        <div class="col-12 col-md-9">
                            <div class="card">
                                <div class="card-header">
                                    <h4>Listado de Empleados</h4>
                                </div>
                            </div>
                        
                            <div>
                                <table class="table  table-striped">
                                    <thead class="table-dark">
                                        <tr>
                                            <th>Empleado No.</th>
                                            <th>Persona Id</th>
                                            <th>Editar</th>
                                            <th>Eliminar</th>
                                        </tr>
                                    </thead> 

                                    <tbody>
                                        <c:forEach var="empleado" items="${ListadoDeEmpleados}">
                                            <tr>
                                                <td>${empleado.id_empleado}</td>
                                                <td>${empleado.persona_id}</td>
                                                <td>
                                                    <i class="fa-solid fa-user-pen"></i>
                                                </td>
                                                <td>
                                                    <a class="btn btn-primary" href="${pageContext.request.contextPath}/ServletEmpleados?accion=eliminar&idEmpleado=${empleado.id_empleado}"> 
                                                        <i class="far fa-trash-alt"></i> Eliminar
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
                                        <h3>Total de empleados</h3>
                                        <h4 class="display-4">${totalEmpleados}</h4>
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
