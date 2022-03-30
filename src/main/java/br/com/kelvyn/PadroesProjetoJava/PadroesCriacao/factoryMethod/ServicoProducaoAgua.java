package br.com.kelvyn.PadroesProjetoJava.PadroesCriacao.factoryMethod;

public class ServicoProducaoAgua implements InterfaceServico {

    public String executar() {
        return "Produção de água iniciada";
    }

    public String cancelar() {
        return "Produção de água cancelada";
    }

}
