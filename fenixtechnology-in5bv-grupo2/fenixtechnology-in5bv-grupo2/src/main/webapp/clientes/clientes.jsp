<%-- 
    Document   : index
    Created on : 9/08/2022, 17:08:46
    Author     : Lionar Villalta
    Código técnico : IN5BV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">

    <!-- Cabeza de la página-->

    <head>
        <title> Fundación kinal</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="../assets/css/hoja-estilo-kinal.css" />
        <link rel="stylesheet" type="text/css" href="../assets/css/flexslider.css" />
        <link rel="stylesheet" type="text/css" href="../assets/css/bootstrap.css" />
        <script src="../assets/js/7bddefec33.js"></script>
    </head>
    <!-- Cuerpo de la página-->

    <body>
        <header>
            <!-- Encabezado de la página-->
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <h1>
                          <i class="fa-solid fa-graduation-cap"></i>  Control de Clientes</h1>
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
                            <a href="#" class="btn btn-primary"> Agregar Clientes </a>
                        </div>
                    </div>
                </div>
            </section>
            
            <section id="cliente">
                <div class="container mb-5 pb-5">
                    <div class="row">
                        <div class="col-12">
                            <div class="card">
                                <div class="card-header">
                                    <h4>Listado de Clientes</h4>
                                </div>
                            </div>
                        </div>
                        <table class="table  table-striped">
                            <thead class="table-dark">
                                <tr>
                                    <th>Id_cliente</th>
                                    <th>Persona</th>
                                    <th>Nit</th>                                
                                </tr>
                            </thead>                      
                            <tbody>
                                <tr>
                                    <td>1</td>
                                    <td>4</td>
                                    <td>1234567893</td>
                                </tr>
                            </tbody>
                            <tbody>
                                <tr>
                                    <td>2</td>
                                    <td>5</td>
                                    <td>2345457893</td>
                                </tr>
                            </tbody>
                            <tbody>
                                <tr>
                                    <td>3</td>
                                    <td>3</td>
                                    <td>7894567893</td>
                                </tr>
                            </tbody>
                            <tbody>
                                <tr>
                                    <td>4</td>
                                    <td>1</td>
                                    <td>6534567893</td>
                                </tr>
                            </tbody>
                            <tbody>
                                <tr>
                                    <td>5</td>
                                    <td>2</td>
                                    <td>3534567893</td>
                                </tr>
                            </tbody> 
                        </table>
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