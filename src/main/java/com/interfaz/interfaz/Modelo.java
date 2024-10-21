package com.interfaz.interfaz;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Modelo {
    public static ArrayList listaClientes;


    public static boolean crearCliente(Cliente c){
        listaClientes.add(c);
        return true;
    }
}
