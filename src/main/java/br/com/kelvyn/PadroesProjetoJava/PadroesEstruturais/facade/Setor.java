package br.com.kelvyn.PadroesProjetoJava.PadroesEstruturais.facade;

import java.util.ArrayList;
import java.util.List;

public class Setor {

    private List<ProjetoCivil> projetosComPendencia = new ArrayList<ProjetoCivil>();

    public void addProjetoPendente(ProjetoCivil projetoCivil) {
        this.projetosComPendencia.add(projetoCivil);
    }

    public boolean verificarProjetoComPendencia(ProjetoCivil projetoCivil) {
        return this.projetosComPendencia.contains(projetoCivil);
    }

}
