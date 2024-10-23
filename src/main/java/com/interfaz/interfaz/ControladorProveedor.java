package com.interfaz.interfaz;

import javafx.animation.PauseTransition;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.util.Duration;



public class ControladorProveedor extends ControladorPrincipal{
    @FXML
    private CheckBox tasaTrasnporte;
    @FXML
    private RadioButton SA ;
    @FXML
    private ChoiceBox sectorProv;
    @FXML
    private TextField NIF ;
    @FXML
    private Button volver;
    @FXML
    private TextField nombreEmpresa;
    @FXML
    private ToggleGroup toggleGroup;
    @FXML
    private TextField datosExtra;
    @FXML
    private DatePicker date;
    @FXML
    private TextField nombreProducto;

    @FXML
    protected void inicializar(){
        String[] opciones = {"Primario","Secundario","Terciario"};
        sectorProv.setItems(FXCollections.observableArrayList(opciones));
    }

    @FXML
    protected void onConfirmarAltaClick(ActionEvent event) {
        mensajeConfirmar.setOpacity(1);
        mensajeConfirmar.setDisable(false);
        Proveedor pr = new Proveedor(nombreEmpresa.getText(),(String) sectorProv.getValue(), SA.isSelected(), tasaTrasnporte.isSelected(), (date.getValue() != null) ? date.getValue().toString() : "", datosExtra.getText());
        HelloApplication.getModelo().darAlta(pr);
        PauseTransition pause = new PauseTransition(Duration.seconds(1));
        pause.setOnFinished(e -> {
            mensajeConfirmar.setOpacity(0);
            mensajeConfirmar.setDisable(true);
            mensajeConfirmar.getParent().setOpacity(0);
            mensajeConfirmar.getParent().setDisable(true);
        });
        pause.play();
    }
}
