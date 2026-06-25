package com.example.nossareceitalp2;

import com.example.nossareceitalp2.model.Receita;
import com.example.nossareceitalp2.model.TipoComida;
import com.example.nossareceitalp2.service.ReceitaService;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.ComboBox;

public class AdicionarReceitaController {

    //Back-end

    private final ReceitaService receitaService =
            ReceitaService.getInstance();

    @FXML
    private TextField tituloField;

    @FXML
    private TextArea ingredientesArea;

    @FXML
    private TextArea preparoArea;

    @FXML
    private ComboBox<TipoComida> tipoComboBox;

    private String caminhoFotoPerfil;
    private String caminhoCapa;

    //Carregar as outras telas da navabar ao clicar em um de seus botoes  (Front-end)

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

    //Back-end

    @FXML
    public void adicionarReceita() {

        Receita receita = new Receita(
                tituloField.getText(),
                ingredientesArea.getText(),
                preparoArea.getText(),
                caminhoFotoPerfil,
                caminhoCapa,
                tipoComboBox.getValue()
        );

        receitaService.adicionarReceita(receita);
    }
}