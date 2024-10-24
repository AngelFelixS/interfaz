package com.interfaz.interfaz;

import java.util.Objects;

public class Proveedor {
    private String nif;
    private String nombreEmpresa;
    private String sector;
    private boolean tipoEmpresa;
    private boolean tasaTransporte;
    private String fechaCreacionEmpresa;
    private String datosExtra;


    public Proveedor(String nif, String nombreEmpresa, String sector, boolean tipoEmpresa, boolean tasaTransporte, String fechaCreacionEmpresa, String datosExtra) {
        this.nif=nif;
        this.nombreEmpresa = nombreEmpresa;
        this.sector = sector;
        this.tipoEmpresa = tipoEmpresa;
        this.tasaTransporte = tasaTransporte;
        this.fechaCreacionEmpresa = fechaCreacionEmpresa;
        this.datosExtra = datosExtra;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Proveedor proveedor = (Proveedor) o;
        return Objects.equals(nif, proveedor.nif);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nif);
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
