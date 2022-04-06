package br.com.kelvyn.PadroesProjetoJava.PadroesEstruturais.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Time {

    private List<Jogador> jogadores = new ArrayList<>();

    public void contratar(String nomeJogador, String salarioJogador, String duracaoContratoJogador) {
        Contrato contrato = ContratoFactory.getContrato(salarioJogador, duracaoContratoJogador);
        Jogador jogador = new Jogador(nomeJogador, contrato);
        jogadores.add(jogador);
    }

    public List<String> obterJogadores() {
        List<String> saida = new ArrayList<String>();
        for (Jogador jogador : this.jogadores) {
            saida.add(jogador.obterInformacoesJogador());
        }
        return saida;
    }

}
