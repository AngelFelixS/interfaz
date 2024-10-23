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
    private TextArea datosExtra;
    @FXML
    protected void inicializar(){
        String[] opciones = {"Si","No"};
        esEmpleado.setItems(FXCollections.observableArrayList(opciones));
    }

    @FXML
    protected void onConfirmarClick(ActionEvent event) {
        Label mensajeLabel = new Label("Cliente dado de alta con éxito");
        mensajeConfirmar.getChildren().add(mensajeLabel);
        Cliente c=new Cliente(nombre.getText(),dni.getText(),esEmpleado.getValue().toString(),hombre.isSelected(), correoElectronico.getText(),fechaNacimiento.getValue().toString(),jubilado.isSelected(),datosExtra.getText());
        HelloApplication.getModelo().darAlta(c);
        PauseTransition pause = new PauseTransition(Duration.seconds(1));
        pause.setOnFinished(e -> {
            mensajeConfirmar.getChildren().remove(mensajeLabel);
            mensajeConfirmar.getParent().setOpacity(0);
            mensajeConfirmar.getParent().setDisable(true);
        });
        pause.play();
    }

    @FXML
    protected void onBuscar(){
        Cliente c=null;
        HelloApplication.getModelo().busquedaDatos(c);
    }
}
