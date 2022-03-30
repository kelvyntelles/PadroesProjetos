package br.com.kelvyn.PadroesProjetoJava.PadroesCriacao.factoryMethod;

public class ServicoProducaoCerveja implements InterfaceServico {

    public String executar() {
        return "Produção de cerveja iniciada";
    }

    public String cancelar() {
        return "Produção de cervaja cancelada";
    }

}
