
package ModeloDAO;

import Configuracion.Conexion;
import Modelo.Producto;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletResponse;
import Interfaces.metodoProducto;


public class ProductoDAO implements metodoProducto {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Producto art;

    @Override
    public boolean agregar(Producto articulo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editar(String art_codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(String art_codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Producto> listar() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ArrayList<Producto> productos = new ArrayList<>();
        try{
            String sql = "Select * from producto";
            con = cn.getConnection();
            ps=con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                Producto art = new Producto();
                art.setPro_codigo(rs.getString("pro_codigo"));
                art.setPro_descripcion(rs.getString("pro_descripcion"));
                art.setPro_precio_unitario(rs.getDouble("pro_precio_unitario"));
                art.setPro_stock(rs.getInt("pro_stock"));
                art.setCat_codigo(rs.getInt("cat_codigo"));
                art.setPro_img(rs.getBinaryStream("pro_img"));
                productos.add(art);
            }
        }
        catch (SQLException ex){
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE,null,ex);
        }
        return productos;
    }
    
    public void listar_imagen(String procod, HttpServletResponse response){
     String sql = "Select * from producto where pro_codigo='"+procod+"';";
        InputStream inputstream=null;
        OutputStream outputstream=null;
        BufferedInputStream bufferedinputstream=null;
        BufferedOutputStream bufferedoutputstream=null;
     try{
        outputstream=response.getOutputStream();
        con = cn.getConnection();
        ps=con.prepareStatement(sql);
        rs = ps.executeQuery();
        if(rs.next()){
            inputstream= rs.getBinaryStream("pro_img");
        }
        bufferedinputstream= new BufferedInputStream(inputstream);
        bufferedoutputstream=new BufferedOutputStream(outputstream);
        int i=0;
        while((i=bufferedinputstream.read())!=-1){
            bufferedoutputstream.write(i);
        }
     }
     catch(Exception e){
         
     }
    }

    @Override
    public ArrayList<Producto> listarArticulosporCategoria(int cat_codigo) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ArrayList<Producto>lista = new ArrayList<>();
        try{
            String sql = "Select * from producto where cat_codigo='"+cat_codigo+"';";
            con = cn.getConnection();
            ps=con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
               Producto art = new Producto();
                art.setPro_codigo(rs.getString("pro_codigo"));
                art.setPro_descripcion(rs.getString("pro_descripcion"));
                art.setPro_precio_unitario(rs.getDouble("pro_precio_unitario"));
                art.setPro_stock(rs.getInt("pro_stock"));
                art.setCat_codigo(rs.getInt("cat_codigo"));
                art.setPro_img(rs.getBinaryStream("pro_img"));
                lista.add(art);
            }
        }
        catch (SQLException ex){
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE,null,ex);
        }
        return lista;
    }
    
}
