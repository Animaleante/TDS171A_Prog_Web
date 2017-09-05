package com.tds171a.aula02;

/**
 * Class de uma bicicleta.
 *
 * @author Diogo S. Moraes
 * @since 7 de ago de 2017
 * @version 1.0.0
 *
 */
public class Bicicleta
{
    /**
     * Atributo que ir· representar a velocidade da bicicleta
     */
    private int   cadencia   = 0;

    /**
     * Atributo que ir· representar a marcha da bicicleta
     */
    private int   marcha     = 0;

    /**
     * Atributo que ir· armazenar a que velocidade a bicicleta esta indo
     */
    private float velocidade = 0;

    /**
     * Construtor da classe da Bicicleta
     */
    public Bicicleta()
    {
        // TODO Auto-generated constructor stub
    }

    /**
     * Cosntrutor da classe da Bicicleta
     *
     * @param marcha
     */
    public Bicicleta(int marcha)
    {
        this.marcha = marcha;
    }

    /**
     * Construtor recebendo os paramatros para velocidade, marcha e cadencia
     *
     * @param velocidade
     *            float - valor iniciar da velocidade
     * @param marcha
     *            int - valor inicial da marcha
     * @param cadencia
     *            int - valor inicia da cadencia
     */
    public Bicicleta(float velocidade, int marcha, int cadencia)
    {
        System.out.println("Bicicleta::__constructor >> Setando velocidade: " + velocidade + ", marcha: " + marcha + ", cadencia: " + cadencia);
        this.velocidade = velocidade;
        this.marcha = marcha;
        this.cadencia = cadencia;
    }

    /**
     * MÈtodo para retornar a cadencia
     *
     * @return int indicando a cadencia
     */
    public int getCadencia()
    {
        return cadencia;
    }

    /**
     * MÈtodo para retornar a marcha que a bicicleta est√°
     *
     * @return int indicando a marcha
     */
    public int getMarcha()
    {
        return marcha;
    }

    /**
     * MÈtodo para retornar a velocidade da bicicleta
     *
     * @return float indicando a velocidade
     */
    public float getVelocidade()
    {
        return velocidade;
    }

    /**
     * MÈtodo para armazenar valor da cadencia da bicicleta
     *
     * @param cadencia
     */
    public void setCadencia(int cadencia)
    {
        this.cadencia = cadencia;
    }

    /**
     * MÈtodo para armazenar marcha da bicicleta
     *
     * @param marcha
     */
    public void setMarcha(int marcha)
    {
        this.marcha = marcha;
    }

    /**
     * MÈtodo para armazenar a velocidade da bicicleta
     *
     * @param velocidade
     */
    public void setVelocidade(float velocidade)
    {
        this.velocidade = velocidade;
    }
}
