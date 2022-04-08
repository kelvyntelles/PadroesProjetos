package br.com.kelvyn.PadroesProjetoJava.PadroesEstruturais.decorator;

public class ObraCondominio implements Obra {

    public float orcamentoPrevisto;

    public ObraCondominio(){

    }

    public ObraCondominio(float orcamentoPrevisto) {
        this.orcamentoPrevisto = orcamentoPrevisto;
    }

    public float getOrcamento() {
        return orcamentoPrevisto;
    }

    public String getPlanejamento() {
        return "Condominio";
    }

}
