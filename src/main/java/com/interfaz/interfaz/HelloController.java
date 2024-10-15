package com.interfaz.interfaz;

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
    protected void onHelloButtonClick() {
        menuClientes.setText("Welcome to JavaFX Application!");
        menuProductos.setText("ewwseds");
        menuProveedores.setOpacity(0);
    }

    @FXML
    protected void onMouseOver(){
        menuProveedores.setOpacity(1);
    }
}