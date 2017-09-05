package com.tds171a.aula06.veiculos;

/**
 * Classe de Automovel
 * @author Lab. Desenvolvimento
 *
 */
public class Automovel extends Veiculo
{
    /**
     * Atributo que define marca do Automovel
     */
    private String marca;

    /**
     * Atributo que define fabricante do Automovel
     */
    private String fabricante;

    /**
     * Construtor de Automovel
     */
    public Automovel()
    {
        super();

        marca = "Indefinido";
        fabricante = "Indefinido";
    }

    /**
     * Construtor de Automovel recebendo valores para os atributos
     * @param marca
     * @param fabricante
     */
    public Automovel(String cor, int ano, String marca, String fabricante)
    {
        super(cor, ano);

        this.marca = marca;
        this.fabricante = fabricante;
    }

    /**
     * @return the marca
     */
    public String getMarca()
    {
        return marca;
    }
    /**
     * @param pMarca the marca to set
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
     * @param pFabricante the fabricante to set
     */
    public void setFabricante(String pFabricante)
    {
        fabricante = pFabricante;
    }
}
