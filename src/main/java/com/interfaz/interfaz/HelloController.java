package com.interfaz.interfaz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.Window;

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
    protected void onMenuClick(ActionEvent event) {
        String src=event.getSource().toString();
        String id=src.split("=")[1].split(",")[0];
        switch (id){
            case "menuProductos"->{
                if (menuProductos1.getOpacity()!=1) {
                    menuProductos1.setOpacity(1);
                    menuProductos2.setOpacity(1);
                } else {
                    menuProductos1.setOpacity(0);
                    menuProductos2.setOpacity(0);
                }
            }
            case "menuClientes"->{
                if (menuClientes1.getOpacity()!=1) {
                    menuClientes1.setOpacity(1);
                    menuClientes2.setOpacity(1);
                } else {
                    menuClientes1.setOpacity(0);
                    menuClientes2.setOpacity(0);
                }
            }
            case "menuProveedores"->{
                if (menuProveedores1.getOpacity()!=1) {
                    menuProveedores1.setOpacity(1);
                    menuProveedores2.setOpacity(1);
                } else {
                    menuProveedores1.setOpacity(0);
                    menuProveedores2.setOpacity(0);
                }
            }
        }
    }

    @FXML
    protected void onClickOpcion(ActionEvent event){
        String src=event.getSource().toString();
        String id=src.split("=")[1].split(",")[0];
        switch (id){
            case "menuProductos1"->HelloApplication.cambiarScene("darAltaProductos.fxml");
            case "menuProductos2"->HelloApplication.cambiarScene("busquedaProductos.fxml");
            case "menuClientes1"->HelloApplication.cambiarScene("darAltaClientes.fxml");
            case "menuClientes2"->HelloApplication.cambiarScene("busquedaClientes.fxml");
            case "menuProveedores1"->HelloApplication.cambiarScene("darAltaProveedor.fxml");
            case "menuProveedores2"->HelloApplication.cambiarScene("busquedaProveedores.fxml");
        }
    }
}