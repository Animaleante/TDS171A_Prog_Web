package com.tds171a.aula05.veiculos;

/**
 * Classe do Carro
 *
 * @author Lab. Desenvolvimento
 *
 */
public class Carro
{
    /**
     * Atributo que define a cor do carro
     */
    private String cor;

    /**
     * Atributo que define o ano do carro
     */
    private int    ano;

    /**
     * Atributo que define a marca do carro
     */
    private String marca;

    /**
     * Atributo que define o fabricante do carro
     */
    private String fabricante;

    /**
     * Construtor da classe Carro
     */
    private Carro()
    {
        // TODO Auto-generated constructor stub
    }

    /**
     * Construtor da classe Carro com parametros
     *
     * @param cor
     * @param ano
     * @param marca
     * @param fabricante
     */
    public Carro(String cor, int ano, String marca, String fabricante)
    {
        this.cor = cor;
        this.ano = ano;
        this.marca = marca;
        this.fabricante = fabricante;
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
}
