package br.com.kelvyn.PadroesProjetoJava.PadroesEstruturais.composite;

import java.util.ArrayList;
import java.util.List;

public class Categoria extends Competicao {

    private List<Competicao> competicoes;

    public Categoria(String nome, List<Competicao> competicoes) {
        super(nome);
        this.competicoes = competicoes;
    }

    public void addCompeticao(Competicao competicao) {
        this.competicoes.add(competicao);
    }

    public String getCompeticao() {
        String saida = "";
        saida = "Categoria: " + this.getNome() + "\n";
        for(Competicao competicao : competicoes) {
            saida += competicao.getCompeticao();
        }
        return saida;
    }
}
