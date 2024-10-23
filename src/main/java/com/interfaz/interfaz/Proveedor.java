package com.interfaz.interfaz;

public class Proveedor {
    private String nombreEmpresa;
    private String sector;
    private boolean tipoEmpresa;
    private boolean tasaTransporte;
    private String fechaCreacionEmpresa;
    private String datosExtra;


    public Proveedor(String nombreEmpresa, String sector, boolean tipoEmpresa, boolean tasaTransporte, String fechaCreacionEmpresa, String datosExtra) {
        this.nombreEmpresa = nombreEmpresa;
        this.sector = sector;
        this.tipoEmpresa = tipoEmpresa;
        this.tasaTransporte = tasaTransporte;
        this.fechaCreacionEmpresa = fechaCreacionEmpresa;
        this.datosExtra = datosExtra;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public void setTipoEmpresa(boolean tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    public void setTasaTransporte(boolean tasaTransporte) {
        this.tasaTransporte = tasaTransporte;
    }

    public void setFechaCreacionEmpresa(String fechaCreacionEmpresa) {
        this.fechaCreacionEmpresa = fechaCreacionEmpresa;
    }

    public void setDatosExtra(String datosExtra) {
        this.datosExtra = datosExtra;
    }

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

    @Override
    public String toString() {
        return "Proveedor{" +
                "nombreEmpresa='" + nombreEmpresa + '\'' +
                ", sector='" + sector + '\'' +
                ", tipoEmpresa=" + tipoEmpresa +
                ", tasaTransporte=" + tasaTransporte +
                ", fechaCreacionEmpresa='" + fechaCreacionEmpresa + '\'' +
                ", datosExtra='" + datosExtra + '\'' +
                '}';
    }
}
