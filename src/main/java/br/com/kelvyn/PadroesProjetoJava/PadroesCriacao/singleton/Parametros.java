package br.com.kelvyn.PadroesProjetoJava.PadroesCriacao.singleton;

public class Parametros {

    private Parametros() {};
    private static Parametros instance = new Parametros();
    public static Parametros getInstance() {
        return instance;
    }

    private String momeEmpresa;
    private String usuarioLogado;

    public String getNomeEmpresa() {
        return momeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.momeEmpresa = nomeEmpresa;
    }

    public String getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(String usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }

}
