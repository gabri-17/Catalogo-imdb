package com.catalogo.imdb;

public class Diretor extends Pessoa{
    private int credencialDiretor;

    public Diretor(String nome, String dataNascimento, String genero, int credencialDiretor) {
        super(nome, dataNascimento, genero);
        this.credencialDiretor = credencialDiretor;
    }

    public int getCredencialDiretor() {
        return credencialDiretor;
    }

    public void setCredencialDiretor(int credencialDiretor) {
        this.credencialDiretor = credencialDiretor;
    }

    public String mostrarInfo() {
        return super.mostrarInfo() +
                "CredencialDiretor=" + credencialDiretor + '\n';
    }
}
