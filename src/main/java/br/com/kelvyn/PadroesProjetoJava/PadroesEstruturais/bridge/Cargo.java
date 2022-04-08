package br.com.kelvyn.PadroesProjetoJava.PadroesEstruturais.bridge;

public abstract class Cargo {

    protected NivelExperiencia nivelExperiencia;

    protected float salarioBase;

    public Cargo(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setNivelExperiencia(NivelExperiencia nivelExperiencia) {
        this.nivelExperiencia = nivelExperiencia;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract float calcularSalario();

}
