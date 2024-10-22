package com.interfaz.interfaz;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Modelo {
    private ArrayList listaClientes;
    private ArrayList listaProductos;
    private ArrayList listaProveedor;

    public Modelo() {
        listaClientes = new ArrayList<>();
        listaProductos = new ArrayList<>();
        listaProveedor = new ArrayList<>();
    }

    public void darAlta(Object o) {
        if (o instanceof Cliente){
            listaClientes.add(o);
        } else if (o instanceof Proveedor) {
            listaProveedor.add(o);
        } else if (o instanceof Producto) {
            listaProductos.add(o);
        }
    }

    public void busquedaDatos(Object o) {
        if (o instanceof Cliente && listaClientes.contains(o)){
            System.out.println(o);
        } else if (o instanceof Proveedor && listaProveedor.contains(o)) {
            System.out.println(o);
        } else if (o instanceof Producto && listaProductos.contains(o)) {
            System.out.println(o);
        }
    }

    public void darBaja(Object o) {
        if (o instanceof Cliente){
            listaClientes.remove(o);
        } else if (o instanceof Proveedor) {
            listaProveedor.remove(o);
        } else if (o instanceof Producto) {
            listaProductos.remove(o);
        }
    }


    public static void modificarDatos(){}


}
