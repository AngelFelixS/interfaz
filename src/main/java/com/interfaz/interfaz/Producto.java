package com.interfaz.interfaz;

public class Producto {
    private String nombre;
    private String tipoProducto;
    private boolean procedenciaEur;
    private boolean tieneIva;
    private String fechaProduccion;
    private String descripcionProducto;

    public Producto(String nombre, String tipoProducto, boolean procedencia, String fechaProduccion, boolean tieneIva, String descripcionProducto) {
        this.nombre = nombre;
        this.tipoProducto = tipoProducto;
        this.procedenciaEur = procedencia;
        this.fechaProduccion = fechaProduccion;
        this.tieneIva = tieneIva;
        this.descripcionProducto = descripcionProducto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public void setProcedenciaEur(boolean procedenciaEur) {
        this.procedenciaEur = procedenciaEur;
    }

    public void setTieneIva(boolean tieneIva) {
        this.tieneIva = tieneIva;
    }

    public void setFechaProduccion(String fechaProduccion) {
        this.fechaProduccion = fechaProduccion;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public boolean isProcedenciaEur() {
        return procedenciaEur;
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

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", tipoProducto='" + tipoProducto + '\'' +
                ", procedenciaEur=" + procedenciaEur +
                ", tieneIva=" + tieneIva +
                ", fechaProduccion='" + fechaProduccion + '\'' +
                ", descripcionProducto='" + descripcionProducto + '\'' +
                '}';
    }
}
