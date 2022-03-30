package br.com.kelvyn.PadroesProjetoJava.PadroesCriacao.factoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoProducaoCervejaTest {

    @Test
    void deveExecutarFormatura() {
        InterfaceServico servico = ServicoFactory.obterServico("Cerveja");
        assertEquals("Produção de cerveja iniciada", servico.executar());
    }

    @Test
    void deveCancelarFormatura() {
        InterfaceServico servico = ServicoFactory.obterServico("Cerveja");
        assertEquals("Produção de cerveja cancelada", servico.cancelar());
    }

}