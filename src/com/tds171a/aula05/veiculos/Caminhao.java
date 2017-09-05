package com.tds171a.aula05.veiculos;

/**
 * Classe do Caminhao
 *
 * @author Lab. Desenvolvimento
 *
 */
public class Caminhao
{
    /**
     * Atributo que define a cor do caminhao
     */
    private String cor;
    /**
     * Atributo que define o ano do caminhao
     */
    private int    ano;

    /**
     * Atributo que define a marca do caminhao
     */
    private String marca;

    /**
     * Atributo que define o fabricante do caminhao
     */
    private String fabricante;

    /**
     * Atributo que define a tara do caminhao
     */
    private int    tara;

    /**
     * Construtor da classe Caminhao
     */
    public Caminhao()
    {
        // TODO Auto-generated constructor stub
    }

    /**
     * Construtor da classe Caminhao com parametros
     *
     * @param cor
     * @param ano
     * @param marca
     * @param fabricante
     * @param tara
     */
    public Caminhao(String cor, int ano, String marca, String fabricante, int tara)
    {
        this.cor = cor;
        this.ano = ano;
        this.marca = marca;
        this.fabricante = fabricante;
        this.tara = tara;

    }

    /**
     * @return the cor
     */
    public String getCor()
    {
        return cor;
    }

    /**
     * @param pCor
     *            the cor to set
     */
    public void setCor(String pCor)
    {
        cor = pCor;
    }

    /**
     * @return the ano
     */
    public int getAno()
    {
        return ano;
    }

    /**
     * @param pAno
     *            the ano to set
     */
    public void setAno(int pAno)
    {
        ano = pAno;
    }

    /**
     * @return the marca
     */
    public String getMarca()
    {
        return marca;
    }

    /**
     * @param pMarca
     *            the marca to set
     */
    public void setMarca(String pMarca)
    {
        marca = pMarca;
    }

    /**
     * @return the fabricante
     */
    public String getFabricante()
    {
        return fabricante;
    }

    /**
     * @param pFabricante
     *            the fabricante to set
     */
    public void setFabricante(String pFabricante)
    {
        fabricante = pFabricante;
    }

    /**
     * @return the tara
     */
    public int getTara()
    {
        return tara;
    }

    /**
     * @param pTara
     *            the tara to set
     */
    public void setTara(int pTara)
    {
        tara = pTara;
    }

}
