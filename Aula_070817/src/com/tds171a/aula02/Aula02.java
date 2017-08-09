package com.tds171a.aula02;

/**
 * Class da aula 2.
 *
 * @author Diogo S. Moraes
 * @since 7 de ago de 2017
 * @version 1.0.0
 *
 */
public class Aula02
{

    public static void main(String[] args)
    {
        new Aula02();
    }

    public Aula02()
    {
        Bicicleta bicicleta = new Bicicleta(40.0f, 3, 180);
        // bicicleta.setCadencia(4);
        System.out.println("Cadencia: " + bicicleta.getCadencia());
        System.out.println("Marcha: " + bicicleta.getMarcha());
        System.out.println("Velocidade: " + bicicleta.getVelocidade());
    }

}
