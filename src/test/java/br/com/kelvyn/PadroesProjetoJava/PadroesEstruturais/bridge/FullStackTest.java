package br.com.kelvyn.PadroesProjetoJava.PadroesEstruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FullStackTest {

    @Test
    void deveRetornarSalarioFullStackEstagiario() {
        NivelExperiencia nivelExperiencia = new Estagiario();
        BackEnd backEnd = new BackEnd(1000.0f);
        backEnd.setNivelExperiencia(nivelExperiencia);
        assertEquals(1100.0f, backEnd.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioFullStackJunior() {
        NivelExperiencia nivelExperiencia = new ProgramadorJunior();
        BackEnd backEnd = new BackEnd(2000.0f);
        backEnd.setNivelExperiencia(nivelExperiencia);
        assertEquals(2400.0f, backEnd.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioFullStackPleno() {
        NivelExperiencia nivelExperiencia = new ProgramadorPleno();
        BackEnd backEnd = new BackEnd(5000.0f);
        backEnd.setNivelExperiencia(nivelExperiencia);
        assertEquals(6500.0f, backEnd.calcularSalario(), 0.01f);
    }

}