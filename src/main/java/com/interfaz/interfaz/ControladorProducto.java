package com.interfaz.interfaz;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.util.Duration;

public class ControladorProducto extends ControladorPrincipal{
    @FXML
    private CheckBox checkBox;
    @FXML
    private RadioButton radio;
    @FXML
    private TextField text;
    @FXML
    private DatePicker date;
    @FXML
    private TextArea textArea;

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
}
