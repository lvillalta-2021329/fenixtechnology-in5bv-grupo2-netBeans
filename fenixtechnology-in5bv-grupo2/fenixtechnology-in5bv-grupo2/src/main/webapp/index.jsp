<%-- 
    Document   : index
    Created on : 25/08/2022, 14:00:14
    Scrum Master    :   Edy Leonel Letona Argueta 
    Developer   : Jairo Estuardo Alvarado Del Cid
    Developer   : Josecarlos Anzueto Rodas
    Developer   : Cesar Alexander Barillas Dominguez
    Developer   : 
    Developer   : 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fenix</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link 
            rel="stylesheet" 
            type="text/css" 
            href="./assets/css/hoja-estilos-principal.css"> 
        <link rel="stylesheet" type="text/css" href="./assets/css/bootstrap.css"/> 
    </head>
    <body>
        <header><h1>Fenix Technology</h1></header>
        
        <jsp:include page="./WEB-INF/paginas/comunes/cabecera.jsp" />
        
        <main>
            
            <section>
                <article id="contenido">  
                <div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="true">
                    <div class="carousel-indicators">
                        <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
                        <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
                        <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
                    </div>
                    <div class="carousel-inner">
                        <div class="carousel-item active">
                            <video src="./assets/videos/video_fenix.mp4" class="d-block w-100" autoplay muted loop></video>
                        </div>
                        <div class="carousel-item">
                            <img src="./assets/images/slider.png" class="d-block w-100" alt="...">
                        </div>
                        <div class="carousel-item">
                            <img src="./assets/images/slider 2.png" class="d-block w-100" alt="...">
                        </div>
                    </div>
                    <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
                        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                        <span class="visually-hidden">Previous</span>
                    </button>
                    <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
                        <span class="carousel-control-next-icon" aria-hidden="true"></span>
                        <span class="visually-hidden">Next</span>
                    </button>
                </div>
                    <div class="container">
                        <div class="row">
                            <div class="col-1   col-sm-2    col-md-3"></div>
                            <div class="col-10  col-sm-8    col-md-6">
                                <p class="descripcion">
                                    Fenix technology es una tienda virtual novedosa y facil de usar. 
                                    Esta página web tiene como funcionalidad brindar una mejor administración 
                                    de nuestros productos.
                                </p>
                                <p class="descripcion">
                                    
                                </p>
                                <div class="col-1   col-sm-2    col-md-3"></div>
                            </div>
                        </div>
                    </div>
                </article>
            </section>
        </main>
        
        <script type="text/javascript" src="./assets/js/jquery-3.6.0.js"></script>
        <script type="text/javascript" src="./assets/js/jquery-migrate-3.4.0.js"></script>
        <script type="text/javascript" src="./assets/js/jquery-migrate-1.4.1.js"></script>
        <script type="text/javascript" src="./assets/js/jquery.flexslider.js"></script>
        <script type="text/javascript" src="./assets/js/script.js"></script>
        <script type="text/javascript" src="./assets/js/bootstrap.bundle.js"></script>
        
        <jsp:include page="./WEB-INF/paginas/comunes/pie-pagina.jsp" />
        
    </body>
</html>
