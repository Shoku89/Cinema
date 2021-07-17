package com.cinema;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

public class Sessao {

    private Integer id;
    private Filme filme;
    private String horario;
    private LocalDate data;
    private int lotacao;

    public Sessao( Filme filme, String horario, LocalDate data, int lotacao) {
        Random random = new Random();
        this.id = random.nextInt(1000);
        this.filme = filme;
        this.horario = horario;
        this.data = data;
        this.lotacao = lotacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getLotacao() {
        return lotacao;
    }

    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }

    public void iniciarSessao() {
        System.out.printf("Sessao do filme %s foi iniciada", filme.getTitulo());
        filme.iniciar();
        encerrarSessao();
    }

    public void encerrarSessao() {
        System.out.println("Sessao do filme: " + filme.getTitulo() + " foi encerrada");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("#####################################################################" + "\n");
        builder.append("id: " + id + "\n");
        builder.append("horario: " + horario + "\n");
        builder.append("data: " + data + "\n");
        builder.append("nome do filme: " + filme.getTitulo() + "\n");
        builder.append("lotacao: " + lotacao + "\n");
        builder.append("#####################################################################");
        return builder.toString();
    }
}
