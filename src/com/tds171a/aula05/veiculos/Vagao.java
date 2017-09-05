package com.tds171a.aula05.veiculos;

/**
 * Classe do Vagao
 *
 * @author Lab. Desenvolvimento
 *
 */
public class Vagao
{
    /**
     * Atributo que define a capacidade do vagão
     */
    public int capacidade;

    /**
     * Construtor da classe Vagao
     */
    public Vagao()
    {
        // TODO Auto-generated constructor stub
    }

    /**
     * Construtor da classe vagao com parametros
     *
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
     * @param pCapacidade
     *            the capacidade to set
     */
    public void setCapacidade(int pCapacidade)
    {
        capacidade = pCapacidade;
    }
}
