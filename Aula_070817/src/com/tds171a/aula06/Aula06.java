package com.tds171a.aula06;

import com.tds171a.aula06.veiculos.Caminhao;
import com.tds171a.aula06.veiculos.Carro;
import com.tds171a.aula06.veiculos.Trem;

/**
 *
 * @author Lab. Desenvolvimento
 *
 */
public class Aula06
{
    /**
     * Método main
     * @param args
     */
    public static void main(String[] args)
    {
        new Aula06();
    }

    /**
     * Construtor da classe Aula06
     */
    public Aula06()
    {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro(1988, "vermelho", "Ka", "Ford", 40);
        Caminhao caminhao1 = new Caminhao();
        Caminhao caminhao2 = new Caminhao(2000, "azul", "Noce", "Mercedes", 20);
        Trem trem1 = new Trem();
        Trem trem2 = new Trem(2010, "amarelo", null);
    }
}
