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



        if(receita == null){

            throw new IllegalArgumentException(
                    "Receita inválida."
            );

        }



        if(receita.getTitulo() == null ||
                receita.getTitulo().isBlank()){


            throw new IllegalArgumentException(
                    "Título obrigatório."
            );

        }





        if(receita.getIngredientes() == null ||
                receita.getIngredientes().isBlank()){


            throw new IllegalArgumentException(
                    "Ingredientes obrigatórios."
            );

        }





        if(receita.getModoPreparo() == null ||
                receita.getModoPreparo().isBlank()){


            throw new IllegalArgumentException(
                    "Modo de preparo obrigatório."
            );

        }





        if(receita.getTipoComida() == null){


            throw new IllegalArgumentException(
                    "Tipo de comida obrigatório."
            );

        }




        repository.adicionar(receita);

    }






    public List<Receita> listarReceitas(){

        return repository.listar();

    }







    public Receita buscarReceita(int indice){


        return repository.buscarPorIndice(indice);

    }






    public void editarReceita(
            int indice,
            Receita novaReceita
    ){



        Receita antiga =
                repository.buscarPorIndice(indice);



        if(antiga == null){

            throw new IllegalArgumentException(
                    "Receita não encontrada."
            );

        }




        antiga.setTitulo(
                novaReceita.getTitulo()
        );


        antiga.setIngredientes(
                novaReceita.getIngredientes()
        );


        antiga.setModoPreparo(
                novaReceita.getModoPreparo()
        );


        antiga.setFotoPerfil(
                novaReceita.getFotoPerfil()
        );


        antiga.setCapa(
                novaReceita.getCapa()
        );


        antiga.setTipoComida(
                novaReceita.getTipoComida()
        );

    }







    public void excluirReceita(int indice){


        repository.remover(indice);


    }


}