package com.example.nossareceitalp2;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import java.io.IOException;

public class GerenciarReceitasController {

    //Carregar as outras telas da navabar ao clicar em um de seus botoes

    @FXML
    public void voltarParaMain(ActionEvent event) throws IOException {

        javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(getClass().getResource("main.fxml"));
        javafx.scene.Parent root = loader.load();

        javafx.stage.Stage stage = (javafx.stage.Stage)((javafx.scene.Node)event.getSource()).getScene().getWindow();
        stage.setScene(new javafx.scene.Scene(root));
        stage.show();
    }

    @FXML
    public void irParaAdicionarReceita(javafx.event.ActionEvent event) throws java.io.IOException {

        javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(getClass().getResource("AdicionarReceita.fxml"));
        javafx.scene.Parent root = loader.load();

        javafx.stage.Stage stage = (javafx.stage.Stage)((javafx.scene.Node)event.getSource()).getScene().getWindow();
        stage.setScene(new javafx.scene.Scene(root));
        stage.show();
    }
}
