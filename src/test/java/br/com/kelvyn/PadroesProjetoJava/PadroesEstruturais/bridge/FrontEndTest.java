package br.com.kelvyn.PadroesProjetoJava.PadroesEstruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrontEndTest {

    @Test
    void deveRetornarSalarioFrontEndEstagiario() {
        NivelExperiencia nivelExperiencia = new Estagiario();
        FrontEnd frontEnd = new FrontEnd(1000.0f);
        frontEnd.setNivelExperiencia(nivelExperiencia);
        assertEquals(1000.0f, frontEnd.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioFrontEndJunior() {
        NivelExperiencia nivelExperiencia = new ProgramadorJunior();
        FrontEnd frontEnd = new FrontEnd(1000.0f);
        frontEnd.setNivelExperiencia(nivelExperiencia);
        assertEquals(1000.0f, frontEnd.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioFrontEndPleno() {
        NivelExperiencia nivelExperiencia = new ProgramadorPleno();
        FrontEnd frontEnd = new FrontEnd(1000.0f);
        frontEnd.setNivelExperiencia(nivelExperiencia);
        assertEquals(1000.0f, frontEnd.calcularSalario(), 0.01f);
    }

}