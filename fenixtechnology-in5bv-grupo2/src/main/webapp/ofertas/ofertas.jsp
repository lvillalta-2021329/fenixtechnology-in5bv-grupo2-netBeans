<%-- 
    Document   : ofertas
    Created on : 25 ago 2022, 16:03:45
    Author     : informatica
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                            <i class="fas fa-users-cog"></i> Control de descuentos
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
            
            <section id="estudiante">
                <div class="container mb-5 pb-5">
                    <div class="row">
                        <div class="col-12">
                            
                            <div class="card">
                                <div class-header>
                                    <h4>Lista de descuentos</h4>
                                </div>
                            </div>
                            
                            <table class="table table-striped">
                                <thead class="table-dark">
                                    <tr>
                                        <th>id</th>
                                        <th>Descuentos</th>
                                        <th>Editar</th>
                                        <th>Eliminar</th>
                                    </tr>
                                </thead>
                                
                                <tbody>
                                    <tr>
                                        <td>1</td>
                                        <td>0%</td>
                                        <td>
                                            <i class="fa-solid fa-user-pen"></i>
                                        </td>
                                        <td>
                                            <i class="fa-solid fa-user-xmark"></i>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>2</td>
                                        <td>10%</td>
                                        <td>
                                            <i class="fa-solid fa-user-pen"></i>
                                        </td>
                                        <td>
                                            <i class="fa-solid fa-user-xmark"></i>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>3</td>
                                        <td>20%</td>
                                        <td>
                                            <i class="fa-solid fa-user-pen"></i>
                                        </td>
                                        <td>
                                            <i class="fa-solid fa-user-xmark"></i>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>4</td>
                                        <td>30%</td>
                                        <td>
                                            <i class="fa-solid fa-user-pen"></i>
                                        </td>
                                        <td>
                                            <i class="fa-solid fa-user-xmark"></i>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>5</td>
                                        <td>40%</td>
                                        <td>
                                            <i class="fa-solid fa-user-pen"></i>
                                        </td>
                                        <td>
                                            <i class="fa-solid fa-user-xmark"></i>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>6</td>
                                        <td>50%</td>
                                        <td>
                                            <i class="fa-solid fa-user-pen"></i>
                                        </td>
                                        <td>
                                            <i class="fa-solid fa-user-xmark"></i>
                                        </td>
                                    </tr>
                                                                        <tr>
                                        <td>7</td>
                                        <td>60%</td>
                                        <td>
                                            <i class="fa-solid fa-user-pen"></i>
                                        </td>
                                        <td>
                                            <i class="fa-solid fa-user-xmark"></i>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>8</td>
                                        <td>70%</td>
                                        <td>
                                            <i class="fa-solid fa-user-pen"></i>
                                        </td>
                                        <td>
                                            <i class="fa-solid fa-user-xmark"></i>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>9</td>
                                        <td>80%</td>
                                        <td>
                                            <i class="fa-solid fa-user-pen"></i>
                                        </td>
                                        <td>
                                            <i class="fa-solid fa-user-xmark"></i>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>10</td>
                                        <td>90%</td>
                                        <td>
                                            <i class="fa-solid fa-user-pen"></i>
                                        </td>
                                        <td>
                                            <i class="fa-solid fa-user-xmark"></i>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>11</td>
                                        <td>100%</td>
                                        <td>
                                            <i class="fa-solid fa-user-pen"></i>
                                        </td>
                                        <td>
                                            <i class="fa-solid fa-user-xmark"></i>
                                        </td>
                                    </tr>
                                </tbody>
                                
                            </table>
                            
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

