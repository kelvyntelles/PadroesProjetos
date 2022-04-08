package br.com.kelvyn.PadroesProjetoJava.PadroesEstruturais.bridge;

public class FrontEnd extends Cargo {

    public FrontEnd(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase;
    }

}
