
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<fmt:setLocale value="es_GT"/>

<!DOCTYPE html>
<html lang="es">
    <!--Cabecera de la pagina-->
    <head>
        <title>Listar Productos</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1">
        
        <link rel="stylesheet" type="text/css" href="../assets/css/hoja-estilos-principal.css" />
        
        <link rel="stylesheet" type="text/css" href="../assets/css/flexslider.css" />
        <link rel="stylesheet" type="text/css" href="../assets/css/bootstrap.css" />
        
        <script src="../assets/js/ef0cc6c186.js"></script>

    </head>

    <!--Cuerpo de la pagina-->
    <body>
        <header>
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <h1>
                          <i class="fa-solid fa-computer"></i> Control de Productos</h1>
                    </div>
                </div>
            </div>
        </header>
        
        <jsp:include page="../WEB-INF/paginas/comunes/cabecera.jsp" />

        <main>
            <section id = "accions" class="py-4 mb-4">
                <div class="container">
                    <div class = "row">
                        <div class="col-12 ">
                            <a href="#" class="btn btn-primary ">Agregar Producto </a>
                        </div>                       
                    </div>                    
                </div>  
            </section> 
            
            <section id="producto">
                <div class="container mb-5 pb-5">
                    <div class="row">
                        <div class="col-12 col-md-9">
                            <div class="card">
                                <div class="card-header">
                                    <h4>
                                        Listado de Productos
                                    </h4>
                                </div>
                            </div>
                        
                            
                            <div>
                                <table class="table table-striped">
                                    <thead class="table-dark">
                                        <tr>
                                            <th>Id</th>
                                            <th>Producto</th>
                                            <th>Descripción</th>
                                            <th>Precio Unitario</th>
                                            <th>Stock</th>
                                            <th>Id Tipo Producto</th>
                                            <th>Id Proveedor</th>
                                            <th>Id Oferta</th>
                                            <th>Editar</th>
                                            <th>Eliminar</th>
                                        </tr>
                                    </thead>

                                    <tbody>

                                        <c:forEach var="producto" items="${data}">
                                        <tr>
                                            <td>${producto.id}</td>
                                            <td>${producto.nombreProducto}</td>
                                            <td>${producto.descripcion}</td>
                                            <td>${producto.precioUnitario}</td>
                                            <td>${producto.stock}</td>
                                            <td>${producto.idTipoProducto}</td>
                                            <td>${producto.idProveedor}</td>
                                            <td>${producto.idOferta}</td>
                                            <td>
                                                <i class="fa-solid fa-user-pen"></i>
                                            </td>
                                            <td>
                                                <a class="btn btn-primary" href="${pageContext.request.contextPath}/ServletProducto?accion=eliminar&id=${producto.id}" >
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
                                <div class="card text-center bg-success text-white mb-3">
                                    <div class="card-body">
                                        <h3>Saldo Total</h3>
                                        <h4 class="display-4">
                                            <fmt:formatNumber value="${saldoTotal}" type="currency" />
                                        </h4>
                                    </div>            
                                </div>

                                <div class="card text-center bg-primary text-white mb-3">
                                    <dic class="card-body">
                                        <h3>Total de Productos</h3>
                                        <h4 class="display-4">${totalProductos}</h4>
                                    </dic>
                                </div>

                            </div>
    
                        </div>
                    </div>
                </div>
            </section>
        </main>

       <jsp:include page = "../WEB-INF/paginas/comunes/pie-pagina.jsp"/>

        <script type="text/javascript" src="../assets/js/jquery-3.6.0.js"></script>
        <script type="text/javascript" src="../assets/js/jquery-migrate-3.4.0.js"></script>
        <script type="text/javascript" src="../assets/js/jquery-migrate-1.4.1.js"></script>
        <script type="text/javascript" src="../assets/js/jquery.flexslider.js"></script>
        <script type="text/javascript" src="../assets/js/script.js"></script>
        <script type="text/javascript" src="https://unpkg.com/@popperjs/core@2"></script>
        <script type="text/javascript" src="../assets/js/bootstrap.bundle.js"></script> 
    </body>
</html>


