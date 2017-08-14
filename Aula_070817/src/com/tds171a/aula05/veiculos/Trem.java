package com.tds171a.aula05.veiculos;

import java.util.List;

/**
 * Classe do Trem
 *
 * @author Lab. Desenvolvimento
 *
 */
public class Trem
{
    /**
     * Atributo que define os vagões do trem
     */
    private List<Vagao> listaVagoes;

    /**
     * Atributo que define o nome do trem
     */
    private String      nomeDoTrem;

    /**
     * Construtor da classe Trem
     */
    private Trem()
    {
        // TODO Auto-generated constructor stub
    }

    /**
     * Construtor da classe Trem com parametros
     *
     * @param listaVagoes
     * @param nomeDoTrem
     */
    public Trem(List<Vagao> listaVagoes, String nomeDoTrem)
    {
        this.listaVagoes = listaVagoes;
        this.nomeDoTrem = nomeDoTrem;
    }

    /**
     * @return the listaVagoes
     */
    public List<Vagao> getListaVagoes()
    {
        return listaVagoes;
    }

    /**
     * @param pListaVagoes
     *            the listaVagoes to set
     */
    public void setListaVagoes(List<Vagao> pListaVagoes)
    {
        listaVagoes = pListaVagoes;
    }

    /**
     * @return the nomeDoTrem
     */
    public String getNomeDoTrem()
    {
        return nomeDoTrem;
    }

    /**
     * @param pNomeDoTrem
     *            the nomeDoTrem to set
     */
    public void setNomeDoTrem(String pNomeDoTrem)
    {
        nomeDoTrem = pNomeDoTrem;
    }
}
