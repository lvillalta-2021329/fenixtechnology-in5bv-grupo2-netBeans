<%-- 
    Document   : tipo-producto
    Created on : 25/08/2022, 15:56:15
    Author     : informatica
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tipo Producto</title>
        <jsp:include page = "../WEB-INF/paginas/comunes/cabecera.jsp"/>
    </head>
    <body>
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
            
            <section id="tipoproducto">
                <div class="container mb-5 pb-5">
                    <div class="row">
                        <div class="col-12">
                            
                            <div class="card">
                                <div class-header>
                                    <h4>Tipo De Productos</h4>
                                </div>
                            </div>
                            
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
                                    <tr>
                                        <td>1</td>
                                        <td>Computadoras</td>
                                      
                                        <td>
                                            <i class="fa-solid fa-user-pen"></i>
                                        </td>
                                        <td>
                                            <i class="fa-solid fa-user-xmark"></i>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>2</td>
                                        <td>Telefono</td>
                                       
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
    </body>
</html>
