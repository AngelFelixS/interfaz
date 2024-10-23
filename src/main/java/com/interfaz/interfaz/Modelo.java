package com.interfaz.interfaz;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Modelo {
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Producto> listaProductos;
    private ArrayList<Proveedor> listaProveedor;

    public Modelo() {
        listaClientes = new ArrayList<>();
        listaProductos = new ArrayList<>();
        listaProveedor = new ArrayList<>();
    }

    public void darAlta(Object o) {
        if (o instanceof Cliente){
            listaClientes.add((Cliente) o);
        } else if (o instanceof Proveedor) {
            listaProveedor.add((Proveedor) o);
        } else if (o instanceof Producto) {
            listaProductos.add((Producto) o);
            System.out.println(o);
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
            listaClientes.remove((Cliente) o);
        } else if (o instanceof Proveedor) {
            listaProveedor.remove((Proveedor) o);
        } else if (o instanceof Producto) {
            listaProductos.remove((Producto) o);
        }
    }


    public void modificarDatos(Object viejo, Object nuevo){
        if (viejo instanceof Cliente){

        } else if (viejo instanceof Proveedor) {

        } else if (viejo instanceof Producto) {

        }
    }

}
