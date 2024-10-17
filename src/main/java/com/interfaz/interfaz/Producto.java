package com.interfaz.interfaz;

public class Producto {
    private String nombre;
    private String tipoProducto;
    private boolean procedencia;
    private boolean tieneIva;
    private String fechaProduccion;
    private String descripcionProducto;

    public Producto(String nombre, String tipoProducto, boolean procedencia, String fechaProduccion, boolean tieneIva, String descripcionProducto) {
        this.nombre = nombre;
        this.tipoProducto = tipoProducto;
        this.procedencia = procedencia;
        this.fechaProduccion = fechaProduccion;
        this.tieneIva = tieneIva;
        this.descripcionProducto = descripcionProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public boolean isProcedencia() {
        return procedencia;
    }

    public boolean tieneIva() {
        return tieneIva;
    }

    public String getFechaProduccion() {
        return fechaProduccion;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }
}
