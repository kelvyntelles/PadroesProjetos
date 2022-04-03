package br.com.kelvyn.PadroesProjetoJava.PadroesCriacao.abstractfactory;

public class Piloto {

    private DadosVooPiloto dadosVooPiloto;
    private Historico historico;

    public Piloto(FabricaAbstrata fabrica) {
        this.dadosVooPiloto = fabrica.createDados();
        this.historico = fabrica.createHistorico();
    }

    public String emitirDados() {
        return this.dadosVooPiloto.emitir();
    }

    public String emitirHistorico() {
        return this.historico.emitir();
    }

}
