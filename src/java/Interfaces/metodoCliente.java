/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelo.Cliente;
import java.util.ArrayList;

/**
 *
 * @author mrang
 */
public interface metodoCliente {
    
    public boolean agregar(Cliente cli); //public boolean agregar(Producto idProducto);
    public boolean editar(String cli_codigo);
    public boolean eliminar(String cli_codigo);
    public Cliente listar(String email, String passw);
    public Cliente recuperarClave(String email);
    public int recuperarId(String email);
    public ArrayList<Cliente>listarTodoCliente();
    public int nuevoCliente();
    
}
