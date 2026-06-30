package com.example.nossareceitalp2.model;

import com.example.nossareceitalp2.model.Receita;
import com.example.nossareceitalp2.model.TipoComida;
import com.example.nossareceitalp2.service.ReceitaService;

public class ReceitasExemplo {


    public static void carregar() {


        ReceitaService service =
                ReceitaService.getInstance();

        //SOBREMESAS

        service.adicionarReceita(
            new Receita(
                "Bolo de Cenoura",
                "3 cenouras, farinha, ovos, açúcar",
                "Misture tudo, asse por 40 minutos.",
                null,
                null,
                TipoComida.SOBREMESA
            )
        );

        service.adicionarReceita(
        new Receita(
                "Pudim",
                "Leite condensado, leite e ovos",
                "Misture os ingredientes e asse em banho-maria.",
                null,
                null,
                TipoComida.SOBREMESA
            )
        );

        service.adicionarReceita(
            new Receita(
                "Brigadeiro",
                "Leite condensado, chocolate e manteiga",
                "Mexa até desgrudar da panela.",
                null,
                null,
                TipoComida.SOBREMESA
            )
        );

        service.adicionarReceita(
        new Receita(
                "Churros",
                "Farinha, água e açúcar",
                "Frite a massa e recheie.",
                null,
                null,
                TipoComida.SOBREMESA
            )
        );

        service.adicionarReceita(
        new Receita(
                "Torta de Limão",
                "Biscoito, manteiga, leite condensado e limão",
                "Monte a base, recheie e leve para gelar.",
                null,
                null,
                TipoComida.SOBREMESA
            )
        );

        service.adicionarReceita(
        new Receita(
                "Petit Gateau",
                "Chocolate, manteiga, ovos e farinha",
                "Asse rapidamente para manter o centro cremoso.",
                null,
                null,
                TipoComida.SOBREMESA
            )
        );


        //SALGADO

        service.adicionarReceita(
                new Receita(
                        "Coxinha",
                        "Frango, massa e temperos",
                        "Modele, empane e frite.",
                        null,
                        null,
                        TipoComida.SALGADO
                ));


        service.adicionarReceita(
                new Receita(
                        "Pastel",
                        "Massa e recheio",
                        "Monte e frite.",
                        null,
                        null,
                        TipoComida.SALGADO
                ));


        service.adicionarReceita(
                new Receita(
                        "Empada",
                        "Massa e frango",
                        "Prepare a massa e asse.",
                        null,
                        null,
                        TipoComida.SALGADO
                ));


        service.adicionarReceita(
                new Receita(
                        "Esfirra",
                        "Farinha, carne e temperos",
                        "Modele e asse.",
                        null,
                        null,
                        TipoComida.SALGADO
                ));


        service.adicionarReceita(
                new Receita(
                        "Pão de Queijo",
                        "Polvilho, queijo e ovos",
                        "Misture e asse.",
                        null,
                        null,
                        TipoComida.SALGADO
                ));


        service.adicionarReceita(
                new Receita(
                        "Kibe",
                        "Trigo, carne e temperos",
                        "Modele e frite.",
                        null,
                        null,
                        TipoComida.SALGADO
                ));

        //VEGANO

        service.adicionarReceita(
                new Receita(
                        "Bolo de Aveia",
                        "Aveia, banana e açúcar",
                        "Misture e asse.",
                        null,
                        null,
                        TipoComida.VEGANO
                )
        );


        service.adicionarReceita(
                new Receita(
                        "Queijo de Tofu",
                        "Tofu e temperos",
                        "Tempere e deixe descansar.",
                        null,
                        null,
                        TipoComida.VEGANO
                )
        );


        service.adicionarReceita(
                new Receita(
                        "Leite de Castanha",
                        "Castanhas e água",
                        "Bata no liquidificador e coe.",
                        null,
                        null,
                        TipoComida.VEGANO
                )
        );


        service.adicionarReceita(
                new Receita(
                        "Chocolate Quente Vegano",
                        "Leite vegetal e chocolate",
                        "Aqueça e misture.",
                        null,
                        null,
                        TipoComida.VEGANO
                )
        );


        service.adicionarReceita(
                new Receita(
                        "Iogurte Vegano",
                        "Leite vegetal e fermento",
                        "Misture e deixe fermentar.",
                        null,
                        null,
                        TipoComida.VEGANO
                )
        );


        service.adicionarReceita(
                new Receita(
                        "Milkshake Vegano",
                        "Banana, leite vegetal e cacau",
                        "Bata tudo gelado.",
                        null,
                        null,
                        TipoComida.VEGANO
                )
        );


        //MASSAS

        service.adicionarReceita(
                new Receita(
                        "Macarrão Bolognese",
                        "Macarrão, carne moída, molho de tomate",
                        "Cozinhe o macarrão. Prepare o molho com carne e tomate. Misture e sirva.",
                        null,
                        null,
                        TipoComida.MASSAS
                ));


        service.adicionarReceita(
                new Receita(
                        "Carbonara",
                        "Macarrão, ovos, queijo e bacon",
                        "Cozinhe o macarrão. Misture ovos e queijo. Adicione bacon.",
                        null,
                        null,
                        TipoComida.MASSAS
                ));


        service.adicionarReceita(
                new Receita(
                        "Lasanha",
                        "Massa, queijo, molho e carne",
                        "Monte camadas de massa, molho e queijo. Asse até dourar.",
                        null,
                        null,
                        TipoComida.MASSAS
                ));


        service.adicionarReceita(
                new Receita(
                        "Nhoque",
                        "Batata, farinha e molho",
                        "Faça a massa, corte os pedaços e cozinhe. Sirva com molho.",
                        null,
                        null,
                        TipoComida.MASSAS
                ));


        service.adicionarReceita(
                new Receita(
                        "Ravioli",
                        "Massa recheada e molho",
                        "Cozinhe os raviolis e sirva com molho.",
                        null,
                        null,
                        TipoComida.MASSAS
                ));


        service.adicionarReceita(
                new Receita(
                        "Fettuccine Alfredo",
                        "Massa, creme e queijo",
                        "Cozinhe a massa e misture com molho cremoso.",
                        null,
                        null,
                        TipoComida.MASSAS
                ));

        //CHURRASCO

        service.adicionarReceita(
                new Receita(
                        "Picanha",
                        "Picanha, sal grosso",
                        "Tempere a carne e asse até o ponto desejado.",
                        null,
                        null,
                        TipoComida.CHURRASCO
                ));


        service.adicionarReceita(
                new Receita(
                        "Frango Assado",
                        "Frango, temperos",
                        "Tempere o frango e asse até dourar.",
                        null,
                        null,
                        TipoComida.CHURRASCO
                ));


        service.adicionarReceita(
                new Receita(
                        "Costela",
                        "Costela bovina e sal",
                        "Cozinhe lentamente até ficar macia.",
                        null,
                        null,
                        TipoComida.CHURRASCO
                ));


        service.adicionarReceita(
                new Receita(
                        "Espetinho",
                        "Carne, cebola e pimentão",
                        "Monte os espetos e asse na churrasqueira.",
                        null,
                        null,
                        TipoComida.CHURRASCO
                ));


        service.adicionarReceita(
                new Receita(
                        "Pão de Alho",
                        "Pão, alho e manteiga",
                        "Pincele o pão e asse até dourar.",
                        null,
                        null,
                        TipoComida.CHURRASCO
                ));


        service.adicionarReceita(
                new Receita(
                        "Queijo Coalho",
                        "Queijo coalho",
                        "Asse o queijo até criar crosta.",
                        null,
                        null,
                        TipoComida.CHURRASCO
                ));


    }
}
