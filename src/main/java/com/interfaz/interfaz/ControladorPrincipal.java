package com.interfaz.interfaz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class   ControladorPrincipal {
    @FXML
    private ImageView logo;
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
    protected VBox mensajeConfirmar;
    @FXML
    protected Pane paneActivo;
    private boolean yaHayInterfaz=false;

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
        logo.setOpacity(0);
        logo.setDisable(true);
        if (!yaHayInterfaz) {
            switch (id) {
                case "menuProductos1" -> {
                    altaProductos.setOpacity(1);
                    altaProductos.setDisable(false);
                    paneActivo=altaProductos;
                }
                case "menuProductos2" -> {
                    busquedaProductos.setOpacity(1);
                    busquedaProductos.setDisable(false);
                    paneActivo=busquedaProductos;
                }
                case "menuClientes1" -> {
                    altaClientes.setOpacity(1);
                    altaClientes.setDisable(false);
                    paneActivo=altaClientes;
                }
                case "menuClientes2" -> {
                    busquedaClientes.setOpacity(1);
                    busquedaClientes.setDisable(false);
                    paneActivo=busquedaClientes;
                }
                case "menuProveedores1" -> {
                    altaProveedores.setOpacity(1);
                    altaProveedores.setDisable(false);
                    paneActivo=altaProveedores;
                }
                case "menuProveedores2" -> {
                    busquedaProveedores.setOpacity(1);
                    busquedaProveedores.setDisable(false);
                    paneActivo=busquedaProveedores;
                }
            }
            yaHayInterfaz=true;
        } else {
            paneActivo.setOpacity(0);
            paneActivo.setDisable(true);
            yaHayInterfaz=false;
            onClickOpcion(event);
        }
    }

    @FXML
    protected void onClickVolver(ActionEvent event){
        Button botonPulsado=(Button) event.getSource();
        botonPulsado.getParent().setOpacity(0);
        botonPulsado.getParent().setDisable(true);
        yaHayInterfaz=false;
    }
}