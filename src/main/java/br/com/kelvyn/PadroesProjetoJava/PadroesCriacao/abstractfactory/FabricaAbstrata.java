package br.com.kelvyn.PadroesProjetoJava.PadroesCriacao.abstractfactory;

public interface FabricaAbstrata {
    DadosVooPiloto createDados();
    Historico createHistorico();
}

