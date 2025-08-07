package com.catalogo.imdb;

public class FilmeAtorDiretor{
    private Filme filme;
    private Ator ator;
    private Diretor diretor;

    public FilmeAtorDiretor(Filme filme, Ator ator, Diretor diretor) {
        this.filme = filme;
        this.ator = ator;
        this.diretor = diretor;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Ator getAtor() {
        return ator;
    }

    public void setAtor(Ator ator) {
        this.ator = ator;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public String mostrarInfo() {
        return ator.mostrarInfo() +
               diretor.mostrarInfo() +
               filme.mostrarInfo();
    }
}
