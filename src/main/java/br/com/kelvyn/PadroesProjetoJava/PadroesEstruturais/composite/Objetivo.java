package br.com.kelvyn.PadroesProjetoJava.PadroesEstruturais.composite;

public class Objetivo extends Competicao {

    private String objetivoCompeticao;

    public Objetivo(String nome, String objetivoCompeticao) {
        super(nome);
        this.objetivoCompeticao = objetivoCompeticao;
    }

    public String getObjetivoCompeticao() {
        return objetivoCompeticao;
    }

    public void setObjetivoCompeticao(String objetivoCompeticao) {
        this.objetivoCompeticao = objetivoCompeticao;
    }

    public String getCompeticao() {
        return "Objetivo: " + this.getNome() + " - Objetivo: " + this.objetivoCompeticao + "\n";
    }
}
