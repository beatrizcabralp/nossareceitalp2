package com.example.nossareceitalp2.repository;

import com.example.nossareceitalp2.model.Receita;

import java.util.ArrayList;
import java.util.List;

public class ReceitaRepository {

    private static final ReceitaRepository INSTANCE =
            new ReceitaRepository();

    private final List<Receita> receitas =
            new ArrayList<>();

    private ReceitaRepository() {
    }

    public static ReceitaRepository getInstance() {
        return INSTANCE;
    }

    public void adicionar(Receita receita) {
        receitas.add(receita);
    }

    public List<Receita> listar() {
        return receitas;
    }

    public Receita buscarPorIndice(int indice) {

        if (indice < 0 || indice >= receitas.size()) {
            return null;
        }

        return receitas.get(indice);

    }

    public void atualizar(int indice, Receita novaReceita) {

        if (indice < 0 || indice >= receitas.size()) {
            return;
        }

        receitas.set(indice, novaReceita);

    }

    public void remover(int indice) {

        if (indice < 0 || indice >= receitas.size()) {
            return;
        }

        receitas.remove(indice);

    }

}