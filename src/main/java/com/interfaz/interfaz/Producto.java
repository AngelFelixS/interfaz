package com.interfaz.interfaz;

public class Producto {
    private String nombre;
    private String tipoProducto;
    private boolean procedencia;
    private boolean iva;
    private String fechaProduccion;
    private String descripcionProducto;

    public String getNombre() {
        return nombre;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public boolean isProcedencia() {
        return procedencia;
    }

    public boolean isIva() {
        return iva;
    }

    public String getFechaProduccion() {
        return fechaProduccion;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }
}
