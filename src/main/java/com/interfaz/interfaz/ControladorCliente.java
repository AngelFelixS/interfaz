package com.interfaz.interfaz;

import javafx.animation.PauseTransition;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.util.Duration;


public class ControladorCliente extends ControladorPrincipal {
    @FXML
    public VBox confirmarBaja;
    @FXML
    private Button cancelarButton;
    @FXML
    private Button confirmarButton;
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
    private Modelo modelo= App.getModelo();
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
        App.getModelo().darAlta(c);
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
        confirmarBaja.setOpacity(1);
        confirmarBaja.setDisable(false);
        cancelarButton.setOnAction(e -> ocultarConfirmacion());
        confirmarButton.setOnAction(e -> {ocultarConfirmacion();
        });
    }
    private void ocultarConfirmacion() {
        PauseTransition pause = new PauseTransition(Duration.seconds(1));
        pause.setOnFinished(e -> {
            confirmarBaja.setOpacity(0);
            confirmarBaja.setDisable(true);
            confirmarBaja.getParent().setOpacity(0);
            confirmarBaja.getParent().setDisable(true);
        });
        pause.play();
    }

}
