package com.example.nossareceitalp2.service;

import com.example.nossareceitalp2.model.Receita;
import com.example.nossareceitalp2.repository.ReceitaRepository;

import java.util.List;

public class ReceitaService {

    private static final ReceitaService INSTANCE =
            new ReceitaService();

    private final ReceitaRepository repository =
            ReceitaRepository.getInstance();

    private ReceitaService() {
    }

    public static ReceitaService getInstance() {
        return INSTANCE;
    }

    public void adicionarReceita(Receita receita) {

        if (receita.getTitulo() == null ||
                receita.getTitulo().isBlank()) {

            throw new IllegalArgumentException(
                    "O título é obrigatório.");
        }

        if (receita.getTipoComida() == null) {

            throw new IllegalArgumentException(
                    "Selecione um tipo de comida.");
        }

        repository.adicionar(receita);
    }

    public List<Receita> listarReceitas() {
        return repository.listar();
    }
}