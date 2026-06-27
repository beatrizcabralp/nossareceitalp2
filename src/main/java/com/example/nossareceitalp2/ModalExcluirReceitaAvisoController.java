package com.example.nossareceitalp2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ModalExcluirReceitaAvisoController {

    @FXML
    public void cancelarAviso(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    public void abrirModalExcluirReceita(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("ModalExcluirReceita.fxml")
        );

        Parent root = loader.load();

        Stage stage = new Stage();

        stage.setTitle("Apagar Receita");
        stage.setScene(new Scene(root));

        stage.show();
    }
}