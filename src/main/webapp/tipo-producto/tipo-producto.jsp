<%-- 
    Document   : tipo-producto
    Created on : 25/08/2022, 15:56:15
    Author     : informatica
    Código técnico : IN5BV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<fmt:setLocale value="es_GT" />
<!DOCTYPE html>
<html lang="es">
    
    <head>
        <title>Listar tipo producto</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link 
            rel="stylesheet" 
            type="text/css" 
            href="../assets/css/hoja-estilos-principal.css" />
       
        <link rel="stylesheet" type="text/css" href="../assets/css/bootstrap.css" />
        <script src="../assets/js/ef0cc6c186.js"></script>
        
    </head>
    <body>
        <header>
            <!-- Encabezado de la página-->
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <h1>
                          <i class="fa-solid fa-cart-flatbed"></i> Control de Tipo de productos</h1>
                    </div>
                </div>
            </div>
        </header>
        
        <jsp:include page="../WEB-INF/paginas/comunes/cabecera.jsp" />
        
        <main>
            <section id="accions" class="p-4">
                <div class="container">
                    <div class="row">
                        <div class="col-12">
                            <a href="#" class="btn btn-success" role="button">Agregar Categoria</a>
                        </div>
                    </div>
                </div>
            </section>
            
            <section id="tipoProducto">
                <div class="container mb-5 pb-5">
                    <div class="row">
                        <div class="col-12 col-md-9">
                            
                            <div class="card">
                                <div class-header>
                                    <h4>Listado de los tipos de productos</h4>
                                </div>
                            </div>
                            
                            <div>
                                <table class="table table-striped">
                                    <thead class="table-dark">
                                        <tr>
                                            <th>ID</th>
                                            <th>Categoria</th>
                                            <th>Editar</th>
                                            <th>Eliminar</th>
                                        </tr>
                                    </thead>

                                    <tbody>
                                        <c:forEach var="tipoProducto" items="${listadoDeTipoProducto}">
                                        <tr>
                                            <td>${tipoProducto.id_tipo_producto}</td>
                                            <td>${tipoProducto.categoria}</td>
                                            <td>
                                                <i class="fa-solid fa-user-pen"></i>
                                            </td>
                                            <td>
                                                <a class="btn btn-primary" href="${pageContext.request.contextPath}/ServletTipoProducto?accion=eliminar&id=${tipoProducto.id_tipo_producto}" role="button"><i class="fa-solid fa-trash-can"></i> Eliminar</a>
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
                                        <h3>Total de tipos de producto</h3>
                                        <h4 class="display-4">${totalTipoProducto}</h4>
                                    </div>
                                </div>
                            </div>

                    </div>
                </div>
            </section>
        </main>
        
        <jsp:include page="../WEB-INF/paginas/comunes/pie-pagina.jsp" />
        
        <script type="text/javascript" src="../assets/js/jquery-3.6.0.js"></script>
        <script type="text/javascript" src="../assets/js/jquery-migrate-3.4.0.js"></script>
        <script type="text/javascript" src="../assets/js/jquery-migrate-1.4.1.js"></script>
        <script type="text/javascript" src="../assets/js/jquery.flexslider.js"></script>
        <script type="text/javascript" src="../assets/js/script.js"></script>
        <script type="text/javascript" src="https://unpkg.com/@popperjs/core@2"></script>
        <script type="text/javascript" src="../assets/js/bootstrap.bundle.js"></script>
    </body>
</html>
