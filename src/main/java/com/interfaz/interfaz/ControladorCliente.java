package com.interfaz.interfaz;

import javafx.animation.PauseTransition;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.util.Duration;


public class ControladorCliente extends ControladorPrincipal {

    public VBox confirmarBaja;
    @FXML
    private ComboBox esEmpleado;
    @FXML
    private CheckBox jubilado;
    @FXML
    private RadioButton hombre;
    @FXML
    private RadioButton mujer;
    @FXML
    private TextField nombre;
    @FXML
    private TextField dni;
    @FXML
    private TextField correoElectronico;
    @FXML
    private DatePicker fechaNacimiento;
    @FXML
    private TextField datos;
    @FXML
    private VBox mensajeAltaCliente;
    private Modelo modelo=HelloApplication.getModelo();
    @FXML
    protected void inicializar(){
        String[] opciones = {"Si","No"};
        esEmpleado.setItems(FXCollections.observableArrayList(opciones));
    }

    @FXML
    protected void onConfirmarClick(ActionEvent event) {
        mensajeAltaCliente.setOpacity(1);
        mensajeAltaCliente.setDisable(false);
        Cliente c=new Cliente(nombre.getText(),dni.getText(),esEmpleado.getValue().toString(),hombre.isSelected(), correoElectronico.getText(),fechaNacimiento.getValue().toString(),jubilado.isSelected(),datos.getText());
        HelloApplication.getModelo().darAlta(c);
        PauseTransition pause = new PauseTransition(Duration.seconds(1));
        pause.setOnFinished(e -> {
            mensajeAltaCliente.setOpacity(0);
            mensajeAltaCliente.setDisable(true);
            mensajeAltaCliente.getParent().setOpacity(0);
            mensajeAltaCliente.getParent().setDisable(true);
        });
        pause.play();
    }

    @FXML
    protected void onBuscar(){
        Cliente c=new Cliente(nombre.getText(),dni.getText(),esEmpleado.getValue().toString(),hombre.isSelected(), correoElectronico.getText(),fechaNacimiento.getValue().toString(),jubilado.isSelected(),datos.getText());
    }

    @FXML
    protected void darBajaCliente() {
        String dniActual = dni.getText();  // Obtenemos el DNI ingresado.
        Cliente clienteAEliminar = null;


        for (Cliente cliente : modelo.getListaClientes()) {
            if (cliente.getDni().equals(dniActual)) {
                clienteAEliminar = cliente;
                break;
            }
        }

        if (clienteAEliminar != null) {
            modelo.darBaja(clienteAEliminar);
            System.out.println("Cliente eliminado: " + clienteAEliminar);

            confirmarBaja.setOpacity(1);
            confirmarBaja.setDisable(false);

            PauseTransition pause = new PauseTransition(Duration.seconds(1.5));  // Tiempo de visualización del mensaje
            pause.setOnFinished(e -> {
                confirmarBaja.setOpacity(0);
                confirmarBaja.setDisable(true);
            });
            pause.play();
        } else {
            System.out.println("Cliente no encontrado con DNI: " + dniActual);

        }
    }

}
