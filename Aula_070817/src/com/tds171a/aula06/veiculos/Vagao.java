package com.tds171a.aula06.veiculos;

/**
 *
 * @author Lab. Desenvolvimento
 *
 */
public class Vagao
{
    /**
     * Atributo que define capacidade do Vagao
     */
    private int capacidade;

    /**
     * Construtor de Vagao
     */
    public Vagao()
    {
        // TODO Auto-generated constructor stub
    }

    /**
     * Construtor de Vagao recebendo valores para os atributos
     * @param capacidade
     */
    public Vagao(int capacidade)
    {
        this.capacidade = capacidade;
    }

    /**
     * @return the capacidade
     */
    public int getCapacidade()
    {
        return capacidade;
    }
    /**
     * @param pCapacidade the capacidade to set
     */
    public void setCapacidade(int pCapacidade)
    {
        capacidade = pCapacidade;
    }
}
