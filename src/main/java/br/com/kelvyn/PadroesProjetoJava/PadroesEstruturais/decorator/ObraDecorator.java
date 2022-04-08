package br.com.kelvyn.PadroesProjetoJava.PadroesEstruturais.decorator;

public abstract class ObraDecorator implements Obra {

    private Obra obra;
    private String planejamento;

    public ObraDecorator(Obra obra) {
        this.obra = obra;
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public abstract float getOrcamentoPrevisto();

    public String getPlanejamento() {
        return this.obra.getPlanejamento() + "/" + this.getPlanejamento();
    }

    public void setPlanejamento(String planejamento) {
        this.planejamento = planejamento;
    }
}
