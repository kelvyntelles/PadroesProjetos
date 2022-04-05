package br.com.kelvyn.PadroesProjetoJava.PadroesEstruturais.flyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void deveRetornarJogadores() {
        Time time = new Time();
        time.contratar("Kelvyn", "1.500.000,00", "3 anos");
        time.contratar("Lopes", "500.000,00", "4 anos");
        time.contratar("Telles", "600.000,00", "4 anos");

        List<String> saida = Arrays.asList(
                "Jogador{nome='Kelvyn', salario='1.500.000,00', duracaoContrato='3 anos'}",
                "Jogador{nome='Lopes', salario='500.000,00', duracaoContrato='4 anos'}",
                "Jogador{nome='Telles', salario='600.000,00', duracaoContrato='4 anos'}");

        assertEquals(saida, time.obterJogadores());
    }

    @Test
    void deveRetornarTotalContratos() {
        Time time = new Time();
        time.contratar("Kelvyn", "1.500.000,00", "3 anos");
        time.contratar("Lopes", "500.000,00", "4 anos");
        time.contratar("Telles", "600.000,00", "4 anos");

        assertEquals(3, ContratoFactory.getTotalContratos());
    }


}