package com.example.nossareceitalp2;

import javafx.fxml.FXML;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainController {

    @FXML
    private ImageView ImagemBoloDeCenoura;

    @FXML
    private ScrollPane scrollsobremesas;

    @FXML
    private ScrollPane scrollsalgado;

    @FXML
    private ScrollPane scrollvegan;

    @FXML
    private ScrollPane scrollmassa;

    @FXML
    private ScrollPane scrollchurrasco;



    @FXML
    public void initialize() {

        Image imagem =
                new Image(
                        getClass().getResourceAsStream("/imagens/bolodecenoura.jpg")
                );

        ImagemBoloDeCenoura.setImage(imagem);
    }

    @FXML
    private void moverdireitasobremesa() {

        System.out.println("Clicou direita");

        double posicaoAtual = scrollsobremesas.getHvalue();

        scrollsobremesas.setHvalue(posicaoAtual + 0.2);
    }

    @FXML
    private void moveresquerdasobremesa() {

        System.out.println("Clicou esquerda");

        double posicaoAtual = scrollsobremesas.getHvalue();

        scrollsobremesas.setHvalue(posicaoAtual - 0.2);
    }

    @FXML
    private void moverdireitasalgado() {

        System.out.println("Clicou direita");

        double posicaoAtual = scrollsalgado.getHvalue();

        scrollsalgado.setHvalue(posicaoAtual + 0.2);
    }

    @FXML
    private void moveresquerdasalgado() {

        System.out.println("Clicou esquerda");

        double posicaoAtual = scrollsalgado.getHvalue();

        scrollsalgado.setHvalue(posicaoAtual - 0.2);
    }

    @FXML
    private void moverdireitavegan() {

        System.out.println("Clicou direita");

        double posicaoAtual = scrollvegan.getHvalue();

        scrollvegan.setHvalue(posicaoAtual + 0.2);
    }

    @FXML
    private void moveresquerdavegan() {

        System.out.println("Clicou esquerda");

        double posicaoAtual = scrollvegan.getHvalue();

        scrollvegan.setHvalue(posicaoAtual - 0.2);
    }

    @FXML
    private void moverdireitamassa() {

        System.out.println("Clicou direita");

        double posicaoAtual = scrollmassa.getHvalue();

        scrollmassa.setHvalue(posicaoAtual + 0.2);
    }

    @FXML
    private void moveresquerdamassa() {

        System.out.println("Clicou esquerda");

        double posicaoAtual = scrollmassa.getHvalue();

        scrollmassa.setHvalue(posicaoAtual - 0.2);
    }

    @FXML
    private void moverdireitachurrasco() {

        System.out.println("Clicou direita");

        double posicaoAtual = scrollchurrasco.getHvalue();

        scrollchurrasco.setHvalue(posicaoAtual + 0.2);
    }

    @FXML
    private void moveresquerdachurrasco() {

        System.out.println("Clicou esquerda");

        double posicaoAtual = scrollchurrasco.getHvalue();

        scrollchurrasco.setHvalue(posicaoAtual - 0.2);
    }




}