package br.com.kelvyn.PadroesProjetoJava.PadroesCriacao.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParametrosTest {

    @Test
    public void deveRetornarNomeEmpresa() {
        Parametros.getInstance().setNomeEmpresa("DMS Logistcs");
        assertEquals("DMS Logistcs", Parametros.getInstance().getNomeEmpresa());
    }

    @Test
    public void deveRetornarUsuarioLogado() {
        Parametros.getInstance().setUsuarioLogado("Kelvyn");
        assertEquals("Kelvyn", Parametros.getInstance().getUsuarioLogado());
    }

}