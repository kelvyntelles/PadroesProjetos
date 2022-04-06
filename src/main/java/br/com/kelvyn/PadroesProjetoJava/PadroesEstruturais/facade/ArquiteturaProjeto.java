package br.com.kelvyn.PadroesProjetoJava.PadroesEstruturais.facade;

import java.util.ArrayList;

public class ArquiteturaProjeto extends Setor {

    private static ArquiteturaProjeto arquiteturaProjeto = new ArquiteturaProjeto();

    private ArquiteturaProjeto() {};

    public static ArquiteturaProjeto getInstancia() {
        return arquiteturaProjeto;
    }

}
