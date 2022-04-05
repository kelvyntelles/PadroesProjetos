package br.com.kelvyn.PadroesProjetoJava.PadroesEstruturais.flyweight;

public class Jogador {

    private String nome;
    private Contrato contrato;

    public Jogador(String nome, Contrato contrato) {
        this.nome = nome;
        this.contrato = contrato;
    }

    public String obterInformacoesJogador() {
        return "Jogador{" +
                "nome='" + this.nome + '\'' +
                ", salario='" + contrato.getSalario() + '\'' +
                ", duracaoContrato='" + contrato.getDuracaoContrato() + '\'' +
                '}';
    }

}
