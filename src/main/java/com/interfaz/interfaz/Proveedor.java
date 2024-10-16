package com.interfaz.interfaz;

public class Proveedor {
    private String nombreEmpresa;
    private String sector;
    private boolean tipoEmpresa;
    private boolean tasaTransporte;
    private String fechaCreacionEmpresa;
    private String datosExtra;

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public String getSector() {
        return sector;
    }

    public boolean isTipoEmpresa() {
        return tipoEmpresa;
    }

    public boolean isTasaTransporte() {
        return tasaTransporte;
    }

    public String getDatosExtra() {
        return datosExtra;
    }

    public String getFechaCreacionEmpresa() {
        return fechaCreacionEmpresa;
    }
}
