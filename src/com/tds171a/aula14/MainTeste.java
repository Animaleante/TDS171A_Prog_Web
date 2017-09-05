package com.tds171a.aula14;

import com.tds171a.aula14.exceptions.InvalidDividerException;

public class MainTeste
{
    public static void main(String[] args)
    {
        System.out.println("inicio");

        ClasseA a = new ClasseA();
        try
        {
            System.out.println("Divisão: " + a.divisao(20, 0));
        }
        catch (InvalidDividerException e)
        {
            e.printStackTrace();
        }

        System.out.println("fim");
    }
}
