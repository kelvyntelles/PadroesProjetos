package br.com.kelvyn.PadroesProjetoJava.PadroesEstruturais.proxy;

import java.util.List;

public interface InterfaceProduto {

    List<String> obterDescricaoProduto();
    List<String> obterReceita(Funcionario funcionario);

}
