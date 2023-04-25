<%-- 
    Document   : proveedores
    Created on : 4 sept. 2022, 16:52:08
    Author     : Jairo
    Código técnico : IN5BV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<fmt:setLocale value="es_GT" />

<!DOCTYPE html>
<html lang="es">

 <head>
        <title>Listar proveedores</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1">
        
        <link 
            rel="stylesheet" 
            type="text/css" 
            href="../assets/css/hoja-estilos-principal.css" />
        
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
                          <i class="fa-solid fa-people-carry-box"></i> Control de proveedores</h1>
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
                            <a href="#" class="btn btn-primary"> Agregar Proveedores </a>
                        </div>
                    </div>
                </div>
            </section>
            
            <section id="proveedor">
                <div class="container mb-5 pb-5">
                    <div class="row">
                        <div class="col-12">
                            <div class="card">
                                <div class="card-header">
                                    <h4>Listado de Proveedores</h4>
                                </div>
                            </div>
                        </div>
                        <div class="col-12">
                        <table class="table  table-striped">
                            <thead class="table-dark">
                                <tr>
                                    <th>Id_proveedor</th>
                                    <th>Nombre proveedor</th>
                                    <th>Teléfono</th>
                                    <th>Dirección</th>
                                    <th>Editar</th>
                                    <th>Eliminar</th>
                                </tr>
                            </thead>                      
                            <tbody>
                               <c:forEach var="proveedor" items="${listadoDeProveedores}"> 
                                   <tr>
                                       <td>${proveedor.id_proveedor}</id>
                                       <td>${proveedor.nombre_proveedor}</td>
                                       <td>${proveedor.telefono}</td>
                                       <td>${proveedor.direccion}</td>
                                       <td>
                                            <i class="fa-solid fa-user-pen"></i>
                                        </td>
                                        <td>
                                            <i class="fa-solid fa-user-xmark"></i>
                                        </td>
                                   </tr>
                                </c:forEach>
                            </tbody>  
                        </table>
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
