package br.com.kelvyn.PadroesProjetoJava.PadroesEstruturais.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrcamentoProjetoTest {

    @Test
    void deveRetornarPendenciaArquiteturaProjeto() {
        ProjetoCivil projetoCivil = new ProjetoCivil();
        ArquiteturaProjeto.getInstancia().addProjetoPendente(projetoCivil);

        assertEquals(false, projetoCivil.iniciarObra());
    }

    @Test
    void deveRetornarPendenciaOrcamentoProjeto() {
        ProjetoCivil projetoCivil = new ProjetoCivil();
        OrcamentoProjeto.getInstancia().addProjetoPendente(projetoCivil);

        assertEquals(false, projetoCivil.iniciarObra());
    }

    @Test
    void deveRetornarProjetoSemPendenciaIniciarObra() {
        ProjetoCivil projetoCivil = new ProjetoCivil();

        assertEquals(true, projetoCivil.iniciarObra());
    }

}