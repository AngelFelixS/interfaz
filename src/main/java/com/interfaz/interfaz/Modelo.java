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

    public ArrayList<Proveedor> getListaProveedor() {
        return listaProveedor;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void darAlta(Object o) {
        if (o instanceof Cliente){
            listaClientes.add((Cliente) o);
            System.out.println(o);
        } else if (o instanceof Proveedor) {
            listaProveedor.add((Proveedor) o);
            System.out.println(o);
        } else if (o instanceof Producto) {
            listaProductos.add((Producto) o);
            System.out.println(o);
        }
    }

    public int busquedaDatos(Object o) {
        if (o instanceof Cliente && listaClientes.contains(o)){
            return listaClientes.indexOf(o);
        } else if (o instanceof Proveedor && listaProveedor.contains(o)) {
            return listaProveedor.indexOf(o);
        } else if (o instanceof Producto && listaProductos.contains(o)) {
            return listaProductos.indexOf(o);
        }
        return -1;
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

    public void insertarPosicionLista(Object o,int pos){
        if (o instanceof Cliente){
            listaClientes.add(pos,(Cliente) o);
        } else if (o instanceof Proveedor) {
            listaProveedor.add(pos,(Proveedor) o);
        } else if (o instanceof Producto) {
            listaProductos.add(pos,(Producto) o);
        }
    }

}
