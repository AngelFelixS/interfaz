package com.interfaz.interfaz;

public class Cliente {
    private String nombre;
    private String dni;
    private String empleado;
    private boolean sexo;
    private String correoElectronico;
    private String fechaNacimiento;
    private boolean jubilado;
    private String datosExtra;

    public Cliente(String nombre, String dni, String empleado, boolean sexo, String correoElectronico, String fechaNacimiento, boolean jubilado, String datosExtra) {
        this.nombre = nombre;
        this.dni = dni;
        this.empleado = empleado;
        this.sexo = sexo;
        this.correoElectronico = correoElectronico;
        this.fechaNacimiento = fechaNacimiento;
        this.jubilado = jubilado;
        this.datosExtra = datosExtra;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setJubilado(boolean jubilado) {
        this.jubilado = jubilado;
    }

    public void setDatosExtra(String datosExtra) {
        this.datosExtra = datosExtra;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getEmpleado() {
        return empleado;
    }

    public boolean isSexo() {
        return sexo;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public boolean isJubilado() {
        return jubilado;
    }

    public String getDatosExtra() {
        return datosExtra;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", empleado='" + empleado + '\'' +
                ", sexo=" + sexo +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", jubilado=" + jubilado +
                ", datosExtra='" + datosExtra + '\'' +
                '}';
    }
}
