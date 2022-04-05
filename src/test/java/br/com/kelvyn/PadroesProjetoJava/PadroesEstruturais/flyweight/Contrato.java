package br.com.kelvyn.PadroesProjetoJava.PadroesEstruturais.flyweight;

public class Contrato {

    private String salario;
    private String duracaoContrato;

    public Contrato(String salario, String duracaoContrato) {
        this.salario = salario;
        this.duracaoContrato = duracaoContrato;
    }

    public String getSalario() {
        return salario;
    }

    public String getDuracaoContrato() {
        return duracaoContrato;
    }

}
