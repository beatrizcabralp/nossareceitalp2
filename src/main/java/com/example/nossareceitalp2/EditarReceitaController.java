package com.example.nossareceitalp2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import com.example.nossareceitalp2.model.Receita;

public class EditarReceitaController {
    @FXML
    public void abrirExcluirReceitaAviso(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("ModalExcluirReceitaAviso.fxml")
        );

        Parent root = loader.load();

        Stage stage = new Stage();

        stage.setTitle("Apagar Receita");
        stage.setScene(new Scene(root));

        stage.show();
    }

    @FXML
    public void abrirModalEditarReceita(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("ModalEditarReceita.fxml")
        );

        Parent root = loader.load();

        Stage stage = new Stage();

        stage.setTitle("Apagar Receita");
        stage.setScene(new Scene(root));

        stage.show();
    }

    private Receita receitaAtual;


    public void carregarReceita(Receita receita){

        this.receitaAtual = receita;

    }

}
