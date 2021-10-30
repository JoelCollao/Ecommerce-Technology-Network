
package Interfaces;

import Modelo.Producto;
import java.util.ArrayList;

public interface metodoProducto {
    public boolean agregar(Producto articulo);
    public boolean editar(String art_codigo);
    public boolean eliminar(String art_codigo);
    public ArrayList<Producto>listar();
    public ArrayList<Producto>listarArticulosporCategoria(int cat_codigo);
    
}
