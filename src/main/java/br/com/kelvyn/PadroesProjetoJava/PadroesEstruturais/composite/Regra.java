package br.com.kelvyn.PadroesProjetoJava.PadroesEstruturais.composite;

public class Regra {

    private Competicao regraCompeticao;

    public void setRegraCompeticao(Competicao regraCompeticao) {
        this.regraCompeticao = regraCompeticao;
    }

    public String getRegra() {
        if (this.regraCompeticao == null) {
            throw new NullPointerException("Competicao sem regra");
        }
        return this.regraCompeticao.getCompeticao();
    }
}
