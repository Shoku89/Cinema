package com.cinema;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Filme filme = new Filme("Bananassauro", "acao", "A banana comeu o dinossauro",
                "25 anos", LocalDate.of(2023, 07, 05) );

        Sessao sessao = new Sessao(filme, "18:50", LocalDate.of(2023, 07, 8), 350  );
        System.out.println(sessao);

        sessao.iniciarSessao();
    }
}
