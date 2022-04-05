package br.com.kelvyn.PadroesProjetoJava.PadroesEstruturais.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ContratoFactory {

    private static Map<String, Contrato> contratos = new HashMap<>();

    public static Contrato getContrato(String salario, String duracaoContrato) {
        Contrato contrato = contratos.get(salario);
        if (contrato == null) {
            contrato = new Contrato(salario, duracaoContrato);
            contratos.put(salario, contrato);
        }
        return contrato;
    }

    public static int getTotalContratos() {
        return contratos.size();
    }

}
