package com.interfaz.interfaz;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader principalLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene principal = new Scene(principalLoader.load(), 1280, 720);
        stage.setTitle("App");
        stage.setScene(principal);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}