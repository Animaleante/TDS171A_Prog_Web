package com.tds171a.aula05;

import java.util.ArrayList;

import com.tds171a.aula05.veiculos.Caminhao;
import com.tds171a.aula05.veiculos.Carro;
import com.tds171a.aula05.veiculos.Trem;
import com.tds171a.aula05.veiculos.Vagao;

public class Aula05
{

    public static void main(String[] args)
    {
        new Aula05();
    }

    public Aula05()
    {
        //new Carro();
        new Carro("azul", 2001, "Ka", "Ford");

        new Caminhao();
        new Caminhao("vermelho", 1980, "Qualquer", "bla", 500);

        //new Trem();
        new Trem(new ArrayList<Vagao>(), "Tremzinho");
    }
}
