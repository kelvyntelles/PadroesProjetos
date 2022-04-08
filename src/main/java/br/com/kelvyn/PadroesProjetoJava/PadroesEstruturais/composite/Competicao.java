package br.com.kelvyn.PadroesProjetoJava.PadroesEstruturais.composite;

public abstract class Competicao {

    private String nome;

    public Competicao(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract String getCompeticao();
}
