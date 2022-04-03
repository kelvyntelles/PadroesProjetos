package br.com.kelvyn.PadroesProjetoJava.PadroesCriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PilotoTest {

    @Test
    void deveEmitirHistoricoVooPilotoNacional() {
        FabricaAbstrata fabrica = new FabricaNacional();
        Piloto piloto = new Piloto(fabrica);
        assertEquals("Histórico voo nacional", piloto.emitirHistorico());
    }

    @Test
    void deveEmitirHistoricoVooPilotoInternacional() {
        FabricaAbstrata fabrica = new FabricaInternacional();
        Piloto piloto = new Piloto(fabrica);
        assertEquals("Histórico voo internacional", piloto.emitirHistorico());
    }

    @Test
    void deveEmitirDadosVooPilotoNacional() {
        FabricaAbstrata fabrica = new FabricaNacional();
        Piloto piloto = new Piloto(fabrica);
        assertEquals("Dados de voos nacionais", piloto.emitirDados());
    }

    @Test
    void deveEmitirDadosVooPilotoInternacional() {
        FabricaAbstrata fabrica = new FabricaInternacional();
        Piloto piloto = new Piloto(fabrica);
        assertEquals("Dados de voos internacionais", piloto.emitirDados());
    }
}