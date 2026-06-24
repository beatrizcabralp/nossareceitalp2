package com.example.nossareceitalp2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class AdicionarReceitaController {

    //Carregar as outras telas da navabar ao clicar em um de seus botoes

    @FXML
    public void voltarParaMain(javafx.event.ActionEvent event) throws java.io.IOException {

        javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(getClass().getResource("main.fxml"));
        javafx.scene.Parent root = loader.load();

        javafx.stage.Stage stage = (javafx.stage.Stage)((javafx.scene.Node)event.getSource()).getScene().getWindow();
        stage.setScene(new javafx.scene.Scene(root));
        stage.show();
    }
    @FXML
    public void irParaGerenciarReceitas(javafx.event.ActionEvent event) throws java.io.IOException {

        javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(getClass().getResource("GerenciarReceitas.fxml"));
        javafx.scene.Parent root = loader.load();

        javafx.stage.Stage stage = (javafx.stage.Stage)((javafx.scene.Node)event.getSource()).getScene().getWindow();
        stage.setScene(new javafx.scene.Scene(root));
        stage.show();
    }

    @FXML
    public void abrirModalAdicionarReceita(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("ModalAdicionarReceita.fxml")
        );

        Parent root = loader.load();

        Stage stage = new Stage();
        stage.setTitle("Adicionar Receita");
        stage.setScene(new Scene(root));

        // --- ESSA LINHA É O SEGREDO ---
        // Vincula a tela atual como "dona" do modal que vai abrir
        Stage windowParent = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.initOwner(windowParent);

        stage.show();
    }
}