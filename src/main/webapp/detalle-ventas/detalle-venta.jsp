<%-- 
    Document   : detalle_venta
    Created on : 4 sep 2022, 22:15:22
    Author     : STEEVEN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<fmt:setLocale value="es GT"/>

<!DOCTYPE html>
<html lang="es">
    <!--Cabecera de la pagina-->
    <head>
        <title>Listar Detalle ventas</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link 
            rel="stylesheet" 
            type="text/css" 
            href="../assets/css/hoja-estilos-principal.css">
        
        <link rel="stylesheet" type="text/css" href="../assets/css/bootstrap.css"/>
        
        <script src="../assets/js/ef0cc6c186.js"></script>

        <!--
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        -->

    </head>

    <!--Cuerpo de la pagina-->
    
    <body>
        <header>
            <div class = "container">
                <div class = "row">
                    <div class = "col-12">
                        <h1> <i class="fa-sharp fa-solid fa-file-invoice"></i> Control de Detalle ventas</h1>
                    </div>
                </div>    
            </div>
        </header>
        
        <jsp:include page = "../WEB-INF/paginas/comunes/cabecera.jsp"/>

        <main>
            <!--Contenido Principal de la página web-->
            <section id="accions" class="p-4">
                <div class="container">
                    <div class="row">
                        <div class="col-12">
                            <a href="#" class="btn btn-success" role="button">Agregar Detalle venta</a>
                        </div>
                    </div>
                </div>
            </section>
            
            <section id="datalleVenta">
                <div class="container mb-5 pb-5">
                    <div class="row">
                        <div class="col-12">
                            <div class="card">
                                <div class-header>
                                    <h4>Lista de Detalle ventas</h4>
                                </div>
                            </div>
                            
                            <table class="table table-striped">
                                <thead class="table-dark">
                                    <tr>
                                        <th>Id</th>
                                        <th>Cantidad</th>
                                        <th>Subtotal</th>
                                        <th>Id producto</th>
                                        <th>Editar</th>
                                        <th>Eliminar</th>
                                    </tr>
                                </thead>
                                
                                <tbody>
                                    
                                    <c:forEach var="detalleVenta" items="${listadoDeDetalleVenta}">
                                        <tr>    
                                            <td>${detalleVenta.id_detalle_venta}</td>
                                            <td>${detalleVenta.cantidad}</td>
                                            <td>${detalleVenta.subtotal}</td>
                                            <td>${detalleVenta.id_producto}</td>
                                            <td>
                                                <i class="fa-solid fa-user-pen"></i>
                                            </td> 
                                            <td>
                                                <i class="fa-solid fa-user-xmark"></i>
                                            </td> ` 
                                        </tr>
                                    </c:forEach>
                                    
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </section>
          
        </main>

        <aside>
            <!--Informacion secundaria-->
        </aside>

       <jsp:include page = "../WEB-INF/paginas/comunes/pie-pagina.jsp"/>

        <script type="text/javascript" src="../assets/js/jquery-3.6.0.js" ></script>
        <script type="text/javascript" src="../assets/js/jquery-migrate-3.4.0.js"></script>
        <script type="text/javascript" src="../assets/js/jquery-migrate-1.4.1.js"></script>
        <script type="text/javascript" src="../assets/js/jquery.flexslider.js"></script>
        <script type="text/javascript" src="../assets/js/scrip.js"></script>
        <script type="text/javascript" src="https://unpkg.com/@popperjs/core@2"></script>
        <!--<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" 
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="
        anonymous"> </script> -->
        <script type="text/javascript" src="./assets/js/bootstrap.bundle.js"></script>
        
    </body>
</html>
