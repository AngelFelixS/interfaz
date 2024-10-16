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
