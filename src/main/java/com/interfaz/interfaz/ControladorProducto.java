package com.interfaz.interfaz;

import javafx.animation.PauseTransition;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.util.Duration;

public class ControladorProducto extends ControladorPrincipal{
    @FXML
    private ComboBox combo;
    @FXML
    private CheckBox checkBox;
    @FXML
    private RadioButton radio;
    @FXML
    private TextField nombre;
    @FXML
    private DatePicker date;
    @FXML
    private TextArea textArea;

    @FXML
    protected void inicializar(){
        String[] opciones = {"a","b"};
        combo.setPromptText("aaaaaaaaaaa");
        combo.setItems(FXCollections.observableArrayList(opciones));
    }
    @FXML
    protected void onConfirmarAltaClick(ActionEvent event) {
        mensajeConfirmar.setOpacity(1);
        mensajeConfirmar.setDisable(false);
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
        Producto p=new Producto(nombre.getText(),);
        HelloApplication.getModelo().busquedaDatos(p);
    }
}
