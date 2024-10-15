package com.interfaz.interfaz;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    public Button menuProductos;
    public Button menuClientes;
    public Button menuProveedores;
    @FXML
    private Label welcomeText;
    @FXML
    private Button button;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        button.setText("ewwseds");
    }
}