package com.interfaz.interfaz;

import javafx.animation.PauseTransition;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

import java.io.IOException;


public class ControladorProveedor extends ControladorPrincipal{
    @FXML
    private Button cancelarButton;
    @FXML
    private Button confirmarButton;
    @FXML
    public VBox confirmarBaja;
    @FXML
    private Button consulta;
    @FXML
    private CheckBox tasaTrasnporte;
    @FXML
    private RadioButton SA ;
    @FXML
    private ComboBox sectorProv;
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

    private Modelo modelo= App.getModelo();


    @FXML
    protected void inicializar(){
        String[] opciones = {"Primario","Secundario","Terciario"};
        sectorProv.setItems(FXCollections.observableArrayList(opciones));
    }

    @FXML
    protected void onConfirmarAltaClick(ActionEvent event) {
        mensajeConfirmar.setOpacity(1);
        mensajeConfirmar.setDisable(false);
        Proveedor pr = new Proveedor(NIF.getText() ,nombreEmpresa.getText(),(String) sectorProv.getValue(), SA.isSelected(), tasaTrasnporte.isSelected(), (date.getValue() != null) ? date.getValue().toString() : "", datosExtra.getText());
        App.getModelo().darAlta(pr);
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
        Proveedor pr = new Proveedor(NIF.getText() ,nombreEmpresa.getText(),(String) sectorProv.getValue(), SA.isSelected(), tasaTrasnporte.isSelected(), (date.getValue() != null) ? date.getValue().toString() : "", datosExtra.getText());
    }
    @FXML
    protected void onModificarProveedorClick(ActionEvent event) {

        String nifActual = NIF.getText();
        Proveedor proveedorActual = null;

        for (Proveedor proveedor : modelo.getListaProveedor()) {
            if (proveedor.getNif().equals(nifActual)) {
                proveedorActual = proveedor;
                break;
            }
        }

        if (proveedorActual != null) {

            Proveedor proveedorModificado = new Proveedor(
                    NIF.getText(),
                    nombreEmpresa.getText(),
                    (String) sectorProv.getValue(),
                    SA.isSelected(),
                    tasaTrasnporte.isSelected(),
                    (date.getValue() != null) ? date.getValue().toString() : "",
                    datosExtra.getText()
            );


            modelo.modificarDatos(proveedorActual, proveedorModificado);

            mensajeConfirmar.setOpacity(1);
            mensajeConfirmar.setDisable(false);
            PauseTransition pause = new PauseTransition(Duration.seconds(1));
            pause.setOnFinished(e -> {
                mensajeConfirmar.setOpacity(0);
                mensajeConfirmar.setDisable(true);
            });
            pause.play();
        } else {
            System.out.println("Proveedor no encontrado");
        }
    }
    @FXML
    private void onConsultaClick(ActionEvent event) {
        App.cambiarScene("consultaProveedores.fxml");
    }
    @FXML
    private void onModificarClick(ActionEvent event) {
        App.cambiarScene("modificarProveedores.fxml");
    }

    @FXML
    protected void darBajaProveedor() {
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
