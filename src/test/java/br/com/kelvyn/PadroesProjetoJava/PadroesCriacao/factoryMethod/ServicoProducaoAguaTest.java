package br.com.kelvyn.PadroesProjetoJava.PadroesCriacao.factoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoProducaoAguaTest {

    @Test
    void deveExecutarFormatura() {
        InterfaceServico servico = ServicoFactory.obterServico("Agua");
        assertEquals("Produção de água iniciada", servico.executar());
    }

    @Test
    void deveCancelarFormatura() {
        InterfaceServico servico = ServicoFactory.obterServico("Agua");
        assertEquals("Produção de água cancelada", servico.cancelar());
    }

}