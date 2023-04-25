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
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="${pageContext.request.contextPath}/index.jsp">Inicio</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Proveedores</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="${pageContext.request.contextPath}/ofertas.jsp">Ofertas</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Productos
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="#">Computadoras</a></li>
            <li><a class="dropdown-item" href="#">Telefonos</a></li>
          </ul>
        </li>
      </ul>
    </div>
  </div>
</nav>
