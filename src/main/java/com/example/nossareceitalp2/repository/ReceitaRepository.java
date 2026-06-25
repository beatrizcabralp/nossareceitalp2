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
}