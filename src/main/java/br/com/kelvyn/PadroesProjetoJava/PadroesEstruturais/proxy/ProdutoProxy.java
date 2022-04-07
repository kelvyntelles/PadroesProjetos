package br.com.kelvyn.PadroesProjetoJava.PadroesEstruturais.proxy;

import java.util.List;

public class ProdutoProxy implements InterfaceProduto {

    private Produto produto;

    private Integer codigo;

    public ProdutoProxy(Integer codigo) {
        this.codigo = codigo;
    }

    @Override
    public List<String> obterDescricaoProduto() {
        if (this.produto == null) {
            this.produto = new Produto(this.codigo);
        }
        return this.produto.obterDescricaoProduto();
    }

    @Override
    public List<String> obterReceita(Funcionario funcionario) {
        if (!funcionario.isAdministrador()) {
            throw new IllegalArgumentException("Funcionário não autorizado");
        }
        if (this.produto == null) {
            this.produto = new Produto(this.codigo);
        }
        return this.produto.obterReceita(funcionario);
    }
}
