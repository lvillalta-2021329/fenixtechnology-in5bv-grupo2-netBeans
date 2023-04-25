<%-- 
    Document   : listar-Factura
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<fmt:setLocale value="es GT"/>

<!DOCTYPE html>
<html lang="es">
    <!--Cabecera de la pagina-->
    <head>
        <title>Listar Facturas</title>
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
                <div class = "row">
                    <div class = "col-12">
                        <h1> <i class="fa-solid fa-file-invoice-dollar"></i> Control de Facturas</h1>
                    </div>
                </div>    
            </div>
        </header>
        
        <jsp:include page="../WEB-INF/paginas/comunes/cabecera.jsp" />

        <main>
            <section id = "accions" class="py-4 mb-4">
                <div class="container">
                    <div class = "row">
                        <div class="col-12">
                            <a href="#" class="btn btn-primary "> Agregar Factura </a>
                        </div>                       
                    </div>                    
                </div>  
            </section> 

            <section id="factura">
                <div class="container mb-5 pb-5">
                    <div class="row">
                        <div class="col-12 col-md-9">
                            
                            <div class="card">
                                <div class="card-header">
                                    <h4>
                                        Listado de Facturas
                                    </h4>
                                </div>
                            </div>
                            
                            <div>
                                <table class="table table-striped">
                                    <thead class="table-dark">
                                        <tr>
                                            <th>No. Factura</th>
                                            <th>No. Serie</th>
                                            <th>Nombre</th>
                                            <th>Dirección</th>
                                            <th>Nit</th>
                                            <th>Fecha</th>
                                            <th>Id Venta</th>
                                            <th>Id del cliente</th>
                                            <th>Editar</th>
                                            <th>Eliminar</th>
                                        </tr>
                                    </thead>
                                    <tbody>

                                        <c:forEach var="factura" items="${data}">
                                            <tr>
                                            <td>${factura.no_factura}</td>
                                            <td>${factura.serie}</td>
                                            <td>${factura.nombre}</td>
                                            <td>${factura.direccion}</td>
                                            <td>${factura.nit}</td>
                                            <td>${factura.fecha}</td>
                                            <td>${factura.id_detalle_venta}</td>
                                            <td>${factura.id_cliente}</td>
                                            <td>
                                                <i class="fa-solid fa-user-pen"></i>
                                            </td>
                                            <td>
                                                <a class="btn btn-primary" href="${pageContext.request.contextPath}/ServletFactura?accion=eliminar&idFactura=${factura.no_factura}"> 
                                                    <i class="far fa-trash-alt"></i> Eliminar
                                                </a>
                                            </td> ` 
                                        </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                            
                            <div class="col-12 col-md-3">
                                <div class="card text-center bg-primary text-white mb-3">
                                    <div class="card-body">
                                        <h3>Total de facturas</h3>
                                        <h4 class="display-4">${totalFactura}</h4>
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
