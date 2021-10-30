package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.Producto;
import ModeloDAO.ProductoDAO;
import Modelo.Categoria;
import java.util.ArrayList;
import ModeloDAO.CategoriaDAO;

public final class Principal_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\"> \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta2/css/all.min.css\" integrity=\"sha512-YWzhKL2whUzgiheMoBFwW8CKV4qpHQAEuvilg9FAn5VJUDwKZZxkJNuGM4XkWuk94WCrrwslk8yWNGmY1EduTA==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- <link rel=\"stylesheet\" type=\"text/css\" href=\"Estilos/estilos.css\"/>-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Estilos/estilosindex.css\"/>\n");
      out.write("        <script type=\"text/javascript\" src=\"Js/codigo.js\"></script> \n");
      out.write("        <title>Technology Networks</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <header class=\"page-header\">\n");
      out.write("        ");

            HttpSession sesion = request.getSession();
            if (sesion.getAttribute("cliente") == null) {
        
      out.write("\n");
      out.write("        ");

        } else {
      out.print( sesion.getAttribute("cliente"));
      out.write("\n");
      out.write("        ");
}
      out.write(" \n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">Technology Networks</a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("\n");
      out.write("                <ul class=\"navbar-nav mr-auto\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <!-- para ver toda la lista de catalogos -->\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link\" href=\"Control?accion=home\">Home<span class=\"sr-only\">(current)</span></a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            Nosotros\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Misión</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Visión</a>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            Categorías\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                            ");

                                CategoriaDAO c = new CategoriaDAO();
                                ArrayList<Categoria> lista = c.listarTodoCategoria();
                                Categoria cat;
                                for (int i = 0; i < lista.size(); i++) {
                                    cat = new Categoria();
                                    cat = lista.get(i);
                            
      out.write(" \n");
      out.write("                            <p><a href=\"Control?accion=");
      out.print(cat.getCat_codigo());
      out.write('"');
      out.write('>');
      out.print(cat.getCat_nombre());
      out.write("</a></p>\n");
      out.write("                                ");

                                    }
                                
      out.write("\n");
      out.write("                            <p><a href=\"Control?accion=-1\">Ver todo</a></p>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div>        \n");
      out.write("                    <style type=\"text/css\">\n");
      out.write("                        #logeo{\n");
      out.write("                            color: white;\n");
      out.write("                        }\n");
      out.write("                    </style>\n");
      out.write("\n");
      out.write("                    <a id = \"logeo\" class=\"nav-link\"><span class=\"sr-only\">(current)</span>\n");
      out.write("                        ");

                            if (sesion.getAttribute("cliente") == null) {
                        
      out.write(" \n");
      out.write("                        ");

                        } else {
      out.write("Bienvenido ");
      out.print( sesion.getAttribute("cliente"));
      out.write("\n");
      out.write("                        ");
}
      out.write(" \n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"dropdown\">\n");
      out.write("                    <button class=\"btn btn-secondary dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                        Sesión\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton\">\n");
      out.write("                        ");

                                 try {
                                     if (sesion.getAttribute("cliente") == null) {
      out.write("\n");
      out.write("                        <a class=\"dropdown-item\" href=\"Control?accion=login\">Iniciar Sesion</a>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"Control?accion=registrarse\">Registrarse</a>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                        ");
if (sesion.getAttribute("cliente") != null) {
      out.write("\n");
      out.write("                        <a class=\"dropdown-item\" href=\"Control?accion=logout\">Cerrar Sesion</a>\n");
      out.write("                        ");
}
                                } catch (Exception e) {
                                }
      out.write(" \n");
      out.write("                        <a class=\"dropdown-item\" href=\"Control?accion=ir_a_carrito\">Ir al carrito</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Verificar ESTA PARTE DEL CODIGO --->  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Verificar ESTA PARTE DEL CODIGO --->                                        \n");
      out.write("\n");
      out.write("        <div class=\"container mt-4\">   \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <!-- IRIA UN FOREACG  RECORRE LA IMAGENES  -->\n");
      out.write("\n");
      out.write("                ");

                    try {
                        int cat_cod = -1;
                        if (request.getAttribute("cod_categoria") == null || Integer.parseInt(request.getAttribute("cod_categoria").toString()) == -1) {
                            //cat_cod=1;
                            ProductoDAO aDAO = new ProductoDAO();
                            ArrayList<Producto> listarProductos = aDAO.listar();
                            Producto a = new Producto();
                            for (int j = 0; j < listarProductos.size(); j++) {
                                a = listarProductos.get(j);
                
      out.write("\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <div class=\"card-header\">\n");
      out.write("                            <labels>");
      out.print( a.getPro_descripcion());
      out.write(" </labels>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <i>");
      out.print( a.getPro_precio_unitario());
      out.write(" </i>\n");
      out.write("                            <img src=\"ControladorImg?pro_codigo=");
      out.print( a.getPro_codigo());
      out.write(" \" width=\"200\" height=\"200\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-footer text-center\">\n");
      out.write("                            <label>Descripción del Producto</label>\n");
      out.write("                            <div>\n");
      out.write("                                <a href=\"#\" class=\"btn btn-outline-info\">Agregar a Carrito</a>\n");
      out.write("                                <a href=\"#\" class=\"btn btn-primary\">Comprar</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                ");

                    }
                } else {
                    cat_cod = Integer.parseInt(request.getAttribute("cod_categoria").toString());
                    //   }
                    if (cat_cod > 0) {
                        ProductoDAO aDAO = new ProductoDAO();
                        ArrayList<Producto> artCategoria = aDAO.listarArticulosporCategoria(cat_cod);
                        Producto art = new Producto();
                
      out.write("   \n");
      out.write("                ");

                    for (int k = 0; k < artCategoria.size(); k++) {
                        art = artCategoria.get(k);
                
      out.write("\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <div class=\"card-header\">\n");
      out.write("                            <labels>");
      out.print( art.getPro_descripcion());
      out.write(" </labels>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <i>");
      out.print( art.getPro_precio_unitario());
      out.write(" </i>\n");
      out.write("                            <img src=\"ControladorImg?pro_codigo=");
      out.print( art.getPro_codigo());
      out.write(" \" width=\"200\" height=\"200\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-footer text-center\">\n");
      out.write("                            <label>Descripción del Producto</label>\n");
      out.write("                            <div>\n");
      out.write("                                <a href=\"#\" class=\"btn btn-outline-info\">Agregar a Carrito</a>\n");
      out.write("                                <a href=\"#\" class=\"btn btn-primary\">Comprar</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                ");
  }
      out.write("  \n");
      out.write("                ");

                            }
                        }
                    } catch (NumberFormatException ex) {
                    }
                
      out.write("\n");
      out.write("                <!-- IRIA UN FOREACG  RECORRE LA IMAGENES -->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js\" integrity=\"sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js\" integrity=\"sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
