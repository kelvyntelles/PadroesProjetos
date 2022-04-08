package br.com.kelvyn.PadroesProjetoJava.PadroesEstruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackEndTest {

    @Test
    void deveRetornarSalarioBackEndEstagiario() {
        NivelExperiencia nivelExperiencia = new ProgramadorJunior();
        BackEnd backEnd = new BackEnd(1000.0f);
        backEnd.setNivelExperiencia(nivelExperiencia);
        assertEquals(1200.0f, backEnd.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioBackEndJunior() {
        NivelExperiencia nivelExperiencia = new ProgramadorJunior();
        BackEnd backEnd = new BackEnd(2000.0f);
        backEnd.setNivelExperiencia(nivelExperiencia);
        assertEquals(2400.0f, backEnd.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioBackEndPleno() {
        NivelExperiencia nivelExperiencia = new ProgramadorJunior();
        BackEnd backEnd = new BackEnd(4000.0f);
        backEnd.setNivelExperiencia(nivelExperiencia);
        assertEquals(4800.0f, backEnd.calcularSalario(), 0.01f);
    }

}