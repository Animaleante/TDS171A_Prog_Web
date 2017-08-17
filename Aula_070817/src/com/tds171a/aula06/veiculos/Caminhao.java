package com.tds171a.aula06.veiculos;

/**
 *
 * @author Lab. Desenvolvimento
 *
 */
public class Caminhao extends Automovel
{
    /**
     * Atributo que define tara do Caminhao
     */
    private int tara;

    /**
     * Construtor de Caminhao
     */
    public Caminhao()
    {
        // TODO Auto-generated constructor stub
    }

    /**
     * Construtor de Caminhao recebendo valores para os atributos
     * @param ano
     * @param cor
     * @param marca
     * @param fabricante
     * @param tara
     */
    public Caminhao(int ano, String cor, String marca, String fabricante, int tara)
    {
        super(cor, ano, marca, fabricante);

        this.tara = tara;
    }

    /**
     * @return the tara
     */
    public int getTara()
    {
        return tara;
    }

    /**
     * @param pTara the tara to set
     */
    public void setTara(int pTara)
    {
        tara = pTara;
    }
}
