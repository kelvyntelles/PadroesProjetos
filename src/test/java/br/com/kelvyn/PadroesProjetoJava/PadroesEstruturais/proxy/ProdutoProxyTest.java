package br.com.kelvyn.PadroesProjetoJava.PadroesEstruturais.proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoProxyTest {

    @BeforeEach
    void setUp() {
        BD.addProduto(new Produto(1, "Coca Cola", "coca 2 litros", 10.0f, "teste receita coca"));
        BD.addProduto(new Produto(2, "Fanta", "fanta 2 litros", 8.0f, "teste receita fanta"));
    }

    @Test
    void deveRetornarDescricaoProduto() {
        ProdutoProxy produto = new ProdutoProxy(1);

        assertEquals(Arrays.asList("Coca Cola", "coca 2 litros"), produto.obterDescricaoProduto());
    }

    @Test
    void deveRetonarNotasAluno() {
        Funcionario funcionario = new Funcionario("Kelvyn", true);
        ProdutoProxy produto = new ProdutoProxy(2);

        assertEquals(Arrays.asList("teste receita fanta"), produto.obterReceita(funcionario));
    }

    @Test
    void deveRetonarExcecaoUsuarioNaoAutorizadoConsultarNotasAluno() {
        try {
            Funcionario funcionario = new Funcionario("Telles", false);
            ProdutoProxy produto = new ProdutoProxy(2);

            produto.obterReceita(funcionario);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Funcionário não autorizado", e.getMessage());
        }
    }

}