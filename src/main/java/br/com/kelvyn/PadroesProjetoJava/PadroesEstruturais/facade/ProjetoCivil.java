package br.com.kelvyn.PadroesProjetoJava.PadroesEstruturais.facade;

public class ProjetoCivil {

    public boolean iniciarObra() {
        return ProjetoCivilFacade.verificarPendenciasIniciarObra(this);
    }

}
