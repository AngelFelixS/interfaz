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
}
