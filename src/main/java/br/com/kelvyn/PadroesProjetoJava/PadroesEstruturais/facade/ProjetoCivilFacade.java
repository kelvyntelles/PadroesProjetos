package br.com.kelvyn.PadroesProjetoJava.PadroesEstruturais.facade;

public class ProjetoCivilFacade {

    public static boolean verificarPendenciasIniciarObra(ProjetoCivil projetoCivil) {
        if (ArquiteturaProjeto.getInstancia().verificarProjetoComPendencia(projetoCivil)) {
            return false;
        }
        if (OrcamentoProjeto.getInstancia().verificarProjetoComPendencia(projetoCivil)) {
            return false;
        }
        return true;
    }

}
