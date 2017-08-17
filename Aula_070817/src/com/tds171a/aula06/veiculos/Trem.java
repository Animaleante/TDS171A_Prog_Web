package com.tds171a.aula06.veiculos;

import java.util.List;

/**
 *
 * @author Lab. Desenvolvimento
 *
 */
public class Trem extends Veiculo
{
    /**
     * Atributo que define lista de vagoes do Trem
     */
    private List<Vagao> listaVagoes;

    /**
     * Construtor de Trem
     */
    public Trem()
    {
        super();
    }

    /**
     * Construtor de Trem recebendo valores para os atributos
     * @param ano
     * @param cor
     * @param listaVagoes
     */
    public Trem(int ano, String cor, List<Vagao> listaVagoes)
    {
        super(cor, ano);
        this.listaVagoes = listaVagoes;
    }

    /**
     * @return the listaVagoes
     */
    public List<Vagao> getListaVagoes()
    {
        return listaVagoes;
    }

    /**
     * @param pListaVagoes the listaVagoes to set
     */
    public void setListaVagoes(List<Vagao> pListaVagoes)
    {
        listaVagoes = pListaVagoes;
    }
}
