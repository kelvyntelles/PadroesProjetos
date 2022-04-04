package br.com.kelvyn.PadroesProjetoJava.PadroesEstruturais.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AvaliacaoAdapterTest {

    @Test
    void deveRetornarConceitoAluno() {
        AlunoMotorista aluno = new AlunoMotorista();
        aluno.setAvaliacao("Aprovado");

        assertEquals("Aprovado", aluno.getAvaliacao());
    }

    @Test
    void deveRetornarNotaAluno() {
        AlunoMotorista aluno = new AlunoMotorista();
        aluno.setAvaliacao("Aprovado");

        assertEquals(0.0f, aluno.getNota());
    }

}