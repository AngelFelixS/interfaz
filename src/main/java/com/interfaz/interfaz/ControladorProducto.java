package com.interfaz.interfaz;

import javafx.animation.PauseTransition;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.util.Duration;

import java.io.IOException;

import static com.interfaz.interfaz.App.stage;

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
    private Modelo modelo= App.getModelo();

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
    protected void onBuscar(ActionEvent event){
        //NO FUNCIONA POSIBLEMENTE
        Producto p=new Producto(nombre.getText(),tipoProducto.getValue().toString(),procedenciaEur.isSelected(),fechaProd.getValue().toString(),iva.isSelected(),desc.getText());
        modelo.insertarPosicionLista(p,modelo.busquedaDatos(p));
    }

    public static void cambiarScene(String fxml){
        FXMLLoader nuevoLoader=new FXMLLoader(App.class.getResource(fxml));
        try {
            stage.getScene().setRoot(nuevoLoader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
