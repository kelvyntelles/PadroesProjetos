package br.com.kelvyn.PadroesProjetoJava.PadroesEstruturais.adapter;

public class AvaliacaoAdapter extends AvaliacaoNota {

    private IAvaliacao avaliacaoConceito;

    public AvaliacaoAdapter(IAvaliacao avaliacaoConceito) {
        this.avaliacaoConceito = avaliacaoConceito;
    }

    public String recuperarAvaliacao() {
        if (this.getNota() >= 0.0f)
            avaliacaoConceito.setAvaliacao("Aprovado");
        else
        if (this.getNota() >= -1.0f)
            avaliacaoConceito.setAvaliacao("Aprovado");
        else
        if (this.getNota() >= -2.0f)
            avaliacaoConceito.setAvaliacao("Aprovado");
        else
            avaliacaoConceito.setAvaliacao("Reprovado");
        return avaliacaoConceito.getAvaliacao();
    }

    public void salvarAvaliacao() {
        if (avaliacaoConceito.getAvaliacao().equals("Aprovado"))
            this.setNota(0.0f);
        else
            this.setNota(-3.0f);
    }

}
