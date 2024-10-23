package com.interfaz.interfaz;

import javafx.animation.PauseTransition;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class ControladorCliente extends ControladorPrincipal {
    @FXML
    private ComboBox esEmpleado;
    @FXML
    protected void inicializar(){
        String[] opciones = {"Si","No"};
        esEmpleado.setItems(FXCollections.observableArrayList(opciones));
    }

    @FXML
    protected void onConfirmarClick(ActionEvent event) {
        Label mensajeLabel = new Label("Cliente dado de alta con éxito");
        mensajeConfirmar.getChildren().add(mensajeLabel);
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
