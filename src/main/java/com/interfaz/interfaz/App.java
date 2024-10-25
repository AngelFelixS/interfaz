package com.interfaz.interfaz;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    static Stage stage;
    private static Modelo modelo;

    @Override
    public void start(Stage stage) throws IOException {
        this.stage=stage;
        this.modelo=new Modelo();
        FXMLLoader principalLoader = new FXMLLoader(App.class.getResource("menu.fxml"));
        Scene principal = new Scene(principalLoader.load(), 1280, 720);
        stage.setTitle("App");
        stage.setScene(principal);
        stage.show();
    }

    public static void cambiarScene(String fxml){
        FXMLLoader nuevoLoader=new FXMLLoader(App.class.getResource(fxml));
        try {
            stage.getScene().setRoot(nuevoLoader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }

    public static Modelo getModelo() {
        return modelo;
    }
}