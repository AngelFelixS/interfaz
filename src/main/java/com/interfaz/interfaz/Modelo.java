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

    public static void crearCliente(Cliente c) {
        listaClientes.add(c);
    }

    public static void busquedaClientes(Cliente c) {
    }

    public static void borrarCliente(Cliente c) {
    }


    public static void crearProyecto(Producto p) {
        listaProductos.add(p);
    }

    public static void busquedaProducto(Producto p) {
    }


    public static void borrarProducto(Producto p) {
    }


    public static void crearProveedor(Proveedor pr) {
        listaProveedor.add(pr);
    }

    public static void busquedaProveedor(Proveedor pr) {
    }

    public static void borrarProveedor(Proveedor pr) {
    }


}
