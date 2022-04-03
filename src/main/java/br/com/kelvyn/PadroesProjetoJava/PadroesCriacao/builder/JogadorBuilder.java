package br.com.kelvyn.PadroesProjetoJava.PadroesCriacao.builder;

import java.util.Date;

public class JogadorBuilder {

    private Jogador jogador;

    public JogadorBuilder() {
        jogador = new Jogador();
    }

    public Jogador build() {
        if(jogador.getCodigoBid() == 0) {
            throw new IllegalArgumentException("Código inválido");
        }
        if(jogador.getNome().equals("")){
            throw new IllegalArgumentException(("Nome Inválido"));
        }
        return jogador;
    }

    public JogadorBuilder setCodigoBid(int codigoBid) {
        jogador.setCodigoBid(codigoBid);
        return this;
    }

    public JogadorBuilder setNome(String nome) {
        jogador.setNome(nome);
        return this;
    }

    public JogadorBuilder setDataNascimento(Date dataNascimento) {
        jogador.setDataNascimento(dataNascimento);
        return this;
    }

    public JogadorBuilder setCpf(String cpf) {
        jogador.setCpf(cpf);
        return this;
    }

    public JogadorBuilder setRg(String rg) {
        jogador.setRg(rg);
        return this;
    }

    public JogadorBuilder setClubeAnterior(String clubeAnterior) {
        jogador.setClubeAnterior(clubeAnterior);
        return this;
    }

    public JogadorBuilder setEmail(String email) {
        jogador.setEmail(email);
        return this;
    }

    public JogadorBuilder setCelular(String celular) {
        jogador.setCelular(celular);
        return this;
    }
}
