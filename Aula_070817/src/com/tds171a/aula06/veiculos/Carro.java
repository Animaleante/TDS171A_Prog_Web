package com.tds171a.aula06.veiculos;

/**
 *
 * @author Lab. Desenvolvimento
 *
 */
public class Carro extends Automovel
{
    /**
     * Atributo que define tamanho do porta malas do Carro
     */
    private int tamanhoPortaMalas;

    /**
     * Construtor de Carro
     */
    public Carro()
    {
        super();

        tamanhoPortaMalas = 0;
    }

    /**
     * Construtor de Carro recebendo valores para os atributos
     * @param ano
     * @param cor
     * @param marca
     * @param fabricante
     * @param tamanhoPortaMalas
     */
    public Carro(int ano, String cor, String marca, String fabricante, int tamanhoPortaMalas)
    {
        super(cor, ano, marca, fabricante);

        this.tamanhoPortaMalas = tamanhoPortaMalas;
    }

    /**
     * @return the tamanhoPortaMalas
     */
    public int getTamanhoPortaMalas()
    {
        return tamanhoPortaMalas;
    }
    /**
     * @param pTamanhoPortaMalas the tamanhoPortaMalas to set
     */
    public void setTamanhoPortaMalas(int pTamanhoPortaMalas)
    {
        tamanhoPortaMalas = pTamanhoPortaMalas;
    }
}
