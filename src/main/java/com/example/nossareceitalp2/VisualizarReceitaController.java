package com.example.nossareceitalp2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

//Back-end

import com.example.nossareceitalp2.model.Receita;
import com.example.nossareceitalp2.service.ReceitaService;

public class VisualizarReceitaController {

    private final ReceitaService receitaService =
            ReceitaService.getInstance();

    private Receita receitaAtual;

    //Front-end

    // metodos que vao me permitir sair da tela visualizar receita e ir para as outras telas, as que
    // tem botoes na navbar: main, gerenciar receitas e adicionar receitas.

    @FXML
    public void voltarParaMain(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    public void irParaGerenciarReceitas(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("GerenciarReceitas.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    public void irParaAdicionarReceitas(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AdicionarReceita.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    //Back-end

    public void setReceita(Receita receita) {
        this.receitaAtual = receita;
    }

    public Receita getReceitaAtual() {
        return receitaAtual;
    }
}