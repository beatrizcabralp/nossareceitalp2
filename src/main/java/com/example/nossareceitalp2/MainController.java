package com.example.nossareceitalp2;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainController {

    @FXML
    private ImageView ImagemBoloDeCenoura;

    @FXML
    public void initialize() {

        System.out.println(
                getClass().getResource("/imagens/bolodecenoura.jpg")
        );

        Image imagem =
                new Image(
                        getClass().getResourceAsStream("/imagens/bolodecenoura.jpg")
                );

        ImagemBoloDeCenoura.setImage(imagem);
    }
}