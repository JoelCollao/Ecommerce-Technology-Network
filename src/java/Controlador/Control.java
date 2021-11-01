
package Controlador;

import Modelo.Producto;
import Modelo.Cliente;
import Modelo.Administrador;
import ModeloDAO.ProductoDAO;
import ModeloDAO.AdministradorDAO;
import ModeloDAO.ClienteDAO;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Control extends HttpServlet {

        
        // Instancia de cliente
        Cliente cli;
        ClienteDAO cliDAO;
        
        // Instancia de Administrador 
        Administrador admin;
        AdministradorDAO adminDAO;
        
        // Instancia  de los Articulos
        ArrayList<Producto> articulos = new ArrayList<>();
        ProductoDAO aDAO = new ProductoDAO();
        
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
        String accion = request.getParameter("accion");
        if(accion.equals("Administracion")){
            request.getRequestDispatcher("Administracion.jsp").forward(request, response);
        }
        if(accion.equals("Cliente")){
            request.getRequestDispatcher("Cliente.jsp").forward(request, response);
        }
        if(accion.equals("Producto")){
            request.getRequestDispatcher("Producto.jsp").forward(request, response);
        }
        

        
      
  
        String email;
        String pass;
        String paginaLogin="Login.jsp";
        String paginaPrincipal="Principal.jsp";
        String paginaAdministrador="Administracion.jsp";
        String acceso=null;
        
        String action = request.getParameter("accion");
        //int idcat = Integer.parseInt(action);
        
        articulos = aDAO.listar() ;
        
        if(action.equalsIgnoreCase("home")){
            acceso=paginaPrincipal;
        }
        
        if (action.equals("-1") || action.equals("1") || action.equals("2") || action.equals("3") || action.equals("4") || action.equals("5") || action.equals("6") || action.equals("7") || action.equals("8") || action.equals("9") || action.equals("10")|| action.equals("11")) {
            request.setAttribute("cod_categoria", action);
            acceso=paginaPrincipal;
        }
        
          
        
        if(action.equalsIgnoreCase("login")){
        try{
            
            email = (String)request.getParameter("email");
            pass = (String)request.getParameter("pass");
            
            cliDAO = new ClienteDAO();
            cli= cliDAO.listar(email, pass);
            
            adminDAO = new AdministradorDAO();
            admin = adminDAO.listar(email, pass);
            
            HttpSession sesion = request.getSession();
            
            
            
            if(cli ==null && admin==null){
                acceso=paginaLogin;
            }
            
            
            else if(cli!=null && sesion.getAttribute("cliente")==null){
                String nomcat = cli.getCli_nombre()+" "+ cli.getCli_apellido();
                sesion.setAttribute("cliente", nomcat);
                acceso=paginaPrincipal;
            }        
            
            
            else if(admin!=null && sesion.getAttribute("administrador")==null){
                String nomcat = admin.getAdmin_nombre()+" "+ admin.getAdmin_apellido();
                String codadmin = admin.getAdmin_cod();
                String cargo = admin.getAdmin_apellido();
                
                sesion.setAttribute("administrador", nomcat);
                sesion.setAttribute("codigo_admin", codadmin);
                  sesion.setAttribute("cargo", cargo);
                acceso=paginaAdministrador;
            }
              
            
        }
        catch(Exception e){
        }
    }
        
    if(action.equalsIgnoreCase("logout")){
        try{
            System.out.println("Sesion iniciada: "+ request.getSession());
            if(request.getSession()!=null){
                request.getSession().invalidate();
                acceso=paginaPrincipal;
            }
        }
        catch(Exception e){
        }
    }
    
    RequestDispatcher rd= request.getRequestDispatcher(acceso);
    rd.forward(request, response);
   
    }
     
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       processRequest(request, response);
    }

    
    
    
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    
    
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
