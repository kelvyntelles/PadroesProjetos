package br.com.kelvyn.PadroesProjetoJava.PadroesCriacao.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CervejaTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Cerveja cerveja = new Cerveja(123, "Heineken", new DataFabricacaoValidade("3", "4"), "Juiz de Fora");

        Cerveja cervejaClone = cerveja.clone();
        cervejaClone.setCodigo(456);
        cervejaClone.setNome("Heineken clonada");
        cervejaClone.getDataFabricacaoValidade().setDataFabricacao("3");
        cervejaClone.getDataFabricacaoValidade().setDataValidade("9");

        assertEquals("Cerveja{codigo=123, nome='Heineken', data de validade=Data{fabricacao='3', validade=4}, local de fabricação='Juiz de Fora'}", cerveja.toString());
        assertEquals("Cerveja{codigo=456, nome='Heineken clonada', data de validade=Data{fabricacao='3', validade=9}, local de fabricação='Juiz de Fora'}", cervejaClone.toString());
    }

}