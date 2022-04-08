package br.com.kelvyn.PadroesProjetoJava.PadroesEstruturais.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegraTest {

    @Test
    void deveRetornarExecacaoCompeticaoSemRegra() {
        try {
            Regra regra = new Regra();
            regra.getRegra();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Competicao sem regra", e.getMessage());
        }
    }

}