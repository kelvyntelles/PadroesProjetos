package br.com.kelvyn.PadroesProjetoJava.PadroesCriacao.prototype;

public class Cerveja implements Cloneable {
    private int codigo;
    private String nome;
    private DataFabricacaoValidade dataFabricacaoValidade;
    private String cidadeFabricacao;

    public Cerveja(int codigo, String nome, DataFabricacaoValidade dataFabricacaoValidade, String cidadeFabricacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataFabricacaoValidade = dataFabricacaoValidade;
        this.cidadeFabricacao = cidadeFabricacao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public DataFabricacaoValidade getDataFabricacaoValidade() {
        return dataFabricacaoValidade;
    }

    public void setDataFabricacaoValidade(DataFabricacaoValidade dataFabricacaoValidade) {
        this.dataFabricacaoValidade = dataFabricacaoValidade;
    }

    public String getCidadeFabricacao() {
        return cidadeFabricacao;
    }

    public void setCidadeFabricacao(String cidadeFabricacao) {
        this.cidadeFabricacao = cidadeFabricacao;
    }

    @Override
    public Cerveja clone() throws CloneNotSupportedException {
        Cerveja cervejaClone = (Cerveja) super.clone();
        cervejaClone.dataFabricacaoValidade = (DataFabricacaoValidade) cervejaClone.dataFabricacaoValidade.clone();
        return cervejaClone;
    }

    @Override
    public String toString() {
        return "Cerveja{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", data de validade=" + dataFabricacaoValidade +
                ", local de fabricação='" + cidadeFabricacao + '\'' +
                '}';
    }
}
