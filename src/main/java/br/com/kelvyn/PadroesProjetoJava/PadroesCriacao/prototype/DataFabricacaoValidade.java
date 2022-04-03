package br.com.kelvyn.PadroesProjetoJava.PadroesCriacao.prototype;

public class DataFabricacaoValidade implements Cloneable {
    private String dataFabricacao;
    private String dataValidade;

    public DataFabricacaoValidade(String dataFabricacao, String dataValidade) {
        super();
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataValidade;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Data{" +
                "fabricacao='" + dataFabricacao + '\'' +
                ", validade=" + dataValidade +
                '}';
    }
}
