package com.interfaz.interfaz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Button menuProductos;
    @FXML
    private Button menuClientes;
    @FXML
    private Button menuProveedores;
    @FXML
    private Button menuProveedores1;
    @FXML
    private Button menuProveedores2;
    @FXML
    private Button menuProductos1;
    @FXML
    private Button menuProductos2;
    @FXML
    private Button menuClientes1;
    @FXML
    private Button menuClientes2;

    @FXML
    protected void onHelloButtonClick() {
        menuClientes.setText("Welcome to JavaFX Application!");
        menuProductos.setText("ewwseds");
        menuProveedores.setOpacity(0);
    }

    @FXML
    protected void onMouseOver(){
        menuProveedores1.setOpacity(1);
        menuProveedores2.setOpacity(1);
    }

    @FXML
    protected void onMouseExited(){
        menuProveedores1.setOpacity(0);
        menuProveedores2.setOpacity(0);
    }
}