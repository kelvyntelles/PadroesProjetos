package br.com.kelvyn.PadroesProjetoJava.PadroesEstruturais.proxy;

import java.util.Arrays;
import java.util.List;

public class Produto implements InterfaceProduto {

    private Integer codigo;
    private String nome;
    private String descricao;
    private Float valor;
    private String receita;

    public Produto(int codigo) {
        this.codigo = codigo;
        Produto objeto = BD.getProduto(codigo);
        this.nome = objeto.nome;
        this.descricao = objeto.descricao;
        this.valor = objeto.valor;
        this.receita = objeto.receita;
    }

    public Produto(Integer codigo, String nome, String descricao, Float valor, String receita) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.receita = receita;
    }

    public Integer getCodigo() {
        return codigo;
    }

    @Override
    public List<String> obterDescricaoProduto() {
        return Arrays.asList(this.nome, this.descricao);
    }

    @Override
    public List<String> obterReceita(Funcionario funcionario) {
        return Arrays.asList(this.receita);
    }
}

