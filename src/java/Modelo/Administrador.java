
package Modelo;

public class Administrador {
    
    private String admin_cod;
    private String admin_nombre;
    private String admin_apellido;
    private String admin_fec_ing;
    private String admin_password;
    private String admin_estado;
    
    public Administrador(){
        
    }

    public Administrador(String admin_cod, String admin_nombre, String admin_apellido, String admin_fec_ing, String admin_password, String admin_estado) {
        this.admin_cod = admin_cod;
        this.admin_nombre = admin_nombre;
        this.admin_apellido = admin_apellido;
        this.admin_fec_ing = admin_fec_ing;
        this.admin_password = admin_password;
        this.admin_estado = admin_estado;
    }

    public String getAdmin_cod() {
        return admin_cod;
    }

    public void setAdmin_cod(String admin_cod) {
        this.admin_cod = admin_cod;
    }

    public String getAdmin_nombre() {
        return admin_nombre;
    }

    public void setAdmin_nombre(String admin_nombre) {
        this.admin_nombre = admin_nombre;
    }

    public String getAdmin_apellido() {
        return admin_apellido;
    }

    public void setAdmin_apellido(String admin_apellido) {
        this.admin_apellido = admin_apellido;
    }

    public String getAdmin_fec_ing() {
        return admin_fec_ing;
    }

    public void setAdmin_fec_ing(String admin_fec_ing) {
        this.admin_fec_ing = admin_fec_ing;
    }

    public String getAdmin_password() {
        return admin_password;
    }

    public void setAdmin_password(String admin_password) {
        this.admin_password = admin_password;
    }

    public String getAdmin_estado() {
        return admin_estado;
    }

    public void setAdmin_estado(String admin_estado) {
        this.admin_estado = admin_estado;
    }
    
    
}
