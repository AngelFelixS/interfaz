package com.interfaz.interfaz;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Modelo {
    public static ArrayList listaClientes;
    public static ArrayList listaProductos;
    public static ArrayList listaProveedor;

    public Modelo() {
        listaClientes = new ArrayList<>();
        listaProductos = new ArrayList<>();
        listaProveedor = new ArrayList<>();
    }

    public static void darAlta(Object o) {
        if (o instanceof Cliente){
            listaClientes.add(o);
        } else if (o instanceof Proveedor) {
            listaProveedor.add(o);
        } else if (o instanceof Producto) {
            listaProductos.add(o);
        }
    }

    public static void busquedaClientes(Cliente c) {
    }

    public static void darBaja(Object o) {
        if (o instanceof Cliente){
            listaClientes.remove(o);
        } else if (o instanceof Proveedor) {
            listaProveedor.remove(o);
        } else if (o instanceof Producto) {
            listaProductos.remove(o);
        }
    }


    public static void busquedaProducto(Producto p) {
    }


    public static void busquedaProveedor(Proveedor pr) {
    }


}
