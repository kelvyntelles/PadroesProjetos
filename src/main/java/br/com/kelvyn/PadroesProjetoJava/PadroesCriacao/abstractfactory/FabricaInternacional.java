package br.com.kelvyn.PadroesProjetoJava.PadroesCriacao.abstractfactory;

public class FabricaInternacional implements FabricaAbstrata {

    @Override
    public DadosVooPiloto createDados() {
        return new DadosVooPilotoInternacional();
    }

    @Override
    public Historico createHistorico() {
        return new HistoricoVooInternacional();
    }

}
