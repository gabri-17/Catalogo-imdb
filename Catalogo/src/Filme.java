package com.catalogo.imdb;

public class Filme {
    private String nome;
    private String dataLancamento;
    private double orcamento;
    private String descricao;

    public Filme(String nome, String dataLancamento,double orcamento, String descricao) {
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.orcamento = orcamento;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String mostrarInfo() {
        return "Título=" + nome + '\n' +
                "DataLancamento='" + dataLancamento + '\n' +
                "Orcamento=" + orcamento + '\n' +
                "Descricao='" + descricao + '\n';
    }

}
