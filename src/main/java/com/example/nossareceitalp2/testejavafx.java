package com.example.nossareceitalp2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class testejavafx extends Application {

    @Override
    public void start(Stage stage) {
        Label label = new Label("Olá, JavaFX!");

        Scene scene = new Scene(label, 300, 200);

        stage.setScene(scene);
        stage.setTitle("Teste");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}