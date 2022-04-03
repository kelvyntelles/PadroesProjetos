package br.com.kelvyn.PadroesProjetoJava.PadroesCriacao.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorBuilderTest {

    @Test
    void deveRetornarExcecaoParaJogadorSemCodigoBid() {
        try {
            JogadorBuilder jogadorBuilder = new JogadorBuilder();
            Jogador jogador = jogadorBuilder
                    .setNome("Kelvyn")
                    .setEmail("kelvyn@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Código inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaJogadorSemNome() {
        try {
            JogadorBuilder jogadorBuilder = new JogadorBuilder();
            Jogador jogador = jogadorBuilder
                    .setCodigoBid(1)
                    .setEmail("kelvyn@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome Inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarJogadorValido() {
        JogadorBuilder jogadorBuilder = new JogadorBuilder();
        Jogador jogador = jogadorBuilder
                .setCodigoBid(1)
                .setNome("Aluno 1")
                .setEmail("aluno1@email.com")
                .build();

        assertNotNull(jogador);
    }
}