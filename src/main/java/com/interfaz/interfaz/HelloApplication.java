package com.interfaz.interfaz;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private static Stage stage;

    @Override
    public void start(Stage stage) throws IOException {
        this.stage=stage;
        FXMLLoader principalLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene principal = new Scene(principalLoader.load(), 1280, 720);
        stage.setTitle("App");
        stage.setScene(principal);
        stage.show();
    }

    public static void cambiarScene(String fxml){
        FXMLLoader nuevoLoader=new FXMLLoader(HelloApplication.class.getResource(fxml));
        try {
            stage.getScene().setRoot(nuevoLoader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}