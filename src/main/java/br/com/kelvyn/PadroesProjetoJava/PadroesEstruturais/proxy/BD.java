package br.com.kelvyn.PadroesProjetoJava.PadroesEstruturais.proxy;

import java.util.HashMap;
import java.util.Map;

public class BD {

    private static Map<Integer, Produto> produtos = new HashMap<>();

    public static Produto getProduto(Integer matricula) {
        return produtos.get(matricula);
    }

    public static void addProduto(Produto produto) {
        produtos.put(produto.getCodigo(), produto);
    }

}
