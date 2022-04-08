package br.com.kelvyn.PadroesProjetoJava.PadroesEstruturais.bridge;

public class FullStack extends Cargo {

    public FullStack(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (2 + this.nivelExperiencia.percentualAumento());
    }

}
