package com.cinema;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

public class Filme {
    private Integer id;
    private String titulo;
    private String genero;
    private String sinopse;
    private LocalDate dataLancamento;
    private String classIndicativa;

    public Filme() {
    }

    public Filme(String titulo, String genero, String sinopse, String classIndicativa, LocalDate dataLancamento) {
        Random random = new Random();
        this.id = random.nextInt(1000);
        this.titulo = titulo;
        this.genero = genero;
        this.sinopse = sinopse;
        this.classIndicativa = classIndicativa;
        this.dataLancamento = dataLancamento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getClassIndicativa() {
        return classIndicativa;
    }

    public void setClassIndicativa(String classIndicativa) {
        this.classIndicativa = classIndicativa;
    }

    public void iniciar() {
        int count = 0;
        System.out.println("");
        for (int i = 0; i<700; i++) {
            try {
                Thread.sleep(100);
                if (count == 70) {
                    System.out.print("\r");
                    count = 0;
                }
                System.out.printf("#");
                count = count + 1;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("");
    }

    @Override
    public String toString() {
        return "Filme {" + "\n" +
                "\tid=" + id + "\n" +
                "\ttitulo=' " + titulo + '\'' + "\n" +
                "\tgenero='" + genero + '\'' + "\n" +
                "\tsinopse='" + sinopse + '\'' + "\n" +
                "\tdataLancamento=" + dataLancamento + "\n" +
                "\tclassIndicativa='" + classIndicativa + '\'' + "\n" +
                '}';
    }
}
