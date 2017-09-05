package com.tds171a.aula06.veiculos;

/**
 * Classe de Veiculo
 * @author Lab. Desenvolvimento
 *
 */
public class Veiculo
{
    /**
     * Atributo que define ano do Veiculo
     */
    private int ano;

    /**
     * Atributo que define cor do Veiculo
     */
    private String cor;

    /**
     * Contrutor de Veiculo
     */
    public Veiculo()
    {
        ano = 0;
        cor = "Indefinido";
    }

    /**
     * Construtor de Veiculo recebendo valores para os atributos
     * @param cor
     * @param ano
     */
    public Veiculo(String cor, int ano)
    {
        this.cor = cor;
        this.ano = ano;
    }

    /**
     * @return the ano
     */
    public int getAno()
    {
        return ano;
    }
    /**
     * @param pAno the ano to set
     */
    public void setAno(int pAno)
    {
        ano = pAno;
    }
    /**
     * @return the cor
     */
    public String getCor()
    {
        return cor;
    }
    /**
     * @param pCor the cor to set
     */
    public void setCor(String pCor)
    {
        cor = pCor;
    }
}
