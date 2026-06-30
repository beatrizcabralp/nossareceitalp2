package com.example.nossareceitalp2;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import com.example.nossareceitalp2.model.Receita;
import com.example.nossareceitalp2.model.TipoComida;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;
import java.io.IOException;

//Back-end

import com.example.nossareceitalp2.model.Receita;

import com.example.nossareceitalp2.service.ReceitaService;

import java.util.List;

public class GerenciarReceitasController {

    //Back-end

    private final ReceitaService receitaService =
            ReceitaService.getInstance();

    private List<Receita> receitas;

    // --- ATRIBUTOS (IDs dos ScrollPanes da tela de Gerenciar)

    //Front-end

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

    // NAVEGAÇÃO DA NAVBAR

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

    // --- CARREGAMENTO DAS RECEITAS ---

    @FXML
    public void initialize() {

        receitas = receitaService.listarReceitas();

        for (Receita receita : receitas) {

            adicionarCardNaCategoria(receita);

        }

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

    @FXML
    private void abrirEditarReceita(Receita receita) {

        try {

            FXMLLoader loader =
                    new FXMLLoader(
                            getClass().getResource("EditarReceita.fxml")
                    );

            Parent root = loader.load();

            EditarReceitaController controller =
                    loader.getController();

            controller.carregarReceita(receita);

            Stage stage = new Stage();

            stage.setScene(new Scene(root));

            stage.show();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

    private VBox criarCardReceita(Receita receita) {

        VBox card = new VBox();
        card.setSpacing(5);
        card.setAlignment(javafx.geometry.Pos.CENTER);

        ImageView imagem = new ImageView();

        imagem.setFitWidth(125);
        imagem.setFitHeight(100);
        imagem.setPreserveRatio(true);

        try {

            if (receita.getFotoPerfil() != null) {

                imagem.setImage(
                        new Image("file:" + receita.getFotoPerfil())
                );

            }

        } catch (Exception e) {

            // caso a imagem não exista,
            // simplesmente deixa vazio

        }

        Button editar = new Button("🖉");

        editar.setOnAction(event -> {

            abrirEditarReceita(receita);

        });

        Label titulo = new Label(receita.getTitulo());

        card.getChildren().addAll(imagem, editar, titulo);

        return card;

    }

    private void adicionarCardNaCategoria(Receita receita) {

        VBox card = criarCardReceita(receita);

        switch (receita.getTipoComida()) {

            case SOBREMESA:

                ((HBox) scrollsobremesas.getContent())
                        .getChildren()
                        .add(card);

                break;

            case SALGADO:

                ((HBox) scrollsalgado.getContent())
                        .getChildren()
                        .add(card);

                break;

            case VEGANO:

                ((HBox) scrollvegan.getContent())
                        .getChildren()
                        .add(card);

                break;

            case MASSAS:

                ((HBox) scrollmassa.getContent())
                        .getChildren()
                        .add(card);

                break;

            case CHURRASCO:

                ((HBox) scrollchurrasco.getContent())
                        .getChildren()
                        .add(card);

                break;

        }

    }

}