package com.interfaz.interfaz;

import javafx.animation.PauseTransition;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.util.Duration;


public class ControladorCliente extends ControladorPrincipal {
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
    private Modelo modelo=HelloApplication.getModelo();
    @FXML
    protected void inicializar(){
        String[] opciones = {"Si","No"};
        esEmpleado.setItems(FXCollections.observableArrayList(opciones));
    }

    @FXML
    protected void onConfirmarClick(ActionEvent event) {
        mensajeConfirmar.setOpacity(1);
        mensajeConfirmar.setDisable(false);
        Cliente c=new Cliente(nombre.getText(),dni.getText(),esEmpleado.getValue().toString(),hombre.isSelected(), correoElectronico.getText(),fechaNacimiento.getValue().toString(),jubilado.isSelected(),datos.getText());
        HelloApplication.getModelo().darAlta(c);
        PauseTransition pause = new PauseTransition(Duration.seconds(1));
        pause.setOnFinished(e -> {
            mensajeConfirmar.setOpacity(0);
            mensajeConfirmar.setDisable(true);
            mensajeConfirmar.getParent().setOpacity(0);
            mensajeConfirmar.getParent().setDisable(true);
        });
        pause.play();
    }

    @FXML
    protected void onBuscar(){
        Cliente c=new Cliente(nombre.getText(),dni.getText(),esEmpleado.getValue().toString(),hombre.isSelected(), correoElectronico.getText(),fechaNacimiento.getValue().toString(),jubilado.isSelected(),datos.getText());
    }

    @FXML
    protected void darBajaCliente(){
        String dniActual = dni.getText();
        Cliente c = null;
        /*for (Cliente cliente : modelo.getListaClientes) {

        }



        HelloApplication.getModelo().darBaja();*/
    }
}
