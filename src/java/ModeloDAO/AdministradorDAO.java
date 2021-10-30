
package ModeloDAO;

import Configuracion.Conexion;
import Interfaces.metodoAdministrador;
import Modelo.Administrador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdministradorDAO implements metodoAdministrador{
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Administrador admi;
    
    
     public Administrador validar(String admin_cod , String admin_pass){
        
        Administrador admi = new Administrador();
        String sql = "select * from administrador where admin_cod=? and admin_password=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, admin_cod);
            ps.setString(2, admin_pass);
            rs = ps.executeQuery();
            while (rs.next()) {                
                admi.setAdmin_cod(rs.getString("admin_cod"));
                admi.setAdmin_nombre(rs.getString("admin_nombre"));
                admi.setAdmin_apellido(rs.getString("admin_apellido"));
                admi.setAdmin_fec_ing(rs.getDate("admin_fec_ing").toString());
                admi.setAdmin_password(rs.getString("admin_password"));
                admi.setAdmin_estado(rs.getString("admin_estado"));
            }
            
        } catch (Exception e) {
        }
        return admi;
    }

    @Override
    public boolean agregar(Administrador admi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editar(String admin_cod) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(String admin_cod) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Administrador listar(String admin_cod, String admin_pass) {
       try{
            String sql ="Select * From administrador where admin_cod='"+admin_cod+"' and admin_password='"+admin_pass+"'" ;
            con = cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                admi =new Administrador();
                admi.setAdmin_cod(rs.getString("admin_cod"));
                admi.setAdmin_nombre(rs.getString("admin_nombre"));
                admi.setAdmin_apellido(rs.getString("admin_apellido"));
                admi.setAdmin_fec_ing(rs.getDate("admin_fec_ing").toString());
                admi.setAdmin_password(rs.getString("admin_password"));
                admi.setAdmin_estado(rs.getString("admin_estado"));
            }
        }
        catch(SQLException ex){
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return admi;
    }

    @Override
    public Administrador recuperarClave(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int recuperarId(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Administrador> listarTodoAdministrador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int nuevoAdministrador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
