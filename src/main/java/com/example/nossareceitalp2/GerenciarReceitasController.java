package com.example.nossareceitalp2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;
import java.io.IOException;

public class GerenciarReceitasController {

    // --- ATRIBUTOS (IDs dos ScrollPanes da tela de Gerenciar) ---
    // Certifique-se de que no fx:id de cada ScrollPane no Scene Builder esteja exatamente assim:
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


    // --- NAVEGAÇÃO DA NAVBAR ---

    @FXML
    public void voltarParaMain(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    public void irParaAdicionarReceita(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AdicionarReceita.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }


    // --- MOVIMENTAÇÃO REAL DOS CARROSSÉIS ---

    // 1. SOBREMESAS
    @FXML
    private void moverdireitasobremesa() {
        double posicaoAtual = scrollsobremesas.getHvalue();
        scrollsobremesas.setHvalue(posicaoAtual + 0.2);
    }

    @FXML
    private void moveresquerdasobremesa() {
        double posicaoAtual = scrollsobremesas.getHvalue();
        scrollsobremesas.setHvalue(posicaoAtual - 0.2);
    }

    // 2. SALGADOS
    @FXML
    private void moverdireitasalgado() {
        double posicaoAtual = scrollsalgado.getHvalue();
        scrollsalgado.setHvalue(posicaoAtual + 0.2);
    }

    @FXML
    private void moveresquerdasalgado() {
        double posicaoAtual = scrollsalgado.getHvalue();
        scrollsalgado.setHvalue(posicaoAtual - 0.2);
    }

    // 3. VEGANO
    @FXML
    private void moverdireitavegan() {
        double posicaoAtual = scrollvegan.getHvalue();
        scrollvegan.setHvalue(posicaoAtual + 0.2);
    }

    @FXML
    private void moveresquerdavegan() {
        double posicaoAtual = scrollvegan.getHvalue();
        scrollvegan.setHvalue(posicaoAtual - 0.2);
    }

    // 4. MASSAS
    @FXML
    private void moverdireitamassa() {
        double posicaoAtual = scrollmassa.getHvalue();
        scrollmassa.setHvalue(posicaoAtual + 0.2);
    }

    @FXML
    private void moveresquerdamassa() {
        double posicaoAtual = scrollmassa.getHvalue();
        scrollmassa.setHvalue(posicaoAtual - 0.2);
    }

    // 5. CHURRASCO
    @FXML
    private void moverdireitachurrasco() {
        double posicaoAtual = scrollchurrasco.getHvalue();
        scrollchurrasco.setHvalue(posicaoAtual + 0.2);
    }

    @FXML
    private void moveresquerdachurrasco() {
        double posicaoAtual = scrollchurrasco.getHvalue();
        scrollchurrasco.setHvalue(posicaoAtual - 0.2);
    }
}