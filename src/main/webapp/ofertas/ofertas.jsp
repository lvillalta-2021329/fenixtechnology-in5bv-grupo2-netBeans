<%-- 
    Document   : ofertas
    Created on : 25 ago 2022, 16:03:45
    Author     : informatica
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<fmt:setLocale value="es GT"/>

<!DOCTYPE html>
<html lang="es">
    <!--Cabecera de la página web-->
    <head>
        <title>Lista de ofertas</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link 
            rel="stylesheet" 
            type="text/css" 
            href="../assets/css/hoja-estilos-principal.css">
        
        <link rel="stylesheet" type="text/css" href="../assets/css/bootstrap.css"/>
        
        <script src="../assets/js/ef0cc6c186.js"></script>
        
    </head>
    <!--Cuerpo de la página web-->
    <body>
        <header id="main-header" class="py-2">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <h1>
                           <i class="fa-sharp fa-solid fa-sack-dollar"></i> Control de descuentos
                        </h1>
                    </div>
                </div>
            </div>
        </header>
        
        <jsp:include page="../WEB-INF/paginas/comunes/cabecera.jsp" />
        
        <main>
            <!--Contenido Principal de la página web-->
            <section id="accions" class="p-4">
                <div class="container">
                    <div class="row">
                        <div class="col-12">
                            <a href="#" class="btn btn-success" role="button">Agregar descuento</a>
                        </div>
                    </div>
                </div>
            </section>
            
            <section id="ofertas">
                <div class="container mb-5 pb-5">
                    <div class="row">
                        <div class="col-12 col-md-9">
                            
                            <div class="card">
                                <div class-header>
                                    <h4>Lista de descuentos</h4>
                                </div>
                            </div>
                            <div>
                            <table class="table table-striped">
                                <thead class="table-dark">
                                    <tr>
                                        <th>Id</th>
                                        <th>Descuentos</th>
                                        <th>Editar</th>
                                        <th>Eliminar</th>
                                    </tr>
                                </thead>
                                
                                <tbody>
                                    <c:forEach var="oferta" items="${data}">
                                        <tr>
                                            <td>${oferta.id}</td>
                                            <td>${oferta.descuento}</td>
                                            <td>
                                                <i class="fa-solid fa-user-pen"></i>
                                            </td>
                                            <td>
                                                <a class="btn btn-secondary" href="${pageContext.request.contextPath}/ServletOfertas?accion=eliminar&idOfertas=${oferta.id}" role="button" >
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
                                    <h3>Total de ofertas</h3>
                                    <h4 class="display-4">${totalOfertas}</h4>
                                </div>
                            </div>
                        </div>
                        
                    </div>
                </div>
                </div>
            </section>
            
        </main>
        <aside>
            <!--Informacion secundaria de la página web-->
        </aside>
        
        <jsp:include page="../WEB-INF/paginas/comunes/pie-pagina.jsp" />
        
        <script type="text/javascript" src="../assets/js/jquery-3.6.0.js"></script>
        <script type="text/javascript" src="../assets/js/jquery-migrate-3.4.0.js"></script>
        <script type="text/javascript" src="../assets/js/jquery-migrate-1.4.1.js"></script>
        <script type="text/javascript" src="../assets/js/jquery.flexslider.js"></script>
        <script type="text/javascript" src="../assets/js/script.js"></script>
        <script type="text/javascript" src="../assets/js/bootstrap.bundle.js"></script>
    </body>
</html>

