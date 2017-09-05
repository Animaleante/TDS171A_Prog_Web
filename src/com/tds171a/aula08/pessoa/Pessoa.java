package com.tds171a.aula08.pessoa;

import java.util.Date;

public class Pessoa
{
    private String nome;
    private String sexo;
    private Date dataNascimento;

    public Pessoa(String nome, String sexo, Date dataNascimento)
    {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    public Pessoa()
    {
        // TODO Auto-generated constructor stub
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
