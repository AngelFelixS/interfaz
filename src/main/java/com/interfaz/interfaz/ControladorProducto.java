package com.interfaz.interfaz;

import javafx.animation.PauseTransition;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.util.Duration;

public class ControladorProducto extends ControladorPrincipal{
    @FXML
    private ComboBox tipoProducto;
    @FXML
    private CheckBox iva;
    @FXML
    private RadioButton procedenciaEur;
    @FXML
    private RadioButton procedenciaEx;
    @FXML
    private TextField nombre;
    @FXML
    private DatePicker fechaProd;
    @FXML
    private TextArea desc;
    private Modelo modelo=HelloApplication.getModelo();

    @FXML
    protected void inicializar(){
        String[] opciones = {"Ropa","Electrodomestico","Mueble"};
        tipoProducto.setItems(FXCollections.observableArrayList(opciones));
    }

    @FXML
    protected void onConfirmarAltaClick(ActionEvent event) {
        mensajeConfirmar.setOpacity(1);
        mensajeConfirmar.setDisable(false);
        Producto p=new Producto(nombre.getText(),tipoProducto.getValue().toString(),procedenciaEur.isSelected(),fechaProd.getValue().toString(),iva.isSelected(),desc.getText());
        modelo.darAlta(p);
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
        //NO FUNCIONA POSIBLEMENTE
        Producto p=new Producto(nombre.getText(),tipoProducto.getValue().toString(),procedenciaEur.isSelected(),fechaProd.getValue().toString(),iva.isSelected(),desc.getText());
        modelo.insertarPosicionLista(p,modelo.busquedaDatos(p));
    }
}
