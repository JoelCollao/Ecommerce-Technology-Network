<%@page import="Modelo.Producto"%>
<%@page import="ModeloDAO.ProductoDAO"%>
<%@page import="Modelo.Categoria"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.CategoriaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous"> 
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta2/css/all.min.css" integrity="sha512-YWzhKL2whUzgiheMoBFwW8CKV4qpHQAEuvilg9FAn5VJUDwKZZxkJNuGM4XkWuk94WCrrwslk8yWNGmY1EduTA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">


        <!-- <link rel="stylesheet" type="text/css" href="Estilos/estilos.css"/>-->
        <link rel="stylesheet" type="text/css" href="Estilos/estilosindex.css"/>
        <script type="text/javascript" src="Js/codigo.js"></script> 
        <title>Technology Networks</title>
    </head>

    <header class="page-header">
        <%
            HttpSession sesion = request.getSession();
            if (sesion.getAttribute("cliente") == null) {
        %>
        <%
        } else {%><%= sesion.getAttribute("cliente")%>
        <%}%> 
    </header>

    <body>

        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" href="#">Technology Networks</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">

                <ul class="navbar-nav mr-auto">


                    <!-- para ver toda la lista de catalogos -->
                    <li class="nav-item dropdown">
                        <a class="nav-link" href="Control?accion=home">Home<span class="sr-only">(current)</span></a>
                    </li>


                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Nosotros
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="#">Misión</a>
                            <a class="dropdown-item" href="#">Visión</a>

                        </div>
                    </li>

                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Categorías
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">


                            <%
                                CategoriaDAO c = new CategoriaDAO();
                                ArrayList<Categoria> lista = c.listarTodoCategoria();
                                Categoria cat;
                                for (int i = 0; i < lista.size(); i++) {
                                    cat = new Categoria();
                                    cat = lista.get(i);
                            %> 
                            <p><a href="Control?accion=<%=cat.getCat_codigo()%>"><%=cat.getCat_nombre()%></a></p>
                                <%
                                    }
                                %>
                            <p><a href="Control?accion=-1">Ver todo</a></p>
                        </div>
                    </li>

                </ul>



                <div>        
                    <style type="text/css">
                        #logeo{
                            color: white;
                        }
                    </style>

                    <a id = "logeo" class="nav-link"><span class="sr-only">(current)</span>
                        <%
                            if (sesion.getAttribute("cliente") == null) {
                        %> 
                        <%
                        } else {%>Bienvenido <%= sesion.getAttribute("cliente")%>
                        <%}%> 
                    </a>
                </div>


                <div class="dropdown">
                    <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Sesión
                    </button>
                    <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                        <%
                                 try {
                                     if (sesion.getAttribute("cliente") == null) {%>
                        <a class="dropdown-item" href="Control?accion=login">Iniciar Sesion</a>
                        <a class="dropdown-item" href="Control?accion=registrarse">Registrarse</a>
                        <%}%>
                        <%if (sesion.getAttribute("cliente") != null) {%>
                        <a class="dropdown-item" href="Control?accion=logout">Cerrar Sesion</a>
                        <%}
                                } catch (Exception e) {
                                }%> 
                        <a class="dropdown-item" href="Control?accion=ir_a_carrito">Ir al carrito</a>
                    </div>
                </div>
            </div>
        </nav>


        <!-- Verificar ESTA PARTE DEL CODIGO --->  





        <!-- Verificar ESTA PARTE DEL CODIGO --->                                        

        <div class="container mt-4">   
            <div class="row">
                <!-- IRIA UN FOREACG  RECORRE LA IMAGENES  -->

                <%
                    try {
                        int cat_cod = -1;
                        if (request.getAttribute("cod_categoria") == null || Integer.parseInt(request.getAttribute("cod_categoria").toString()) == -1) {
                            //cat_cod=1;
                            ProductoDAO aDAO = new ProductoDAO();
                            ArrayList<Producto> listarProductos = aDAO.listar();
                            Producto a = new Producto();
                            for (int j = 0; j < listarProductos.size(); j++) {
                                a = listarProductos.get(j);
                %>
                <div class="col-sm-4">
                    <div class="card">
                        <div class="card-header">
                            <labels><%= a.getPro_descripcion()%> </labels>
                        </div>
                        <div class="card-body">
                            <i><%= a.getPro_precio_unitario()%> </i>
                            <img src="ControladorImg?pro_codigo=<%= a.getPro_codigo()%> " width="200" height="200">
                        </div>
                        <div class="card-footer text-center">
                            <label>Descripción del Producto</label>
                            <div>
                                <a href="#" class="btn btn-outline-info">Agregar a Carrito</a>
                                <a href="#" class="btn btn-primary">Comprar</a>
                            </div>
                        </div>
                    </div>
                </div>
                <%
                    }
                } else {
                    cat_cod = Integer.parseInt(request.getAttribute("cod_categoria").toString());
                    //   }
                    if (cat_cod > 0) {
                        ProductoDAO aDAO = new ProductoDAO();
                        ArrayList<Producto> artCategoria = aDAO.listarArticulosporCategoria(cat_cod);
                        Producto art = new Producto();
                %>   
                <%
                    for (int k = 0; k < artCategoria.size(); k++) {
                        art = artCategoria.get(k);
                %>
                <div class="col-sm-4">
                    <div class="card">
                        <div class="card-header">
                            <labels><%= art.getPro_descripcion()%> </labels>
                        </div>
                        <div class="card-body">
                            <i><%= art.getPro_precio_unitario()%> </i>
                            <img src="ControladorImg?pro_codigo=<%= art.getPro_codigo()%> " width="200" height="200">
                        </div>
                        <div class="card-footer text-center">
                            <label>Descripción del Producto</label>
                            <div>
                                <a href="#" class="btn btn-outline-info">Agregar a Carrito</a>
                                <a href="#" class="btn btn-primary">Comprar</a>
                            </div>
                        </div>
                    </div>
                </div>
                <%  }%>  
                <%
                            }
                        }
                    } catch (NumberFormatException ex) {
                    }
                %>
                <!-- IRIA UN FOREACG  RECORRE LA IMAGENES -->
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

    </body>
</html>