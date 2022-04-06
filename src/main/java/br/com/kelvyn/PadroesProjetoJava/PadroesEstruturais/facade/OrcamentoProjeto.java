package br.com.kelvyn.PadroesProjetoJava.PadroesEstruturais.facade;

public class OrcamentoProjeto extends Setor {

    private static OrcamentoProjeto orcamentoProjeto = new OrcamentoProjeto();

    private OrcamentoProjeto() {};

    public static OrcamentoProjeto getInstancia() {
        return orcamentoProjeto;
    }

}
