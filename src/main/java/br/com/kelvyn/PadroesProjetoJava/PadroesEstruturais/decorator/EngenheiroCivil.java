package br.com.kelvyn.PadroesProjetoJava.PadroesEstruturais.decorator;

public class EngenheiroCivil extends ObraDecorator {

    public EngenheiroCivil(Obra obra) {
        super(obra);
    }

    @Override
    public float getOrcamentoPrevisto() {
        return 10.0f;
    }

    public float getOrcamento() {
        return 10.0f;
    }

    public String getPlanejamento() {
        return "Engenheiro civil";
    }
}
