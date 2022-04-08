package br.com.kelvyn.PadroesProjetoJava.PadroesEstruturais.bridge;

public class BackEnd extends Cargo {

    public BackEnd(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.nivelExperiencia.percentualAumento());
    }

}
