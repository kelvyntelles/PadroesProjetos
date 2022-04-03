package br.com.kelvyn.PadroesProjetoJava.PadroesCriacao.builder;

import java.util.Date;

public class Jogador {

    private int codigoBid;
    private String nome;
    private Date dataNascimento;
    private String cpf;
    private String rg;
    private String clubeAnterior;
    private String email;
    private String celular;

    public Jogador() {
        this.codigoBid = 0;
        this.nome = "";
    }

    public int getCodigoBid() {
        return codigoBid;
    }

    public void setCodigoBid(int codigoBid) {
        this.codigoBid = codigoBid;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getClubeAnterior() {
        return clubeAnterior;
    }

    public void setClubeAnterior(String clubeAnterior) {
        this.clubeAnterior = clubeAnterior;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}
