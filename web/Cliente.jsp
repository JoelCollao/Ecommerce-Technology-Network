<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
    <body>

        <div>
            <div class="d-flex">
                <div class="card col-sm-6">
                    <form>
                        <div class="form-group">
                            <label>Codigo Cliente</label>
                            <input type="text" name="txtCod_Cli" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Nombre Cliente</label>
                            <input type="text" name="txtNom_Cli" class="form-control">
                        </div>

                        <div class="form-group">
                            <label>Apellido Cliente</label>
                            <input type="text" name="txtApe_Cli" class="form-control">
                        </div>

                        <div class="form-group">
                            <label>Documento Identidad</label>
                            <input type="text" name="txtDoi" class="form-control">
                        </div>

                        <div class="form-group">
                            <label>Dirección</label>
                            <input type="text" name="txtDirec" class="form-control">
                        </div>

                        <div class="form-group">
                            <label>Distrito</label>
                            <input type="text" name="txtDist" class="form-control">
                        </div>

                        <div class="form-group">
                            <label>Teléfono</label>
                            <input type="text" name="txtTelef" class="form-control">
                        </div>

                        <div class="form-group">
                            <label>Correo Electronico</label>
                            <input type="text" name="txtCorre_Elec" class="form-control">
                        </div>
                        <input type="submit" name="accion" value="Agregar"  class="btn btn-info">

                    </form>
                </div>


                <div class="col-sm-8">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>COD CLIENTE</th>
                                <th>NOMBRE</th>
                                <th>APELLIDO</th>
                                <th>DOCUMENTO</th>
                                <th>DIRECCION</th>
                                <th>DISTRITO</th>
                                <th>TELEFONO</th>
                                <th>EMAIL</th>

                            </tr>
                        </thead>
                        <tbody>
                           <!--  FOREACH -->
                            <tr>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                            </tr>
                            
                        </tbody>
                    </table>

                </div>
            </div>


        </div>




        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
