package br.com.kelvyn.PadroesProjetoJava.PadroesCriacao.abstractfactory;

public class FabricaNacional implements FabricaAbstrata {

    @Override
    public DadosVooPiloto createDados() {
        return new DadosVooPilotoNacional();
    }

    @Override
    public Historico createHistorico() {
        return new HistoricoVooPilotoNacional();
    }

}
