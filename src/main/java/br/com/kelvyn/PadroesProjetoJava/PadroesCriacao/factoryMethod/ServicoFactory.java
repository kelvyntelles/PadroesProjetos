package br.com.kelvyn.PadroesProjetoJava.PadroesCriacao.factoryMethod;

public class ServicoFactory {

    public static InterfaceServico obterServico(String servico) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("PadroesCriacao.factoryMethod.ServicoProducao" + servico);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Serviço inexistente");
        }
        if (!(objeto instanceof InterfaceServico)) {
            throw new IllegalArgumentException("Serviço inválido");
        }
        return (InterfaceServico) objeto;
    }

}
