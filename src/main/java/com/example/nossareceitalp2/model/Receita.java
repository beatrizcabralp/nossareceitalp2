package com.example.nossareceitalp2.model;


// Classe que representa uma receita

public class Receita {


    private String titulo;

    private String ingredientes;

    private String modoPreparo;


    private String fotoPerfil;

    private String capa;


    private TipoComida tipoComida;



    public Receita(
            String titulo,
            String ingredientes,
            String modoPreparo,
            String fotoPerfil,
            String capa,
            TipoComida tipoComida
    ) {

        this.titulo = titulo;
        this.ingredientes = ingredientes;
        this.modoPreparo = modoPreparo;
        this.fotoPerfil = fotoPerfil;
        this.capa = capa;
        this.tipoComida = tipoComida;

    }



    public String getTitulo() {
        return titulo;
    }


    public String getIngredientes() {
        return ingredientes;
    }


    public String getModoPreparo() {
        return modoPreparo;
    }


    public String getFotoPerfil() {
        return fotoPerfil;
    }


    public String getCapa() {
        return capa;
    }


    public TipoComida getTipoComida() {
        return tipoComida;
    }



    public void setTitulo(String titulo) {

        this.titulo = titulo;

    }


    public void setIngredientes(String ingredientes) {

        this.ingredientes = ingredientes;

    }


    public void setModoPreparo(String modoPreparo) {

        this.modoPreparo = modoPreparo;

    }


    public void setFotoPerfil(String fotoPerfil) {

        this.fotoPerfil = fotoPerfil;

    }


    public void setCapa(String capa) {

        this.capa = capa;

    }


    public void setTipoComida(TipoComida tipoComida) {

        this.tipoComida = tipoComida;

    }



    @Override
    public String toString() {

        return titulo;

    }

}