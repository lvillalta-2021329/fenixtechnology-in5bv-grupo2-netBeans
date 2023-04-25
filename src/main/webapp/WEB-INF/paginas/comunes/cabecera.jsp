<%-- 
    Document   : cabecera
    Created on : 25/08/2022, 14:05:38
    Scrum Master    :   Edy Leonel Letona Argueta 
    Developer   : Jairo Estuardo Alvarado Del Cid
    Developer   : Josecarlos Anzueto Rodas
    Developer   : Cesar Alexander Barillas Dominguez
    Developer   : 
    Developer   : 
--%>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Menú</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavDropdown">
            <ul class="navbar-nav">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        Entidades
                    </a>
                    <ul class="dropdown-menu">
                        <li class="nav-item">
                    <a class="dropdown-item" aria-current="page" href="${pageContext.request.contextPath}/index.jsp">Inicio</a>
                </li>
                <li class="nav-item">
                    <a class="dropdown-item" href="${pageContext.request.contextPath}/ServletProducto?accion=listar">Productos</a>
                </li>
                <li class="nav-item">
                    <a class="dropdown-item" href="${pageContext.request.contextPath}/ServletProveedores?accion=listar">Proveedores</a>
                </li>
                <li class="nav-item">
                    <a class="dropdown-item" href="${pageContext.request.contextPath}/ServletTipoProducto?accion=listar">Tipo de productos</a>
                </li>
                <li class="nav-item">
                    <a class="dropdown-item" href="${pageContext.request.contextPath}/ServletOfertas?accion=listar">Ofertas</a>
                </li>
                <li class="nav-item">
                    <a class="dropdown-item" href="${pageContext.request.contextPath}/ServletDetalleVentas?accion=listar">Detalle de venta</a>
                </li>
                <li class="nav-item">
                    <a class="dropdown-item" href="${pageContext.request.contextPath}/ServletFactura?accion=listar">Factura</a>
                </li>
                <li class="nav-item">
                    <a class="dropdown-item" href="${pageContext.request.contextPath}/ServletCliente?accion=listar">Clientes</a>
                </li>
                <li class="nav-item">
                    <a class="dropdown-item" href="${pageContext.request.contextPath}/ServletEmpleados?accion=listar">Empleados</a>
                </li>
                <li class="nav-item">
                    <a class="dropdown-item" href="${pageContext.request.contextPath}/ServletPersona?accion=listar">Personas</a>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>
