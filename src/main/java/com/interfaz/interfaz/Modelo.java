package com.interfaz.interfaz;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Modelo {
    public static ArrayList listaClientes;
    public static ArrayList listaProductos;
    public static ArrayList listaProveedor;


    public static boolean crearCliente(Cliente c){
        listaClientes.add(c);
        return true;
    }

    public static boolean crearProyecto(Producto p){
        listaClientes.add(p);
        return true;
    }
    public static boolean crearProveedor(Proveedor pr){
        listaClientes.add(pr);
        return true;
    }
}
